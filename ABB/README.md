Ejercicio 1

La complejidad de agregar es O(n), el método lo único que hace es delegar en agregarRecursivo;
El peor camino, sería un ABB degenerado como una lista enlazada, por tanto, se debería recorrer el
árbol completo para agregar un nuevo elemento.

Ejercicio 2

1_
--A) El método ABB.mains, intenta crear dentro del bloque try un ABB vacío e insertar números desde el 1 
        hasta el 50000, en el caso de que surja un error por overflow de la pila de ejecución, el catch 
        imprime por consola, una variable representativa de la cantidad de posiciones que tenía la pila en ese
        momento.

--B) La problematica se da por una combinación de factores, al insertarse los valores de manera ordenada
        en el árbol el mismo se deforma, agregado a la recursividad hacen que cada vez que se quiere agregar
        un nuevo valor se agrege un llamado a la pila de ejecucion q termina llenandose y lanzando el error.

--C) Porque cada nueva llamada recursiva ocupa una nueva posición en la pila de ejecución

3_

Método recursivo

Si bien el código es más corto y fácil de leer. Se usa la pila de ejecución de Java
En un árbol muy profundo puede producir que la misma se llene y termine dando un error.
El ABB degenerado del ejemplo, es una buena muestra de este problema.

Método iterativo

Usa la memoria auxiliar por eso es más segura para árboles muy profundos. El problema es
el código es un poco más largo y difícil de mantener, además de trabajar con 2 referencias
el nodo actual y el padre.


Ejercicio 3

La complejidad temporal en el peor caso del método es O(n). Si el árbol está degenerado (Que es el caso
que estamos trabajando), se puede dar la situacion de recorrer el arbol completo para encontrar el valor
deseado.

Comparado con una búsqueda lineal en un array, ambas pueden tener peor caso O(n), aunque el ABB puede ser 
más eficiente si está balanceado.
Comparado con búsqueda binaria en un array ordenado, la búsqueda binaria tiene peor caso O(log n),
mientras que el ABB solo garantiza O(log n) si está balanceado.


Ejercicio 5

La particularidad no es el método en sí, sino que a pesar de que los datos no fueron cargados de manera ordenada
y no se ejecutó ningún algoritmo de ordenamiento. La salida queda ordenada por la propiedad del ABB.
Además, sirve como verificación del árbol, si el inorden queda desordenado, el árbol no respeta la propiedad de ABB;
si deberían prohibirse duplicados y aparecen, también evidencia un problema en la inserción.

La complejidad en los 3 métodos es O(n), justamente porque si o si los métodos recorren todos los nodos

