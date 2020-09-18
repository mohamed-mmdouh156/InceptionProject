package com.example.ieeetask2;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.DatabaseUtils;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.util.ArrayList;

public class my_database extends SQLiteOpenHelper {

    public static final String  DATABASE_NAME = "register";
    public static final String TABLE_NAME = "users";
    public static final String USER_ID = "id";
    public static final String USER_NAME = "name";
    public static final String USER_EMAIL = "email";
    public static final String USER_PHONE = "phone";
    public static final String USER_PASS = "password";


    my_database (Context c)
    {
        super(c ,"register" ,null ,1);
    }
    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL("CREATE TABLE users (id INTEGER PRIMARY KEY AUTOINCREMENT , name TEXT , email TEXT , phone TEXT , password TEXT )");
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
        sqLiteDatabase.execSQL("drop table if exists users");
        onCreate(sqLiteDatabase);
    }


    public boolean insert_user (user user)
    {
        SQLiteDatabase db = getWritableDatabase();
        ContentValues values = new ContentValues ();

        values.put("name" , user.getName());
        values.put("email" , user.getEmail());
        values.put("phone" , user.getPhone());
        values.put("password" , user.getPass());

        // insert method return -1 if it no added and positive number if added

        long result = db.insert("users" ,null , values);
        db.close();

        if (result != -1)
            return true;
        else
            return false;

    }


    public boolean  check_user_login (String user_mail , String user_pass) {

        SQLiteDatabase db = getReadableDatabase();


        Cursor cursor = db.rawQuery("SELECT * FROM users WHERE email =? and password =? ", new String[]{user_mail , user_pass});

        if(cursor.getCount() == 0)
            return false;
        else
            return true;

    }



    public boolean check_mail (String user_mail ) {
        SQLiteDatabase db = getReadableDatabase();


        Cursor cursor = db.rawQuery("SELECT * FROM users WHERE email =? ", new String[]{user_mail});

        if(cursor.getCount() == 0)
            return false;
        else
            return true;
    }



    public boolean check_pass ( String user_pass ) {

        SQLiteDatabase db = getReadableDatabase();

        Cursor cursor = db.rawQuery("SELECT * FROM users WHERE password =? ", new String[]{user_pass});

        if(cursor.getCount() == 0)
            return false;
        else
            return true;
    }


    public long get_count ()
    {
        SQLiteDatabase db = getWritableDatabase();

        return DatabaseUtils.queryNumEntries(db , TABLE_NAME);
    }










    /*



    public boolean update_user (user user)
    {
        SQLiteDatabase db = getWritableDatabase();
        ContentValues values = new ContentValues ();

        values.put(USER_NAME , user.getName());
        values.put(USER_EMAIL , user.getEmail());
        values.put(USER_PASS , user.getPass());

        String arr [] ={user.getEmail()+"" , user.getPhone()+""};

        // update method always return int (number of colums you edit in) ;

        int result = db.update(DB_NAME , values ,"email=? , phone=?" ,arr);
        db.close();

        return (result > 0) ;
    }




    public boolean delete_user (user user)
    {
        SQLiteDatabase db = getWritableDatabase();

        String arr [] ={user.getEmail()+"" , user.getPass()+""};
        int result = db.delete(DB_NAME ,"email=?" ,arr);

        return (result > 0) ;
    }





    public ArrayList<user> get_all_data ()
    {
        SQLiteDatabase db = getReadableDatabase();

        ArrayList <user> users = new ArrayList<>();

        Cursor cursor = db.rawQuery("select * from "+DB_NAME ,null);

        if(DB_NAME != null && cursor.moveToFirst())
        {
            do {
                int id = cursor.getInt(cursor.getColumnIndex(USER_ID));
                String name = cursor.getString(cursor.getColumnIndex(USER_NAME));
                String email = cursor.getString(cursor.getColumnIndex(USER_EMAIL));
                String phone = cursor.getString(cursor.getColumnIndex(USER_PHONE));
                String pass = cursor.getString(cursor.getColumnIndex(USER_PASS));

                user user = new user (id ,name , email, phone,pass );

                users.add(user);

            }while(cursor.moveToNext());

            cursor.close();

        }

        return users;
    }



     */

}
