package com.min.to_do_list;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    Button elim1,elim2;
    TextView deber,compra;
    CheckBox hacer1,hacer2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        elim1=findViewById(R.id.eliminar1);
        elim2=findViewById(R.id.eliminar2);

        deber=findViewById(R.id.deberes);
        compra=findViewById(R.id.comprar);

        hacer1=findViewById(R.id.hecha1);
        hacer2=findViewById(R.id.hecha2);

        elim1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {//  Cuando se pulse, ejecuta:
                deber.setVisibility(View.INVISIBLE);
                hacer1.setVisibility(View.INVISIBLE);
                elim1.setVisibility(View.INVISIBLE);
            }

        });
        elim2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {//  Cuando se pulse, ejecuta:
                compra.setVisibility(View.INVISIBLE);
                hacer2.setVisibility(View.INVISIBLE);
                elim2.setVisibility(View.INVISIBLE);
            }
        });
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}