package com.example.serialapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class info extends AppCompatActivity {
    //declear textview which will work as button
private TextView buttonback;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);
        //find view by id
        buttonback=findViewById(R.id.btnstart);
        //onclick listener for go back login page
        buttonback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent iregistration = new Intent(info.this, loginpage.class);
                startActivity(iregistration);
            }
        });
    }
}
