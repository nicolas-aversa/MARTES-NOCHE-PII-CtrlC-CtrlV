package ejercicioPalabras;

import java.util.Scanner;

public class TestABBPalabras {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ABBPalabras indice = new ABBPalabras();

        System.out.println("Ingrese el texto.");
        System.out.println("Escriba FIN para terminar: ");

        String linea = scanner.nextLine();

        while (!linea.equalsIgnoreCase("FIN")) {
            indice.procesarTexto(linea);

            linea = scanner.nextLine();
        }

        System.out.println("");
        System.out.println("Índice de palabras:");
        indice.mostrarIndice();

        scanner.close();
    }
}
