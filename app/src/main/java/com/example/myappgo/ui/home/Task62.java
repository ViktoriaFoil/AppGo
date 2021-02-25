package com.example.myappgo.ui.home;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.myappgo.MainActivity;
import com.example.myappgo.R;

public class Task62 extends AppCompatActivity {

    @Override
    protected void onCreate( Bundle savedInstanceState ) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_task62);
    }

    public void main( View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
    //public void task7(View view) {
        //Intent intent = new Intent(this, Task7.class);
        //startActivity(intent);
    //}
}