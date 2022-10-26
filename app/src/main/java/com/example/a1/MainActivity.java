package com.example.a1;

import static java.security.AccessController.getContext;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.content.pm.PackageManager;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button hotel;
    Button attract;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        hotel = findViewById(R.id.hotel);
        attract = findViewById(R.id.attract);


        hotel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast toast = Toast.makeText(view.getContext(), "Send Hotel Intent", Toast.LENGTH_SHORT);
                toast.show();
                //System.out.println("")
            }
        });
        attract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast toast = Toast.makeText(view.getContext(), "Send Attract Intent", Toast.LENGTH_SHORT);
                toast.show();
                //System.out.println("")
            }
        });
        if(ContextCompat.checkSelfPermission(this, "edu.uic.cs478.fall22.mp3") == PackageManager.PERMISSION_GRANTED) {
            System.out.println("allowed");
        }

    }

}