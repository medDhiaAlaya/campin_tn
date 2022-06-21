package com.example.campingtn.screens;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;

import com.example.campingtn.HomeScreen;
import com.example.campingtn.R;
import com.example.campingtn.adapters.ToolsAdapter;

public class ToolsScreen extends AppCompatActivity {
    ListView l;
    String[] platforms = {
            "sac a dos",
            "tente",
            "sac de cauchage",
            "lampe frontale"
    } ;
    Integer[] images = {
            R.drawable.sac,
            R.drawable.tente,
            R.drawable.cauchage,
            R.drawable.lampe
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tools_screen);
        Intent intent=getIntent();
        l=(ListView)findViewById(R.id.list);
        ToolsAdapter adapter=new
                ToolsAdapter(ToolsScreen.this,platforms,images);
        l.setAdapter(adapter);

    }
    public void toHomeScreen(View view){
        Intent intent = new Intent(this, HomeScreen.class);
        startActivity(intent);
    }
}