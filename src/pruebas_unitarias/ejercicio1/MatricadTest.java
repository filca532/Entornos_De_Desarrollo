package pruebas_unitarias.ejercicio1;

import org.testng.annotations.*;

import static org.testng.Assert.*;

/**
 * Prueba la funcionalidad de la clase Matricad
 */
public class MatricadTest {

    /**
     * Array de cadenas utilizado para las pruebas
     */
    static String[] cadenes;

    /**
     * Configura el entorno de prueba antes de ejecutar las pruebas.
     * @throws Exception si ocurre algún error durante la configuración.
     */
    @BeforeClass
    public void setUpClass() throws Exception {
        cadenes = new String[]{"hui", "és", "dilluns", "i", "no", "m'agrada", "gens"};
    }

    /**
     * Prueba el constructor de Matricad con un array de cadenas.
     */
    @Test(expectedExceptions = {java.lang.IllegalArgumentException.class})
    public void crea() {
        System.out.println("Constructor amb la matriu de cadenes");
        Matricad instance = new Matricad(cadenes);
    }

    /**
     * Prueba el constructor de Matricad con un valor nulo.
     */
    @Test(expectedExceptions = {java.lang.IllegalArgumentException.class})
    public void crea1() {
        System.out.println("Constructor amb un null");
        Matricad instance = new Matricad(null);
    }

    /**
     * Prueba el constructor de Matricad con un array vacío.
     */
    @Test(expectedExceptions = {java.lang.IllegalArgumentException.class})
    public void crea2() {
        System.out.println("Constructor amb una matriu buida");
        String[] cads = {};
        Matricad instance = new Matricad(cads);
    }

    /**
     * Prueba el constructor de Matricad con un valor nulo.
     * Espera una excepción IllegalArgumentException.
     */
    @Test
    public void crea3() {
        try {
            System.out.println("Constructor amb null");
            Matricad instance = new Matricad(null);
            fail("no ha saltat l'excepció per a null");
        } catch (java.lang.IllegalArgumentException e) {

        }
    }

    /**
     * Prueba el constructor de Matricad con un array que contiene una cadena vacía.
     * Espera una excepción IllegalArgumentException.
     */
    @Test
    public void crea4() {
        try {
            System.out.println("Constructor amb una matriu buida");
            String[] mat = {""};
            Matricad instance = new Matricad(mat);
            fail("no ha saltat l'excepcio per a la matriu buida");
        } catch (java.lang.IllegalArgumentException e) {}
    }

    /**
     * Prueba el método getIndexDe para comprobar la posición de una cadena.
     */
    @Test
    public void testGetIndexDe() {
        System.out.println("GetIndexOf comprova la posició d'una cadena");
        Matricad instance = new Matricad(cadenes);
        int expResult = 2;
        int result = instance.getIndexDe("dilluns");
        assertEquals(expResult, result);
    }

    /**
     * Prueba el método getIndexDe con un valor nulo.
     * Espera una excepción IllegalArgumentException.
     */
    @Test(expectedExceptions = {java.lang.IllegalArgumentException.class})
    public void testGetIndexDe1() {
        System.out.println("GetIndexOf cerca d'un valor nul");
        Matricad instance = new Matricad(cadenes);
        instance.getIndexDe(null);
    }

    /**
     * Prueba el método getIndexDe con un valor inexistente.
     * Espera una excepción NoSuchElementException.
     */
    @Test(expectedExceptions = {java.util.NoSuchElementException.class})
    public void testGetIndexDe2() {
        System.out.println("GetIndexOf cerca d'un valor inexistent");
        Matricad instance = new Matricad(cadenes);
        instance.getIndexDe("lunes");
    }

}