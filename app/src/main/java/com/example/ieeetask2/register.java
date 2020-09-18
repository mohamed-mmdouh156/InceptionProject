package com.example.ieeetask2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class register extends AppCompatActivity {

    Button create_account_btn ;
    EditText name_et ;
    EditText mail_et ;
    EditText phone_et ;
    EditText password_et ;

    my_database db ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        Toolbar toolbar;
        toolbar=findViewById(R.id.toolbar_main);

        setSupportActionBar(toolbar);

        // linked ids of views

           id();

           db = new my_database(this);


       //--------- register layout (button) create account code ----------

        create_account_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String user_name = name_et.getText().toString().trim();
                String user_mail = mail_et.getText().toString().trim();
                String user_phone = phone_et.getText().toString().trim();
                String user_pass = password_et.getText().toString().trim();

                 user user = new user (user_name , user_mail, user_phone, user_pass);

                 boolean result =  db.insert_user(user);
                 boolean check_mail = db.check_mail(user_mail);


                if (result == true)
                {

                        Toast.makeText(getApplicationContext(), "Data saved", Toast.LENGTH_LONG).show();
                        Intent to_login = new Intent(register.this, login.class);
                        startActivity(to_login);
                }
                else
                {
                    Toast.makeText(getApplicationContext() ,"Data not saved" , Toast.LENGTH_LONG).show();
                }



            }
        });


    }



    private void id ()
    {
        create_account_btn = findViewById(R.id.register_layout_create_account_btn);
        name_et = findViewById(R.id.register_layout_name_et);
        mail_et = findViewById(R.id.register_layout_mail_et);
        password_et = findViewById(R.id.register_layout_password_et);
        phone_et = findViewById(R.id.register_layout_phone_et);
    }


}