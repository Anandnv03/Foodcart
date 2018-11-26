package com.example.nandhu.anandssfoodcart;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class ChineseFood extends AppCompatActivity {
    static int noodles = 0;
    static int gobi65 = 0;
    static int friedrice = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chinese_food);

        Button buttonNo = (Button)(findViewById(R.id.buttonNo));
        buttonNo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                noodles++;
                Toast.makeText(getBaseContext(), "Noodles added" , Toast.LENGTH_SHORT).show();
            }
        });
        Button button2No = (Button)(findViewById(R.id.button2No));
        button2No.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(noodles>0)
                {
                    noodles--;
                    Toast.makeText(getBaseContext(), "Noodles removed" , Toast.LENGTH_SHORT).show();
                }

            }
        });

        Button buttonGb = (Button)(findViewById(R.id.buttonGb));
        buttonGb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gobi65++;
                Toast.makeText(getBaseContext(), "Gobi65 added" , Toast.LENGTH_SHORT).show();
            }
        });
        Button button2Gb = (Button)(findViewById(R.id.button2Gb));
        button2Gb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(gobi65>0)
                {
                   gobi65--;
                    Toast.makeText(getBaseContext(), "Gobi65 removed" , Toast.LENGTH_SHORT).show();
                }

            }
        });


        Button buttonFr = (Button)(findViewById(R.id.buttonFr));
        buttonFr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                friedrice++;
                Toast.makeText(getBaseContext(), "Fried Rice added" , Toast.LENGTH_SHORT).show();
            }
        });
        Button button2Fr = (Button)(findViewById(R.id.button2Fr));
        button2Fr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(friedrice>0)
                {
                    friedrice--;
                    Toast.makeText(getBaseContext(), "Fried Rice removed" , Toast.LENGTH_SHORT).show();
                }

            }
        });
    }
}
