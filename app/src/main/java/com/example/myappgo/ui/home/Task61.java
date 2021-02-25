package com.example.myappgo.ui.home;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.myappgo.MainActivity;
import com.example.myappgo.R;

public class Task61 extends AppCompatActivity {

    @Override
    protected void onCreate( Bundle savedInstanceState ) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_task61);
    }

    public void main( View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
    public void task62(View view) {
        Intent intent = new Intent(this, Task62.class);
        startActivity(intent);
    }
}