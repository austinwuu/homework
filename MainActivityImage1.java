package com.example.image;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    private TextView mTextResult;
    private ImageButton mIngBtnYa,mIngBtnStone,mIngBtnPaper;
    private ImageView mImgViewCom;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mTextResult=findViewById(R.id.textView4);
        mIngBtnYa=findViewById(R.id.imageButton3);
        mIngBtnPaper=findViewById(R.id.imageButton);
        mIngBtnStone=findViewById(R.id.imageButton2);
        mImgViewCom=findViewById(R.id.imageView);

        mIngBtnYa.setOnClickListener(mIngBtnYaOnClick);
        mIngBtnStone.setOnClickListener(mIngBtnStoneOnClick);
        mIngBtnPaper.setOnClickListener(mIngBtnPaperOnClick);
    }

    private View.OnClickListener mIngBtnYaOnClick=new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            int mComPlay=(int)(Math.random()*3+1);
            switch (mComPlay){
                case 1:
                    mImgViewCom.setImageResource(R.drawable.ya);
                    mTextResult.setText("平手");
                    break;
                case 2:
                    mImgViewCom.setImageResource(R.drawable.stone);
                    mTextResult.setText("HAHA Loser");
                    break;
                case 3:
                    mImgViewCom.setImageResource(R.drawable.paper);
                    mTextResult.setText("啊你爽了嗎");
                    break;
            }

        }
    };
    private View.OnClickListener mIngBtnStoneOnClick=new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            int mComPlay=(int)(Math.random()*3+1);
            switch (mComPlay){
                case 1:
                    mImgViewCom.setImageResource(R.drawable.ya);
                    mTextResult.setText("阿你爽了嗎");
                    break;
                case 2:
                    mImgViewCom.setImageResource(R.drawable.stone);
                    mTextResult.setText("平手");
                    break;
                case 3:
                    mImgViewCom.setImageResource(R.drawable.paper);
                    mTextResult.setText("HAHA Loser");
                    break;
            }

        }
    };
    private View.OnClickListener mIngBtnPaperOnClick=new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            int mComPlay=(int)(Math.random()*3+1);
            switch (mComPlay){
                case 1:
                    mImgViewCom.setImageResource(R.drawable.ya);
                    mTextResult.setText("HAHA Loser");
                    break;
                case 2:
                    mImgViewCom.setImageResource(R.drawable.stone);
                    mTextResult.setText("阿你爽了嗎");
                    break;
                case 3:
                    mImgViewCom.setImageResource(R.drawable.paper);
                    mTextResult.setText("平手");
                    break;
            }

        }
    };
}