package com.example.ieeetask2;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class soft_drinks_menu extends AppCompatActivity {

    ListView soft_drinks_list ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_soft_drinks_menu);

        soft_drinks_list = findViewById(R.id.soft_drinks_menu_list_view);

        ArrayList<menu> menus = new ArrayList<>();


        menus.add(new menu(R.drawable.pepsi  , getString(R.string.soft_drink_menu_Pepsi)   , "6"));
        menus.add(new menu(R.drawable.seven  ,  getString(R.string.soft_drink_menu_7up)     , "6"));
        menus.add(new menu(R.drawable.marinda   ,  getString(R.string.soft_drink_menu_Mirinda) , "6"));
        menus.add(new menu(R.drawable.rany  ,  getString(R.string.soft_drink_menu_Rennie)  , "6"));
        menus.add(new menu(R.drawable.prel  ,  getString(R.string.soft_drink_menu_Pirrell) , "7"));
        menus.add(new menu(R.drawable.froz  ,  getString(R.string.soft_drink_menu_Fayrouz) , "7"));


        MenuListView adptar =new MenuListView(this,R.layout.menu_row,menus);


        soft_drinks_list.setAdapter(adptar);




        soft_drinks_list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                switch (i)
                {
                    case 0 :


                        Intent intent1 = new Intent(soft_drinks_menu.this , result.class);

                        intent1.putExtra("soft_drinks_image1" , R.drawable.pepsi);
                        intent1.putExtra("soft_drinks_name1" , getString(R.string.soft_drink_menu_Pepsi));
                        intent1.putExtra("soft_drinks_price1" , "6");

                        startActivity(intent1);

                        break;


                    case 1 :

                        Intent intent2 = new Intent(soft_drinks_menu.this, result.class);

                        intent2.putExtra("soft_drinks_image2" , R.drawable.seven );
                        intent2.putExtra("soft_drinks_name2" , getString(R.string.soft_drink_menu_7up) );
                        intent2.putExtra("soft_drinks_price2" , "6");


                        startActivity(intent2);

                        break;


                    case 2 :

                        Intent intent3 = new Intent(soft_drinks_menu.this , result.class);

                        intent3.putExtra("soft_drinks_image3" ,R.drawable.marinda );
                        intent3.putExtra("soft_drinks_name3" , getString(R.string.soft_drink_menu_Mirinda));
                        intent3.putExtra("soft_drinks_price3" , "6" );


                        startActivity(intent3);

                        break;


                    case 3 :

                        Intent intent4 = new Intent(soft_drinks_menu.this, result.class);

                        intent4.putExtra("soft_drinks_image4" ,R.drawable.rany );
                        intent4.putExtra("soft_drinks_name4" , getString(R.string.soft_drink_menu_Rennie)  );
                        intent4.putExtra("soft_drinks_price4" , "6" );


                        startActivity(intent4);

                        break;


                    case 4 :

                        Intent intent5 = new Intent(soft_drinks_menu.this , result.class);

                        intent5.putExtra("soft_drinks_image5" ,R.drawable.prel);
                        intent5.putExtra("soft_drinks_name5" , getString(R.string.soft_drink_menu_Pirrell) );
                        intent5.putExtra("soft_drinks_price5" ,"7");


                        startActivity(intent5);

                        break;



                    case 5 :

                        Intent intent6 = new Intent(soft_drinks_menu.this , result.class);

                        intent6.putExtra("soft_drinks_image6" ,R.drawable.froz );
                        intent6.putExtra("soft_drinks_name6" ,  getString(R.string.soft_drink_menu_Fayrouz) );
                        intent6.putExtra("soft_drinks_price6" , "7" );


                        startActivity(intent6);

                        break;


                }

            }
        });

    }


}