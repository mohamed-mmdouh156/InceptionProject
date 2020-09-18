package com.example.ieeetask2;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class MenuListView extends BaseAdapter {
    Context c;
    int resource;
    ArrayList<menu> menus;

    public MenuListView (Context c, int resource, ArrayList<menu> menus)
    {
       this.c = c;
       this.resource = resource;
       this.menus = menus;
    }
    @Override
    public int getCount() {
        return menus.size();
    }

    @Override
    public menu getItem(int i) {
        return menus.get(i);
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }


    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        View v=view;
        if(v==null)
        {
            v= LayoutInflater.from(c).inflate(resource,null,false);
        }
        TextView tv1=v.findViewById(R.id.row_main_text);
        TextView tv2=v.findViewById(R.id.row_price);
        ImageView img=v.findViewById(R.id.row_image);

        menu m=getItem(i);
        tv1.setText(m.getText1());
        tv2.setText(m.getText2());
        img.setImageResource(m.getImg());


        return v;

    }
}
