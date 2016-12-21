package com.example.peter.breathalyzer;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import static android.content.ContentValues.TAG;

/**
 * Created by Peter on 10/20/2016.
 */

public class InfoFragment extends Fragment {
    private Button calculatorButton;
    private Button breathButton;
    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        View v = inflater.inflate(R.layout.fragment_welcome, container, false);
        calculatorButton = (Button) v.findViewById(R.id.next_button);
        calculatorButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(getActivity(), Calculator.class);
                startActivity(intent);
            }
        });

        breathButton = (Button) v.findViewById(R.id.breath_button);
        breathButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(getActivity(), Breathalyzer.class);
                startActivity(intent);
            }
        });

        return v;
    }
}
