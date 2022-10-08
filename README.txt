#Laboratorio 07/10/2022
Francisco Muñoz

## Descripcion
Proyecto de Inteligencia Artificial hecho en el IDE "IntelliJ IDEA" "(https://www.jetbrains.com/es-es/idea/)",
el objetivo de este es que a través de un camino marcado en una matriz, una casilla pueda ingresar y detectar dicho camino
llegando hasta el final de forma autónoma.

#Metodología implementada
La casilla ira examinando el camino que tiene a su alrededor, si esta esta marcada en negro avanzará hacia ella
esto se puede realizar gracias a unas verificaciones en sentido horario Derecha,Abajo,Izquierda,Arriba respectivamente
ademas de enviar un mensaje por terminal mostrando el movimiento realizado, pero antes de esto se guardará la posicion previa al movimiento para evitar que regrese a dicha posicion en caso de que no encuentre la siguiente.
Una vez que se encuentre la ultima casilla se enviara un mensaje por terminal informando al usuario que el camino ha sido recorrido
en su totalidad.

#Ejecución recomendada
1.Instalar IntellJ IDEA para evitar problemas de compatibilidad
2.Descomprimir el archivo .zip y abrir la carpeta con el IDE
3.Ejecutar el Metodo "Main.java".