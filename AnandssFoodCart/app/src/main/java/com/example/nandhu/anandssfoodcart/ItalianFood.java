package com.example.nandhu.anandssfoodcart;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class ItalianFood extends AppCompatActivity {

    static int pasta = 0;
    static int lasgna = 0;
    static int garlic = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_italian_food);

        Button buttonpas = (Button)(findViewById(R.id.buttonpas));
        buttonpas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pasta++;
                Toast.makeText(getBaseContext(), "Pasta added" , Toast.LENGTH_SHORT).show();
            }
        });
        Button button2pas = (Button)(findViewById(R.id.button2pas));
        button2pas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(pasta>0)
                {
                    pasta--;
                    Toast.makeText(getBaseContext(), "Pasta removed" , Toast.LENGTH_SHORT).show();
                }

            }
        });


        Button buttongab = (Button)(findViewById(R.id.buttongab));
        buttongab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                garlic++;
                Toast.makeText(getBaseContext(), "Garlic Bread added" , Toast.LENGTH_SHORT).show();
            }
        });
        Button button2gab = (Button)(findViewById(R.id.button2gab));
        button2gab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(garlic>0)
                {
                    garlic--;
                    Toast.makeText(getBaseContext(), "Garlic Bread removed" , Toast.LENGTH_SHORT).show();
                }

            }
        });

        Button buttonla = (Button)(findViewById(R.id.buttonla));
        buttonla.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                lasgna++;
                Toast.makeText(getBaseContext(), "Lasgna added" , Toast.LENGTH_SHORT).show();
            }
        });
        Button button2la = (Button)(findViewById(R.id.button2la));
        button2la.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(lasgna>0)
                {
                    lasgna--;
                    Toast.makeText(getBaseContext(), "Lasgna removed" , Toast.LENGTH_SHORT).show();
                }

            }
        });


    }
}
