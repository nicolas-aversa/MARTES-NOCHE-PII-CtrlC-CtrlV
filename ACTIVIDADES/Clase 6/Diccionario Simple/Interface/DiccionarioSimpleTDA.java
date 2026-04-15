package Interface;

public interface DiccionarioSimpleTDA {
    void InicializarDiccionario();
    void Agregar(String clave, int valor);
    void Eliminar(String clave);
    String[] Claves();
}
