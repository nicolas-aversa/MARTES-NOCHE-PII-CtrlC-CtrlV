package Implementacion;

public class Node {

    private String clave;
    private int valor;
    private Node next;

    public Node(String clave, int valor, Node next) {
        this.clave = clave;
        this.valor = valor;
        this.next = next;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}
