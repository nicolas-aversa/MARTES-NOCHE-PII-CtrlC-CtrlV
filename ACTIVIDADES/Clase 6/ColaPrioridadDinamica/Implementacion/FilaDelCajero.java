package Implementacion;
import Implementacion.ColaPrioridadDinamica;
import Interface.ColaPrioridadTDA;

public class FilaDelCajero
{
    ColaPrioridadTDA colaDelCajero = new ColaPrioridadDinamica();

    public void Inicializar(){
        colaDelCajero.InicializarColaPrioridad();
    }

    public void Ejercicio (){
        colaDelCajero.AcolarPrioridad(new Cliente("Mirna", "Jubilado"));
        colaDelCajero.AcolarPrioridad(new Cliente("Valentino", "Comun"));
        colaDelCajero.AcolarPrioridad(new Cliente("Esteban", "Discapacitado"));
        colaDelCajero.AcolarPrioridad(new Cliente("Jorge", "Jubilado Discapacitado"));
        colaDelCajero.AcolarPrioridad(new Cliente("Mariana", "Embarazada"));
        colaDelCajero.AcolarPrioridad(new Cliente("Estela", "Jubilado"));
        colaDelCajero.AcolarPrioridad(new Cliente("Leonora", "Jubilado Discapacitado"));

        while(!colaDelCajero.ColaVacia()){
            ImprimirEnPantallaElPrimero();
            colaDelCajero.Desacolar();
        }
        System.out.println("¿Cola vacía?: " + colaDelCajero.ColaVacia());
    }

    private void ImprimirEnPantallaElPrimero(){
        System.out.println("Primero: " + colaDelCajero.Primero().nombre + " -- Tipo de prioridad: " + colaDelCajero.Primero().tipoDePrioridad);
        System.out.println("Valor de prioridad del primero: " + colaDelCajero.Prioridad());
    }

}
