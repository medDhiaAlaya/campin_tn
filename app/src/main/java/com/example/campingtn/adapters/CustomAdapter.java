package com.example.campingtn.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.campingtn.R;

public class CustomAdapter extends ArrayAdapter<String> {
    private final Context context;
    private final String[] platforms;
    private final Integer[] images;
    public CustomAdapter(Context context,String[] platforms,Integer[]
            images)
    {
        super(context, R.layout.place_item, platforms);
        this.context = context;
        this.platforms = platforms;
        this.images = images;
    }
    @Override
    public View getView(int position, View view, ViewGroup parent)
    {
        LayoutInflater inflater = LayoutInflater.from(getContext());
        View rowView= inflater.inflate(R.layout.place_item, parent, false);
        TextView txtTitle = (TextView) rowView.findViewById(R.id.txt);
        ImageView imageView = (ImageView) rowView.findViewById(R.id.img);
        txtTitle.setText(platforms[position]);
        imageView.setImageResource(images[position]);
        return rowView;
    }
}

