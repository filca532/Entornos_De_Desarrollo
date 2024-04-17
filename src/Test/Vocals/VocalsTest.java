package Test.Vocals;

import org.testng.annotations.Test;
import static org.testng.Assert.*;
import pruebas_unitarias.ejercicio2.Vocals;

/**
 * Esta clase prueba la funcionalidad del método esVocal de la clase Vocals.
 */
public class VocalsTest {

    /**
     * Prueba el método esVocal con una vocal minúscula.
     */
    @Test
    public void testEsVocal1() {
        Vocals instance = new Vocals();
        assertTrue(instance.esVocal("a"));
    }

    /**
     * Prueba el método esVocal con una vocal mayúscula.
     */
    @Test
    public void testEsVocal2() {
        Vocals instance = new Vocals();
        assertTrue(instance.esVocal("A"));
    }

    /**
     * Prueba el método esVocal con una consonante minúscula.
     */
    @Test
    public void testEsVocal3() {
        Vocals instance = new Vocals();
        assertFalse(instance.esVocal("b"));
    }

    /**
     * Prueba el método esVocal con una consonante mayúscula.
     */
    @Test
    public void testEsVocal4() {
        Vocals instance = new Vocals();
        assertFalse(instance.esVocal("B"));
    }

    /**
     * Prueba el método esVocal con una cadena vacía.
     */
    @Test
    public void testEsVocal5() {
        Vocals instance = new Vocals();
        assertFalse(instance.esVocal(""));
    }

    /**
     * Prueba el método esVocal con una cadena de más de un carácter.
     */
    @Test
    public void testEsVocal6() {
        Vocals instance = new Vocals();
        assertFalse(instance.esVocal("ab"));
    }
}