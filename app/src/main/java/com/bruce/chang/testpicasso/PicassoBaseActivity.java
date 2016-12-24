package com.bruce.chang.testpicasso;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class PicassoBaseActivity extends AppCompatActivity {

    ImageView iv_picasso1, iv_picasso2, iv_picasso3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_picasso_base);
        iv_picasso1 = (ImageView) findViewById(R.id.iv_picasso1);
        iv_picasso2 = (ImageView) findViewById(R.id.iv_picasso2);
        iv_picasso3 = (ImageView) findViewById(R.id.iv_picasso3);

        //普通加载
        Picasso.with(PicassoBaseActivity.this)
                .load("http://ww2.sinaimg.cn/mw690/b0d9a523jw1fb272glrqkj20go0d2jrz.jpg")
                .into(iv_picasso1);
        //裁剪的方式加载
        Picasso.with(PicassoBaseActivity.this)
                .load("http://ww2.sinaimg.cn/mw690/b0d9a523jw1fb272glrqkj20go0d2jrz.jpg")
                .resize(300,300)
                .into(iv_picasso2);
        //旋转90度加载
        Picasso.with(PicassoBaseActivity.this)
                .load("http://ww2.sinaimg.cn/mw690/b0d9a523jw1fb272glrqkj20go0d2jrz.jpg")
                .rotate(90)
                .into(iv_picasso3);
    }
}
