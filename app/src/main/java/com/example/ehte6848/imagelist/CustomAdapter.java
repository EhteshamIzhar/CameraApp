package com.example.ehte6848.imagelist;

import android.content.Context;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import static android.R.attr.resource;

/**
 * Created by ehte6848 on 18-07-2017.
 */

public class CustomAdapter extends BaseAdapter {



    private Context Context;
    private List<MyImage> MyImage;

    public CustomAdapter(Context Context, List<MyImage> MyImage) {
        this.Context = Context;
        this.MyImage = MyImage;
    }



    @Override
    public int getCount() {
        return MyImage.size();
    }

    @Override
    public Object getItem(int position) {
        return MyImage.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View v = View.inflate(Context,R.layout.custom_row,null);
        TextView txt = (TextView) v.findViewById(R.id.textView);
        ImageView img = (ImageView) v.findViewById(R.id.imageView);

        txt.setText(MyImage.get(position).getcaption());
        img.setImageBitmap(MyImage.get(position).getimg());


        return v;
    }


}