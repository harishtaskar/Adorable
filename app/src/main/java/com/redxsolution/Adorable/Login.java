package com.redxsolution.Adorable;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Login extends AppCompatActivity {
    Button btnlogin, Login;
    TextView Log_in, Dha;
    EditText email_login, pass_login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        getSupportActionBar().hide();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        Login = findViewById(R.id.login_btn);
        Log_in = findViewById(R.id.LoginText);
        Dha = findViewById(R.id.Dha);
        email_login = findViewById(R.id.email_Login);
        if(email_login.requestFocus()) {
            getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_VISIBLE);
        }
        btnlogin = findViewById(R.id.registartion_login);
        btnlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent send = new Intent(getApplicationContext(),Registration.class);
                startActivity(send);
            }
        });

    }
}