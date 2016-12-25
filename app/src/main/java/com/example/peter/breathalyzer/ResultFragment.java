package com.example.peter.breathalyzer;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by jlee29 on 12/20/16.
 */

public class ResultFragment extends Fragment {
    private TextView bac_results;
    private Button back_button;
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
    }
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        View v = inflater.inflate(R.layout.fragment_result, container, false);
        bac_results = (TextView) v.findViewById(R.id.results);
        SharedPreferences preferences = getActivity().getSharedPreferences("preferences", Context.MODE_PRIVATE);
        float bac = preferences.getFloat("selected_bac", 0.1f);
        String results = "Your BAC is " + bac;
        bac_results.setText(results);

        back_button = (Button) v.findViewById(R.id.home_screen_button);
        back_button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                InfoFragment infoFrag = new InfoFragment();
                getActivity().getSupportFragmentManager().beginTransaction()
                        .replace(R.id.fragment_container, infoFrag)
                        .commit();
            }
        });
        return v;
    }
}
