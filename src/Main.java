import java.util.Scanner;

public class Main {
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