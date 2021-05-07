package com.chrsoft.mincalc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    public static final String EXTRA_MESSAGE = "com.chrsoft.mainactivity.MESSAGE";

    private StringBuffer num1 = new StringBuffer();
    private StringBuffer num2 = new StringBuffer();
    private StringBuffer consola = new StringBuffer();
    private String operador;
    private TextView tvPantalla;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvPantalla = findViewById(R.id.tvPantalla);
    }

    /**
     *
     * @param view
     */
    public void introducirNumero (View view) {
        Button btn = (Button) view;
        String btnText = btn.getText().toString();

        if (num1.toString().equalsIgnoreCase("0")) {
            num1.deleteCharAt(0);
        }
        if (num2.toString().equalsIgnoreCase("0")) {
            num2.deleteCharAt(0);
        }
        if (operador == null) {
            num1.append(btnText);
        } else {
            num2.append(btnText);
        }
        updateTextView();
    }

    /**
     *
     * @param view
     */
    public void introducirOperacion (View view) {
        Button btn = (Button) view;
        String btnText = btn.getText().toString();

        if (!num1.toString().equalsIgnoreCase("") && !num1.toString().equalsIgnoreCase("0")) {
            this.operador = btnText;
        }

        updateTextView();
    }


    public void updateTextView () {
        consola = new StringBuffer();
        consola.append(this.num1.toString());
        if (this.operador != null) {
            consola.append(this.operador);
            if (!num2.toString().equalsIgnoreCase("")){
                consola.append(this.num2.toString());
            }
        }
        this.tvPantalla.setText(consola.toString());
    }

    public void borrar (View view) {
        if (!num2.toString().equalsIgnoreCase("")) {
            num2.deleteCharAt(num2.length() - 1);
        } else if (operador != null) {
            this.operador = null;
        } else if (!num1.toString().equalsIgnoreCase("")) {
            num1.deleteCharAt(num1.length() - 1);
        }

        updateTextView();
    }

    public void reiniciar (View view) {
        resetearValores();
    }

    public void punto (View view) {
        if (!num1.toString().contains(".") && !num1.toString().equalsIgnoreCase("") && operador == null) {
            num1.append(".");
        } else if (!num2.toString().contains(".") && !num2.toString().equalsIgnoreCase("")) {
            num2.append(".");
        }
        updateTextView();
    }

    public void resetearValores () {
        this.num1 = new StringBuffer();
        this.num2 = new StringBuffer();
        this.consola = new StringBuffer();
        this.operador = null;
        this.tvPantalla.setText("");
    }



    public void calcularResultado (View view) {
        if (!num1.toString().equalsIgnoreCase("") && !num2.toString().equalsIgnoreCase("") && operador != null) {
            float numero1 = Float.parseFloat(num1.toString());
            float numero2 = Float.parseFloat(num2.toString());
            float resultado = 0;

            if (operador.equalsIgnoreCase("+")) {
                resultado = numero1 + numero2;
            }
            if (operador.equalsIgnoreCase("–")) {
                resultado = numero1 - numero2;
            }
            if (operador.equalsIgnoreCase("×")) {
                resultado = numero1 * numero2;
            }
            if (operador.equalsIgnoreCase("÷")) {
                resultado = numero1 / numero2;
            }
            resetearValores();
            mostrarResultado(resultado);
            //enviarResultado(resultado);
        }
    }

    /**
     *
     * @param resultado
     */
    public void enviarResultado (float resultado) {
        Intent intent = new Intent(this, Activity2.class);
        String message = "El resultado es: " + resultado;
        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);
    }

    /**
     *
     * @param resultado
     */
    public void mostrarResultado (float resultado) {
        if (numeroEsEntero(resultado) == true) {
            this.num1.append((int) resultado);
        } else {
            this.num1.append(resultado);
        }
        updateTextView();
    }

    /**
     *
     * @param numero
     * @return
     */
    private boolean numeroEsEntero (float numero) {
        if (numero % 1 == 0) {
            return true;
        }
        return false;
    }


}