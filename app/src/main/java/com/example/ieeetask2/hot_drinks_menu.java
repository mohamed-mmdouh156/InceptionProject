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

public class hot_drinks_menu extends AppCompatActivity {

    ListView hot_drinks_list ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hot_drinks_menu);


        hot_drinks_list = findViewById(R.id.hot_drinks_menu_list_view);



        ArrayList<menu> menu = new ArrayList<>();

        menu.add(new menu(R.drawable.tea , getString(R.string.hot_drink_menu_Tea),"5"));
        menu.add(new menu(R.drawable.teamilk , getString(R.string.hot_drink_menu_Milk_Tea),"7"));
        menu.add(new menu(R.drawable.coffe ,getString(R.string.hot_drink_menu_Coffee) ,"6"));
        menu.add(new menu(R.drawable.coffebondk ,getString(R.string.hot_drink_menu_Hazelnut_Coffee),"8"));
        menu.add(new menu(R.drawable.naskafi,getString(R.string.hot_drink_menu_Nescafe),"6"));
        menu.add(new menu(R.drawable.kaptshino,getString(R.string.hot_drink_menu_Cappuccino),"7"));
        menu.add(new menu( R.drawable.hotshoklat,getString(R.string.hot_drink_menu_Hot_Chocolate),"11"));
        menu.add(new menu(R.drawable.spraso ,getString(R.string.hot_drink_menu_Espresso),"8"));
        menu.add(new menu(R.drawable.chlap ,getString(R.string.hot_drink_menu_Sahlab),"10"));


        MenuListView adptar =new MenuListView(this,R.layout.menu_row,menu);

        hot_drinks_list.setAdapter(adptar);



        hot_drinks_list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                switch (i)
                {
                    case 0 :


                        Intent intent1 = new Intent(hot_drinks_menu.this , result.class);

                        intent1.putExtra("hot_drinks_image1" ,R.drawable.tea);
                        intent1.putExtra("hot_drinks_name1" , getString(R.string.hot_drink_menu_Tea));
                        intent1.putExtra("hot_drinks_price1" , "5");

                        startActivity(intent1);

                        break;


                    case 1 :

                        Intent intent2 = new Intent(hot_drinks_menu.this, result.class);

                        intent2.putExtra("hot_drinks_image2" ,R.drawable.teamilk );
                        intent2.putExtra("hot_drinks_name2" ,  getString(R.string.hot_drink_menu_Milk_Tea));
                        intent2.putExtra("hot_drinks_price2" , "7");


                        startActivity(intent2);

                        break;


                    case 2 :

                        Intent intent3 = new Intent(hot_drinks_menu.this , result.class);

                        intent3.putExtra("hot_drinks_image3" , R.drawable.coffe);
                        intent3.putExtra("hot_drinks_name3" , getString(R.string.hot_drink_menu_Coffee));
                        intent3.putExtra("hot_drinks_price3" , "6" );


                        startActivity(intent3);

                        break;


                    case 3 :

                        Intent intent4 = new Intent(hot_drinks_menu.this, result.class);

                        intent4.putExtra("hot_drinks_image4" ,R.drawable.coffebondk);
                        intent4.putExtra("hot_drinks_name4" , getString(R.string.hot_drink_menu_Hazelnut_Coffee) );
                        intent4.putExtra("hot_drinks_price4" , "8" );


                        startActivity(intent4);

                        break;


                    case 4 :

                        Intent intent5 = new Intent(hot_drinks_menu.this , result.class);

                        intent5.putExtra("hot_drinks_image5" ,R.drawable.naskafi);
                        intent5.putExtra("hot_drinks_name5" , getString(R.string.hot_drink_menu_Nescafe));
                        intent5.putExtra("hot_drinks_price5" , "6");


                        startActivity(intent5);

                        break;



                    case 5 :

                        Intent intent6 = new Intent(hot_drinks_menu.this , result.class);

                        intent6.putExtra("hot_drinks_image6" , R.drawable.kaptshino);
                        intent6.putExtra("hot_drinks_name6" , getString(R.string.hot_drink_menu_Cappuccino));
                        intent6.putExtra("hot_drinks_price6" , "7" );


                        startActivity(intent6);

                        break;

                    case 6 :

                        Intent intent7 = new Intent(hot_drinks_menu.this , result.class);

                        intent7.putExtra("hot_drinks_image7" , R.drawable.hotshoklat);
                        intent7.putExtra("hot_drinks_name7" , getString(R.string.hot_drink_menu_Hot_Chocolate) );
                        intent7.putExtra("hot_drinks_price7" , "11" );


                        startActivity(intent7);

                        break;

                    case 7 :

                        Intent intent8 = new Intent(hot_drinks_menu.this , result.class);

                        intent8.putExtra("hot_drinks_image8" , R.drawable.spraso);
                        intent8.putExtra("hot_drinks_name8" , getString(R.string.hot_drink_menu_Espresso));
                        intent8.putExtra("hot_drinks_price8" , "8");


                        startActivity(intent8);

                        break;

                    case 8 :

                        Intent intent9 = new Intent(hot_drinks_menu.this , result.class);

                        intent9.putExtra("hot_drinks_image9" ,R.drawable.chlap);
                        intent9.putExtra("hot_drinks_name9" , getString(R.string.hot_drink_menu_Sahlab));
                        intent9.putExtra("hot_drinks_price9" , "10");


                        startActivity(intent9);

                        break;


                }

            }


        });



    }



}