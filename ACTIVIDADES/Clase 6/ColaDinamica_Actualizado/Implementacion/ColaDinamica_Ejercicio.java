package Implementacion;
import Implementacion.ColaDinamica;
import Interface.ColaTDA;

public class ColaDinamica_Ejercicio {
    public static void main(String[] args)
    {
        ColaTDA cola = new ColaDinamica();
        cola.InicializarCola();
        EjecutarEjercicio(cola);
    }

    private static void EjecutarEjercicio(ColaTDA cola)
    {
        AcolarDocumentosAImprimir(cola);
        while (!cola.ColaVacia()){
            ImprimeYDesacola(cola);
        }
        System.out.println("Cola de impresión vacía: " + cola.ColaVacia());
    }

    private static void AcolarDocumentosAImprimir(ColaTDA cola)
    {
        cola.Acolar("Documento1");
        cola.Acolar("Documento2");
        cola.Acolar("Documento3");
        cola.Acolar("Documento4");
        cola.Acolar("Documento5");
    }

    private static void ImprimeYDesacola(ColaTDA cola)
    {
        System.out.println("Impimiendo... " + cola.Primero());
        cola.Desacolar();
        System.out.println("Documento impreso con éxito");
    }
}
