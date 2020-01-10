package com.example.serialapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class wrong extends AppCompatActivity {
    //textview as button for going to login page
    private TextView buttonback1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wrong);
        //find view by id
        buttonback1=findViewById(R.id.btnstart1);
        //for going login page activity
        buttonback1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent iregistration = new Intent(wrong.this, loginpage.class);
                startActivity(iregistration);
            }
        });
    }
}
