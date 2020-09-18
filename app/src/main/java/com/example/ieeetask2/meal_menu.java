package com.example.ieeetask2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class meal_menu extends AppCompatActivity {
ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_meal_menu);

        listView=findViewById(R.id.meal_menu);


        ArrayList<menu> menus=new ArrayList<>();

        menus.add(new menu(R.drawable.kapapmeal , getString(R.string.meal_menu_layout_kebab_meal) , "48"));
        menus.add(new menu(R.drawable.halfstchiken , getString(R.string.meal_menu_layout_chicken_meal) , "40"));
        menus.add(new menu(R.drawable.sashtawakmeal , getString(R.string.meal_menu_layout_shish_tawook) ,"30"));
        menus.add(new menu(R.drawable.maksgrilmeal , getString(R.string.meal_menu_layout_mix_grill) ,"35"));
        menus.add(new menu(R.drawable.kapadameal , getString(R.string.meal_menu_layout_grilled_liver) ,"20"));
        menus.add(new menu(R.drawable.stchikenmeal , getString(R.string.meal_menu_layout_grilled_chicken) ,"25"));



        MenuListView adptar =new MenuListView(this,R.layout.menu_row,menus);
        listView.setAdapter(adptar);





        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                switch (i)
                {
                    case 0 :

                        Intent intent1 = new Intent(meal_menu.this , result.class);
                        intent1.putExtra("meat_image1" ,R.drawable.kapapmeal);
                        intent1.putExtra("meat_name1" , getString(R.string.meal_menu_layout_kebab_meal));
                        intent1.putExtra("meat_price1" , "48");
                        startActivity(intent1);

                        break;

                    case 1 :

                        Intent intent2 = new Intent(meal_menu.this , result.class);

                        intent2.putExtra("meat_image2" ,R.drawable.halfstchiken);
                        intent2.putExtra("meat_name2" , getString(R.string.meal_menu_layout_chicken_meal));
                        intent2.putExtra("meat_price2" , "40");

                        startActivity(intent2);

                        break;

                    case 2 :

                        Intent intent3 = new Intent(meal_menu.this , result.class);

                        intent3.putExtra("meat_image3" ,R.drawable.sashtawakmeal);
                        intent3.putExtra("meat_name3" , getString(R.string.meal_menu_layout_shish_tawook));
                        intent3.putExtra("meat_price3" , "30");

                        startActivity(intent3);

                        break;

                    case 3 :

                        Intent intent4 = new Intent(meal_menu.this , result.class);

                        intent4.putExtra("meat_image4" ,R.drawable.maksgrilmeal);
                        intent4.putExtra("meat_name4" , getString(R.string.meal_menu_layout_mix_grill));
                        intent4.putExtra("meat_price4" , "35");

                        startActivity(intent4);

                        break;

                    case 4 :

                        Intent intent5 = new Intent(meal_menu.this , result.class);

                        intent5.putExtra("meat_image5" ,R.drawable.kapadameal);
                        intent5.putExtra("meat_name5" , getString(R.string.meal_menu_layout_grilled_liver));
                        intent5.putExtra("meat_price5" , "20");

                        startActivity(intent5);

                        break;

                    case 5 :

                        Intent intent6 = new Intent(meal_menu.this , result.class);

                        intent6.putExtra("meat_image6" ,R.drawable.stchikenmeal);
                        intent6.putExtra("meat_name6" , getString(R.string.meal_menu_layout_grilled_chicken));
                        intent6.putExtra("meat_price6" , "25");

                        startActivity(intent6);

                        break;


                }

          }
      });

    }
}