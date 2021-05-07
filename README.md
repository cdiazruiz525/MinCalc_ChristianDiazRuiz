# MinCalc 🖩
Creacion de una calculadora simple para Android.

## Como usar MinCalc 📋
1. Primero deberá escribir una cifra.
1. Una vez escrita, elija operador.
1. La proxima cifra pasará a escribirse en el cuadrado derecho.
1. Una vez haya terminado de escribir la segunda cifra, pulse en igual (=).
2. Pasará a mostrarse una pantalla en la que se le de el resultado de la operación.

### Ejemplo de uso de la MinCalc 🚀



## Código ⚙️

La calculadora se basa en el uso de empty activities en Android Studio.

### MainActivity
La primera empty Activity, será el main, la cual es denominada MainActivity. Esta se encargará de llevar a cabo distintos metodos,
según el boton que esté pulsado. El layout de la actividad es el siguiente:

![MainActivity_Layout](https://github.com/cdiazruiz525/MinCalc_ChristianDiazRuiz/blob/main/MinCalc_Images/MainActivity_Layout.png)

Quedará de la siguiente forma:

![MainActivity_Appearance](https://github.com/cdiazruiz525/MinCalc_ChristianDiazRuiz/blob/main/MinCalc_Images/MainActivity_Appearance.png)


![MainActivity_Appearance](https://github.com/cdiazruiz525/MinCalc_ChristianDiazRuiz/blob/main/MinCalc_Images/MainActivity_Appearance.png)

### Activity_2
Como segunda actividad, tenemos Activity2. Esta actividad se encargara de recibir un String con un mensaje de resultado, para despues pasar
y mostrar el mensaje en un text view.

![Activity2_Layout](https://github.com/cdiazruiz525/MinCalc_ChristianDiazRuiz/blob/main/MinCalc_Images/Activity2_Layout.png)

![Activity2_Appearance](https://github.com/cdiazruiz525/MinCalc_ChristianDiazRuiz/blob/main/MinCalc_Images/Activity2_Appearance.png)


## Depuración 🔧

La calculadora esta programada de tal manera, que toma en cuenta los simple casos de uso de una calculadora normal.

Por ejemplo:
* No permitirá escribir más de un cero seguido al principio.
* Solo podrá haber una coma/punto por cifra dada.
* En caso de no ser decimal, ningún numero podra comenzar por 0.
* La calculadora permite cambiar el operador usado, una vez hayamos escrito la expresión.
* La Activity2 nos permitira volver/retornar a la MainActivity.


## Enlaces 🔗

* [MainActivity](https://github.com/cdiazruiz525/MinCalc_ChristianDiazRuiz/blob/main/MinCalc/app/src/main/java/com/chrsoft/mincalc/MainActivity.java)
  * [Layout MainActivity](https://github.com/cdiazruiz525/MinCalc_ChristianDiazRuiz/blob/main/MinCalc/app/src/main/res/layout/activity_main.xml)
* [Activity2](https://github.com/cdiazruiz525/MinCalc_ChristianDiazRuiz/blob/main/MinCalc/app/src/main/java/com/chrsoft/mincalc/Activity2.java)
  * [Layout Activity2](https://github.com/cdiazruiz525/MinCalc_ChristianDiazRuiz/blob/main/MinCalc/app/src/main/res/layout/activity_2.xml)
* [Strings](https://github.com/cdiazruiz525/MinCalc_ChristianDiazRuiz/blob/main/MinCalc/app/src/main/res/values/strings.xml)
* [Manifest](https://github.com/cdiazruiz525/MinCalc_ChristianDiazRuiz/blob/main/MinCalc/app/src/main/AndroidManifest.xml)
* [Carpeta de resources](https://github.com/cdiazruiz525/MinCalc_ChristianDiazRuiz/tree/main/MinCalc/app/src/main/res)


## Autor ✒️

* **Christian Díaz** - [cdiazruiz525](https://github.com/cdiazruiz525)
