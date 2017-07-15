package com.example.android.gridviewdemo1;

import android.app.Activity;
import android.content.Context;
import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by WanChing on 15/7/2017.
 */

public class ImageAdapter extends BaseAdapter {

    private Context context;

    public ImageAdapter(Context context){
        this.context = context;
    }

    private int[] images = {
            R.drawable.malaysia,
            R.drawable.argentina,
            R.drawable.australia,
            R.drawable.china,
            R.drawable.japan
    };

    public static String[] countriesName = {
            "Malaysia", "Argentina", "Australia", "China", "Japan"
    };

    @Override
    public int getCount() {
        return images.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup viewGroup) {

        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        if(convertView== null) {
            convertView = inflater.inflate(R.layout.single_grid, null);
        }

        ImageView imageView = (ImageView) convertView.findViewById(R.id.image_view);
        imageView.setImageResource(images[position]);
        TextView textView = (TextView) convertView.findViewById(R.id.text_view);
        textView.setText(countriesName[position]);

        return convertView;
    }
}
