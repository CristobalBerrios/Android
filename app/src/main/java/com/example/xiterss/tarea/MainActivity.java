package com.example.xiterss.tarea;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity implements Button.OnClickListener {


    Spinner lista;
    EditText editText;
    Button btn ;
    ArrayAdapter<String> adapter;
    String [] elementos = new String[3];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lista =  (Spinner) findViewById(R.id.lista);
        editText= (EditText)findViewById(R.id.editText);
        btn=(Button) findViewById(R.id.button);
        btn.setOnClickListener(this);
        elementos[0]="Linear Layout";
        elementos[1]="Frame Layout";
        elementos[2]="Table Layout";
        adapter= new ArrayAdapter<String>(this,android.R.layout.simple_spinner_dropdown_item,elementos);
        lista.setAdapter(adapter);

    }

    @Override
    public void onClick(View v) {

        String nombre =editText.getText().toString();
        if(lista.getSelectedItemPosition()==0){
            Intent i = new Intent(this,LinearLayout.class);
            i.putExtra("nombre",nombre);
            startActivity(i);
        }else if (lista.getSelectedItemPosition()==1){
            Intent i = new Intent(this,FrameLayout.class);
            i.putExtra("nombre",nombre);
            startActivity(i);
        }else if(lista.getSelectedItemPosition()==2){
            Intent i = new Intent(this,TableLayout.class);
            i.putExtra("nombre",nombre);
            startActivity(i);

        }

    }
}
