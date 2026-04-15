package Implementacion;



public class Cliente {
    public String nombre;
    public String tipoDePrioridad;
    public int valorDePrioridad;

    public Cliente(String _nombre, String prioridad){
        nombre = _nombre;
        SetPrioridad(prioridad);
    }

    private void SetPrioridad(String prioridad){
        if(!prioridad.isEmpty() || prioridad!=null){
            tipoDePrioridad = prioridad;
            GetPrioridad(prioridad);
        };
    }
    private void GetPrioridad(String prioridad){
        switch (prioridad){
            case "Comun":
                valorDePrioridad=0;
                return;
            case "Embarazada":
                valorDePrioridad=25;
                return;
            case "Discapacitado":
                valorDePrioridad=50;
                return;
            case "Jubilado":
                valorDePrioridad=75;
                return;
            case "Jubilado Discapacitado":
                valorDePrioridad=100;
                return;
            default:
                valorDePrioridad=0;
        }
    }
}
