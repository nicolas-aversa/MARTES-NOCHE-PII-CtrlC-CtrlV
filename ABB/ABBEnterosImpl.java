package ABB;

import ABB.interfaces.ABBEnteros;

public class ABBEnterosImpl implements ABBEnteros {
    private Nodo raiz;


    // Métodos para Agregar
    @Override
    public void agregar(int valor) {
        raiz = agregarRecursivo(raiz, valor);
        // agregarIterativo(valor);
    }

    public Nodo agregarRecursivo(Nodo actual, int valor) {
        // caso base
        if (actual == null) {
            return new Nodo(valor);
        }

        if (valor < actual.valor) {
            actual.izquierdo = agregarRecursivo(actual.izquierdo, valor);
        } else if (valor > actual.valor) {
            actual.derecho = agregarRecursivo(actual.derecho, valor);
        }

        return actual;
        // throw new UnsupportedOperationException("Método no implementado");
    }

    public void agregarIterativo(int valor) {
        if (raiz == null) {
            raiz = new Nodo(valor);
            return;
        }

        Nodo actual = raiz;
        Nodo padre = null;

        while (actual != null) {
            padre = actual;

            if (valor == actual.valor) {
                return;
            }

            if (valor < actual.valor) {
                actual = actual.izquierdo;
            } else {
                actual = actual.derecho;
            }
        }

        if (valor < padre.valor) {
            padre.izquierdo = new Nodo(valor);
        } else {
            padre.derecho = new Nodo(valor);
        }
    }


    // Métodos para Validar
    @Override
    public boolean contiene(int valor) {
        return contieneRecursivo(raiz, valor);
    }

    private boolean contieneRecursivo(Nodo actual, int valor) {
        // caso base
        if (actual == null) {
            return false;
        }

        if (actual.valor == valor) {
            return true;
        }

        if (valor < actual.valor) {
            return contieneRecursivo(actual.izquierdo, valor);
        }

        return contieneRecursivo(actual.derecho, valor);
        // throw new UnsupportedOperationException("Método no implementado");
    }


    // Métodos para Eliminar
    @Override
    public boolean eliminar(int valor) {
        if (!contiene(valor)) {
            return false;
        }

        raiz = eliminarRecursivo(raiz, valor);
        return true;
    }

    private Nodo eliminarRecursivo(Nodo actual, int valor) {
        // caso base
        if (actual == null) {
            return null;
        }

        if (valor < actual.valor) {
            actual.izquierdo = eliminarRecursivo(actual.izquierdo, valor);

        } else if (valor > actual.valor) {
            actual.derecho = eliminarRecursivo(actual.derecho, valor);

        } else {
            // Caso 1: es hoja
            if (actual.izquierdo == null && actual.derecho == null) {
                return null;
            }

            // Caso 2-A: tiene solamente hijo derecho
            if (actual.izquierdo == null) {
                return actual.derecho;
            }

            // Caso 2-B: tiene solamente hijo izquierdo
            if (actual.derecho == null) {
                return actual.izquierdo;
            }

            // Caso 3: tiene dos hijos
            Nodo sucesor = minimoRecursivo(actual.derecho);
            actual.valor = sucesor.valor;
            actual.derecho = eliminarRecursivo(actual.derecho, sucesor.valor);
        }

        return actual;
        // throw new UnsupportedOperationException("Método no implementado");
    }


    // Métodos para Cantidad
    @Override
    public int cantidad() {
        return cantidadRecursivo(raiz);
    }

    private int cantidadRecursivo(Nodo actual) {
        // caso base
        if (actual == null) {
            return 0;
        }

        return 1 + cantidadRecursivo(actual.izquierdo) + cantidadRecursivo(actual.derecho);
        // throw new UnsupportedOperationException("Método no implementado");
    }

    // Métodos para Altura
    @Override
    public int altura() {
        return alturaRecursivo(raiz);
    }

    private int alturaRecursivo(Nodo actual) {
        // caso base
        if (actual == null) {
            return 0;
        }

        int alturaIzquierda = alturaRecursivo(actual.izquierdo);
        int alturaDerecha = alturaRecursivo(actual.derecho);

        return 1 + Math.max(alturaIzquierda, alturaDerecha);
        // throw new UnsupportedOperationException("Método no implementado");
    }


    // Métodos para Minimo
    @Override
    public int minimo() {
        if (raiz == null) {
            throw new IllegalStateException("El árbol está vacío");
        }

        return minimoRecursivo(raiz).valor;
    }

    private Nodo minimoRecursivo(Nodo actual) {
        // caso base
        if (actual.izquierdo == null) {
            return actual;
        }

        return minimoRecursivo(actual.izquierdo);
        // throw new UnsupportedOperationException("Método no implementado");
    }


    // Métodos para Maximo
    @Override
    public int maximo() {
        if (raiz == null) {
            throw new IllegalStateException("El árbol está vacío");
        }

        return maximoRecursivo(raiz).valor;
    }

    private Nodo maximoRecursivo(Nodo actual) {
        // caso base
        if (actual.derecho == null) {
            return actual;
        }

        return maximoRecursivo(actual.derecho);
        // throw new UnsupportedOperationException("Método no implementado");
    }


    // Métodos para Recorridos
    @Override
    public void mostrarInOrden() {
        mostrarInOrdenRecursivo(raiz);
    }

    private void mostrarInOrdenRecursivo(Nodo actual) {
        // caso base
        if (actual == null) {
            return;
        }

        mostrarInOrdenRecursivo(actual.izquierdo);
        System.out.print(actual.valor + " ");
        mostrarInOrdenRecursivo(actual.derecho);
        // throw new UnsupportedOperationException("Método no implementado");
    }

    @Override
    public void mostrarPreOrden() {
        mostrarPreOrdenRecursivo(raiz);
    }

    private void mostrarPreOrdenRecursivo(Nodo actual) {
        // caso base
        if (actual == null) {
            return;
        }

        System.out.print(actual.valor + " ");
        mostrarPreOrdenRecursivo(actual.izquierdo);
        mostrarPreOrdenRecursivo(actual.derecho);
        // throw new UnsupportedOperationException("Método no implementado");
    }

    @Override
    public void mostrarPostOrden() {
        mostrarPostOrdenRecursivo(raiz);
    }

    private void mostrarPostOrdenRecursivo(Nodo actual) {
        // caso base
        if (actual == null) {
            return;
        }

        mostrarPostOrdenRecursivo(actual.izquierdo);
        mostrarPostOrdenRecursivo(actual.derecho);
        System.out.print(actual.valor + " ");
        // throw new UnsupportedOperationException("Método no implementado");
    }


    // Método enRango
    public boolean enRango(int desde, int hasta) {
        // Árbol NO vacío
        if (raiz == null) {
            return false;
        }

        Nodo minimo = minimoRecursivo(raiz);
        Nodo maximo = maximoRecursivo(raiz);

        return desde <= minimo.valor && maximo.valor <= hasta;
    }

    // Métodos para trabajar el conjunto
    public void agregarElementosComunesEn(ABBEnteros arbol1, ABBEnteros destino) {
        agregarElementosComunesEnRecursivo(raiz, arbol1, destino);
    }

    private void agregarElementosComunesEnRecursivo(Nodo actual, ABBEnteros arbol1, ABBEnteros destino) {
        // Caso base
        if (actual == null) {
            return;
        }

        if (arbol1.contiene(actual.valor)) {
            destino.agregar(actual.valor);
        }

        agregarElementosComunesEnRecursivo(actual.izquierdo, arbol1, destino);
        agregarElementosComunesEnRecursivo(actual.derecho, arbol1, destino);
    }
}
