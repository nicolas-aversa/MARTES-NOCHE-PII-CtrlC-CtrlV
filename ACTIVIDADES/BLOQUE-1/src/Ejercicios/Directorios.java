package Ejercicios;

import Ejercicios.Interfaz.PilaString;

/* Estrategia 2:
 * Solo la usamos para tenerla como
 * ejemplo, no es necesaria ni conveniente
 * debido a su complejidad
 *
 * Para el desarrollo del ejercicio
 * reutilizamos el tope de la pila
 * para armar la ruta completa de directorios
 */

public class Directorios {

    public void navegarDirectorios(PilaString pila) {

        System.out.println();
        System.out.println();
        System.out.println("--- Ejercicio 6 ---");
        pila.InicializarPila();

        System.out.println("El usuario comienza en C:/");
        pila.Apilar("C:/");

        System.out.println("Entra a: " + pila.Tope() + "Usuarios/");
        pila.Apilar(pila.Tope() + "Usuarios/");

        System.out.println("Entra a: " + pila.Tope() + "Documentos/");
        pila.Apilar(pila.Tope() + "Documentos/");

        System.out.println();
        System.out.println("Directorio actual: " + pila.Tope());

        System.out.println();
        System.out.println("El usuario presiona 'Subir un nivel'");
        pila.Desapilar();
        System.out.println("Directorio actual: " + pila.Tope());

        System.out.println("Sube otro nivel");
        pila.Desapilar();
        System.out.println("Directorio actual: " + pila.Tope());

        System.out.println("Sube otro nivel");
        pila.Desapilar();

        if (!pila.PilaVacia()) {
            System.out.println("Directorio actual: " + pila.Tope());
        } else {
            System.out.println("Ya no hay más niveles (root alcanzado)");
        }
    }
}
