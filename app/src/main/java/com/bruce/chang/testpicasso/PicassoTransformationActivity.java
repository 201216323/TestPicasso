package com.bruce.chang.testpicasso;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

public class PicassoTransformationActivity extends AppCompatActivity {

    ListView lv_picasso_transformation;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_picasso_transformation);
        lv_picasso_transformation = (ListView) findViewById(R.id.lv_picasso_transformation);
        PicassoTransformationAdapter picassoListViewAdapter = new PicassoTransformationAdapter(this);
        lv_picasso_transformation.setAdapter(picassoListViewAdapter);
    }
}
