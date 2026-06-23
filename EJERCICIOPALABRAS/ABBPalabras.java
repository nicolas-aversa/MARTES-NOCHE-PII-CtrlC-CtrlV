package ejercicioPalabras;

import java.util.Scanner;

public class ABBPalabras {
    private NodoString raiz;

    public void procesarTexto(String texto) {
        Scanner lector = new Scanner(texto);

        // Uno o más caracteres que no sean letras, separo palabras
        lector.useDelimiter("[^\\p{L}]+");

        while (lector.hasNext()) {
            String palabra = lector.next();
            registrarPalabra(palabra);
        }

        lector.close();
    }

    private void registrarPalabra(String palabra) {
        palabra = palabra.toLowerCase();

        raiz = registrarPalabraRecursivo(raiz, palabra);
    }

    private NodoString registrarPalabraRecursivo(NodoString actual, String palabra) {
        // Caso base
        if (actual == null) {
            return new NodoString(palabra);
        }

        int comparacion = palabra.compareTo(actual.palabra);

        if (comparacion < 0) {
            actual.izquierdo = registrarPalabraRecursivo(actual.izquierdo, palabra);

        } else if (comparacion > 0) {
            actual.derecho = registrarPalabraRecursivo(actual.derecho, palabra);

        } else {
            actual.cantidadApariciones++;
        }

        return actual;
    }

    public void mostrarIndice() {
        mostrarInOrdenRecursivo(raiz);
    }

    private void mostrarInOrdenRecursivo(NodoString actual) {
        // Caso base
        if (actual == null) {
            return;
        }

        mostrarInOrdenRecursivo(actual.izquierdo);
        System.out.println(actual.palabra + " -> " + actual.cantidadApariciones);
        mostrarInOrdenRecursivo(actual.derecho);
    }
}
