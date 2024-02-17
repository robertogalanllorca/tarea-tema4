public class Criba {
    // Generar números primos de 1 a max
    public static int[] generarPrimos (int max) {
        int i, j;
        if (max >= 2) {
            // Declaraciones
            int dim = max + 1; // Tamaño del array
            boolean[] esPrimo = new boolean[dim];
            // Inicializar el array
            for (i = 0; i < dim; i++) {
                esPrimo[i] = true;
            }
            // Eliminar el 0 y el 1, que no son primos
            esPrimo[0] = esPrimo[1] = false;
            // Criba
            comprobarPrimo(dim, esPrimo);
            // ¿Cuántos primos hay?
            int cuenta = 0;
            for (i = 0; i < dim; i++) {
                if (esPrimo[i]) cuenta++;
            }
            // Rellenar el vector de números primos
            int[] primos = new int[cuenta];
            for (i = 0, j = 0; i < dim; i++) {
                if (esPrimo[i]) primos[j++] = i;
            }
            return primos;
        } else { // max < 2
            return new int[0];
            // Vector vacío
        }
    }
    private static void comprobarPrimo(int dim, boolean[] esPrimo) {
        int j;
        int i;
        for (i = 2; i < Math.sqrt(dim) + 1; i++) {
            if (esPrimo[i]) {
                // Eliminar los múltiplos de i
                for (j = 2 * i; j < dim; j += i) {
                    esPrimo[j] = false;
                }
            }
        }
    }

    public static void vectorInicial(int[] vector) {
        for (int i = 0; i < vector.length; i++) {
            if (i % 10 == 0) System.out.println();
            System.out.print(i + 1 + "\t");
        }
    }
    public static void vectorPrimos(int[] vector) {
        for (int i = 0; i < vector.length; i++) {
            if (i % 10 == 0) System.out.println();
            System.out.print(vector[i] + "\t");
        }
    }

}