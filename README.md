# MinCalc
Creacion de una calculadora simple para Android.

## Como usar MinCalc 📋
1. Primero deberá escribir una cifra.
1. Una vez escrita, elija operador.
1. La proxima cifra pasará a escribirse.
1. Una vez haya terminado de escribir la segunda cifra, pulse en igual (=).
2. Pasará a mostrarse en pantalla el resultado de la operación.

### Ejemplo de uso de la MinCalc 🚀
![Ejemplo](https://github.com/cdiazruiz525/MinCalc_ChristianDiazRuiz/blob/main/MinCalc_Images/ejemplo.gif)


## Código ⚙️

La calculadora se basa en el uso de empty activities en Android Studio.

### MainActivity
#### Versión 1
La primera empty Activity, será el main, la cual es denominada [MainActivity](https://github.com/cdiazruiz525/MinCalc_ChristianDiazRuiz/blob/main/MinCalc/app/src/main/java/com/chrsoft/mincalc/MainActivity.java). Esta se encargará de llevar a cabo distintos metodos,
según el boton que esté pulsado. El [layout](https://github.com/cdiazruiz525/MinCalc_ChristianDiazRuiz/blob/main/MinCalc/app/src/main/res/layout/activity_main.xml) de la actividad es el siguiente:

![MainActivity_Layout](https://github.com/cdiazruiz525/MinCalc_ChristianDiazRuiz/blob/main/MinCalc_Images/MainActivity_Layout.png)

Quedará de la siguiente forma:

![MainActivity_Appearance](https://github.com/cdiazruiz525/MinCalc_ChristianDiazRuiz/blob/main/MinCalc_Images/MainActivity_Appearance.png)


#### Versión 2
En la v2 se han establecidos numerosos cambios en la clase MainActivity, siendo los principales, la implementación de una sola pantalla que interactue con nuestro layout, además de la adición de nuevas funcionalidades, como son los bontones "Reiniciar" y "Borrar". En el codigo se ha realizado una gran depuración y optimización de los metodos usados.
El diseño de MainActivity, pasa a quedar de la siguiente forma:

![MainActivity_Design_v2](https://github.com/cdiazruiz525/MinCalc_ChristianDiazRuiz/blob/main/MinCalc_Images/MainActivity_Design_v2.png)


### Activity_2
(En desuso a partir de v2)
Como segunda actividad, tenemos [Activity_2](https://github.com/cdiazruiz525/MinCalc_ChristianDiazRuiz/blob/main/MinCalc/app/src/main/java/com/chrsoft/mincalc/Activity2.java). Esta actividad se encargara de recibir un String con un mensaje de resultado, para despues mediante el [layout](https://github.com/cdiazruiz525/MinCalc_ChristianDiazRuiz/blob/main/MinCalc/app/src/main/res/layout/activity_2.xml), mostrar el mensaje en un text view.

![Activity2_Layout](https://github.com/cdiazruiz525/MinCalc_ChristianDiazRuiz/blob/main/MinCalc_Images/Activity2_Layout.png)

![Activity2_Appearance](https://github.com/cdiazruiz525/MinCalc_ChristianDiazRuiz/blob/main/MinCalc_Images/Activity2_Appearance.png)


## Depuración 🔧

La calculadora esta programada de tal manera, que toma en cuenta los simple casos de uso de una calculadora normal.

Por ejemplo:
* No permitirá escribir más de un cero seguido al principio.
* Solo podrá haber una coma/punto por cifra dada.
* En caso de no ser decimal, ningún numero podra comenzar por 0.
* La calculadora permite cambiar el operador usado, una vez hayamos escrito la expresión.
* La Activity2 nos permitira volver/retornar a la MainActivity. (Desuso a partir de v2)



## Versión 2 ➕

Se ha introducido los siguientes cambios:
* En MainActivity ya no se muestran tres TextViews, el TextView principal pasa a mostrar toda la información.
* Activity_2 ha sido removida temporalmente, ahora el resultado se pasa a mostrar en MainActivity.
* Se ha añadido la funcionalidad de Reiniciar, la cual reiniciará todos los datos en pantalla.
* Se ha añadido la funcionalidad de Borrar, con esto se podrá borrar un carácter/es sin necesidad de reiniciar la operación.
* El resultado pasa a mostrarse en pantalla, permitiendo seguir operando con un resultado.
* Se ha cambiado la paleta de colores, diferenciado los botones de acción de aquellos que son de operación y/o numéricos.
* Ahora aquellas cifras que no contengan decimales, pasarán a mostrarse como números enteros.

## Enlaces 🔗

* [MainActivity](https://github.com/cdiazruiz525/MinCalc_ChristianDiazRuiz/blob/main/MinCalc/app/src/main/java/com/chrsoft/mincalc/MainActivity.java)
  * [Layout MainActivity](https://github.com/cdiazruiz525/MinCalc_ChristianDiazRuiz/blob/main/MinCalc/app/src/main/res/layout/activity_main.xml)
* [Activity_2](https://github.com/cdiazruiz525/MinCalc_ChristianDiazRuiz/blob/main/MinCalc/app/src/main/java/com/chrsoft/mincalc/Activity2.java)
  * [Layout Activity_2](https://github.com/cdiazruiz525/MinCalc_ChristianDiazRuiz/blob/main/MinCalc/app/src/main/res/layout/activity_2.xml)
* [Strings](https://github.com/cdiazruiz525/MinCalc_ChristianDiazRuiz/blob/main/MinCalc/app/src/main/res/values/strings.xml)
* [Manifest](https://github.com/cdiazruiz525/MinCalc_ChristianDiazRuiz/blob/main/MinCalc/app/src/main/AndroidManifest.xml)
* [Carpeta de resources](https://github.com/cdiazruiz525/MinCalc_ChristianDiazRuiz/tree/main/MinCalc/app/src/main/res)


## Autor ✒️

* **Christian Díaz** - [cdiazruiz525](https://github.com/cdiazruiz525)
