package Ejercicios;

import Ejercicios.Interfaz.PilaString;

/* Estrategia 1:
 * No podemos usar el metodo 3, porque el puntero
 * es de tipo int y guardamos String con el codigo
 *
 * Para el desarrollo del ejercicio solo tomamos
 * como ejemplo cuado el usuario borra lineas de codigo
 * en ese momento apilamos esa linea
 * luego al hacer CTRL+Z
 * 1° Devolvemos el tope
 * 2° Desapilamos 1 vez la pila
 */

public class Editor {

    public void editarCodigo (PilaString pila) {

        System.out.println();
        System.out.println();
        System.out.println("--- Ejercicio 2 ---");
        pila.InicializarPila();

        System.out.println("El usuario declara la interfaz:");
        System.out.println("public interface Pila {");
        System.out.println("    void InicializarPila();");
        System.out.println("    void Apilar(String x);");
        System.out.println("    void Desapilar();");
        System.out.println("    String Tope();");
        System.out.println("    boolean PilaVacia();");
        System.out.println("}");

        System.out.println();
        System.out.println("Borra el metodo Desapilar");
        pila.Apilar("    void Desapilar();");
        System.out.println("Borra el metodo Apilar");
        pila.Apilar("    void Apilar();");
        System.out.println("Borra el metodo InicializarPila");
        pila.Apilar("    void InicializarPila();");

        System.out.println();
        System.out.println("Hace CTRL+Z");
        System.out.println("La pila devuelve: "+ pila.Tope());
        pila.Desapilar();
        System.out.println("Hace CTRL+Z");
        System.out.println("La pila devuelve: "+ pila.Tope());
        pila.Desapilar();
        System.out.println("Hace CTRL+Z");
        System.out.println("La pila devuelve: "+ pila.Tope());
        pila.Desapilar();
    }
}