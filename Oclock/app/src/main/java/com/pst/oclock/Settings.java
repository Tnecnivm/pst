package com.pst.oclock;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Settings extends AppCompatActivity {

    private Button button;
    public String num,type,adre,postal,minutes,maps;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);


        this.button = findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText numadresse = findViewById(R.id.editText2);
                num = numadresse.getText().toString();
                Integer.parseInt(num);

                EditText adresse = findViewById(R.id.editText4);
                type = adresse.getText().toString();

                EditText lol = findViewById(R.id.editText5);
                adre = lol.getText().toString();

                EditText y = findViewById(R.id.editText6);
                postal=y.getText().toString();
                Integer.parseInt(postal);

                EditText x= findViewById(R.id.editText);
                minutes =x.getText().toString();
                Integer.parseInt(minutes);

                EditText z=findViewById(R.id.editText3);
                maps= z.getText().toString();


                Intent otherActivity = new Intent(getApplicationContext(),Home.class);
                startActivity(otherActivity);

            }
        });

    }


}

