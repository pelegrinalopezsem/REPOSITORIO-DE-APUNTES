package es.stemgranada.ed.testing.calculadora;

import org.junit.jupiter.api.BeforeEach;

import es.stemgranada.ed.testing.validacion.ValidadorEdad;

public class ValidacionEdadTest {
    private ValidadorEdad validadorEdad;

    @BeforeEach
    void inicializar() {
        validadorEdad = new ValidadorEdad();
    }

}
