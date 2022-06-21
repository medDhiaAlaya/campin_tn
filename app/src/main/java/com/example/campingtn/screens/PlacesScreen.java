package com.example.campingtn.screens;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;

import com.example.campingtn.HomeScreen;
import com.example.campingtn.adapters.CustomAdapter;
import com.example.campingtn.R;

public class PlacesScreen extends AppCompatActivity {
    ListView l;
    String[] platforms = {
            "Cap negro,Beja",
            "Cap Angela , Bizerte",
            "Cap Serrat",
            "Touzeur"
    } ;
    Integer[] images = {
            R.drawable.cap_negro,
            R.drawable.cap_angela,
            R.drawable.cap_serrat,
            R.drawable.touzeur
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_places_screen);
        Intent intent=getIntent();
        l=(ListView)findViewById(R.id.list);
        CustomAdapter adapter=new
                CustomAdapter(PlacesScreen.this,platforms,images);
        l.setAdapter(adapter);

    }
    public void toHomeScreen(View view){
        Intent intent = new Intent(this, HomeScreen.class);
        startActivity(intent);
    }
}