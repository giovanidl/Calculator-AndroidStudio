package com.example.calc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView resultado;
    EditText numero1, numero2;

    Button botao1, botao2, botao3, botao4, botao5, botao6, botao7, botao8, botao9, botao0;
    Button mult, sub, soma, div;
    Button igual;
    Button clear;

    double res;
    int op1, op2;

    public void trocaDisponibilidadeOperandos(){
        numero1.setEnabled(false);
        numero2.setEnabled(true);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        resultado = (TextView) findViewById(R.id.resultado);
        numero1 = (EditText) findViewById(R.id.numero1);
        numero2 = (EditText) findViewById(R.id.numero2);

        soma = (Button) findViewById(R.id.soma);
        sub = (Button) findViewById(R.id.sub);
        mult = (Button) findViewById(R.id.mult);
        div = (Button) findViewById(R.id.div);
        igual = (Button) findViewById(R.id.igual);
        clear = (Button) findViewById(R.id.clear);
        numero1.setEnabled(true);
        numero2.setEnabled(false);

        soma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                res = Integer.parseInt(numero1.getText().toString()) + Integer.parseInt(numero1.getText().toString());
                trocaDisponibilidadeOperandos();
            }
        });

        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                res = Integer.parseInt(numero1.getText().toString()) - Integer.parseInt(numero1.getText().toString());
                trocaDisponibilidadeOperandos();
            }
        });

        mult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                res = Integer.parseInt(numero1.getText().toString()) * Integer.parseInt(numero1.getText().toString());
                trocaDisponibilidadeOperandos();
            }
        });

        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(Integer.parseInt(String.valueOf(numero2)) != 0) {
                    res = Integer.parseInt(numero1.getText().toString()) / Integer.parseInt(numero1.getText().toString());
                    numero1.setText("");
                }
                else{
                    resultado.setText("Não pode dividir por zero");
                    return;
                }
            }
        });
        igual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resultado.setText(String.valueOf(res));
            }
        });

        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resultado.setText("");
                numero1.setText("");
                numero2.setText("");
            }
        });

        botao0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(numero1.isEnabled()){
                    numero1.setText(numero1.getText() + "0");
                }
                if(numero2.isEnabled()){
                    numero2.setText(numero2.getText() + "0");
                }
            }
        });

        botao1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(numero1.isEnabled()){
                    numero1.setText(numero1.getText() + "1");
                }
                if(numero2.isEnabled()){
                    numero2.setText(numero2.getText() + "1");
                }
            }
        });

        botao2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(numero1.isEnabled()){
                    numero1.setText(numero1.getText() + "2");
                }
                if(numero2.isEnabled()){
                    numero2.setText(numero2.getText() + "2");
                }
            }
        });

        botao3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(numero1.isEnabled()){
                    numero1.setText(numero1.getText() + "3");
                }
                if(numero2.isEnabled()){
                    numero2.setText(numero2.getText() + "3");
                }
            }
        });

        botao4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(numero1.isEnabled()){
                    numero1.setText(numero1.getText() + "4");
                }
                if(numero2.isEnabled()){
                    numero2.setText(numero2.getText() + "4");
                }
            }
        });

        botao5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(numero1.isEnabled()){
                    numero1.setText(numero1.getText() + "5");
                }
                if(numero2.isEnabled()){
                    numero2.setText(numero2.getText() + "5");
                }
            }
        });

        botao6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(numero1.isEnabled()){
                    numero1.setText(numero1.getText() + "6");
                }
                if(numero2.isEnabled()){
                    numero2.setText(numero2.getText() + "6");
                }
            }
        });

        botao7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(numero1.isEnabled()){
                    numero1.setText(numero1.getText() + "7");
                }
                if(numero2.isEnabled()){
                    numero2.setText(numero2.getText() + "7");
                }
            }
        });

        botao8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(numero1.isEnabled()){
                    numero1.setText(numero1.getText() + "8");
                }
                if(numero2.isEnabled()){
                    numero2.setText(numero2.getText() + "8");
                }
            }
        });

        botao9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(numero1.isEnabled()){
                    numero1.setText(numero1.getText() + "9");
                }
                if(numero2.isEnabled()){
                    numero2.setText(numero2.getText() + "9");
                }
            }
        });






    }
}
