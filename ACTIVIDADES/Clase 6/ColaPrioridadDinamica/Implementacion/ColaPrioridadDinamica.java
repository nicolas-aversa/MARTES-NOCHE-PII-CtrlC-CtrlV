package Implementacion;
import Implementacion.Cliente;

import Interface.ColaPrioridadTDA;

public class ColaPrioridadDinamica implements ColaPrioridadTDA {

    // La lista está ordenada de mayor a menor prioridad.
    // frente apunta al nodo con mayor prioridad (el primero en salir).
    private Node frente;

    @Override
    public void InicializarColaPrioridad() {
        frente = null;
    }

    @Override
    public void AcolarPrioridad(Cliente cliente) {
        Node nuevo = new Node(cliente, null);

        if (frente == null || cliente.valorDePrioridad > frente.getPrioridad()) {
            // Insertar al frente si la lista está vacía o tiene mayor prioridad.
            nuevo.setNext(frente);
            frente = nuevo;
        } else {
            // Avanzar hasta encontrar el lugar correcto (orden descendente de prioridad).
            Node curr = frente;
            while (curr.getNext() != null && curr.getNext().getPrioridad() >= cliente.valorDePrioridad) {
                curr = curr.getNext();
            }
            nuevo.setNext(curr.getNext());
            curr.setNext(nuevo);
        }
    }

    @Override
    public void Desacolar() {
        if (!ColaVacia()) {
            frente = frente.getNext();
        }
    }

    @Override
    public boolean ColaVacia() {
        return frente == null;
    }

    @Override
    public Cliente Primero() {
        return frente.getDato();
    }

    @Override
    public int Prioridad() {
        return frente.getPrioridad();
    }
}
