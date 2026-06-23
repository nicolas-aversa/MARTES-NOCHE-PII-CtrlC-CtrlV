package ejercicioPalabras;

public class NodoString {
    String palabra;
    int cantidadApariciones;

    NodoString izquierdo;
    NodoString derecho;

    public NodoString(String palabra) {
        this.palabra = palabra;
        this.cantidadApariciones = 1;
    }
}
