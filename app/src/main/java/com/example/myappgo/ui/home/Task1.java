package com.example.myappgo.ui.home;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import com.example.myappgo.MainActivity;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.widget.Button;

import com.example.myappgo.R;

public class Task1 extends AppCompatActivity {

    private Activity view;

    @Override
    protected void onCreate( Bundle savedInstanceState ) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_task1);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick( View view ) {
                Snackbar.make(view, "Лучший ход соперника - твой лучший ход!", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

    }

    public void onClick(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    public void taskComplete(View view) {
        Intent intent = new Intent(this, Task12.class);
        startActivity(intent);
    }

    //@Nullable
    //private Context getContext() {

        //Button taskFirst2Button = (Button) view.findViewById(R.id.buttontask12);
        //taskFirst2Button.setOnClickListener(new View.OnClickListener(){

            //@Override
            //public void onClick( View v ) {
                //Intent intent = new Intent(Task1.this.getContext(), Task12.class);
                //startActivity(intent);
            //}


        //});
        //return null;
    //}

}
