package Implementacion;

import Interface.ConjuntoTDA;

public class ConjuntoDinamico implements ConjuntoTDA {

    private Node cabeza; // apunta al primer nodo de la lista

    @Override
    public void InicializarConjunto() {
        cabeza = null;
    }

    @Override
    public void Agregar(String x) {
        // Solo agrega si el elemento no pertenece al conjunto (sin duplicados).
        if (!Pertenece(x)) {
            cabeza = new Node(x, cabeza);
        }
    }

    @Override
    public void Sacar(String x) {
        Node curr = cabeza;
        Node prev = null;

        while (curr != null && curr.getData() != x) {
            prev = curr;
            curr = curr.getNext();
        }

        if (curr != null) {
            if (prev == null) {
                cabeza = curr.getNext();
            } else {
                prev.setNext(curr.getNext());
            }
        }
    }

    @Override
    public boolean ConjuntoVacio() {
        return cabeza == null;
    }

    @Override
    public boolean Pertenece(String x) {
        Node curr = cabeza;
        while (curr != null) {
            if (curr.getData() == x) {
                return true;
            }
            curr = curr.getNext();
        }
        return false;
    }

    @Override
    public String Elegir() {
        return cabeza.getData();
    }
}
