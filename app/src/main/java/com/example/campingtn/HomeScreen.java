package com.example.campingtn;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.campingtn.screens.CommunityScreen;
import com.example.campingtn.screens.PlacesScreen;
import com.example.campingtn.screens.ProfileScreen;
import com.example.campingtn.screens.TipsScreen;
import com.example.campingtn.screens.ToolsScreen;


public class HomeScreen extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_screen);
    }
    public void toPlacesScreen(View view){
        Intent intent = new Intent(this, PlacesScreen.class);
        startActivity(intent);
    }
    public void toCommunityScreen(View view){
        Intent intent = new Intent(this, CommunityScreen.class);
        startActivity(intent);
    }
    public void toTipsScreen(View view){
        Intent intent = new Intent(this, TipsScreen.class);
        startActivity(intent);
    }
    public void toToolsScreen(View view){
        Intent intent = new Intent(this, ToolsScreen.class);
        startActivity(intent);
    }
    public void toProfileScreen(View view){
        Intent intent = new Intent(this, ProfileScreen.class);
        startActivity(intent);
    }

}