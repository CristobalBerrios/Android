package com.example.xiterss.tarea;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class FrameLayout extends AppCompatActivity {

    TextView txt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frame_layout);

        txt=(TextView) findViewById(R.id.txt);
        String nombre = getIntent().getExtras().getString("nombre");
        txt.setText(nombre);
    }
}
