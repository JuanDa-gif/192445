
# **Ejercicio 1: Calculadora de Comparaciones y Repetición**

---

- **¿Sabías que `Scanner.nextInt()` no consume el salto de línea?** Si mezclas tipos de entrada (por ejemplo, int y luego String), puede traerte problemas.
- **El operador `%` no es solo para saber si un número es par… 👀**
- Usa `Math.round()` para redondear si quieres impresionar, pero recuerda que el casting explícito también tiene su encanto.
- El `while(true)` tiene su fuerza, pero salir de él con un `break` bien ubicado es arte ninja.
- **No subestimes `Scanner.nextLine()` para hacer una pregunta tipo “¿Deseas continuar?” y evaluar con `.equalsIgnoreCase("si")`.**

optimizacion de los repositorios:
cambiamos el float d ela linea 16 para optimizar la memoria ya que llevaba un float y un float es para numeros decimales, en la linea 22 cambiamos el booleman por int, Cambiamos la linea 28 y 34 por un int. Tambien lo que haremos es cambiar la variables para un mejor entendimiento del codigo, otra cosa que hicimos fue cambiar la variable de la x por input, porque el profesor dijo que siempre era preferible hacerlo con eso, otra cosa que podemos hacer es optimizar el codigo, como lo haremos pues dejando de utilizar tanto if, osea que vamos a utilizar solo una variable, borramos casi 24 lineas de codigo la cual vamos a optimizar para que se convierta en una sola condicion, ya depues lo que vamos a hacver es hacer un for, el inconveniente es que no sabemos como hacer para que vaya guardando las variables para hacer el promedio de edad. inicializamos las variables para que corran en el for, despues de eso optimizamos el if el cual nos va ir guaradando el nombre de cada uno de los estudiantes junto con su edad, ahora la idea es sacar la edad promedio