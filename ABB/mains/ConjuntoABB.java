package ABB;

public class ConjuntoABB {
    private ABBEnterosImpl arbol;

    public ConjuntoABB() {
        arbol = new ABBEnterosImpl();
    }

    public void agregar(int valor) {
        arbol.agregar(valor);
    }

    public boolean eliminar(int valor) {
        return arbol.eliminar(valor);
    }

    public boolean contiene(int valor) {
        return arbol.contiene(valor);
    }

    public int cantidad() {
        return arbol.cantidad();
    }

    public int elegir() {
        int valor = (int) (Math.random() * 2) + 1;

        if (valor == 1) {
            return arbol.minimo();
        } else {
            return arbol.maximo();
        }
    }

    public ConjuntoABB interseccion(ConjuntoABB conjunto) {
        ConjuntoABB resultado = new ConjuntoABB();

        arbol.agregarElementosComunesEn(conjunto.arbol, resultado.arbol);
        return resultado;
    }
}
