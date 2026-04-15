package Implementacion;
import Implementacion.PilaDinamica;
import Interfaces.PilaTDA;

public class PilaDinamica_Ejercicio
{
    public void IniciarEjercicio(){
        PilaTDA pila = new PilaDinamica();
        EjecutarEjercicio(pila);
    }

    public void EjecutarEjercicio(PilaTDA pila)
    {
        pila.InicializarPila();
        ApilarElementosInicialesDelEjercicio(pila);
        while(!pila.PilaVacia()){
            ImprimeYDesapila(pila);
        }
        System.out.println("¿Pila vacía?: " + pila.PilaVacia());
    }

    private void ApilarElementosInicialesDelEjercicio(PilaTDA pila)
    {
        pila.Apilar("fi.uba.ar");
        pila.Apilar("campus.utn.edu.ar");
        pila.Apilar("stackoverflow.com");
    }
    private void ImprimeYDesapila(PilaTDA pila)
    {
        System.out.println("Tope luego de desapilar una vez: " + pila.Tope());
        pila.Desapilar();
    }
}
