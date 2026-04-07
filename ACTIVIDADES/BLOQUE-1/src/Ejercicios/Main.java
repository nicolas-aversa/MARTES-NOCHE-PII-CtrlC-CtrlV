package Ejercicios;

import Ejercicios.Implementaciones.PilaStringMetodo2;
import Ejercicios.Interfaz.PilaString;
import Ejercicios.Implementaciones.PilaStringMetodo1;

public class Main {
    public static void main(String[] args) {

        // Ejercicio Editor de Código
        PilaString pila1 = new PilaStringMetodo1();
        Editor editor = new Editor();
        editor.editarCodigo(pila1);

        // Ejercicio Balanceo de Paréntesis
        PilaString pila2 = new PilaStringMetodo1();
        Balanceador balanceador = new Balanceador();
        balanceador.balancearParentesis(pila2);

        // Ejercicio Reversión de Strings
        PilaString pila3 = new PilaStringMetodo1();
        RevertirStrings revertir = new RevertirStrings();
        revertir.revertirString(pila3);

        // Ejercicio Pila de Llamadas
        PilaString pila4 = new PilaStringMetodo2();
        Llamadas  callStack = new Llamadas();
        callStack.simularLlamadas(pila4);

        // Ejercicio Navegación de Directorios
        PilaString pila5 = new PilaStringMetodo2();
        Directorios directorios = new Directorios();
        directorios.navegarDirectorios(pila5);

    }

}
