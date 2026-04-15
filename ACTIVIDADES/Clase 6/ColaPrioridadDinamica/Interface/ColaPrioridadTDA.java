package Interface;
import Implementacion.Cliente;

public interface ColaPrioridadTDA {
    void InicializarColaPrioridad();
    void AcolarPrioridad(Cliente cliente);
    void Desacolar();
    boolean ColaVacia();
    Cliente Primero();
    int Prioridad();
}
