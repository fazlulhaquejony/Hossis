package com.example.serialapplication;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ToggleButton;

public class loginpage extends AppCompatActivity {
    //for go to home page
    private Button button1;
    //for info page
    private Button buttoninfo;
    //for registration page
    private TextView button2;
    //for taking user id
    private TextView userid1;
    //for password field
    private TextView password;
    //add korsi for toggle button declare
    private ToggleButton toggleButton1, toggleButton2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loginpage);
        //a method for id declear and on click action performed
        addListenerOnButtonClick();
    }

    //From the link i copy https://www.javatpoint.com/android-togglebutton-example
    public void addListenerOnButtonClick () {
        //Getting the ToggleButton and Button instance from the layout xml file
        //getting error in here line 38,39
        toggleButton1 = (ToggleButton) findViewById(android.R.id.first);
        toggleButton2 = (ToggleButton) findViewById(android.R.id.second);

        //button1 is for login and button2 for regist.
        //getting error in here line 43,44,45
        button1 = (Button)findViewById(android.R.id.btnflogin);
        buttoninfo=(Button)findViewById(android.R.id.btnlogo);
        button2 = findViewById(android.R.id.btnreg);

        //for making a basic login
        //getting error in here line 49,50
        userid1 = (EditText)findViewById(android.R.id.userid);
        password = (EditText)findViewById(android.R.id.password);

        //Performing action on button click
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                StringBuilder result = new StringBuilder();
                result.append("ToggleButton1 : ").append(toggleButton1.getText());
                result.append("\nToggleButton2 : ").append(toggleButton2.getText());
                //Displaying the message in toast
                Toast.makeText(getApplicationContext(), result.toString(), Toast.LENGTH_LONG).show();
            }
        });

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //basic login
                if(userid1.getText().toString().equals("181022") && password.getText().toString().equals("serial")) {
                    userid1.setText(null);
                    password.setText(null);
                    //went to homepage
                    Intent i = new Intent(loginpage.this, homepage.class);
                    startActivity(i);
                }
                else{
                    Intent itwo = new Intent(loginpage.this, wrong.class);
                    startActivity(itwo);
                }
            }
        });
        //registration work is done by here
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent iregistration = new Intent(loginpage.this, Registration.class);
                startActivity(iregistration);
            }
        });
        //info work is done by here
        buttoninfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent iinfo = new Intent(loginpage.this, info.class);
                startActivity(iinfo);
            }
        });
    }
}
