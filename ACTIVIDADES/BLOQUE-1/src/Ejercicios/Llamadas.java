package Ejercicios;

import Ejercicios.Interfaz.PilaString;

/* Estrategia 2:
 * Solo la usamos para tenerla como
 * ejemplo, no es necesaria ni conveniente
 * debido a su complejidad
 *
 * Para el desarrollo del ejercicio
 * apilamos cada llamada en el flujo
 * de ejecucucion del codigo, luego a
 * medida q terminan los mismos de desapilan
 */

public class Llamadas {

    public void simularLlamadas(PilaString pila) {

        System.out.println();
        System.out.println();
        System.out.println("--- Ejercicio 5 ---");
        pila.InicializarPila();

        System.out.println("El usuario llama a Main()");
        pila.Apilar("Main()");

        System.out.println("Main() llama a CalcularPromedio()");
        pila.Apilar("CalcularPromedio()");

        System.out.println("CalcularPromedio() llama a Sumar()");
        pila.Apilar("Sumar()");

        System.out.println();
        System.out.println("Se ejecuta el codigo");

        while (!pila.PilaVacia()) {
            System.out.println("Finaliza: " + pila.Tope());
            pila.Desapilar();
        }

        System.out.println("El usuario recibe en consola el resultado de la suma");
    }
}
