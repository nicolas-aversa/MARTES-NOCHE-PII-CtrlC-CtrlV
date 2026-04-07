package Ejercicios.Implementaciones;

import Ejercicios.Interfaz.PilaString;

public class PilaStringMetodo2 implements PilaString {

    private static final int MAX = 10;
    private String[] datos;
    private int cantidad;

    @Override
    public void InicializarPila() {
        datos = new String[MAX];
        cantidad = 0;
    }

    @Override
    public void Apilar(String x) {
        if (cantidad < MAX) {
            for (int i = cantidad; i > 0; i--) {
                datos[i] = datos[i - 1];
            }
            datos[0] = x;
            cantidad++;
        }
    }

    @Override
    public void Desapilar() {
        if (!PilaVacia()) {
            for (int i = 0; i < cantidad - 1; i++) {
                datos[i] = datos[i + 1];
            }
            cantidad--;
        }
    }

    @Override
    public String Tope() {
        if (!PilaVacia()) {
            return datos[0];
        }
        return "";
    }

    @Override
    public boolean PilaVacia() {
        return cantidad == 0;
    }
}
