# GIT Realiza todos los pasos que se sugieren en el documento y entrega en Aules un PDF con todas las capturas de pantalla que se solicitan, en total 12. La guía para seguir los diferentes apartados está aquí. ## CONFIGURACIÓN DE GIT El primer paso de todos es introducir un nombre y un email, puesto que todas las acciones que hagamos en el repositorio tienen que tener un autor. ```git git config --global user.name "user_name" git config --global user.email "user_email" ``` Puedes ver los valores de configuración con: ``` git config --list ``` 1. Haz una captura de pantalla del archivo .gitconfig, donde aparezca los datos del usuario de Git en tu equipo. ## CREAR UN REPOSITORIO Crea un repositorio con un archivo **"fichero_1.php"**, el cual estará vacío cuando iniciemos el repositorio. ``` git init ``` Vemos en la consola de Git Bash que estamos situados en la rama Master. Renombramos la rama master por la rama main. ``` git branch -m main ``` 2. Captura de pantalla del nombre de la consola de Git con el nombre de la rama cambiado. ## BORRAR UN REPOSITORIO Para borrar un repositorio podemos emplear el siguiente comando: ``` rm -rf .git ``` ## GUARDAR CAMBIOS Para comprobar el estado de nuestro repositorio. ``` git status ``` Haz un commit llamado "Mi primer commit". Este commit será una versión de nuestro repositorio con únicamente el fichero **"fichero_1.php"** vacío. Ahora crea otro archivo **"fichero_2.php"** y haz un commit con el siguiente mensaje "Este es mi segundo commit". ## GIT CHECKOUT Vamos a volver a una versión anterior de nuestro repositorio. ``` git checkout nombre_fichero ``` Entre otras funcionalidades, permite descartar los cambios locales que se han hecho en un fichero y volver a la última versión (commit) que había del repositorio. Para probarlo puedes añadir un texto al **fichero_1.php** y solo guardar los cambios en local. De esta manera, si hacemos: ``` git checkout fichero_1.php ``` Podemos volver a la versión que teníamos en el momento que habíamos hecho el commit. ## GIT LOG Vamos a modificar el archivo **fichero_1.php** y hacemos un tercer commit. Podemos ver todo el historial de commits de diferentes formas: ``` git log git log --graph git log --oneline ``` De esta forma tenemos el hash y el lugar donde está el HEAD, entre otros datos. 3. Captura de pantalla del log hasta el momento, es decir los tres commits. ## GIT ALIAS Vamos a crear un alias llamado **"git tree"** para que cuando queramos ejecutar el comando: ``` git log --oneline ``` podamos únicamente escribir **git tree**. 4. Adjunta una screenshot de la consola ejecutando el comando git tree. ## FICHERO .GITIGNORE Crea un fichero que será aquel que ignoremos en los commits, por ejemplo **"fichero_3.php"**. Después crea el fichero **.gitignore** a través de la consola. ``` touch .gitignore ``` Añadimos el fichero que no queramos incluir en los commits dentro del archivo creado: ``` **/nombre_fichero ``` 5. Añade una captura haciendo un git status del repositorio, en el que aparezca el fichero .gitignore pero no el fichero_3.php. Por último, haz un commit en el que incluyas el fichero .gitignore. **IMPORTANTE** Si hacemos commit de un archivo y después lo incluimos en .gitignore no lo ignorará, porque GIT ya lo había detectado en el historial de cambios. Primero incluye el nombre del archivo en el fichero .gitignore y después trabaja sobre el fichero que quieres ignorar. ## GIT DIFF Haz cambios en el fichero **fichero_1.php** y sin hacer un commit comprueba con el comando git diff que puedes ver cual han sido los cambios que has hecho en el fichero. Puedes añadir el siguiente código: ```php ``` Ahora tienes el HEAD en el primer commit, pero los que has hecho posteriormente siguen estando ahí. Puedes consultarlos con el siguiente comando: ``` git log --all ``` 7. Adjunta una captura una captura de todo el historial de commits. Ahora vuelve a situar el HEAD en el último commit con: ``` git checkout ``` Fíjate que todavía no estamos en la rama main, por tanto, vuelve a la rama main con: ``` git checkout main ``` ## GIT RESET HARD Y REFLOG GIT RESET nos permitirá situarnos en un commit concreto de nuestra rama. Ahora vamos a volver al commit en el que añadimos el fichero **.gitignore** y vamos a borrar los que hicimos posteriormente. ``` git reset --hard ``` Comprueba que no existen los demás commits con: ``` git log --oneline git log --all ``` 8. Adjunta la captura de pantalla de uno de estos dos logs. Sin embargo, hay un lugar donde se quedan almacenados todos esos commits: ``` git reflog ``` Aquí encontramos un historial completo de interacciones con nuestro repositorio. Ahora vuelve a situar el **HEAD** en el último commit que habíamos hecho, volviendo a hacer otro reset. ## GIT TAG Vamos a utilizar los tags para etiquetar commits, concretamente aquellos que sean puntos relevantes dentro de mi repositorio. Añade el tag **clase_1** y después haz un commit para comprobar que el tag se queda guardado dentro del tercer commit. Vuelve el **HEAD** al commit en el que insertamos el tag con: ``` git checkout tags/clase_1 ``` 9. Añade una captura de pantalla con el **HEAD** en el tag pero que también aparezca el commit posterior. La ventaja es que podemos trabajar de forma más intuitiva y no únicamente con el hash del commit. ## GIT BRANCH Y SWITCH Vamos a crear una nueva rama. Por ejemplo, estamos trabajando en un proyecto y queremos desarrollar una nueva funcionalidad para hacer un login. Crea la rama y comprueba que se ha creado con: ``` git branch ``` La rama activa se marca con un * Ahora cambiamos a la rama **login**: ``` git switch login ``` 10. Adjunta una captura con la consola en la nueva rama. Ahora creamos el fichero **login.php** y hacemos un commit con el siguiente mensaje **"commit del login"**. Volvemos a la rama **main** y comprobamos que no está el fichero **login.php**. Dentro de la rama **main** y comprueba que cuando cambias a la rama **login** no se encuentran los cambios. ## GIT MERGE Vamos a trabajar en la unión de ambas ramas. Para ello, cambiamos el **HEAD** a la rama login para traer los cambios que hemos hecho en la main a la rama login. ``` git merge main ``` Puedes dejar el mensaje que se introduce por defecto. Comprueba que se han traido los cambios que has hecho en el último commit de la rama main a la rama login. ## RESOLUCIÓN DE CONFLICTOS Hasta ahora no había ningún problema porque hemos trabajado en ficheros distintos en cada rama, pero ahora vamos a crear en cada rama un cambio en la misma línea, para que GIT nos informe de un conflicto. Para ello tendrás que hacer un commit en cada rama con un cambio en la misma línea. Cuando hagas el merge, es decir, cuando quieras llevar los cambios de la rama main a la rama login, git nos informará de un conflicto. Dentro de VSCode podremos ver las dos opciones con las que contamos. Seleccionamos que queremos mantener los cambios que hemos hecho desde la rama **main**. Después únicamente debemos hacer un commit para guardar la correccción de ese conflicto. ## GIT STASH Realiza algún cambio en culquier fichero de la rama **login**, intenta moverte a la rama **main** y verás como no permite cambiar a otro rama si todavía no has ido hecho un commit de esos cambios. Si no queremos hacer un commit porque el código todavía no es correcto o no es totalmente funcional, podemos utilizar el siguiente comando: ``` git stash ``` De esta forma no se guardarán de manera definitiva, pero podremos recuperarlos. Puedes comprobar los stash creados con: ``` git stash list ``` Comprueba que ahora si puedes moverte a la rama main. 11. Añade una captura de pantalla con la lista en la que aparezca el stash. Vuelve a la rama login y verás que no están guardados los últimos cambios que hiciste. Si quieres recuperarlos y continuar por donde te habías quedado debes utilizar: ``` git stash pop ``` Por último haz un commit en el que incluyas estos cambios. ## REINTEGRACIÓN DE RAMAS Ahora vamos a integrar la rama de login dentro de la rama **main**, es decir, un merge de la rama login a la **main**. Comprueba que los commits hechos en la rama **login** se han integrado en la rama **main**. ## ELIMINACIÓN DE RAMAS Por último vamos a eliminar la rama de **login** que no será necesaria, puesto que todos los cambios que había hecho en la rama de **login** ya están en la rama **main**. ``` git branch -d login ``` Comprueba que ya no está la rama: ``` git branch ``` 12. Adjunta una captura de pantalla con las ramas eliminadas. ## PROPUESTA Vuelve al primer commit con un reset hard y después vuelve al último commit en el que se había integrado la rama login dentro de la master.

--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

Crea los proyectos en NetBeans y después subelos a un repositorio.


En los comentarios del JavaDoc debes explicar el porque de los casos de equivalencia seleccionados del **Ejercicio 1** y **Ejercicio 2**


Después, añade el nombre del repositorio a la tarea.


# EJERCICIO 1

## MATRICAD

La clase Matricad, contiene una serie de métodos que actúan sobre una matriz de cadenas.

```java
public class Matricad {
    private java.util.ArrayList<String> cadenes; 	// referència a la llista de cadenes, un camp
    /**
     * Constructor de Matricad.
     * @param dada matriu amb les cadenes per a la llista
     */
    public Matricad(String[] dada) {
        if ((dada == null) || (dada.length == 0)) {.	// Verifiquem que la llista tinga valors  
            throw new IllegalArgumentException();
        }
        this.cadenes = new java.util.ArrayList<>();
        for (String element : dada) {
            cadenes.add(element);
        }
    }
    /**
     * @return la cadena que té més caràcters. La primera si hi ha diverses amb la mateixa longitud
     */
    public String getMaxCad() {
        String max = "";
        for (String element : cadenes) {
            if (element.length() > max.length()) {
                max = element;
            }
        }
        return max;
    }
    /**
     * @return la suma total de caràcters de totes les cadenes.
     */
    public int getSumaCaracters() {
        int total = 0;
        for (String d : cadenes) {
            total += d.length();
        }
        return total;
    }
    /**
     * Retorna l'índex de la cadena buscada.
     *
     * @param unaCadena Cadena buscada
     * @return Retorna la posició d'un element dins de l’array
     * @throws java.util.NoSuchElementException Si l'element no existeix en la llista
     */
    public int getIndexDe(String unaCadena) throws java.util.NoSuchElementException {
        if (unaCadena == null) { 	// Comprovem que l'argument siga vàlid  
            throw new IllegalArgumentException();
        }
        int pos = 0;
        for (String d : cadenes) { 	// Recorrem la informació fins a trobar l'element
            if (d.equals(unaCadena)) {
                return pos;
            }
            pos++;
        }
        throw new java.util.NoSuchElementException(unaCadena); 	// L'element no existeix, llancem l'excepció
    }
}
```

Creamos la clase de pruebas con el framework TestNG. Al contrario que hemos hecho en ocasiones anteriores, esta vez marcamos todas las opciones y obtenemos una clase de pruebas como esta:

```java
public class MatriCadNGTest {
    public MatriCadNGTest() {
    }
    @BeforeClass
    public static void setUpClass() throws Exception { 	// s’executa una única vegada a l’inici de la prova
    }
    @AfterClass
    public static void tearDownClass() throws Exception { 	// s’executa una única vegada al final de la prova
    }
    @BeforeMethod
    public void setUpMethod() throws Exception { 	// s’executa cada vegada a l’inici del mètode
    }
    @AfterMethod
    public void tearDownMethod() throws Exception { 	// s’executa cada vegada al final del mètode
    }
    /**
     * Test of getMaxCad method, of class MatriCad.
     */
    @Test
    public void testGetMaxCad() {
        System.out.println("getMaxCad");
        MatriCad instance = null;
        String expResult = "";
        String result = instance.getMaxCad();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSumaCaracters method, of class MatriCad.
     */
    @Test
    public void testGetSumaCaracters() {
        System.out.println("getSumaCaracters");
        MatriCad instance = null;
        int expResult = 0;
        int result = instance.getSumaCaracters();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    /**
     * Test of getIndexDe method, of class MatriCad.
     */
    @Test
    public void testGetIndexDe() {
        System.out.println("getIndexDe");
        String unaCadena = "";
        MatriCad instance = null;
        int expResult = 0;
        int result = instance.getIndexDe(unaCadena);
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}
```

El método ***setUpClass*** que se crea nos será de gran utilidad, puesto que este método se ejecuta una vez al inicio de ejecutar las pruebas. En el vamos a declarar la matriz de cadenas "cadenes". Se trata de un campo estático puesto que se va a emplear en un método estático.

```java
static String[] cadenes;

@BeforeClass
public static void setUpClass() throws Exception {
    cadenes = new String[]{"hui", "és", "dilluns", "i", "no", "m'agrada", "gens"}; 	// carrega la matriu de cadenes
}
```
En primer lugar vamos a crear tres casos de prueba para el constructor: con una matriz vacía, con un *null* y con la matriz "cadenes". Crea las tres casos de prueba para que pasen los test.


En los dos primeros casos el constructor lanzará una excepción. Diseña las pruebas con los dos procemientos que conocemos: mediante un try-catch y también introduciendo la excepción esperada después de @Test.


Ahora prueba los métodos siguiente:

- getMaxCad
- getSumaCaracteres

***Prueba con una matriz que no esté vacía*** 

Para cada uno de estos métodos debes probar el funcionamiento con una matriz cualquiera, puesto que si tenemos una matriz vacía o nula, el test anterior fallará.

Por último, vamos a probar el método *getIndexDe*. Para ello vamos a establecer tres casos de prueba:

- Con un String de la matriz "cadenes" que hemos definido anteriormente.
- Con un null.
- Con un String que no esté en la matriz "cadenes".


# EJERCICIO 2
## VOCALS

```java
public class Vocals {
    /**
     * Comprova si la lletra és una vocal. el conjunt de vocals és "aeiouAEIOU"
     * @param lletra cadena de text amb la lletra a comprovar
     * @return <code>true</code> si és una vocal<br><code>false</code> si és no una vocal
     */
    public boolean esVocal(String lletra) { 	// rep una lletra
        if (lletra.length() != 1) { 	// si lletra no té longitud 1
            return false; 	// no és una lletra
        }
        String vocals = "aeiouAEIOU"; 	// cadenes amb les vocals
        for (int i = 0; i < vocals.length(); i++) { 	// recorre les vocals
            if(vocals.substring(i, i+1).equals(lletra)){ 	// si la subcadena de 1 caràcter és la lletra
                return true; 	// és una vocal
            }
        }
        return false;
    }
}
```

La siguiente clase contiene el método esVocal, que comprueba si una letra, que se pasa por parámetro, es vocal o no.


Diseña al menos 6 casos de prueba para probar el método y detalla en el Javadoc cual es el caso de equivalecia.


# EJERCICIO 3
## EMPLEAT

Crea la clase Empleat con los siguientes métodos:

```java
public double calculaSalariBrut( String tipusEmpleat, double vendesMes, int horesExtra)
```

El salari base és de 1000 euros si l'empleat és de tipus “venedor”, i de 1500 euros si és de tipus “encarregat”.


S'obté una prima de 100 euros si les vendes del mes són majors o iguals que 1000 euros, i de 200 euros són major de 2500 euros. 


Per cada hora extra es paga 18.57 euros. El salari brut és igual al salari base més la prima més les hores extres. 


Si tipus d’empleat és null o no és “venedor” ni “encarregat” el mètode llança una excepció de tipus MaException amb el missatge “el tipus de venedor no és correcte”. 

Si vendesMes o horesExtra prenen valors negatius el mètode llança una excepció de tipus MaException amb el missatge “el valor no pot ser negatiu”.

```java
public double calculaSalariNet(double salariBrut)
```

Se aplican las siguientes retenciones, dependiendo del sueldo bruto:


- De 0 a 999 no se aplica retención.
- De 1000 a 1500 se aplica un 16% de retención.
- De 1501 en adelante, se aplica un 20% de retención.


***El método devuelve salarioBruto * (1-retencion)***


Si el salario bruto es negativo el método lanza una excepción del tipo MAException, con el mensaje "El salario bruto no puede ser negativo".

El mètode retorna salariBrut * (1 - retenció)
Si salari brut és negatiu el mètode llança una excepció de tipus MaException amb el missatge “el valor no pot ser negatiu”.


Para el método **calculaSalariBrut** crea al menos 10 casos de prueba y explica el porque de esos casos de equivalencia.


Para el método **calculaSalariNet** crea también 10 casos y explicalos.
