package Ejercicios;

import Ejercicios.Interfaz.PilaString;

/* Estrategia 1:
 * No podemos usar el metodo 3, porque el puntero
 * es de tipo int y guardamos String con cada caracter
 *
 * Para el desarrollo del ejercicio
 * apilamos cada caracter que el usuario ingresa
 * y luego recorremos la pila completa para poder
 * dar vuelta la palabra
 */

public class RevertirStrings {

    public void revertirString(PilaString pila) {

        System.out.println();
        System.out.println();
        System.out.println("--- Ejercicio 4 ---");
        pila.InicializarPila();

        System.out.println("El usuario comienza a escribir");
        System.out.println("A");
        pila.Apilar("A");
        System.out.println("AL");
        pila.Apilar("L");
        System.out.println("ALG");
        pila.Apilar("G");
        System.out.println("ALGO");
        pila.Apilar("O");
        System.out.println("ALGOR");
        pila.Apilar("R");
        System.out.println("ALGORI");
        pila.Apilar("I");
        System.out.println("ALGORIT");
        pila.Apilar("T");
        System.out.println("ALGORITM");
        pila.Apilar("M");
        System.out.println("ALGORITMO");
        pila.Apilar("O");
        System.out.println("ALGORITMOS");
        pila.Apilar("S");

        System.out.println("Termina la sentencia y se revierte la palabra");

        while (!pila.PilaVacia()) {
            System.out.print(pila.Tope());
            pila.Desapilar();
        }
    }
}
