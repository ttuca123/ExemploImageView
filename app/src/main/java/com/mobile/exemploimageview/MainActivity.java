package com.mobile.exemploimageview;

import android.graphics.Bitmap;

import android.graphics.BitmapFactory;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class MainActivity extends AppCompatActivity {


    ImageView imgView;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imgView = (ImageView) findViewById(R.id.imgView);
        btn = (Button) findViewById(R.id.btnLoad);



    }


    public void loadImg(View view) {

        Picasso.with(view.getContext()).load("https://www.thiengo.com.br/img/system/logo/thiengo-80-80.png")
                .into(imgView);

    }
}
