package es.stemgranada.pt6;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class GestorNotasTest {

    private GestorNotas gestor;

    @BeforeEach
    void inicializar_gestor() {
        gestor = new GestorNotas();
    }

    // ------------------------
    // TESTS NOMINALES
    // ------------------------

    @Test
    void agregarNota_incrementaContador_notaValida() {

        gestor.agregarNota(7);

        assertEquals(1, gestor.contarNotas());
    }

    @Test
    void calcularMedia_devuelveMedia_correcta() {

        gestor.agregarNota(6);
        gestor.agregarNota(8);

        double media = gestor.calcularMedia();

        assertEquals(7, media, 0.001);
    }

    @Test
    void obtenerNotaMaxima_devuelveMaxima_siHayNotas() {

        gestor.agregarNota(3);
        gestor.agregarNota(9);
        gestor.agregarNota(7);

        Double max = gestor.obtenerNotaMaxima();

        assertEquals(9, max);
        assertNotNull(max);
    }

    @Test
    void obtenerNotaMinima_devuelveMinima_siHayNotas() {

        gestor.agregarNota(3);
        gestor.agregarNota(9);
        gestor.agregarNota(7);

        Double min = gestor.obtenerNotaMinima();

        assertEquals(3, min);
    }

    @Test
    void esAprobado_devuelveTrue_siNotaMayorIgual5() {

        boolean resultado = gestor.esAprobado(6);

        assertTrue(resultado);
    }

    @Test
    void esAprobado_devuelveFalse_siNotaMenor5() {

        boolean resultado = gestor.esAprobado(4);

        assertFalse(resultado);
    }

    @Test
    void todoAprobado_devuelveTrue_siTodasAprobadas() {

        gestor.agregarNota(6);
        gestor.agregarNota(7);

        assertTrue(gestor.todoAprobado());
    }

    @Test
    void contarAprobados_devuelveNumeroCorrecto() {

        gestor.agregarNota(4);
        gestor.agregarNota(6);
        gestor.agregarNota(8);

        int resultado = gestor.contarAprobados();

        assertEquals(2, resultado);
    }

    @Test
    void contarSuspensos_devuelveNumeroCorrecto() {

        gestor.agregarNota(4);
        gestor.agregarNota(6);
        gestor.agregarNota(2);

        int resultado = gestor.contarSuspensos();

        assertEquals(2, resultado);
    }

    // ------------------------
    // TESTS LIMITE
    // ------------------------

    @Test
    void agregarNota_aceptaCero_valorLimite() {

        gestor.agregarNota(0);

        assertEquals(1, gestor.contarNotas());
    }

    @Test
    void agregarNota_aceptaDiez_valorLimite() {

        gestor.agregarNota(10);

        assertEquals(1, gestor.contarNotas());
    }

    @Test
    void esAprobado_devuelveTrue_siNotaEs5_limite() {

        boolean resultado = gestor.esAprobado(5);

        assertTrue(resultado);
    }

    @Test
    void obtenerNotaMaxima_devuelveNull_siNoHayNotas() {

        Double max = gestor.obtenerNotaMaxima();

        assertNull(max);
    }

    @Test
    void obtenerNotaMinima_devuelveNull_siNoHayNotas() {

        Double min = gestor.obtenerNotaMinima();

        assertNull(min);
    }

    // ------------------------
    // TESTS ERRONEOS
    // ------------------------

    @Test
    void agregarNota_lanzaExcepcion_siNotaMenorQueCero() {

        assertThrows(
                IllegalArgumentException.class,
                () -> gestor.agregarNota(-1)
        );
    }

    @Test
    void agregarNota_lanzaExcepcion_siNotaMayorQueDiez() {

        assertThrows(
                IllegalArgumentException.class,
                () -> gestor.agregarNota(11)
        );
    }

    @Test
    void calcularMedia_lanzaExcepcion_siNoHayNotas() {

        assertThrows(
                IllegalStateException.class,
                () -> gestor.calcularMedia()
        );
    }

    @Test
    void esAprobado_lanzaExcepcion_siNotaInvalida() {

        assertThrows(
                IllegalArgumentException.class,
                () -> gestor.esAprobado(20)
        );
    }

    @Test
    void clasificarNota_lanzaExcepcion_siNotaFueraRango() {

        assertThrows(
                IllegalArgumentException.class,
                () -> gestor.clasificarNota(-5)
        );
    }

    // ------------------------
    // TESTS PARAMETRIZADOS
    // ------------------------

    @ParameterizedTest
    @ValueSource(doubles = {5, 6, 7, 8, 9, 10})
    void esAprobado_devuelveTrue_variasNotas(double nota) {

        assertTrue(gestor.esAprobado(nota));
    }

    @ParameterizedTest
    @ValueSource(doubles = {0, 1, 2, 3, 4})
    void esAprobado_devuelveFalse_variasNotas(double nota) {

        assertFalse(gestor.esAprobado(nota));
    }

    @ParameterizedTest
    @CsvSource({
            "4,Suspenso",
            "5,Aprobado",
            "6,Aprobado",
            "7,Notable",
            "8,Notable",
            "9,Sobresaliente",
            "10,Sobresaliente"
    })
    void clasificarNota_devuelveCategoriaCorrecta(double nota, String esperado) {

        String resultado = gestor.clasificarNota(nota);

        assertEquals(esperado, resultado);
    }

}