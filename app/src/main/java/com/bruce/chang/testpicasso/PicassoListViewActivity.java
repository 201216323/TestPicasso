package com.bruce.chang.testpicasso;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

public class PicassoListViewActivity extends AppCompatActivity {

    ListView lv_picasso;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_picasso_list_view);
        lv_picasso = (ListView) findViewById(R.id.lv_picasso);
        PicassoListViewAdapter picassoListViewAdapter = new PicassoListViewAdapter(this);
        lv_picasso.setAdapter(picassoListViewAdapter);
    }
}
