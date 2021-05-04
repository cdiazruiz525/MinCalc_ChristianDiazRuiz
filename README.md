# MinCalc_ChristianDiazRuiz
Creacion de una calculadora simple para Android.

Como usar MinCalc:
1. Primero deberá escribir una cifra
1. Una vez escrita, elija unerador.
1. La proxima cifra pasará a escribirse en el cuadrado derecho.
1. Una vez haya terminado de escribir la segunda cifra, pulse en igual (=).
2. Pasará a mostrarse una pantalla en la que se le de el resultado de la operación.

La calculadora se basa en el uso de empty activities en Android Studio.

La primera empty Activity, será el main, la cual es denominada MainActivity. Esta se encargará de llevar a cabo distintos metodos,
según el boton que esté pulsado. El layout de la actividad es el siguiente:

Imagen layout

Quedará de la siguiente forma:

Imagen app


Como segunda actividad, tenemos Activity2. Esta actividad se encargara de recibir un String con un mensaje de resultado, para despues pasar
y mostrar el mensaje en un text view.

layout Actividad 2

Imagen app Actividad 2


La calculadora esta programada de tal manera, que toma en cuenta los simple casos de uso de una calculadora normal.

Por ejemplo:
* No permitirá escribir más de un cero seguido al principio.
* Solo podrá haber una coma/punto por cifra dada.
* En caso de no ser decimal, ningún numero podra comenzar por 0.
* La calculadora permite cambiar el operador usado, una vez hayamos escrito la expresión.
* La Activity2 nos permitira volver/retornar a la MainActivity.

Ejemplo de uso de la MinCalc:

Imagen1

Imagen2

Imagen3
