package com.example.xiterss.tarea;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class TableLayout extends AppCompatActivity {


    TextView txt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_table_layout);

        txt=(TextView)findViewById(R.id.txt);
        String nombre = getIntent().getExtras().getString("nombre");
        txt.setText("Su Nombre es "+nombre);

    }
}
