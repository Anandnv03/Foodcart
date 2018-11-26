package com.example.nandhu.anandssfoodcart;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button buttonIndian = (Button)(findViewById(R.id.btn1));
        buttonIndian.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getBaseContext(),IndianFood.class);
                startActivity(intent);
            }
        });

        Button buttonChinese = (Button)(findViewById(R.id.buttonChinese));
        buttonChinese.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getBaseContext(),ChineseFood.class);
                startActivity(intent);
            }
        });

        Button buttonItalian = (Button)(findViewById(R.id.buttonItalian));
        buttonItalian.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getBaseContext(),ItalianFood.class);
                startActivity(intent);
            }
        });

        Button buttonViewCart = (Button)(findViewById(R.id.viewCart));
        buttonViewCart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getBaseContext(),FoodCart.class);
                startActivity(intent);
            }
        });
    }
}
