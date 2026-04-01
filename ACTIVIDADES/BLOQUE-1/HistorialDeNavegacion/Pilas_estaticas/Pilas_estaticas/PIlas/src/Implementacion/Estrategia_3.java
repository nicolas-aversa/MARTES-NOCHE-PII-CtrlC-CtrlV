package Implementacion;

import Interfaces.PilaTDAString;

public class Estrategia_3 implements PilaTDAString {

    private static final int MAX = 100;
    private String[] datos;

    @Override
    public void InicializarPila() {
        datos = new String[MAX + 1]; // +1 porque datos[0] es el contador
        datos[0] = "0";
    }

    @Override
    public void Apilar(String x) {
        int cantidad = Integer.parseInt(datos[0]);
        if (cantidad < MAX) {
            cantidad++;
            datos[cantidad] = x;
            datos[0] = String.valueOf(cantidad);
        }
    }

    @Override
    public void Desapilar() {
        if (!PilaVacia()) {
            int cantidad = Integer.parseInt(datos[0]);
            cantidad--;
            datos[0] = String.valueOf(cantidad);
        }
    }

    @Override
    public String Tope() {
        int cantidad = Integer.parseInt(datos[0]);
        return datos[cantidad];
    }

    @Override
    public boolean PilaVacia() {
        return Integer.parseInt(datos[0]) == 0;
    }
}