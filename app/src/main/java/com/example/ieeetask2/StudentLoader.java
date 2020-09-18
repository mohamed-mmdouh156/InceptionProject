package com.example.ieeetask2;


import android.content.Context;

import androidx.annotation.NonNull;
import androidx.loader.content.AsyncTaskLoader;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.ArrayList;

import javax.net.ssl.HttpsURLConnection;

public class StudentLoader extends AsyncTaskLoader<ArrayList<String>> {

    String url = null;
    ArrayList<String> students = new ArrayList<>();

    public StudentLoader(@NonNull Context context, String url) {
        super(context);
        this.url = url;
    }

    private String getHttpRequest(URL url) throws IOException {
        String jsonResponse = "";

        HttpsURLConnection urlConnection = null;

        InputStream inputStream = null;

        try {
            urlConnection = (HttpsURLConnection) url.openConnection();
            urlConnection.setRequestMethod("GET");
            urlConnection.setReadTimeout(10000);
            urlConnection.setConnectTimeout(20000);
            urlConnection.connect();
            inputStream = urlConnection.getInputStream();
            jsonResponse = readFromStream(inputStream);

        } catch (Exception e) {
            return "No Internet Connection";
        } finally {
            if (urlConnection != null)
                urlConnection.disconnect();

            if (inputStream != null)
                inputStream.close();
        }


        return jsonResponse;
    }

    private String readFromStream(InputStream inputStream) throws IOException {

        StringBuilder result = new StringBuilder();

        if (inputStream != null) {
            InputStreamReader inputStreamReader = new InputStreamReader(inputStream, Charset.forName("UTF-8"));

            BufferedReader reader = new BufferedReader(inputStreamReader);

            String line = reader.readLine();

            while (line != null) {
                result.append(line);
                line = reader.readLine();
            }

        }
        return result.toString();
    }

    @Override
    public ArrayList<String> loadInBackground() {


        JSONObject jsonRoot = null;
        JSONObject jsonRoot1 = null;
        JSONObject jsonRoot2 = null;
        JSONObject jsonRoot3 = null;
        JSONObject jsonRoot4 = null;
        JSONObject jsonRoot5 = null;
        JSONObject jsonRoot6 = null;
        JSONObject jsonRoot7 = null;

        try {
            students.add("------------------MEAL MENU------------------");
            jsonRoot = new JSONObject(getHttpRequest(new URL(url)));

            JSONArray jsonArray = jsonRoot.getJSONArray("meal");

            for (int i = 0; i < jsonArray.length(); i++) {
                JSONObject student = jsonArray.getJSONObject(i);

                String category = student.getString("category");
                String item = student.getString("item");
                String name = student.getString("name");
                String price = student.getString("price");

                students.add("\ncategory: " + category + "\nitem: " + item + "\nname: " + name + "\nprice: " + price + "\n");

            }
        } catch (JSONException e) {
            e.printStackTrace();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            students.add("\n\n\n------------------PIZZA MENU------------------");
            jsonRoot1 = new JSONObject(getHttpRequest(new URL(url)));

            JSONArray jsonArray = jsonRoot1.getJSONArray("pizza");

            for (int i = 0; i < jsonArray.length(); i++) {
                JSONObject student = jsonArray.getJSONObject(i);

                String category = student.getString("category");
                String item = student.getString("item");
                String name = student.getString("name");
                String price = student.getString("price");

                students.add("\ncategory: " + category + "\nitem: " + item + "\nname: " + name + "\nprice: " + price + "\n");

            }
        } catch (JSONException e) {
            e.printStackTrace();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            students.add("\n\n\n------------------SANDWITCH MENU------------------");
            jsonRoot2 = new JSONObject(getHttpRequest(new URL(url)));

            JSONArray jsonArray = jsonRoot2.getJSONArray("sandwitch");

            for (int i = 0; i < jsonArray.length(); i++) {
                JSONObject student = jsonArray.getJSONObject(i);

                String category = student.getString("category");
                String item = student.getString("item");
                String name = student.getString("name");
                String price = student.getString("price");

                students.add("\ncategory: " + category + "\nitem: " + item + "\nname: " + name + "\nprice: " + price + "\n");

            }
        } catch (JSONException e) {
            e.printStackTrace();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            students.add("\n\n\n------------------CREPE MENU------------------");
            jsonRoot3 = new JSONObject(getHttpRequest(new URL(url)));

            JSONArray jsonArray = jsonRoot3.getJSONArray("crepe");

            for (int i = 0; i < jsonArray.length(); i++) {
                JSONObject student = jsonArray.getJSONObject(i);

                String category = student.getString("category");
                String item = student.getString("item");
                String name = student.getString("name");
                String price = student.getString("price");

                students.add("\ncategory: " + category + "\nitem: " + item + "\nname: " + name + "\nprice: " + price + "\n");

            }
        } catch (JSONException e) {
            e.printStackTrace();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            students.add("\n\n\n------------------HOT DRINKS MENU------------------");
            jsonRoot4 = new JSONObject(getHttpRequest(new URL(url)));

            JSONArray jsonArray = jsonRoot4.getJSONArray("hot drinks");

            for (int i = 0; i < jsonArray.length(); i++) {
                JSONObject student = jsonArray.getJSONObject(i);

                String category = student.getString("category");
                String item = student.getString("item");
                String name = student.getString("name");
                String price = student.getString("price");

                students.add("\ncategory: " + category + "\nitem: " + item + "\nname: " + name + "\nprice: " + price + "\n");

            }
        } catch (JSONException e) {
            e.printStackTrace();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


        try {
            students.add("\n\n\n------------------SOFT DRINKS MENU------------------");
            jsonRoot5 = new JSONObject(getHttpRequest(new URL(url)));

            JSONArray jsonArray = jsonRoot5.getJSONArray("soft drinks");

            for (int i = 0; i < jsonArray.length(); i++) {
                JSONObject student = jsonArray.getJSONObject(i);

                String category = student.getString("category");
                String item = student.getString("item");
                String name = student.getString("name");
                String price = student.getString("price");

                students.add("\ncategory: " + category + "\nitem: " + item + "\nname: " + name + "\nprice " + price + "\n");

            }
        } catch (JSONException e) {
            e.printStackTrace();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


        try {
            students.add("\n\n\n------------------ICE CREAM MENU------------------");
            jsonRoot6 = new JSONObject(getHttpRequest(new URL(url)));

            JSONArray jsonArray = jsonRoot6.getJSONArray("ice cream");

            for (int i = 0; i < jsonArray.length(); i++) {
                JSONObject student = jsonArray.getJSONObject(i);

                String category = student.getString("category");
                String item = student.getString("item");
                String name = student.getString("name");
                String price = student.getString("price");

                students.add("\ncategory: " + category + "\nitem: " + item + "\nname: " + name + "\nprice: " + price + "\n");

            }
        } catch (JSONException e) {
            e.printStackTrace();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


        try {
            students.add("\n\n\n------------------JUICE MENU------------------");
            jsonRoot7 = new JSONObject(getHttpRequest(new URL(url)));

            JSONArray jsonArray = jsonRoot7.getJSONArray("juice");

            for (int i = 0; i < jsonArray.length(); i++) {
                JSONObject student = jsonArray.getJSONObject(i);

                String category = student.getString("category");
                String item = student.getString("item");
                String name = student.getString("name");
                String price = student.getString("price");

                students.add("\ncategory: " + category + "\nitem: " + item + "\nname: " + name + "\nprice: " + price + "\n");

            }
        } catch (JSONException e) {
            e.printStackTrace();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


        return students;
    }
}