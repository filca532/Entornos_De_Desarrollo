package pruebas_unitarias.ejercicio3;

import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Esta clase prueba la funcionalidad de los métodos calculaSalariBrut y calculaSalariNet de la clase Empleat.
 */
public class EmpleatTest {

    Empleat empleat = new Empleat();

    /**
     * Prueba el método calculaSalariBrut con un empleado de tipo "venedor", ventas del mes 500, 2 horas extra.
     */
    @Test
    public void testCalculaSalariBrut1() throws MaException {
        assertEquals(empleat.calculaSalariBrut("venedor", 500, 2), 1037.14);
    }

    /**
     * Prueba el método calculaSalariBrut con un empleado de tipo "venedor", ventas del mes 1500, 0 horas extra.
     */
    @Test
    public void testCalculaSalariBrut2() throws MaException {
        assertEquals(empleat.calculaSalariBrut("venedor", 1500, 0), 1100);
    }

    /**
     * Prueba el método calculaSalariBrut con un empleado de tipo "venedor", ventas del mes 3000, 5 horas extra.
     */
    @Test
    public void testCalculaSalariBrut3() throws MaException {
        assertEquals(empleat.calculaSalariBrut("venedor", 3000, 5), 1392.85);
    }

    /**
     * Prueba el método calculaSalariBrut con un empleado de tipo "encarregat", ventas del mes 500, 2 horas extra.
     */
    @Test
    public void testCalculaSalariBrut4() throws MaException {
        assertEquals(empleat.calculaSalariBrut("encarregat", 500, 2), 1537.14);
    }

    /**
     * Prueba el método calculaSalariBrut con un empleado de tipo "encarregat", ventas del mes 1500, 0 horas extra.
     */
    @Test
    public void testCalculaSalariBrut5() throws MaException {
        assertEquals(empleat.calculaSalariBrut("encarregat", 1500, 0), 1600);
    }

    /**
     * Prueba el método calculaSalariBrut con un empleado de tipo "encarregat", ventas del mes 3000, 5 horas extra.
     */
    @Test
    public void testCalculaSalariBrut6() throws MaException {
        assertEquals(empleat.calculaSalariBrut("encarregat", 3000, 5), 1892.85);
    }

    /**
     * Prueba el método calculaSalariBrut con un empleado de tipo null, ventas del mes 500, 2 horas extra.
     */
    @Test(expectedExceptions = MaException.class)
    public void testCalculaSalariBrut7() throws MaException {
        empleat.calculaSalariBrut(null, 500, 2);
    }

    /**
     * Prueba el método calculaSalariBrut con un empleado de tipo "gerent", ventas del mes 500, 2 horas extra.
     */
    @Test(expectedExceptions = MaException.class)
    public void testCalculaSalariBrut8() throws MaException {
        empleat.calculaSalariBrut("gerent", 500, 2);
    }

    /**
     * Prueba el método calculaSalariBrut con un empleado de tipo "venedor", ventas del mes -500, 2 horas extra.
     */
    @Test(expectedExceptions = MaException.class)
    public void testCalculaSalariBrut9() throws MaException {
        empleat.calculaSalariBrut("venedor", -500, 2);
    }

    /**
     * Prueba el método calculaSalariBrut con un empleado de tipo "venedor", ventas del mes 500, -2 horas extra.
     */
    @Test(expectedExceptions = MaException.class)
    public void testCalculaSalariBrut10() throws MaException {
        empleat.calculaSalariBrut("venedor", 500, -2);
    }

    /**
     * Prueba el método calculaSalariNet con un salario bruto de 500.
     */
    @Test
    public void testCalculaSalariNet1() throws MaException {
        assertEquals(empleat.calculaSalariNet(500), 500);
    }

    /**
     * Prueba el método calculaSalariNet con un salario bruto de 1000.
     */
    @Test
    public void testCalculaSalariNet2() throws MaException {
        assertEquals(empleat.calculaSalariNet(1000), 840);
    }

    /**
     * Prueba el método calculaSalariNet con un salario bruto de 1500.
     */
    @Test
    public void testCalculaSalariNet3() throws MaException {
        assertEquals(empleat.calculaSalariNet(1500), 1260);
    }

    /**
     * Prueba el método calculaSalariNet con un salario bruto de 1501.
     */
    @Test
    public void testCalculaSalariNet4() throws MaException {
        assertEquals(empleat.calculaSalariNet(1501), 1200.8);
    }

    /**
     * Prueba el método calculaSalariNet con un salario bruto de 2000.
     */
    @Test
    public void testCalculaSalariNet5() throws MaException {
        assertEquals(empleat.calculaSalariNet(2000), 1600);
    }

    /**
     * Prueba el método calculaSalariNet con un salario bruto negativo.
     */
    @Test(expectedExceptions = MaException.class)
    public void testCalculaSalariNet6() throws MaException {
        empleat.calculaSalariNet(-500);
    }

    /**
     * Prueba el método calculaSalariNet con un salario bruto de 999.
     */
    @Test
    public void testCalculaSalariNet7() throws MaException {
        assertEquals(empleat.calculaSalariNet(999), 999);
    }

    /**
     * Prueba el método calculaSalariNet con un salario bruto de 1001.
     */
    @Test
    public void testCalculaSalariNet8() throws MaException {
        assertEquals(empleat.calculaSalariNet(1001), 841.16);
    }

    /**
     * Prueba el método calculaSalariNet con un salario bruto de 1501.
     */
    @Test
    public void testCalculaSalariNet9() throws MaException {
        assertEquals(empleat.calculaSalariNet(1501), 1200.8);
    }

    /**
     * Prueba el método calculaSalariNet con un salario bruto de 2000.
     */
    @Test
    public void testCalculaSalariNet10() throws MaException {
        assertEquals(empleat.calculaSalariNet(2000), 1600);
    }
}