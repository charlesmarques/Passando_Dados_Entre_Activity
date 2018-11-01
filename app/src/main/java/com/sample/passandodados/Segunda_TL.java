package com.sample.passandodados;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Segunda_TL extends AppCompatActivity {

    private TextView texto;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda_tl);

        texto = findViewById(R.id.textView);

        Bundle extra = getIntent().getExtras();

        if (extra != null){
            String oTexto_Passado = extra.getString("name");

            texto.setText(oTexto_Passado);
        }
    }
}
