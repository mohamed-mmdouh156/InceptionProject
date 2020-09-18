package com.example.ieeetask2;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {
    Button to_home, create_account;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar;
        toolbar=findViewById(R.id.toolbar_main);

        setSupportActionBar(toolbar);

        id();

        /*
        View v = LayoutInflater.from(this).inflate(R.layout.start_screen ,null ,false);
        ImageView imageView = v.findViewById(R.id.custom_toast_img);

        Toast start_toast = new Toast(this);
        start_toast.setView(v);
        start_toast.setDuration(Toast.LENGTH_LONG);

        start_toast.show();

         */


        //----------- welcome toast ------------

        Toast.makeText(getApplicationContext(), "Welcome", Toast.LENGTH_LONG).show();

        //-------- login button code --------------

        to_home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent to_home_page = new Intent(MainActivity.this, login.class);
                startActivity(to_home_page);
            }
        });


        //-------- create account button code --------------

        create_account.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent to_create_account_page = new Intent(MainActivity.this, register.class);
                startActivity(to_create_account_page);
            }
        });


    }

    private void id() {
        to_home = findViewById(R.id.start_layout_login_btn);
        create_account = findViewById(R.id.start_layout_create_account_btn);
    }

    //--------------Create Menu-------------------------


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.main_menu, menu);
        return true;

    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.phone_menu:
                String uri = "tel:" + "01277556432";
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(uri));
                startActivity(intent);

                break;


           case R.id.about_menu:
              Intent intent1 = new Intent(MainActivity.this, about.class);
                startActivity(intent1);

                break;

        }
        return true;
    }
}