package com.example.nandhu.anandssfoodcart;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class FoodCart extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food_cart);

        int paneerButterMasala =  IndianFood.paneerButterMasala;
        int daalMakhani = IndianFood.daalMakhani;
        int tandooriChicken = IndianFood.tandoorChicken;
        int noodles = ChineseFood.noodles;
        int gobi65 = ChineseFood.gobi65;
        int friedrice = ChineseFood.friedrice;
        int pasta = ItalianFood.pasta;
        int lasgna = ItalianFood.lasgna;
        int garlic = ItalianFood.garlic;
        int total=0;

        TextView tvpbm = (TextView)(findViewById(R.id.tvpbm));
        tvpbm.setText(""+paneerButterMasala*200);
        total=total + paneerButterMasala*200;

        TextView tvdm = (TextView)(findViewById(R.id.tvdm));
        tvdm.setText(""+daalMakhani*100);
        total=total+daalMakhani*100;

        TextView tvtc = (TextView)(findViewById(R.id.tvtc));
        tvtc.setText(""+tandooriChicken*100);
        total=total+tandooriChicken*100;

       TextView tvno = (TextView)(findViewById(R.id.tv2no));
        tvno.setText(""+noodles*150);
        total=total+noodles*150;

        TextView tvgb = (TextView)(findViewById(R.id.tv2gb));
        tvgb.setText(""+gobi65*90);
        total=total+gobi65*90;

        TextView tvfr = (TextView)(findViewById(R.id.tv2fr));
        tvfr.setText(""+friedrice*60);
        total=total+friedrice*60;

        TextView tvpas = (TextView)(findViewById(R.id.tvpa));
        tvpas.setText(""+pasta*200);
        total=total+pasta*200;

        TextView tvlg = (TextView)(findViewById(R.id.tvlg));
        tvlg.setText(""+lasgna*100);
        total=total+lasgna*100;

        TextView tvgab = (TextView)(findViewById(R.id.tvgbr));
        tvgab.setText(""+garlic*200);
        total=total+garlic*200;

        TextView tvTotal = (TextView)(findViewById(R.id.tv2total));
        tvTotal.setText(""+total);
    }
}
