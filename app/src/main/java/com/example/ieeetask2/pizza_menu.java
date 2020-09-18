package com.example.ieeetask2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class pizza_menu extends AppCompatActivity {


    ListView listView;
    result r ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pizza_menu);

        listView = findViewById(R.id.ls_menu_pizza);


        ArrayList<menu> menus=new ArrayList<>();

        menus.add(new menu(R.drawable.magrita , getString(R.string.pizza_menu_layout_Margherita_Pizza) , "24"));
        menus.add(new menu(R.drawable.stchkin , getString(R.string.pizza_menu_layout_Chicken_Pizza),"35"));
        menus.add(new menu(R.drawable.meat , getString(R.string.pizza_menu_layout_Meat_Pizza) ,"31"));
        menus.add(new menu(R.drawable.chesse , getString(R.string.pizza_menu_layout_Cheese_Pizza) ,"29"));
        menus.add(new menu(R.drawable.tona , getString(R.string.pizza_menu_layout_Tuna_pizza) ,"33"));
        menus.add(new menu(R.drawable.ganabary , getString(R.string.pizza_menu_layout_Shrimp_pizza) ,"43"));


        MenuListView myadptar =new MenuListView(this,R.layout.menu_row,menus);
        listView.setAdapter(myadptar);


        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                switch (i)
                {
                    case 0 :


                        Intent intent1 = new Intent(pizza_menu.this , result.class);

                        intent1.putExtra("pizza_image1" , R.drawable.magrita);
                        intent1.putExtra("pizza_name1" , getString(R.string.pizza_menu_layout_Margherita_Pizza));
                        intent1.putExtra("pizza_price1" , "24");

                        startActivity(intent1);

                        break;



                    case 1 :

                        Intent intent2 = new Intent(pizza_menu.this, result.class);

                        intent2.putExtra("pizza_image2" ,R.drawable.stchkin);
                        intent2.putExtra("pizza_name2" , getString(R.string.pizza_menu_layout_Chicken_Pizza));
                        intent2.putExtra("pizza_price2" , "35");


                        startActivity(intent2);

                        break;

                    case 2 :

                        Intent intent3 = new Intent(pizza_menu.this , result.class);

                        intent3.putExtra("pizza_image3" ,R.drawable.meat);
                        intent3.putExtra("pizza_name3" , getString(R.string.pizza_menu_layout_Meat_Pizza));
                        intent3.putExtra("pizza_price3" , "31");


                        startActivity(intent3);

                        break;

                    case 3 :

                        Intent intent4 = new Intent(pizza_menu.this, result.class);

                        intent4.putExtra("pizza_image4" ,R.drawable.chesse);
                        intent4.putExtra("pizza_name4" ,  getString(R.string.pizza_menu_layout_Cheese_Pizza));
                        intent4.putExtra("pizza_price4" , "29");


                        startActivity(intent4);

                        break;

                    case 4 :

                        Intent intent5 = new Intent(pizza_menu.this , result.class);

                        intent5.putExtra("pizza_image5" ,R.drawable.tona);
                        intent5.putExtra("pizza_name5" , getString(R.string.pizza_menu_layout_Tuna_pizza));
                        intent5.putExtra("pizza_price5" , "33");


                        startActivity(intent5);

                        break;

                    case 5 :

                        Intent intent6 = new Intent(pizza_menu.this , result.class);

                        intent6.putExtra("pizza_image6" ,R.drawable.ganabary);
                        intent6.putExtra("pizza_name6" , getString(R.string.pizza_menu_layout_Shrimp_pizza));
                        intent6.putExtra("pizza_price6" , "43");


                        startActivity(intent6);

                        break;


                }
            }
        });

    }
}