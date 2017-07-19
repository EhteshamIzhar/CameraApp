package com.example.ehte6848.imagelist;

import android.graphics.Bitmap;
import android.net.Uri;

/**
 * Created by ehte6848 on 19-07-2017.
 */

public class MyImage {


    private Uri uri;
    private int mark;
    private Bitmap Img ;
    private  String Caption ="";

    public MyImage (Bitmap bit, String cap, Uri uri, int mark) {
        Img = bit;
        Caption= cap;
        this.uri = uri;
        this.mark=mark;
    }

    /* Set Functions*/



    public void setUri(Uri uri) {
        this.uri = uri;
    }

    public void setmark(int mark) {
        this.mark = mark;
    }

    public void setimg(Bitmap bit) {
        Img = bit;
    }

    public void setcaption(String cap) {
        Caption = cap;
    }

    /* get Functions */

    public Uri getUri() {
        return uri;
    }

    public int getmark() {
        return mark;
    }

    public Bitmap getimg() {
        return Img;
    }

    public String getcaption() {
        return Caption;
    }
}
