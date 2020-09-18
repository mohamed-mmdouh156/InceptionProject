package com.example.ieeetask2;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;



public class result extends AppCompatActivity {

    ListView result_listView;
    Button save , ok ;
    EditText number,price_for_one ;
    TextView price ;
    AlertDialog.Builder alert_dialog ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        Toolbar toolbar;
        toolbar=findViewById(R.id.toolbar_main);

        setSupportActionBar(toolbar);

        result_listView = findViewById(R.id.result_menu);
        save = findViewById(R.id.result_layout_save_btn);
        number = findViewById(R.id.result_layout_num_et);
        price_for_one = findViewById(R.id.result_layout_num_et_price);
        price = findViewById(R.id.result_layout_price_tv);
        ok = findViewById(R.id.result_layout_ok_btn);

        price_for_one.setVisibility(View.GONE);

        // ---- save order (button) code ------------



        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                alert_dialog = new AlertDialog.Builder(result.this);
                alert_dialog.setTitle("Warning");
                alert_dialog.setCancelable(false);
                alert_dialog.setMessage("Do you need Save order !");

                alert_dialog.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Toast.makeText(getApplicationContext() ,"Order Saved " ,Toast.LENGTH_LONG).show();
                        Intent to_home = new Intent(result.this , home.class);
                        startActivity(to_home);
                    }
                });

                alert_dialog.setNegativeButton("No", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.cancel();
                    }
                });

                AlertDialog dialog = alert_dialog.create();
                dialog.show();



            }
        });



        ok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                double num1 = Double.parseDouble(number.getText().toString()) ;
                double num2 = Double.parseDouble(price_for_one.getText().toString()) ;
                double total = num1 * num2;


                price.setText("    "+getString(R.string.result_layout_price_tv)+"  " + total);

            }
        });




        ArrayList <menu> result_menus = new ArrayList <> ();

        if (getIntent() != null)
        {

            // ----------------------- ( meat menu )-------------------
            // ----------- (get meat menu item 1 )------------

           int meat_res_image = getIntent().getIntExtra("meat_image1" ,0);
           String meat_rec_name = getIntent().getStringExtra("meat_name1" );
           String meat_rec_price = getIntent().getStringExtra("meat_price1");

            if(meat_rec_name != null && meat_rec_price != null) {
                result_menus.add(new menu(meat_res_image , meat_rec_name , meat_rec_price));
                price_for_one.setText(meat_rec_price);
            }

            // ----------- (get meat menu item 2 )------------

            int meat_res_image2 = getIntent().getIntExtra("meat_image2" ,0);
            String meat_rec_name2 = getIntent().getStringExtra("meat_name2" );
            String meat_rec_price2 = getIntent().getStringExtra("meat_price2");

            if(meat_rec_name2 != null && meat_rec_price2 != null) {
                result_menus.add( new menu (meat_res_image2, meat_rec_name2, meat_rec_price2));
                price_for_one.setText(meat_rec_price2);
            }

            // ----------- (get meat menu item 3 )------------

            int meat_res_image3 = getIntent().getIntExtra("meat_image3" ,0);
            String meat_rec_name3 = getIntent().getStringExtra("meat_name3" );
            String meat_rec_price3 = getIntent().getStringExtra("meat_price3");

            if(meat_rec_name3 != null && meat_rec_price3 != null) {
                result_menus.add( new menu (meat_res_image3, meat_rec_name3, meat_rec_price3));
                price_for_one.setText(meat_rec_price3);
            }

            // ----------- (get meat menu item 4 )------------

            int meat_res_image4 = getIntent().getIntExtra("meat_image4" ,0);
            String meat_rec_name4 = getIntent().getStringExtra("meat_name4" );
            String meat_rec_price4 = getIntent().getStringExtra("meat_price4");

            if(meat_rec_name4 != null && meat_rec_price4 != null) {
                result_menus.add( new menu (meat_res_image4, meat_rec_name4, meat_rec_price4));
                price_for_one.setText(meat_rec_price4);
            }

            // ----------- (get meat menu item 5 )------------

            int meat_res_image5 = getIntent().getIntExtra("meat_image5" ,0);
            String meat_rec_name5 = getIntent().getStringExtra("meat_name5" );
            String meat_rec_price5 = getIntent().getStringExtra("meat_price5");

            if(meat_rec_name5 != null && meat_rec_price5 != null) {
                result_menus.add( new menu (meat_res_image5, meat_rec_name5, meat_rec_price5));
                price_for_one.setText(meat_rec_price5);
            }

            // ----------- (get meat menu item 6 )------------

            int meat_res_image6 = getIntent().getIntExtra("meat_image6" ,0);
            String meat_rec_name6 = getIntent().getStringExtra("meat_name6" );
            String meat_rec_price6 = getIntent().getStringExtra("meat_price6");

            if(meat_rec_name6 != null && meat_rec_price6 != null) {
                result_menus.add( new menu (meat_res_image6, meat_rec_name6, meat_rec_price6));
                price_for_one.setText(meat_rec_price6);
            }



         // ----------------------- ( pizza menu )-------------------
         // ---------------------(get pizza menu item 1 )------------

            int pizza_res_image = getIntent().getIntExtra("pizza_image1" ,0);
            String pizza_rec_name = getIntent().getStringExtra("pizza_name1" );
            String pizza_rec_price = getIntent().getStringExtra("pizza_price1");

            if(pizza_rec_name != null && pizza_rec_price != null) {
                result_menus.add(new menu(pizza_res_image , pizza_rec_name , pizza_rec_price));
                price_for_one.setText(pizza_rec_price);
            }

            // ---------------------(get pizza menu item 2 )------------

            int pizza_res_image2 = getIntent().getIntExtra("pizza_image2" ,0);
            String pizza_rec_name2 = getIntent().getStringExtra("pizza_name2" );
            String pizza_rec_price2 = getIntent().getStringExtra("pizza_price2");

            if(pizza_rec_name2 != null && pizza_rec_price2 != null) {
                result_menus.add(new menu(pizza_res_image2 , pizza_rec_name2 , pizza_rec_price2));
                price_for_one.setText(pizza_rec_price2);
            }

            // ---------------------(get pizza menu item 3 )------------

            int pizza_res_image3 = getIntent().getIntExtra("pizza_image3" ,0);
            String pizza_rec_name3 = getIntent().getStringExtra("pizza_name3" );
            String pizza_rec_price3 = getIntent().getStringExtra("pizza_price3");

            if(pizza_rec_name3 != null && pizza_rec_price3 != null) {
                result_menus.add(new menu(pizza_res_image3 , pizza_rec_name3 , pizza_rec_price3));
                price_for_one.setText(pizza_rec_price3);
            }

            // ---------------------(get pizza menu item 4 )------------

            int pizza_res_image4 = getIntent().getIntExtra("pizza_image4" ,0);
            String pizza_rec_name4 = getIntent().getStringExtra("pizza_name4" );
            String pizza_rec_price4 = getIntent().getStringExtra("pizza_price4");

            if(pizza_rec_name4 != null && pizza_rec_price4 != null) {
                result_menus.add(new menu(pizza_res_image4 , pizza_rec_name4 , pizza_rec_price4));
                price_for_one.setText(pizza_rec_price4);
            }


            // ---------------------(get pizza menu item 5 )------------

            int pizza_res_image5 = getIntent().getIntExtra("pizza_image5" ,0);
            String pizza_rec_name5 = getIntent().getStringExtra("pizza_name5" );
            String pizza_rec_price5 = getIntent().getStringExtra("pizza_price5");

            if(pizza_rec_name5 != null && pizza_rec_price5 != null) {
                result_menus.add(new menu(pizza_res_image5 , pizza_rec_name5 , pizza_rec_price5));
                price_for_one.setText(pizza_rec_price5);
            }


            // ---------------------(get pizza menu item 6 )------------

            int pizza_res_image6 = getIntent().getIntExtra("pizza_image6" ,0);
            String pizza_rec_name6 = getIntent().getStringExtra("pizza_name6" );
            String pizza_rec_price6 = getIntent().getStringExtra("pizza_price6");

            if(pizza_rec_name6 != null && pizza_rec_price6 != null) {
                result_menus.add(new menu(pizza_res_image6 , pizza_rec_name6 , pizza_rec_price6));
                price_for_one.setText(pizza_rec_price6);
            }



            // ----------------------- ( sandwitch menu )-------------------
            // ---------------------(get sandwitch menu item 1 )------------

            int sandwitch_res_image = getIntent().getIntExtra("sandwitch_image1" ,0);
            String sandwitch_rec_name = getIntent().getStringExtra("sandwitch_name1" );
            String sandwitch_rec_price = getIntent().getStringExtra("sandwitch_price1");

            if(sandwitch_rec_name != null && sandwitch_rec_price != null) {
                result_menus.add(new menu(sandwitch_res_image , sandwitch_rec_name , sandwitch_rec_price));
                price_for_one.setText(sandwitch_rec_price);
            }


            // ---------------------(get sandwitch menu item 2 )------------

            int sandwitch_res_image2 = getIntent().getIntExtra("sandwitch_image2" ,0);
            String sandwitch_rec_name2 = getIntent().getStringExtra("sandwitch_name2" );
            String sandwitch_rec_price2 = getIntent().getStringExtra("sandwitch_price2");

            if(sandwitch_rec_name2 != null && sandwitch_rec_price2 != null) {
                result_menus.add(new menu(sandwitch_res_image2 , sandwitch_rec_name2 , sandwitch_rec_price2));
                price_for_one.setText(sandwitch_rec_price2);
            }


            // ---------------------(get sandwitch menu item 3 )------------

            int sandwitch_res_image3 = getIntent().getIntExtra("sandwitch_image3" ,0);
            String sandwitch_rec_name3 = getIntent().getStringExtra("sandwitch_name3" );
            String sandwitch_rec_price3 = getIntent().getStringExtra("sandwitch_price3");

            if(sandwitch_rec_name3 != null && sandwitch_rec_price3 != null) {
                result_menus.add(new menu(sandwitch_res_image3 , sandwitch_rec_name3 , sandwitch_rec_price3));
                price_for_one.setText(sandwitch_rec_price3);
            }


            // ---------------------(get sandwitch menu item 4 )------------

            int sandwitch_res_image4 = getIntent().getIntExtra("sandwitch_image4" ,0);
            String sandwitch_rec_name4 = getIntent().getStringExtra("sandwitch_name4" );
            String sandwitch_rec_price4 = getIntent().getStringExtra("sandwitch_price4");

            if(sandwitch_rec_name4 != null && sandwitch_rec_price4 != null) {
                result_menus.add(new menu(sandwitch_res_image4 , sandwitch_rec_name4 , sandwitch_rec_price4));
                price_for_one.setText(sandwitch_rec_price4);
            }


            // ---------------------(get sandwitch menu item 5 )------------

            int sandwitch_res_image5 = getIntent().getIntExtra("sandwitch_image5" ,0);
            String sandwitch_rec_name5 = getIntent().getStringExtra("sandwitch_name5" );
            String sandwitch_rec_price5 = getIntent().getStringExtra("sandwitch_price5");

            if(sandwitch_rec_name5 != null && sandwitch_rec_price5 != null) {
                result_menus.add(new menu(sandwitch_res_image5 , sandwitch_rec_name5 , sandwitch_rec_price5));
                price_for_one.setText(sandwitch_rec_price5);
            }


            // ---------------------(get sandwitch menu item 6 )------------

            int sandwitch_res_image6 = getIntent().getIntExtra("sandwitch_image6" ,0);
            String sandwitch_rec_name6 = getIntent().getStringExtra("sandwitch_name6" );
            String sandwitch_rec_price6 = getIntent().getStringExtra("sandwitch_price6");

            if(sandwitch_rec_name6 != null && sandwitch_rec_price6 != null) {
                result_menus.add(new menu(sandwitch_res_image6 , sandwitch_rec_name6 , sandwitch_rec_price6));
                price_for_one.setText(sandwitch_rec_price6);
            }




            // ----------------------- ( crepe menu )-------------------
            // ---------------------(get crepe menu item 1 )------------

            int crepe_res_image = getIntent().getIntExtra("crepe_image1" ,0);
            String crepe_rec_name = getIntent().getStringExtra("crepe_name1" );
            String crepe_rec_price = getIntent().getStringExtra("crepe_price1");

            if(crepe_rec_name != null && crepe_rec_price != null) {
                result_menus.add(new menu(crepe_res_image , crepe_rec_name , crepe_rec_price));
                price_for_one.setText(crepe_rec_price);
            }


            // ---------------------(get crepe menu item 2 )------------

            int crepe_res_image2 = getIntent().getIntExtra("crepe_image2" ,0);
            String crepe_rec_name2 = getIntent().getStringExtra("crepe_name2" );
            String crepe_rec_price2 = getIntent().getStringExtra("crepe_price2");

            if(crepe_rec_name2 != null && crepe_rec_price2 != null) {
                result_menus.add(new menu(crepe_res_image2 , crepe_rec_name2 , crepe_rec_price2));
                price_for_one.setText(crepe_rec_price2);
            }


            // ---------------------(get crepe menu item 3 )------------

            int crepe_res_image3 = getIntent().getIntExtra("crepe_image3" ,0);
            String crepe_rec_name3 = getIntent().getStringExtra("crepe_name3" );
            String crepe_rec_price3 = getIntent().getStringExtra("crepe_price3");

            if(crepe_rec_name3 != null && crepe_rec_price3 != null) {
                result_menus.add(new menu(crepe_res_image3 , crepe_rec_name3 , crepe_rec_price3));
                price_for_one.setText(crepe_rec_price3);
            }


            // ---------------------(get crepe menu item 4 )------------

            int crepe_res_image4 = getIntent().getIntExtra("crepe_image4" ,0);
            String crepe_rec_name4 = getIntent().getStringExtra("crepe_name4" );
            String crepe_rec_price4 = getIntent().getStringExtra("crepe_price4");

            if(crepe_rec_name4 != null && crepe_rec_price4 != null) {
                result_menus.add(new menu(crepe_res_image4 , crepe_rec_name4 , crepe_rec_price4));
                price_for_one.setText(crepe_rec_price4);
            }


            // ---------------------(get crepe menu item 5 )------------

            int crepe_res_image5 = getIntent().getIntExtra("crepe_image5" ,0);
            String crepe_rec_name5 = getIntent().getStringExtra("crepe_name5" );
            String crepe_rec_price5 = getIntent().getStringExtra("crepe_price5");

            if(crepe_rec_name5 != null && crepe_rec_price5 != null) {
                result_menus.add(new menu(crepe_res_image5 , crepe_rec_name5 , crepe_rec_price5));
                price_for_one.setText(crepe_rec_price5);
            }


            // ---------------------(get crepe menu item 6 )------------

            int crepe_res_image6 = getIntent().getIntExtra("crepe_image6" ,0);
            String crepe_rec_name6 = getIntent().getStringExtra("crepe_name6" );
            String crepe_rec_price6 = getIntent().getStringExtra("crepe_price6");

            if(crepe_rec_name6 != null && crepe_rec_price6 != null) {
                result_menus.add(new menu(crepe_res_image6 , crepe_rec_name6 , crepe_rec_price6));
                price_for_one.setText(crepe_rec_price6);
            }



            // ----------------------- ( hot drinks menu )-------------------
            // ---------------------(get hot drinks menu item 1 )------------


                int hot_res_image = getIntent().getIntExtra("hot_drinks_image1" ,0);
                String hot_rec_name = getIntent().getStringExtra("hot_drinks_name1");
                String hot_rec_price = getIntent().getStringExtra("hot_drinks_price1");

                if (hot_rec_name != null && hot_rec_price != null) {
                    result_menus.add(new menu(hot_res_image, hot_rec_name, hot_rec_price));
                    price_for_one.setText(hot_rec_price);
                }



            // ---------------------(get hot drinks menu item 2 )------------

            int hot_res_image2 = getIntent().getIntExtra("hot_drinks_image2" ,0);
            String hot_rec_name2 = getIntent().getStringExtra("hot_drinks_name2" );
            String hot_rec_price2 = getIntent().getStringExtra("hot_drinks_price2");

            if(hot_rec_name2 != null && hot_rec_price2 != null) {
                result_menus.add(new menu(hot_res_image2 , hot_rec_name2 , hot_rec_price2));
                price_for_one.setText(hot_rec_price2);
            }


            // ---------------------(get hot drinks menu item 3 )------------

            int hot_res_image3 = getIntent().getIntExtra("hot_drinks_image3" ,0);
            String hot_rec_name3 = getIntent().getStringExtra("hot_drinks_name3" );
            String hot_rec_price3 = getIntent().getStringExtra("hot_drinks_price3");

            if(hot_rec_name3 != null && hot_rec_price3 != null) {
                result_menus.add(new menu(hot_res_image3 , hot_rec_name3 , hot_rec_price3));
                price_for_one.setText(hot_rec_price3);
            }


            // ---------------------(get hot drinks menu item 4 )------------

            int hot_res_image4 = getIntent().getIntExtra("hot_drinks_image4" ,0);
            String hot_rec_name4 = getIntent().getStringExtra("hot_drinks_name4" );
            String hot_rec_price4 = getIntent().getStringExtra("hot_drinks_price4");

            if(hot_rec_name4 != null && hot_rec_price4 != null) {
                result_menus.add(new menu(hot_res_image4 , hot_rec_name4 , hot_rec_price4));
                price_for_one.setText(hot_rec_price4);
            }


            // ---------------------(get hot drinks menu item 5 )------------

            int hot_res_image5 = getIntent().getIntExtra("hot_drinks_image5" ,0);
            String hot_rec_name5 = getIntent().getStringExtra("hot_drinks_name5" );
            String hot_rec_price5 = getIntent().getStringExtra("hot_drinks_price5");

            if(hot_rec_name5 != null && hot_rec_price5 != null) {
                result_menus.add(new menu(hot_res_image5 , hot_rec_name5 , hot_rec_price5));
                price_for_one.setText(hot_rec_price5);
            }


            // ---------------------(get hot drinks menu item 6 )------------

            int hot_res_image6 = getIntent().getIntExtra("hot_drinks_image6" ,0);
            String hot_rec_name6 = getIntent().getStringExtra("hot_drinks_name6" );
            String hot_rec_price6 = getIntent().getStringExtra("hot_drinks_price6");

            if(hot_rec_name6 != null && hot_rec_price6 != null) {
                result_menus.add(new menu(hot_res_image6 , hot_rec_name6 , hot_rec_price6));
                price_for_one.setText(hot_rec_price6);
            }


            // ---------------------(get hot drinks menu item 7 )------------

            int hot_res_image7 = getIntent().getIntExtra("hot_drinks_image7" ,0);
            String hot_rec_name7 = getIntent().getStringExtra("hot_drinks_name7" );
            String hot_rec_price7 = getIntent().getStringExtra("hot_drinks_price7");

            if(hot_rec_name7 != null && hot_rec_price7 != null) {
                result_menus.add(new menu(hot_res_image7 , hot_rec_name7 , hot_rec_price7));
                price_for_one.setText(hot_rec_price7);
            }



            // ---------------------(get hot drinks menu item 8 )------------

            int hot_res_image8 = getIntent().getIntExtra("hot_drinks_image8" ,0);
            String hot_rec_name8 = getIntent().getStringExtra("hot_drinks_name8" );
            String hot_rec_price8 = getIntent().getStringExtra("hot_drinks_price8");

            if(hot_rec_name8 != null && hot_rec_price8 != null) {
                result_menus.add(new menu(hot_res_image8 , hot_rec_name8 , hot_rec_price8));
                price_for_one.setText(hot_rec_price8);
            }


         // ---------------------(get hot drinks menu item 9 )------------

            int hot_res_image9 = getIntent().getIntExtra("hot_drinks_image9" ,0);
            String hot_rec_name9 = getIntent().getStringExtra("hot_drinks_name9" );
            String hot_rec_price9 = getIntent().getStringExtra("hot_drinks_price9");

            if(hot_rec_name9 != null && hot_rec_price9 != null) {
                result_menus.add(new menu(hot_res_image9 , hot_rec_name9 , hot_rec_price9));
                price_for_one.setText(hot_rec_price9);
            }





            // ----------------------- ( soft drinks menu )-------------------
            // ---------------------(get soft drinks menu item 1 )------------


            int soft_res_image = getIntent().getIntExtra("soft_drinks_image1" ,0);
            String soft_rec_name = getIntent().getStringExtra("soft_drinks_name1");
            String soft_rec_price = getIntent().getStringExtra("soft_drinks_price1");

            if (soft_rec_name != null && soft_rec_price != null) {
                result_menus.add(new menu(soft_res_image, soft_rec_name, soft_rec_price));
                price_for_one.setText(soft_rec_price);
            }


            // ---------------------(get soft drinks menu item 2 )------------


            int soft_res_image2 = getIntent().getIntExtra("soft_drinks_image2" ,0);
            String soft_rec_name2 = getIntent().getStringExtra("soft_drinks_name2");
            String soft_rec_price2 = getIntent().getStringExtra("soft_drinks_price2");

            if (soft_rec_name2 != null && soft_rec_price2 != null) {
                result_menus.add(new menu(soft_res_image2, soft_rec_name2, soft_rec_price2));
                price_for_one.setText(soft_rec_price2);
            }

            // ---------------------(get soft drinks menu item 3 )------------


            int soft_res_image3 = getIntent().getIntExtra("soft_drinks_image3" ,0);
            String soft_rec_name3 = getIntent().getStringExtra("soft_drinks_name3");
            String soft_rec_price3 = getIntent().getStringExtra("soft_drinks_price3");

            if (soft_rec_name3 != null && soft_rec_price3 != null) {
                result_menus.add(new menu(soft_res_image3, soft_rec_name3, soft_rec_price3));
                price_for_one.setText(soft_rec_price3);
            }


            // ---------------------(get soft drinks menu item 4 )------------


            int soft_res_image4 = getIntent().getIntExtra("soft_drinks_image4" ,0);
            String soft_rec_name4 = getIntent().getStringExtra("soft_drinks_name4");
            String soft_rec_price4 = getIntent().getStringExtra("soft_drinks_price4");

            if (soft_rec_name4 != null && soft_rec_price4 != null) {
                result_menus.add(new menu(soft_res_image4, soft_rec_name4, soft_rec_price4));
                price_for_one.setText(soft_rec_price4);
            }

            // ---------------------(get soft drinks menu item 5 )------------


            int soft_res_image5 = getIntent().getIntExtra("soft_drinks_image5" ,0);
            String soft_rec_name5 = getIntent().getStringExtra("soft_drinks_name5");
            String soft_rec_price5 = getIntent().getStringExtra("soft_drinks_price5");

            if (soft_rec_name5 != null && soft_rec_price5 != null) {
                result_menus.add(new menu(soft_res_image5, soft_rec_name5, soft_rec_price5));
                price_for_one.setText(soft_rec_price5);
            }


            // ---------------------(get soft drinks menu item 6 )------------


            int soft_res_image6 = getIntent().getIntExtra("soft_drinks_image6" ,0);
            String soft_rec_name6 = getIntent().getStringExtra("soft_drinks_name6");
            String soft_rec_price6 = getIntent().getStringExtra("soft_drinks_price6");

            if (soft_rec_name6 != null && soft_rec_price6 != null) {
                result_menus.add(new menu(soft_res_image6, soft_rec_name6, soft_rec_price6));
                price_for_one.setText(soft_rec_price6);
            }



            // ----------------------- ( ice cream menu )-------------------
            // ---------------------(get ice cream menu item 1 )------------


            int ice_res_image = getIntent().getIntExtra("ice_cream_image1" ,0);
            String ice_rec_name = getIntent().getStringExtra("ice_cream_name1");
            String ice_rec_price = getIntent().getStringExtra("ice_cream_price1");

            if (ice_rec_name != null && ice_rec_price != null) {
                result_menus.add(new menu(ice_res_image, ice_rec_name, ice_rec_price));
                price_for_one.setText(ice_rec_price);
            }


            // ---------------------(get ice cream menu item 2 )------------


            int ice_res_image2 = getIntent().getIntExtra("ice_cream_image2" ,0);
            String ice_rec_name2 = getIntent().getStringExtra("ice_cream_name2");
            String ice_rec_price2 = getIntent().getStringExtra("ice_cream_price2");

            if (ice_rec_name2 != null && ice_rec_price2 != null) {
                result_menus.add(new menu(ice_res_image2, ice_rec_name2, ice_rec_price2));
                price_for_one.setText(ice_rec_price2);
            }


            // ---------------------(get ice cream menu item 3 )------------


            int ice_res_image3 = getIntent().getIntExtra("ice_cream_image3" ,0);
            String ice_rec_name3 = getIntent().getStringExtra("ice_cream_name3");
            String ice_rec_price3 = getIntent().getStringExtra("ice_cream_price3");

            if (ice_rec_name3 != null && ice_rec_price3 != null) {
                result_menus.add(new menu(ice_res_image3, ice_rec_name3, ice_rec_price3));
                price_for_one.setText(ice_rec_price3);
            }


            // ---------------------(get ice cream menu item 4 )------------


            int ice_res_image4 = getIntent().getIntExtra("ice_cream_image4" ,0);
            String ice_rec_name4 = getIntent().getStringExtra("ice_cream_name4");
            String ice_rec_price4 = getIntent().getStringExtra("ice_cream_price4");

            if (ice_rec_name4 != null && ice_rec_price4 != null) {
                result_menus.add(new menu(ice_res_image4, ice_rec_name4, ice_rec_price4));
                price_for_one.setText(ice_rec_price4);
            }


            // ---------------------(get ice cream menu item 5 )------------


            int ice_res_image5 = getIntent().getIntExtra("ice_cream_image5" ,0);
            String ice_rec_name5 = getIntent().getStringExtra("ice_cream_name5");
            String ice_rec_price5 = getIntent().getStringExtra("ice_cream_price5");

            if (ice_rec_name5 != null && ice_rec_price5 != null) {
                result_menus.add(new menu(ice_res_image5, ice_rec_name5, ice_rec_price5));
                price_for_one.setText(ice_rec_price5);
            }




             // ----------------------- ( juice menu )-------------------
            // ---------------------(get juice menu item 1 )------------


            int juice_res_image = getIntent().getIntExtra("juice_image1" ,0);
            String juice_rec_name = getIntent().getStringExtra("juice_name1");
            String juice_rec_price = getIntent().getStringExtra("juice_price1");

            if (juice_rec_name != null && juice_rec_price != null) {
                result_menus.add(new menu(juice_res_image, juice_rec_name, juice_rec_price));
                price_for_one.setText(juice_rec_price);
            }



            // ---------------------(get juice menu item 2 )------------


            int juice_res_image2 = getIntent().getIntExtra("juice_image2" ,0);
            String juice_rec_name2 = getIntent().getStringExtra("juice_name2");
            String juice_rec_price2 = getIntent().getStringExtra("juice_price2");

            if (juice_rec_name2 != null && juice_rec_price2 != null) {
                result_menus.add(new menu(juice_res_image2, juice_rec_name2, juice_rec_price2));
                price_for_one.setText(juice_rec_price2);
            }


            // ---------------------(get juice menu item 3 )------------


            int juice_res_image3 = getIntent().getIntExtra("juice_image3" ,0);
            String juice_rec_name3 = getIntent().getStringExtra("juice_name3");
            String juice_rec_price3 = getIntent().getStringExtra("juice_price3");

            if (juice_rec_name3 != null && juice_rec_price3 != null) {
                result_menus.add(new menu(juice_res_image3, juice_rec_name3, juice_rec_price3));
                price_for_one.setText(juice_rec_price3);
            }


            // ---------------------(get juice menu item 4 )------------


            int juice_res_image4 = getIntent().getIntExtra("juice_image4" ,0);
            String juice_rec_name4 = getIntent().getStringExtra("juice_name4");
            String juice_rec_price4 = getIntent().getStringExtra("juice_price4");

            if (juice_rec_name4 != null && juice_rec_price4 != null) {
                result_menus.add(new menu(juice_res_image4, juice_rec_name4, juice_rec_price4));
                price_for_one.setText(juice_rec_price4);
            }


            // ---------------------(get juice menu item 5 )------------


            int juice_res_image5 = getIntent().getIntExtra("juice_image5" ,0);
            String juice_rec_name5 = getIntent().getStringExtra("juice_name5");
            String juice_rec_price5 = getIntent().getStringExtra("juice_price5");

            if (juice_rec_name5 != null && juice_rec_price5 != null) {
                result_menus.add(new menu(juice_res_image5, juice_rec_name5, juice_rec_price5));
                price_for_one.setText(juice_rec_price5);
            }


            // ---------------------(get juice menu item 6 )------------


            int juice_res_image6 = getIntent().getIntExtra("juice_image6" ,0);
            String juice_rec_name6 = getIntent().getStringExtra("juice_name6");
            String juice_rec_price6 = getIntent().getStringExtra("juice_price6");

            if (juice_rec_name6 != null && juice_rec_price6 != null) {
                result_menus.add(new menu(juice_res_image6, juice_rec_name6, juice_rec_price6));
                price_for_one.setText(juice_rec_price6);
            }

           //------------------------------------------------------------------


        }







        MenuListView result_myadptar =new MenuListView(this,R.layout.menu_row, result_menus);

        result_listView.setAdapter(result_myadptar);


    }
}