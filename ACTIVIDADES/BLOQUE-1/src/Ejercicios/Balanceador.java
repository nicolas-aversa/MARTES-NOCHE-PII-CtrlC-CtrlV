package Ejercicios;

import Ejercicios.Interfaz.PilaString;

/* Estrategia 1:
 * No podemos usar el metodo 3, porque el puntero
 * es de tipo int y guardamos String con el codigo
 *
 * Para el desarrollo del ejercicio
 * apilamos cada ( que el usuario ingresa
 * luego con cada ) desapilamos
 * como condicion para validar si esta o no
 * balanceada la sintaxis, validamos que la pila
 * este vacia
 */

public class Balanceador {

    public void balancearParentesis(PilaString pila) {

        System.out.println();
        System.out.println();
        System.out.println("--- Ejercicio 3 ---");
        pila.InicializarPila();

        System.out.println("El usuario comienza a escribir");
        System.out.println("( ");
        pila.Apilar("(");
        System.out.println("( ( ");
        pila.Apilar("(");
        System.out.println("( ( a ");
        System.out.println("( ( a + ");
        System.out.println("( ( a + b ");
        System.out.println("( ( a + b ) ");
        pila.Desapilar();
        System.out.println("( ( a + b ) * ");
        System.out.println("( ( a + b ) * c ");

        System.out.println("Termina la sentencia y actua el balanceador");

        if (pila.PilaVacia()) {
            System.out.println("Parentesis Balanceados");
        }

        if (!pila.PilaVacia()) {
            System.out.println("Parentesis NO Balanceados");
        }
    }
}
