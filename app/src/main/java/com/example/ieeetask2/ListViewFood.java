package com.example.ieeetask2;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class ListViewFood extends BaseAdapter {

    private Context c ;
    private int resource ;
    private ArrayList<food> foods;
    public ListViewFood(Context c, int resource, ArrayList<food> foods)
    {
this.c=c;
this.foods=foods;
this.resource=resource;
    }

    @Override
    public int getCount() {
        return foods.size();
    }

    @Override
    public food getItem(int i) {
        return foods.get(i);
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        View v=view;
        if(view==null)
        {
            v= LayoutInflater.from(c).inflate(resource,null,false);
        }
        TextView tv=v.findViewById(R.id.textView2);
        ImageView img=v.findViewById(R.id.imageView2);
 food f=getItem(i);
        tv.setText(f.getText());
        img.setImageResource(f.getImg());


        return v;
    }
}
