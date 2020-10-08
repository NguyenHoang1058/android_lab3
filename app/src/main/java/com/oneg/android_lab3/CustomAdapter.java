package com.oneg.android_lab3;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;
import java.util.List;
import java.util.zip.Inflater;

public class CustomAdapter extends ArrayAdapter<Goods> {
    private Context context;
    private int resource;
    private ArrayList<Goods> arrGoods;

    public CustomAdapter(@NonNull Context context, int resource, @NonNull ArrayList<Goods> objects) {
        super(context, resource, objects);
        this.context = context;
        this.resource = resource;
        this.arrGoods = objects;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        convertView = LayoutInflater.from(context).inflate(R.layout.item_listview, parent, false);
        Goods goods = arrGoods.get(position);

        //anh xa cac view
        ImageView img_Goods = (ImageView) convertView.findViewById(R.id.imgGoods);
        TextView tv_Name = (TextView) convertView.findViewById(R.id.tvItemName);
        TextView tv_ShopName = (TextView) convertView.findViewById(R.id.tvShopName);
        tv_Name.setText(goods.getName());
        tv_ShopName.setText(goods.getShopName());
        img_Goods.setImageResource(goods.getImgGoods());

        return convertView;
    }
}
