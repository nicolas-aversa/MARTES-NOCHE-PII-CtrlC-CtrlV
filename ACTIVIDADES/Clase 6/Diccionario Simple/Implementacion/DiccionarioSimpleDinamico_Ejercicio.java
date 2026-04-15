package Implementacion;
import Implementacion.DiccionarioSimpleDinamico;
import Interface.DiccionarioSimpleTDA;

public class DiccionarioSimpleDinamico_Ejercicio {
    public static void main(String[] args) {
        DiccionarioSimpleTDA d = new DiccionarioSimpleDinamico();
        d.InicializarDiccionario();
        EjecutarEjercicio(d);

        System.out.println("Contactos guardados:");
        String[] claves1 = d.Claves();
        for (int i = 0; i < claves1.length; i++) {
            System.out.println(claves1[i]);
        }

        System.out.println("Actualizando el contacto de Valentino Virzi....");
        d.Agregar("Valentino Virzi", 1112345678);


        d.Eliminar("Caterina Turdo");

        System.out.println("Contactos luego de eliminar a Caterina Turdo:");
        String[] claves2 = d.Claves();
        for (int i = 0; i < claves2.length; i++) {
            System.out.println(claves2[i]);
        }
    }

    private static void EjecutarEjercicio (DiccionarioSimpleTDA d) {
        d.Agregar("Nicolas Aversa", 1111111111);
        d.Agregar("Ezequiel Castelnuovo", 1122222222);
        d.Agregar("Valentino Virzi", 1133333333);
        d.Agregar("Caterina Turdo", 1144444444);
        d.Agregar("Guido Botta", 1155555555);
    }
}
