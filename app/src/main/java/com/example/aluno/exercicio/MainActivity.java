package com.example.aluno.exercicio;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends Activity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void radioClick(View view) {
    // usa o método isChecked() para saber se o
    // radioClick está selecionado
        RadioButton controle = (RadioButton) view;
        boolean checado = controle.isChecked();
    // testa qual radioClick foi clicado
        switch(controle.getId()) {
            case R.id.pequenoRadio:
                if (checado)
                    Toast.makeText(this,

                            "não perecivel",Toast.LENGTH_SHORT).show();

                break;

            case R.id.medioRadio:
                if (checado)
                    Toast.makeText(this,

                            "perecivel", Toast.LENGTH_SHORT).show();

                break;

        }
    }

    public void checkbox(View view) {

    // usa o método isChecked() para saber se o
    // checkbox está selecionado
        CheckBox controle = (CheckBox) view;
        boolean checado = controle.isChecked();
    // testa qual checkbox foi clicado
        switch(controle.getId()) {
            case R.id.refrigeradoCheckBox:
                if (checado)
                    Toast.makeText(this,
                            "Local Refrigerado", Toast.LENGTH_SHORT).show();break;

            case R.id.promocaoCheckBox:
                if (checado)
                    Toast.makeText(this,
                            "Promoção", Toast.LENGTH_SHORT).show();break;

            case R.id.estoqueCheckBox:
                if (checado)
                    Toast.makeText(this,
                            "Estoque", Toast.LENGTH_SHORT).show();break;

        }
    }
}
