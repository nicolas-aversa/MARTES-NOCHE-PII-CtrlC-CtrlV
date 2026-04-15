package Implementacion;
import Implementacion.DiccionarioMultipleDinamico;
import Interface.DiccionarioMultipleTDA;

public class DiccionarioMultipleDinamico_Ejercicio {
    public static void main(String[] args) {
        DiccionarioMultipleDinamico diccionarioMD = new DiccionarioMultipleDinamico();
        diccionarioMD.InicializarDiccionario();
        EjecutarEjercicio(diccionarioMD);
    }

    private static void EjecutarEjercicio(DiccionarioMultipleTDA diccionarioMD)
    {
        diccionarioMD.Agregar("Alegre", "Felíz");
        diccionarioMD.Agregar("Alegre", "Contento");
        diccionarioMD.Agregar("Fiesta", "Celebración");
        diccionarioMD.Agregar("Fiesta", "Reunión");
        diccionarioMD.Agregar("Fiesta", "Festejo");
        diccionarioMD.Agregar("Fiesta", "Party");

        System.out.println("Claves del diccionario:");
        String[] claves1 = diccionarioMD.Claves();
        for (int i = 0; i < claves1.length; i++) {
            System.out.println(claves1[i]);
        }

        System.out.println("Valores de la clave Fista:");
        String[] valores7 = diccionarioMD.Recuperar("Fiesta");
        for (int i = 0; i < valores7.length; i++) {
            System.out.println(valores7[i]);
        }

        diccionarioMD.EliminarValor("Fiesta", "Party");

        System.out.println("Valores de la clave Fiesta luego de eliminar el valor Party:");
        String[] valores7b = diccionarioMD.Recuperar("Fiesta");
        for (int i = 0; i < valores7b.length; i++) {
            System.out.println(valores7b[i]);
        }

        diccionarioMD.Eliminar("Fiesta");

        System.out.println("Claves luego de eliminar la clave Fiesta:");
        String[] claves2 = diccionarioMD.Claves();
        for (int i = 0; i < claves2.length; i++) {
            System.out.println(claves2[i]);
        }

    }
}
