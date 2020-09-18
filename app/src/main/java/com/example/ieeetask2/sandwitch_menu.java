package com.example.ieeetask2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class sandwitch_menu extends AppCompatActivity {

    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sandwitch_menu);


        listView=findViewById(R.id.ls_menu_sand);



        ArrayList <menu> menus = new ArrayList<>();

        menus.add(new menu(R.drawable.sandsand , getString(R.string.sandwitch_menu_layout_Cheese_Burger) ,"20"));
        menus.add(new menu(R.drawable.hawawshsand,getString(R.string.sandwitch_menu_layout_Hawawshi_Sandwich),"15"));
        menus.add(new menu(R.drawable.kapapsand,getString(R.string.sandwitch_menu_layout_Kebab_Sandwich),"22"));
        menus.add(new menu(R.drawable.sandkofta,getString(R.string.sandwitch_menu_layout_Kofta_Sandwich),"14"));
        menus.add(new menu(R.drawable.meatsand,getString(R.string.sandwitch_menu_layout_Meat_Sandwich),"23"));
        menus.add(new menu(R.drawable.sheshtawksand,getString(R.string.sandwitch_menu_layout_Chicken_Sandwich),"24"));


        MenuListView myadptar =new MenuListView(this,R.layout.menu_row,menus);
        listView.setAdapter(myadptar);




        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                switch (i)
                {
                    case 0 :


                        Intent intent1 = new Intent(sandwitch_menu.this , result.class);

                        intent1.putExtra("sandwitch_image1" , R.drawable.sandsand);
                        intent1.putExtra("sandwitch_name1" , getString(R.string.sandwitch_menu_layout_Cheese_Burger));
                        intent1.putExtra("sandwitch_price1" , "20");

                        startActivity(intent1);

                        break;



                    case 1 :

                        Intent intent2 = new Intent(sandwitch_menu.this, result.class);

                        intent2.putExtra("sandwitch_image2" ,R.drawable.hawawshsand);
                        intent2.putExtra("sandwitch_name2" , getString(R.string.sandwitch_menu_layout_Hawawshi_Sandwich));
                        intent2.putExtra("sandwitch_price2" , "15");


                        startActivity(intent2);

                        break;

                    case 2 :

                        Intent intent3 = new Intent(sandwitch_menu.this , result.class);

                        intent3.putExtra("sandwitch_image3" ,R.drawable.kapapsand);
                        intent3.putExtra("sandwitch_name3" , getString(R.string.sandwitch_menu_layout_Kebab_Sandwich));
                        intent3.putExtra("sandwitch_price3" , "22");


                        startActivity(intent3);

                        break;

                    case 3 :

                        Intent intent4 = new Intent(sandwitch_menu.this, result.class);

                        intent4.putExtra("sandwitch_image4" ,R.drawable.sandkofta);
                        intent4.putExtra("sandwitch_name4" , getString(R.string.sandwitch_menu_layout_Kofta_Sandwich));
                        intent4.putExtra("sandwitch_price4" , "14");


                        startActivity(intent4);

                        break;

                    case 4 :

                        Intent intent5 = new Intent(sandwitch_menu.this , result.class);

                        intent5.putExtra("sandwitch_image5" ,R.drawable.meatsand);
                        intent5.putExtra("sandwitch_name5" , getString(R.string.sandwitch_menu_layout_Meat_Sandwich));
                        intent5.putExtra("sandwitch_price5" , "23");


                        startActivity(intent5);

                        break;

                    case 5 :

                        Intent intent6 = new Intent(sandwitch_menu.this , result.class);

                        intent6.putExtra("sandwitch_image6" ,R.drawable.sheshtawksand);
                        intent6.putExtra("sandwitch_name6" , getString(R.string.sandwitch_menu_layout_Chicken_Sandwich));
                        intent6.putExtra("sandwitch_price6" , "24");


                        startActivity(intent6);

                        break;


                }

            }
        });



    }
}