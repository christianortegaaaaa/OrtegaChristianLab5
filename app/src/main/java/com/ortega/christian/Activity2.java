package com.ortega.christian;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Activity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
    }
    public void process(View v){
        Intent i = null, chooser = null;
        if(v.getId()== R.id.btnActivity1) {
            i = new Intent(this,MainActivity.class);
            startActivity(i);

        }else if(v.getId()== R.id.btnMap){
            i = new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse("geo:14.5915541, 120.9720467"));
            chooser = Intent.createChooser(i, "Choose Application for Map");
            startActivity(chooser);
        }
    }
}
