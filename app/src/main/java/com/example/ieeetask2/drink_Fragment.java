package com.example.ieeetask2;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link drink_Fragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class drink_Fragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public drink_Fragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment drink_Fragment.
     */
    // TODO: Rename and change types and number of parameters
    public static drink_Fragment newInstance(String param1, String param2) {
        drink_Fragment fragment = new drink_Fragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View V= inflater.inflate(R.layout.fragment_drink_, container, false);
        ListView listView=V.findViewById(R.id.gl);


        ArrayList<food> drinks=new ArrayList<>();


        drinks.add(new  food(R.drawable.hot,getString(R.string.home_drink_tab_hot)));
        drinks.add(new  food(R.drawable.bebsi,getString(R.string.home_drink_tab_soft)));
        drinks.add(new  food(R.drawable.juice,getString(R.string.home_drink_tab_juice)));
        drinks.add(new  food(R.drawable.ice,getString(R.string.home_drink_tab_ice_cream)));


        ListViewFood adptar =new ListViewFood(getActivity(),R.layout.card_layout,drinks);
        listView.setAdapter(adptar);



        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                switch (i){

                    case 0:

                        Intent intent=new Intent(getActivity(),hot_drinks_menu.class);
                        startActivity(intent);
                        break;


                    case 1:

                        Intent intent1=new Intent(getActivity(),soft_drinks_menu.class);
                        startActivity(intent1);
                        break;

                    case 2:

                        Intent intent2=new Intent(getActivity(),ice_cream_menu.class);
                        startActivity(intent2);
                        break;


                    case 3:


                        Intent intent3=new Intent(getActivity(),juice_menu.class);
                        startActivity(intent3);
                        break;


                }


            }
        });



        return V;
    }
}