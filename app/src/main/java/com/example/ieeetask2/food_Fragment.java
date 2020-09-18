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
import android.widget.Button;
import android.widget.GridLayout;
import android.widget.ListView;
import android.widget.Switch;
import android.widget.Toast;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link food_Fragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class food_Fragment extends Fragment {


    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public food_Fragment() {

        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment food_Fragment.
     */
    // TODO: Rename and change types and number of parameters
    public static food_Fragment newInstance(String param1, String param2) {
        food_Fragment fragment = new food_Fragment();
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
       View V= inflater.inflate(R.layout.fragment_food_, container, false);
        final ListView listView=V.findViewById(R.id.gl);

        ArrayList<food> foods=new ArrayList<>();


        foods.add(new  food(R.drawable.meal , getString(R.string.home_food_tab_meal)));
        foods.add(new  food(R.drawable.pizza , getString(R.string.home_food_tab_pizza)));
        foods.add(new  food(R.drawable.sand , getString(R.string.home_food_tab_sandwitch)));
        foods.add(new  food(R.drawable.crepe , getString(R.string.home_food_tab_crepe)));


        ListViewFood adptar =new ListViewFood(getActivity(),R.layout.card_layout,foods);
        listView.setAdapter(adptar);


        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                switch (i){

                    case 0:

                        Intent intent=new Intent(getActivity(),meal_menu.class);
                        startActivity(intent);
                        break;


                    case 1:

                        Intent intent1=new Intent(getActivity(),pizza_menu.class);
                        startActivity(intent1);
                        break;

                    case 2:

                        Intent intent2=new Intent(getActivity(),sandwitch_menu.class);
                        startActivity(intent2);
                        break;

                    case 3:

                        Intent intent3=new Intent(getActivity(),crepe_mene.class);
                        startActivity(intent3);
                        break;

                }


            }
       });



        return V;

    }
}