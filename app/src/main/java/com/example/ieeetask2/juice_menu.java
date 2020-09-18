package com.example.ieeetask2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class juice_menu extends AppCompatActivity {

ListView juice_list;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_juice_menu2);

        juice_list = findViewById(R.id.juice_menu_list_view);

        ArrayList <menu> menus = new ArrayList<>();


        menus.add(new menu(R.drawable.coctal   ,  getString(R.string.juice_menu_Cocktail)  , "22"));
        menus.add(new menu(R.drawable.fraula  ,   getString(R.string.juice_menu_Strawberries)  , "20"));
        menus.add(new menu(R.drawable.manga   ,  getString(R.string.juice_menu_Mango)  , "24"));
        menus.add(new menu(R.drawable.orange  ,  getString(R.string.juice_menu_Orange)  , "18"));
        menus.add(new menu(R.drawable.totred  ,  getString(R.string.juice_menu_Red_Mulberry)  , "18"));
        menus.add(new menu(R.drawable.guava  ,  getString(R.string.juice_menu_Guava)  , "22"));




        MenuListView adptar =new MenuListView(this,R.layout.menu_row,menus);


        juice_list.setAdapter(adptar);


        juice_list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                switch (i)
                {
                    case 0 :

                        Intent intent1 = new Intent(juice_menu.this , result.class);

                        intent1.putExtra("juice_image1" , R.drawable.coctal);
                        intent1.putExtra("juice_name1" ,  getString(R.string.juice_menu_Cocktail));
                        intent1.putExtra("juice_price1" , "22");

                        startActivity(intent1);

                        break;


                    case 1 :

                        Intent intent2 = new Intent(juice_menu.this, result.class);

                        intent2.putExtra("juice_image2" , R.drawable.fraula );
                        intent2.putExtra("juice_name2" ,  getString(R.string.juice_menu_Strawberries) );
                        intent2.putExtra("juice_price2" , "20");


                        startActivity(intent2);

                        break;


                    case 2 :

                        Intent intent3 = new Intent(juice_menu.this , result.class);

                        intent3.putExtra("juice_image3" ,R.drawable.manga );
                        intent3.putExtra("juice_name3" , getString(R.string.juice_menu_Mango));
                        intent3.putExtra("juice_price3" , "24" );


                        startActivity(intent3);

                        break;


                    case 3 :


                        Intent intent4 = new Intent(juice_menu.this, result.class);

                        intent4.putExtra("juice_image4" ,R.drawable.orange );
                        intent4.putExtra("juice_name4" , getString(R.string.juice_menu_Orange) );
                        intent4.putExtra("juice_price4" , "18" );


                        startActivity(intent4);

                        break;


                    case 4 :

                    Intent intent5 = new Intent(juice_menu.this , result.class);

                    intent5.putExtra("juice_image5" , R.drawable.totred  );
                    intent5.putExtra("juice_name5" ,  getString(R.string.juice_menu_Red_Mulberry));
                    intent5.putExtra("juice_price5" , "18");


                    startActivity(intent5);

                    break;

                    case 5 :

                        Intent intent6 = new Intent(juice_menu.this , result.class);

                        intent6.putExtra("juice_image6" ,R.drawable.guava  );
                        intent6.putExtra("juice_name6" ,   getString(R.string.juice_menu_Guava) );
                        intent6.putExtra("juice_price6" , "22");


                        startActivity(intent6);

                        break;


                }

            }
        });




    }
}