package Implementacion;

public class Node {

    private Cliente dato;
    private Node next;

    public Node(Cliente dato, Node next) {
        this.dato = dato;
        this.next = next;
    }

    public Cliente getDato() {
        return dato;
    }

    public void setDato(Cliente dato) {
        this.dato = dato;
    }

    public int getPrioridad() {
        return dato.valorDePrioridad;
    }

    public void setPrioridad(int prioridad) {
        this.dato.valorDePrioridad = prioridad;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}
