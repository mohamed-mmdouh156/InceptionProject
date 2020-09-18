package com.example.ieeetask2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.text.InputType;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class login extends AppCompatActivity {

    CheckBox show_pass_cb;
    TextView create_tv;
    EditText mail_et , password_et ;
    Button sign_in_btn;
    my_database db ;

   static boolean check = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        Toolbar toolbar;
        toolbar=findViewById(R.id.toolbar_main);

        setSupportActionBar(toolbar);



          id();
          db = new my_database(this);



        //----- login layout ( check box ) remember me  code -------------------

        show_pass_cb.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {

                if(check == false)
                {
                    password_et.setInputType(InputType.TYPE_CLASS_TEXT);
                     check = true;
                }
                else
                    {
                    password_et.setInputType(InputType.TYPE_CLASS_TEXT|InputType.TYPE_TEXT_VARIATION_PASSWORD);
                         check = false;
                    }
            }
        });



        //------- login layout (text view) create account code -------------------

        create_tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent create_page = new Intent(login.this , register.class);
                startActivity(create_page);
            }
        });





        //------- login layout (button) create account code -------------------

        sign_in_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String mail = mail_et.getText().toString().trim();
                String pass = password_et.getText().toString().trim();

                boolean res_mail = db.check_mail(mail);
                boolean res_pass = db.check_pass(pass);
                boolean rec_check = db.check_user_login(mail ,pass);




               if (rec_check == true)
               {
                   Toast.makeText(login.this , "login success " ,Toast.LENGTH_LONG).show();
                    Intent to_home = new Intent(login.this ,home.class);
                    startActivity(to_home);
               }
               else if (res_mail == false)
               {
                   Toast.makeText(login.this , " Incorrect Email" ,Toast.LENGTH_LONG).show();
               }
               else if (res_pass == false)
               {
                   Toast.makeText(login.this , "Incorrect password" ,Toast.LENGTH_LONG).show();
               }
               else
               {
                   Toast.makeText(login.this , "Account not Exist" ,Toast.LENGTH_LONG).show();
               }




            }
        });

    }




    private void id ()
    {
        show_pass_cb = findViewById(R.id.login_layout_show_pass_cb);
        create_tv = findViewById(R.id.login_layout_create_account_tv);
        mail_et = findViewById(R.id.login_layout_mail_et);
        password_et = findViewById(R.id.login_layout_password_et);
        sign_in_btn = findViewById(R.id.login_layout_sign_in_btn);
    }

}