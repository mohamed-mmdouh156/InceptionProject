package com.example.ieeetask2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class crepe_mene extends AppCompatActivity {
ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_crepe_mene);


        listView = findViewById(R.id.ls_menu);


        ArrayList<menu> menus=new ArrayList<>();


        menus.add(new menu(R.drawable.bargarcrepe , getString(R.string.crepe_menu_layout_Burger_Crepe) ,"17"));
        menus.add(new menu(R.drawable.sgocrepe , getString(R.string.crepe_menu_layout_Sausage_Crepe) ,"17"));
        menus.add(new menu(R.drawable.koftacrepe , getString(R.string.crepe_menu_layout_Kofta_crepe) ,"18"));
        menus.add(new menu(R.drawable.notalla , getString(R.string.crepe_menu_layout_Nutella) ,"27"));
        menus.add(new menu(R.drawable.meatcrepe , getString(R.string.crepe_menu_layout_Beef_crepe) ,"25"));
        menus.add(new menu(R.drawable.stchikencrepe , getString(R.string.crepe_menu_layout_Chicken_crepe) ,"22"));


        MenuListView myadptar =new MenuListView(this,R.layout.menu_row,menus);
        listView.setAdapter(myadptar);



        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                switch (i)
                {
                    case 0 :


                        Intent intent1 = new Intent(crepe_mene.this , result.class);

                        intent1.putExtra("crepe_image1" ,R.drawable.bargarcrepe);
                        intent1.putExtra("crepe_name1" , getString(R.string.crepe_menu_layout_Burger_Crepe));
                        intent1.putExtra("crepe_price1" , "17");

                        startActivity(intent1);

                        break;


                    case 1 :

                        Intent intent2 = new Intent(crepe_mene.this, result.class);

                        intent2.putExtra("crepe_image2" ,R.drawable.sgocrepe);
                        intent2.putExtra("crepe_name2" , getString(R.string.crepe_menu_layout_Sausage_Crepe) );
                        intent2.putExtra("crepe_price2" , "17");


                        startActivity(intent2);

                        break;


                    case 2 :

                        Intent intent3 = new Intent(crepe_mene.this , result.class);

                        intent3.putExtra("crepe_image3" ,R.drawable.koftacrepe);
                        intent3.putExtra("crepe_name3" , getString(R.string.crepe_menu_layout_Kofta_crepe));
                        intent3.putExtra("crepe_price3" , "18");


                        startActivity(intent3);

                        break;


                    case 3 :

                        Intent intent4 = new Intent(crepe_mene.this, result.class);

                        intent4.putExtra("crepe_image4" ,R.drawable.notalla);
                        intent4.putExtra("crepe_name4" ,  getString(R.string.crepe_menu_layout_Nutella));
                        intent4.putExtra("crepe_price4" , "27");


                        startActivity(intent4);

                        break;


                    case 4 :

                        Intent intent5 = new Intent(crepe_mene.this , result.class);

                        intent5.putExtra("crepe_image5" ,R.drawable.meatcrepe);
                        intent5.putExtra("crepe_name5" , getString(R.string.crepe_menu_layout_Beef_crepe) );
                        intent5.putExtra("crepe_price5" , "25");


                        startActivity(intent5);

                        break;



                    case 5 :

                        Intent intent6 = new Intent(crepe_mene.this , result.class);

                        intent6.putExtra("crepe_image6" ,R.drawable.stchikencrepe);
                        intent6.putExtra("crepe_name6" , getString(R.string.crepe_menu_layout_Chicken_crepe));
                        intent6.putExtra("crepe_price6" , "22");


                        startActivity(intent6);

                        break;


                }

            }
        });





    }
}