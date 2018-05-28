package com.pst.oclock;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Home extends AppCompatActivity {


    private Button button4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);



        this.button4 = findViewById(R.id.Set);

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent otherActivity = new Intent(getApplicationContext(),Settings.class);
                startActivity(otherActivity);
                finish();
            }
        });


        this.button4=findViewById(R.id.buttonmaps);

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent nextActivity= new Intent(getApplicationContext(),MainActivity.class);
                startActivity(nextActivity);
                finish();
            }
        });

        this.button4=findViewById(R.id.buttonedt);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent nextActivity2= new Intent(getApplicationContext(),Main2Activity.class);
                startActivity(nextActivity2);
                finish();
            }
        });

    }
}
