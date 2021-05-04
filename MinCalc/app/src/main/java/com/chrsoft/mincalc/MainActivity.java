package com.chrsoft.mincalc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    public static final String EXTRA_MESSAGE = "com.chrsoft.mainactivity.MESSAGE";

    private StringBuffer num1 = new StringBuffer();
    private StringBuffer num2 = new StringBuffer();
    private String operador;
    private TextView tvNum1;
    private TextView tvNum2;
    private TextView tvOperador;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvNum1 = (TextView) findViewById(R.id.tvNum1);
        tvNum2 = (TextView) findViewById(R.id.tvNum2);
        tvOperador = (TextView) findViewById(R.id.tvOperador);
    }

    public void cero (View view) {
        if (num1.toString().equalsIgnoreCase("0")) {
            num1.deleteCharAt(0);

        }
        if (num2.toString().equalsIgnoreCase("0")) {
            num2.deleteCharAt(0);
        }
        if (operador == null) {
            num1.append("0");
        } else {
            num2.append("0");
        }
        updateTextView();
    }

    public void uno (View view) {
        if (num1.toString().equalsIgnoreCase("0")) {
            num1.deleteCharAt(0);

        }
        if (num2.toString().equalsIgnoreCase("0")) {
            num2.deleteCharAt(0);
        }
        if (operador == null) {
            num1.append("1");
        } else {
            num2.append("1");
        }
        updateTextView();
    }
    public void dos (View view) {
        if (num1.toString().equalsIgnoreCase("0")) {
            num1.deleteCharAt(0);

        }
        if (num2.toString().equalsIgnoreCase("0")) {
            num2.deleteCharAt(0);
        }
        if (operador == null) {
            num1.append("2");
        } else {
            num2.append("2");
        }
        updateTextView();
    }
    public void tres (View view) {
        if (num1.toString().equalsIgnoreCase("0")) {
            num1.deleteCharAt(0);

        }
        if (num2.toString().equalsIgnoreCase("0")) {
            num2.deleteCharAt(0);
        }
        if (operador == null) {
            num1.append("3");
        } else {
            num2.append("3");
        }
        updateTextView();
    }
    public void cuatro (View view) {
        if (num1.toString().equalsIgnoreCase("0")) {
            num1.deleteCharAt(0);

        }
        if (num2.toString().equalsIgnoreCase("0")) {
            num2.deleteCharAt(0);
        }
        if (operador == null) {
            num1.append("4");
        } else {
            num2.append("4");
        }
        updateTextView();
    }
    public void cinco (View view) {
        if (num1.toString().equalsIgnoreCase("0")) {
            num1.deleteCharAt(0);

        }
        if (num2.toString().equalsIgnoreCase("0")) {
            num2.deleteCharAt(0);
        }
        if (operador == null) {
            num1.append("5");
        } else {
            num2.append("5");
        }
        updateTextView();
    }
    public void seis (View view) {
        if (num1.toString().equalsIgnoreCase("0")) {
            num1.deleteCharAt(0);

        }
        if (num2.toString().equalsIgnoreCase("0")) {
            num2.deleteCharAt(0);
        }
        if (operador == null) {
            num1.append("6");
        } else {
            num2.append("6");
        }
        updateTextView();
    }

    public void siete (View view) {
        if (num1.toString().equalsIgnoreCase("0")) {
            num1.deleteCharAt(0);

        }
        if (num2.toString().equalsIgnoreCase("0")) {
            num2.deleteCharAt(0);
        }
        if (operador == null) {
            num1.append("7");
        } else {
            num2.append("7");
        }
        updateTextView();
    }
    public void ocho (View view) {
        if (num1.toString().equalsIgnoreCase("0")) {
            num1.deleteCharAt(0);

        }
        if (num2.toString().equalsIgnoreCase("0")) {
            num2.deleteCharAt(0);
        }
        if (operador == null) {
            num1.append("8");
        } else {
            num2.append("8");
        }
        updateTextView();
    }
    public void nueve (View view) {
        if (num1.toString().equalsIgnoreCase("0")) {
            num1.deleteCharAt(0);

        }
        if (num2.toString().equalsIgnoreCase("0")) {
            num2.deleteCharAt(0);
        }
        if (operador == null) {
            num1.append("9");
        } else {
            num2.append("9");
        }
        updateTextView();
    }

    public void punto (View view) {
        if (num1.toString().contains(".") == false && num1.toString().equalsIgnoreCase("") == false  && operador == null) {
            num1.append(".");
        } else if (num2.toString().contains(".") == false && num2.toString().equalsIgnoreCase("") == false) {
            num2.append(".");
        }
        updateTextView();
    }

    public void updateTextView () {
        String str = this.num1.toString();
        this.tvNum1.setText(this.num1.toString());
        this.tvOperador.setText(operador);
        this.tvNum2.setText(this.num2.toString());
    }

    public void suma (View view) {
        operador = "+";
        updateTextView();
    }

    public void resta (View view) {
        operador = "–";
        updateTextView();
    }

    public void multiplicacion (View view) {
        operador = "×";
        updateTextView();
    }

    public void division (View view) {
        operador = "÷";
        updateTextView();
    }

    public void resultado (View view) {
        if (num1.toString() != null && num2.toString() != null && operador != null) {
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
            
            enviarResultado(resultado);
        }
    }

    public void enviarResultado (float resultado) {
        Intent intent = new Intent(this, Activity2.class);
        String message = "El resultado es: " + resultado;
        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);
    }


}