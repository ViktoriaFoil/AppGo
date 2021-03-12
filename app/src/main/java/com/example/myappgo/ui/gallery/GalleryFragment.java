package com.example.myappgo.ui.gallery;

import android.app.Activity;
import android.os.Bundle;
import android.view.Gravity;
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
import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NotificationCompat;
import androidx.core.app.NotificationManagerCompat;

import android.app.NotificationChannel;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.graphics.BitmapFactory;
import android.widget.Toast;

import com.example.myappgo.R;
import com.example.myappgo.ui.gallery.GalleryViewModel;
import com.example.myappgo.ui.home.HomeFragment;
import com.example.myappgo.ui.home.Task1;

public class GalleryFragment extends AppCompatActivity {


    private GalleryViewModel galleryViewModel;

    @Override
    public void onCreate( Bundle savedInstanceState ) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_gallery);

        //public View onCreateView( @NonNull LayoutInflater inflater,
        //  ViewGroup container, Bundle savedInstanceState ) {
        // galleryViewModel =
        // new ViewModelProvider(this).get(GalleryViewModel.class);
        //View root = inflater.inflate(R.layout.fragment_gallery, container, false);
        //final TextView textView = root.findViewById(R.id.text_gallery);
        //galleryViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
        // @Override
        //public void onChanged( @Nullable String s ) {
        //    textView.setText(s);
        //}
        // });
        //return root;
    }

}
//}