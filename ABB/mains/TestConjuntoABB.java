package ABB.mains;

import ABB.ConjuntoABB;

public class TestConjuntoABB {
    public static void main(String[] args) {

        ConjuntoABB conjuntoA = new ConjuntoABB();
        ConjuntoABB conjuntoB = new ConjuntoABB();

        conjuntoA.agregar(8);
        conjuntoA.agregar(3);
        conjuntoA.agregar(10);
        conjuntoA.agregar(1);
        conjuntoA.agregar(6);

        conjuntoB.agregar(6);
        conjuntoB.agregar(10);
        conjuntoB.agregar(15);
        conjuntoB.agregar(1);

        ConjuntoABB resultado = conjuntoA.interseccion(conjuntoB);

        System.out.println("Elementos en resultado:        " + resultado.cantidad());
        System.out.println("Elegir un numero de resultado: " + resultado.elegir());
        System.out.println("Elegir un numero de resultado: " + resultado.elegir());
        System.out.println("¿Resultado contiene 1?         " + resultado.contiene(1));
        System.out.println("¿Resultado contiene 6?         " + resultado.contiene(6));
        System.out.println("¿Resultado contiene 10?        " + resultado.contiene(10));
        System.out.println("¿Resultado contiene 3?         " + resultado.contiene(3));
    }
}
