package com.bruce.chang.testpicasso;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button bt_base, bt_listview, bt_transformation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bt_base = (Button) findViewById(R.id.bt_base);
        bt_listview = (Button) findViewById(R.id.bt_listview);
        bt_transformation = (Button) findViewById(R.id.bt_transformation);
        bt_base.setOnClickListener(this);
        bt_listview.setOnClickListener(this);
        bt_transformation.setOnClickListener(this);


    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.bt_base:
                startActivity(new Intent(MainActivity.this, PicassoBaseActivity.class));
                break;
            case R.id.bt_listview:
                startActivity(new Intent(MainActivity.this, PicassoListViewActivity.class));
                break;
            case R.id.bt_transformation:
                startActivity(new Intent(MainActivity.this, PicassoTransformationActivity.class));
                break;
            default:
                break;
        }
    }
}
