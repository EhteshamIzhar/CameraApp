package com.example.ehte6848.imagelist;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by ehte6848 on 19-07-2017.
 */

public class Activity_3 extends AppCompatActivity {


    String pass = null;
    private TextView passV = null;
    Bitmap bm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_3);


        pass = getIntent().getStringExtra("zzz");
        passV = (TextView) findViewById(R.id.textView2);
        passV.setText("Caption:  \n   ' " + pass + " ' ");


        Intent intent = getIntent();
        bm = intent.getParcelableExtra("xxx");
        ImageView img = (ImageView) findViewById(R.id.imgview);
        img.setImageBitmap(bm);


    }
}
