package com.myfirstapp.billys.tictactoe;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.AppCompatButton;
import android.widget.EditText;
import android.widget.TextView;


public class Loginscreen extends AppCompatActivity {

    private static TextView _link_signup;
    private static EditText _input_username;
    private static EditText _input_password;
    private static AppCompatButton _btn_login;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loginscreen);
        _input_username = (EditText) findViewById(R.id.InputName);
        _input_password = (EditText) findViewById(R.id.InputPassword);
        _btn_login = (AppCompatButton) findViewById(R.id.btn_login);
        _link_signup = (TextView) findViewById(R.id.link_signup);

    }


}
