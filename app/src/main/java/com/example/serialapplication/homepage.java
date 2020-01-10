package com.example.serialapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class homepage extends AppCompatActivity {
    //here is buttton for "hospital"
    private Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homepage);
        //find view by id for "hospital"
        button = (Button)findViewById(R.id.btnhospital);
        //on click listener for hospital
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ihospital = new Intent(homepage.this, bookingserialgrid.class);
                startActivity(ihospital);
            }
        });

    }
}
