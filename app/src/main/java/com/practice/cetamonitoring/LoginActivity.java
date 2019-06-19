package com.practice.cetamonitoring;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class LoginActivity extends AppCompatActivity {

    private Button signIn;
    private EditText key;
    private EditText pin;
    private int counter = 3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        signIn = (Button) findViewById(R.id.btnLogin);
        key = (EditText) findViewById(R.id.username);
        pin = (EditText) findViewById(R.id.password);

        signIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                validate(key.getText().toString(), pin.getText().toString());
                //call authenticate function
            }
        });

    }

    private void validate(String userName, String userPin) {
        //check if user exists
        //authentication function
        if ((userName.equals(users.getRegisteredUser())) && (userPin.equals(users.getRegisteredPin()))) {
            Intent intent = new Intent(LoginActivity.this, MainActivity.class);
            startActivity(intent);
            counter = 3;
        } else {
            Toast.makeText(getApplicationContext(), "Incorrect usernamepassword", Toast.LENGTH_SHORT).show();
            counter--;
            if (counter == 0) {
                signIn.setEnabled(false);
            }
        }
    }
}

