/**
 * Clase Criba:
 * Genera una cantidad de números primos indicada por el usuario.
 * @author Roberto Galán
 * @version 1.0
 * @see <a href="https://es.wikipedia.org/wiki/numero_primo">Definición Numeros Primos</a>
 */
public class Criba {
    /**
     * Función que genera números primos.
     * @param max es el máximo de números hasta el que iremos comprobando uno a uno si es primo
     * @return un array de enteros con los números primos obtenidos.
     */
    public static int[] generarPrimos (int max) {
        if (max >= 2) {
            int dim = max + 1; // Tamaño del array
            boolean[] esPrimo = new boolean[dim];
            initArray(dim, esPrimo);
            //Ponemos 0 y 1 en false por que no son primos
            esPrimo[0] = esPrimo[1] = false;
            comprobarPrimo(dim, esPrimo);
            int cuenta = cuentaPrimos(dim, esPrimo);
            // Rellenar el vector de números primos
            int[] primos = new int[cuenta];
            for (int i = 0, j = 0; i < dim; i++) {
                if (esPrimo[i]) primos[j++] = i;
            }
            return primos;
        } else { // max < 2
            return new int[0]; // Vector vacío
        }
    }

    /**
     * Función que inicializa el array y pone todos los valores en true.
     * @param dim valor entero que corresponde a la longitud del array.
     * @param esPrimo es el array sobre el que declararemos la longitud.
     */
    public static void initArray(int dim, boolean[] esPrimo) {
        for (int i = 0; i < dim; i++) {
            esPrimo[i] = true;
        }
    }

    /**
     * Función que devuelve la cantidad de números primos que tenemos en un array.
     * @param dim es la longitud que en nuestro for para iterar el contenido del array esPrimo.
     * @param esPrimo es el array sobre el que comprobamos y sacamos la cantidad de números primos.
     * @return la cantidad de números primos que hay en el array.
     */
    public static int cuentaPrimos(int dim, boolean[] esPrimo) {
        int cuenta = 0;
        for (int i = 0; i < dim; i++) {
            if (esPrimo[i]) cuenta++;
        }
        return cuenta;
    }

    /**
     * Función que comprueba si un número es primo
     * @param dim es la longitud del array del cual comprobaremos uno a uno los números.
     * @param esPrimo es el array donde comprobaremos si el número que hay en cada posición es primo.
     */
    public static void comprobarPrimo(int dim, boolean[] esPrimo) {
        for (int i = 2; i < Math.sqrt(dim) + 1; i++) {
            if (esPrimo[i]) {
                // Eliminar los múltiplos de i
                for (int j = 2 * i; j < dim; j += i) {
                    esPrimo[j] = false;
                }
            }
        }
    }

    /**
     * Función que recorre el array inicial y muestra por pantalla uno a uno su contenido.
     * @param vector es el array sobre el cual vamos a iterar  y estrar su contenido.
     */
    public static void vectorInicial(int[] vector) {
        for (int i = 0; i < vector.length; i++) {
            if (i % 10 == 0) System.out.println();
            System.out.print(i + 1 + "\t");
        }
    }

    /**
     * Función que recorre el array final con la cantidad de números primos que hemos obtenido.
     * @param vector es el array sobre el cual vamos iterar y extraer los números primos que contine.
     */
    public static void vectorPrimos(int[] vector) {
        for (int i = 0; i < vector.length; i++) {
            if (i % 10 == 0) System.out.println();
            System.out.print(vector[i] + "\t");
        }
    }
}