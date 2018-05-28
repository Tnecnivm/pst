package com.pst.oclock;

import android.content.Intent;
import android.support.v4.content.LocalBroadcastManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class Main2Activity extends AppCompatActivity {
    Button click1;
    Button bouttt;
    public static TextView data;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        this.click1= findViewById(R.id.buttonedt1);
        data= findViewById(R.id.textview2);

        click1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                fetchData2 process = new fetchData2();
                process.execute() ;
            }
        });


        this.bouttt=findViewById(R.id.button2);
        bouttt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent otherActivity = new Intent(getApplicationContext(),Home.class);
                startActivity(otherActivity);
            }
        });

    }

}
