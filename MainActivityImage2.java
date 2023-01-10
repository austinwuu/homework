package com.example.image2;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.ImageSwitcher;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private GridView mGridView;
    private ImageSwitcher mImgSwitcher;

    Integer[] miThumbImgArr = {R.drawable.a1, R.drawable.a2, R.drawable.a3};

    private Integer[] miImgArr = {R.drawable.a4, R.drawable.a5, R.drawable.a6};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageAdapter imgAdap = new ImageAdapter(getApplicationContext(), miThumbImgArr);
        mGridView = findViewById(R.id.gridview);
        mGridView.setAdapter(imgAdap);

        mGridView.setOnItemClickListener(gridViewOnClick);
        mImgSwitcher = findViewById(R.id.imgSwitcher);
        mImgSwitcher.setFactory(this);
        mImgSwitcher.setInAnimation(Animation.loadAnimaiton(getApplicationContext(), android.R.animator));
        mImgSwitcher.setInAnimation(Animation.loadAnimation(getApplicationContext(), android.R.animator));

    }

    private AdapterView.onItemClickListener gridViewOnClick = new AdapterView<.OnItemClickListener(){
        @Override
        public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
            mImgSwitcher.setImageResource(miImgArr[i]);
        }
    };


    @Override
    public View makeView(){
        ImageView v=new Image(this);
        v.setBackgroundColor(Color.WHITE);
        v.setScaleType(ImageView.ScaleType.FIT_CENTER);
        v.setLayoutParams();
    }
}