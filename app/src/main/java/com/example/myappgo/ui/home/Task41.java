package com.example.myappgo.ui.home;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.myappgo.MainActivity;
import com.example.myappgo.R;

public class Task41 extends AppCompatActivity {

    @Override
    protected void onCreate( Bundle savedInstanceState ) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_task41);
    }

    public void main( View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
    public void task42(View view) {
        Intent intent = new Intent(this, Task42.class);
        startActivity(intent);
    }

}