package calculadora;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CalculadoraTest {

    @Test
    void calcula(){
        Calculadora calculadora = new Calculadora();
        assertEquals("4.0", calculadora.calcula("10-2-4"));
    }

}