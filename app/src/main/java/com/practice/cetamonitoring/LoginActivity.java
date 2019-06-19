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
    private EditText username;
    private EditText password;
    private int counter = 3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        signIn = (Button) findViewById(R.id.btnLogin);
        username = (EditText) findViewById(R.id.username);
        password = (EditText) findViewById(R.id.password);

        signIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                validate(username.getText().toString(), password.getText().toString());
                //call authenticate function
            }
        });

    }

    private void validate(String userName, String userPin) {
        //check if user exists
        //authentication function

        Users u = new Users();
        String passcode = userName;
        String user = userPin;
        if (u.authenticateUser(user, passcode)) {
            Intent intent = new Intent(LoginActivity.this, MainMenu.class);
            startActivity(intent);
        } else {
            Toast.makeText(getApplicationContext(), "Incorrect usernamepassword", Toast.LENGTH_SHORT).show();

        }
    }
}

