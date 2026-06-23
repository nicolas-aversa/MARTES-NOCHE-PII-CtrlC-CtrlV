package ABB.mains;

import ABB.interfaces.ABBEnteros;
import ABB.ABBEnterosImpl;

public class TestRecursividadABB {
    public static void main(String[] args) {

        ABBEnteros abb = new ABBEnterosImpl();

        for (int i = 1; i <= 10; i++) {
            int valor = (int) (Math.random() * 20) + 1;
            abb.agregar(valor);
        }

        /*
        int profundidad = 0;
        try {
            for (int i = 1; i <= 1000; i++) {
                abb.agregar(i);
                profundidad++;
            }

        } catch (StackOverflowError e) {
            System.out.println(
                "StackOverflow en profundidad: " + profundidad
            );
        }
        */


        System.out.println("Cantidad de nodos:  " + abb.cantidad());
        System.out.println("Altura del arbol :  " + abb.altura());
        System.out.println("Minimo del arbol :  " + abb.minimo());
        System.out.println("Maximo del arbol :  " + abb.maximo());
        abb.mostrarPreOrden();
        System.out.println();
        abb.mostrarInOrden();
        System.out.println();
        abb.mostrarPostOrden();
        System.out.println();
        System.out.println("¿ Es valido ? " + abb.enRango(1,2));
        System.out.println("Fin del programa");
    }
}
