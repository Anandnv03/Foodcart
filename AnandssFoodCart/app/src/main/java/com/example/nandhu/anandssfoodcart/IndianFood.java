package com.example.nandhu.anandssfoodcart;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class IndianFood extends AppCompatActivity {

    static int paneerButterMasala = 0;
    static int daalMakhani = 0;
    static int tandoorChicken = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_indian_food);


        Button buttonpbm = (Button)(findViewById(R.id.buttonpbm));
        buttonpbm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                paneerButterMasala++;
                Toast.makeText(getBaseContext(), "Paneer Butter Masala added" , Toast.LENGTH_SHORT).show();
            }
        });
        Button button2pbm = (Button)(findViewById(R.id.button2pbm));
        button2pbm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(paneerButterMasala>0)
                {
                    paneerButterMasala--;
                    Toast.makeText(getBaseContext(), "Paneer Butter Masala removed" , Toast.LENGTH_SHORT).show();
                }

            }
        });


        Button buttondm = (Button)(findViewById(R.id.buttonDm));
        buttondm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                daalMakhani++;
                Toast.makeText(getBaseContext(),"Daal Makhani added" , Toast.LENGTH_SHORT).show();
            }
        });
        Button button2dm = (Button)(findViewById(R.id.button2Dm));
        button2dm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(daalMakhani>0)
                {
                    daalMakhani--;
                    Toast.makeText(getBaseContext(),"Daal Makhani removed" , Toast.LENGTH_SHORT).show();
                }

            }
        });
        Button buttonTc = (Button)(findViewById(R.id.buttonTc));
        buttonTc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tandoorChicken++;
                Toast.makeText(getBaseContext(),"Tandoori Chicken added" , Toast.LENGTH_SHORT).show();
            }
        });
        Button button2Tc = (Button)(findViewById(R.id.button2Tc));
        button2Tc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(tandoorChicken>0)
                {
                    tandoorChicken--;
                    Toast.makeText(getBaseContext(),"Tandoori Chicken removed" , Toast.LENGTH_SHORT).show();
                }

            }
        });

    }
}
