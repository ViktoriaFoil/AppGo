package com.example.myappgo.ui.home;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import com.example.myappgo.R;

public class HomeFragment extends Fragment {

    private HomeViewModel homeViewModel;

    public View onCreateView( @NonNull LayoutInflater inflater,
                              ViewGroup container, Bundle savedInstanceState ) {
        homeViewModel =
                new ViewModelProvider(this).get(HomeViewModel.class);
        View root = inflater.inflate(R.layout.fragment_home, container, false);
        final TextView textView = root.findViewById(R.id.text_home);
        homeViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged( @Nullable String s ) {
                textView.setText(s);
            }
        });
        return root;
    }

    @Override
    public void onViewCreated( @NonNull View view, @Nullable Bundle savedInstanceState ) {
        super.onViewCreated(view, savedInstanceState);

        Button taskFirstButton = (Button) view.findViewById(R.id.task1);
        taskFirstButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick( View view ) {
                Intent intent = new Intent(HomeFragment.this.getContext(), Task1.class);
                startActivity(intent);
            }
        });

        Button taskSecondButton = (Button) view.findViewById(R.id.task2);
        taskSecondButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HomeFragment.this.getContext(), Task2.class);
                startActivity(intent);
            }
        });

        Button taskThirhButton = (Button) view.findViewById(R.id.task3);
        taskThirhButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HomeFragment.this.getContext(), Task3.class);
                startActivity(intent);
            }
        });

        Button taskFourthButton = (Button) view.findViewById(R.id.task4);
        taskFourthButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HomeFragment.this.getContext(), Task4.class);
                startActivity(intent);
            }
        });

        Button taskFifthButton = (Button) view.findViewById(R.id.task5);
        taskFifthButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HomeFragment.this.getContext(), Task5.class);
                startActivity(intent);
            }
        });

        Button taskSixthButton = (Button) view.findViewById(R.id.task6);
        taskSixthButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HomeFragment.this.getContext(), Task6.class);
                startActivity(intent);
            }
        });
    }
}


