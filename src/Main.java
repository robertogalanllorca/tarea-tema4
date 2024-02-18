import java.util.Scanner;

/**
 * Clase Main: Es la clase principal del programa, contiene el método 'main'.
 * @author Roberto Galán
 * @version 1.0
 */
public class Main {

    /**
     * En el método 'main' se ejecuta el programa principal, en el crearemos una instancia de la clase 'Criba'
     * para poder usar todos sus métodos.
     * @param args es el parámetro que se pasa por defecto en los métodos main.
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduce el número para la criba de Erastótenes: ");
        int dato = teclado.nextInt();
        int[] vector = new int[dato];
        System.out.println("\nVector inicial hasta: " + dato);
        Criba.vectorInicial(vector);
        vector = Criba.generarPrimos(dato);
        System.out.println("\nVector de primos hasta: " + dato);
        Criba.vectorPrimos(vector);
    }
}