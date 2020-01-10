package com.example.serialapplication;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Registration extends AppCompatActivity {
    //for go the login page
    private Button button;
    //it must be textview but named as button, button1 is used for you are already registered.
    private TextView button1;
    //for info page
    private TextView button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);
        //button find by id
        button=(Button)findViewById(R.id.btnone);
        //here are two textview field using as button
        button1=findViewById(R.id.btnback);
        button2=findViewById(R.id.btnlogo1);

        //If confirm press direct go to login page
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent iconfirm = new Intent(Registration.this, loginpage.class);
                startActivity(iconfirm);
            }
        });

        //you are already registered, press direct go to login page
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ialready = new Intent(Registration.this, loginpage.class);
                startActivity(ialready);
            }
        });
        //info page
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ilogo1 = new Intent(Registration.this, info.class);
                startActivity(ilogo1);
            }
        });
    }

}
