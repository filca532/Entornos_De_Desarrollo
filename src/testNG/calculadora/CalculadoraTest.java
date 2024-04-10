package testNG.calculadora;

import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;

public class CalculadoraTest {

    @Test
    public void testSumar() {
        double resultado = Calculadora.sumar(2, 3);
        assertEquals(resultado, 5.0);
    }

    @Test
    public void testRestar() {
        double resultado = Calculadora.restar(5, 3);
        assertEquals(resultado, 2.0);
    }

    @Test
    public void testMultiplicar() {
        double resultado = Calculadora.multiplicar(2, 3);
        assertEquals(resultado, 6.0);
    }

    @Test
    public void testDividir() {
        double resultado = Calculadora.dividir(6, 3);
        assertEquals(resultado, 2.0);
    }
}
