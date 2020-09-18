package com.example.ieeetask2;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.loader.app.LoaderManager;
import androidx.loader.content.Loader;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.Toast;

import java.util.ArrayList;

public class about extends AppCompatActivity implements LoaderManager.LoaderCallbacks<ArrayList<String>> {

    Button btn_showEmployees;
    ListView lv_showEmployees;
    ProgressBar progressBar;
    static ArrayList<String> students = new ArrayList<>();
    private static String STUDENTS_URL ="https://jsonware.com/json/b476a2301128d167cdd03ea9028052d6.json";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);

        lv_showEmployees = findViewById(R.id.lv_showEmployees);
        btn_showEmployees = findViewById(R.id.btn_showEmployees);
        progressBar = findViewById(R.id.pb_progress);


        btn_showEmployees.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                LoaderManager loaderManager = getSupportLoaderManager();
                loaderManager.initLoader(0, null, about.this).forceLoad();



/*                try {
                    JSONObject jsonRoot = new JSONObject(jsonString);

                    JSONArray jsonArray = jsonRoot.getJSONArray("students");

                    for (int i = 0; i < jsonArray.length(); i++) {
                        JSONObject student = jsonArray.getJSONObject(i);

                        int id = student.getInt("id");
                        String name = student.getString("name");
                        int age = student.getInt("age");
                        String email = student.getString("email");
                        String phone = student.getString("phone");

                        students.add("Id: " + id + "\nName: " + name + "\nAge: " + age + "\nEmail " + email + "\nPhone: " + phone);

                    }

                    studentsAdapter.notifyDataSetChanged();

                } catch (JSONException e) {
                    e.printStackTrace();
                }
                */

            }
        });


        //player = MediaPlayer.create(MainActivity.this, R.raw.railroad);

    }

    @NonNull
    @Override
    public Loader<ArrayList<String>> onCreateLoader(int i, @Nullable Bundle bundle) {
        progressBar.setVisibility(View.VISIBLE);
        return new StudentLoader(this, STUDENTS_URL);
    }

    @Override
    public void onLoadFinished(@NonNull Loader<ArrayList<String>> loader, ArrayList<String> students) {

        progressBar.setVisibility(View.GONE);

        if (students.size() == 0)
            Toast.makeText(getApplicationContext(), "No Internet Connection", Toast.LENGTH_SHORT).show();

        ArrayAdapter<String> studentsAdapter = new ArrayAdapter<>(getApplicationContext(), R.layout.list_item, students);


        lv_showEmployees.setAdapter(studentsAdapter);

        //studentsAdapter.clear();

        //studentsAdapter.notifyDataSetChanged();

    }

    @Override
    public void onLoaderReset(@NonNull Loader<ArrayList<String>> loader) {
        //students.clear();
    }
}
