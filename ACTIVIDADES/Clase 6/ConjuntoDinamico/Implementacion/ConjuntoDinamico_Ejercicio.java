package Implementacion;
import Implementacion.ConjuntoDinamico;
import Interface.ConjuntoTDA;

public class ConjuntoDinamico_Ejercicio {
    public static void main(String[] args) {
        ConjuntoTDA conjuntoD = new ConjuntoDinamico();
        conjuntoD.InicializarConjunto();
        EjecutarEjercicio(conjuntoD);
    }

    private static void EjecutarEjercicio(ConjuntoTDA conjuntoD)
    {
        //Ingresan invitados
        IngresarInvitadoALaFiesta(conjuntoD, "Nicolas Aversa");
        IngresarInvitadoALaFiesta(conjuntoD, "Ezequiel Castelnuevo");
        IngresarInvitadoALaFiesta(conjuntoD, "Valentino Virzi");
        IngresarInvitadoALaFiesta(conjuntoD, "Caterina Turdo");
        IngresarInvitadoALaFiesta(conjuntoD, "Guido Botta");

        //Repito alguno para probar
        IngresarInvitadoALaFiesta(conjuntoD, "Valentino Virzi");

        //Saco algunos
        SacarInvitadoDeLaFiesta(conjuntoD, "Nicolas Aversa");
        SacarInvitadoDeLaFiesta(conjuntoD, "Ezequiel Castelnuevo");

        //Consulto si alguno de los que quité sigue estando
        System.out.println("¿Nicolas Aversa está en la fiesta? "+ conjuntoD.Pertenece("Nicolas Aversa"));

        //Vuelvo a ingresar a uno
        IngresarInvitadoALaFiesta(conjuntoD, "Ezequiel Castelnuevo");
    }

    private static void IngresarInvitadoALaFiesta(ConjuntoTDA conjuntoD, String persona)
    {
        System.out.println(persona +" quiere ingresar a la fiesta");
        System.out.println("¿Puede hacerlo? "+ !conjuntoD.Pertenece(persona));
        conjuntoD.Agregar(persona);
    }

    private static void SacarInvitadoDeLaFiesta(ConjuntoTDA conjuntoD, String persona){
        System.out.println(persona +" se va de la fiesta");
        conjuntoD.Sacar(persona);
    }
}
