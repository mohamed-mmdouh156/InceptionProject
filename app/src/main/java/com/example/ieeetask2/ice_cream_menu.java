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

public class ice_cream_menu extends AppCompatActivity {

    ListView ice_cream_list ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ice_cream_menu);

        ice_cream_list = findViewById(R.id.ice_cream_menu_list_view);


        ArrayList<menu> menus = new ArrayList<>();


        menus.add(new menu(R.drawable.milkshak , getString(R.string.ice_cream_menu_Milk_Shake) , "18"));
        menus.add(new menu(R.drawable.oreo  ,  getString(R.string.ice_cream_menu_Oreo) ,  "21"));
        menus.add(new menu(R.drawable.twiks ,  getString(R.string.ice_cream_menu_Twix) ,"20"));
        menus.add(new menu(R.drawable.kandr , getString(R.string.ice_cream_menu_Kinder) ,"22"));
        menus.add(new menu(R.drawable.nutalla , getString(R.string.ice_cream_menu_Nutella) ,"24"));



        MenuListView adptar =new MenuListView(this,R.layout.menu_row,menus);

        ice_cream_list.setAdapter(adptar);


        ice_cream_list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                switch (i)
                {
                    case 0 :


                        Intent intent1 = new Intent(ice_cream_menu.this , result.class);

                        intent1.putExtra("ice_cream_image1" , R.drawable.milkshak );
                        intent1.putExtra("ice_cream_name1" ,   getString(R.string.ice_cream_menu_Milk_Shake));
                        intent1.putExtra("ice_cream_price1" , "18");

                        startActivity(intent1);

                        break;


                    case 1 :

                        Intent intent2 = new Intent(ice_cream_menu.this, result.class);

                        intent2.putExtra("ice_cream_image2" , R.drawable.oreo );
                        intent2.putExtra("ice_cream_name2" , getString(R.string.ice_cream_menu_Oreo));
                        intent2.putExtra("ice_cream_price2" , "21");


                        startActivity(intent2);

                        break;


                    case 2 :

                        Intent intent3 = new Intent(ice_cream_menu.this , result.class);

                        intent3.putExtra("ice_cream_image3" , R.drawable.twiks);
                        intent3.putExtra("ice_cream_name3" ,   getString(R.string.ice_cream_menu_Twix));
                        intent3.putExtra("ice_cream_price3" , "20");


                        startActivity(intent3);

                        break;


                    case 3 :

                        Intent intent4 = new Intent(ice_cream_menu.this, result.class);

                        intent4.putExtra("ice_cream_image4"  , R.drawable.kandr );
                        intent4.putExtra("ice_cream_name4" , getString(R.string.ice_cream_menu_Kinder) );
                        intent4.putExtra("ice_cream_price4" ,"22");


                        startActivity(intent4);

                        break;


                    case 4 :

                        Intent intent5 = new Intent(ice_cream_menu.this , result.class);

                        intent5.putExtra("ice_cream_image5" , R.drawable.nutalla );
                        intent5.putExtra("ice_cream_name5" ,  getString(R.string.ice_cream_menu_Nutella) );
                        intent5.putExtra("ice_cream_price5" , "24" );


                        startActivity(intent5);

                        break;


                }

            }
        });


    }



    public class menu_adapter extends ArrayAdapter<String> {

        Context context;
        String food_name_row [] ;
        String food_price_row [] ;
        int food_image_row [] ;

        menu_adapter (Context c , String food_name [] , String food_price [] , int food_image [])
        {
            super(c,R.layout.menu_row, R.id.row_main_text , food_name);

            this.context = c;
            this.food_name_row = food_name;
            this.food_price_row = food_price ;
            this.food_image_row = food_image ;

        }

        @NonNull
        @Override
        public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

            LayoutInflater layoutInflater = (LayoutInflater)getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);

            View v = layoutInflater.inflate(R.layout.menu_row, parent ,false);

            ImageView image = v.findViewById(R.id.row_image);
            TextView name = v.findViewById(R.id.row_main_text);
            TextView price = v.findViewById(R.id.row_price);


            image.setImageResource(food_image_row [position]);
            name.setText(food_name_row [position]);
            price.setText(food_price_row[position]);


            return v;
        }
    }
}