package com.example.a1;

import static java.security.AccessController.getContext;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import android.content.Intent;
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
                Intent hIntent = new Intent("hotel");
                sendBroadcast(hIntent);
                //System.out.println("")
            }
        });
        attract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast toast = Toast.makeText(view.getContext(), "Send Attract Intent", Toast.LENGTH_SHORT);
                toast.show();
                Intent hIntent = new Intent("attract");
                sendBroadcast(hIntent);
                //System.out.println("")
            }
        });
        // Assume thisActivity is the current activity
        int permissionCheck = ContextCompat.checkSelfPermission(this, "edu.uic.cs478.fall22.mp3");
        if (PackageManager.PERMISSION_GRANTED == permissionCheck) {
            System.out.println("allowed");
        } else {
            /* Otherwise request permission */
            System.out.println("REQUESTING");
            ActivityCompat.requestPermissions(this,
                    new String[]{"edu.uic.cs478.fall22.mp3"},
                    1);
            permissionCheck = ContextCompat.checkSelfPermission(this, "edu.uic.cs478.fall22.mp3");
            if (PackageManager.PERMISSION_GRANTED == permissionCheck) {
                System.out.println("allowed 2");
            }
            
        }



    }

}