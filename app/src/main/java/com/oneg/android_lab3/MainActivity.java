package com.oneg.android_lab3;

import android.os.Build;
import android.os.Bundle;
import android.widget.ListView;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private Toolbar topToolBar;

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView lv_Goods = (ListView) findViewById(R.id.lvGoods);
        topToolBar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(topToolBar);


        ArrayList<Goods> arrGoods = new ArrayList<>();
        Goods goods = new Goods("Xe cần cẩu đa năng", "LTD Shop", R.drawable.xecau);
        Goods goods1 = new Goods("Gà xé cay", "Food Store", R.drawable.gaxe);
        Goods goods2 = new Goods("Hiểu lòng trẻ con", "LTD Shop", R.drawable.hieulongtrecon);
        Goods goods3 = new Goods("Lãnh đạo tài ba", "LTD Shop", R.drawable.lanhdao);
        Goods goods4 = new Goods("Nồi cơm điện", "LTD Shop", R.drawable.noicomdien);
        Goods goods5 = new Goods("Xe cứu hỏa đa năng", "LTD Shop", R.drawable.xecuuhoa);
        arrGoods.add(goods);
        arrGoods.add(goods1);
        arrGoods.add(goods2);
        arrGoods.add(goods3);
        arrGoods.add(goods4);
        arrGoods.add(goods5);
        CustomAdapter customAdapter = new CustomAdapter(this, R.layout.item_listview, arrGoods);
        lv_Goods.setAdapter(customAdapter);

    }

}