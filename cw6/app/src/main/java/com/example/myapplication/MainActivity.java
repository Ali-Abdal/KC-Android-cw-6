package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<SMNBT> smnbtArrayList = new ArrayList<>();
    int x = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageView Smpic = findViewById(R.id.imgSm);
        Button next = findViewById(R.id.btnNext);
        TextView Smname = findViewById(R.id.txtName);
        TextView Smpath = findViewById(R.id.txtPath);

        SMNBT smios = new SMNBT("Hussain", R.drawable._9648d88_a2bc_4adf_88a4_d51a19aff854, "ios");
        SMNBT smgdv = new SMNBT("Fatimah", R.drawable.mentor_game_dev, "Game dev");
        SMNBT smweb = new SMNBT("Moudhi", R.drawable.web_mentor, "Web");
        SMNBT smand = new SMNBT("Haider", R.drawable.channels4_profile, "Android");

        smnbtArrayList.add(smgdv);
        smnbtArrayList.add(smios);
        smnbtArrayList.add(smweb);
        smnbtArrayList.add(smand);


        Smpic.setImageResource(smnbtArrayList.get(x).getSmPic());
        Smname.setText(smnbtArrayList.get(x).getSmName());
        Smpath.setText(smnbtArrayList.get(x).getSmPath());



        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                x++;
                if(x == smnbtArrayList.size()){
                    x = 0;
                }


                Smpic.setImageResource(smnbtArrayList.get(x).getSmPic());
                Smname.setText(smnbtArrayList.get(x).getSmName());
                Smpath.setText(smnbtArrayList.get(x).getSmPath());







            }
        });








    }
}