package com.myfirstapp.billys.tictactoe;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.AppCompatButton;
import android.view.View;
import android.view.Window;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class Loginscreen extends AppCompatActivity {
    EditText _inputPassword;
    EditText _inputName;
    AppCompatButton _btn_login;
    TextView _link_signup;
    String s_name;
    String s_password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_loginscreen);

        _inputPassword = (EditText) findViewById(R.id.InputPassword);
        _inputName = (EditText) findViewById(R.id.InputName);
        AppCompatButton _btn_login = (AppCompatButton) findViewById(R.id.btn_login);
        TextView _link_signup = (TextView) findViewById(R.id.link_signup);

        final Intent start_mainActivity = new Intent(this, MainActivity.class);


        // Button onClick Listener erstellen
        _btn_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (validate())
                {
                    Toast.makeText(getBaseContext(), "Login succeeded", Toast.LENGTH_LONG).show();
                    startActivity(start_mainActivity);
                }
                else
                {
                    Toast.makeText(getBaseContext(), "Login failed", Toast.LENGTH_LONG).show();
                }
            }
        });


    }
    //Logik für die Prüfung der Logindaten
    public boolean validate() {
        boolean valid;

        s_name = _inputName.getText().toString();
        s_password = _inputPassword.getText().toString();

        if (s_name.isEmpty()) {
            _inputName.setError("enter a valid name");
            valid = false;
        }

        if (s_password.isEmpty() || s_password.length() < 4 || s_password.length() > 10) {
            _inputPassword.setError("4 to 10 characters allowed");
            valid = false;
        }
        if(s_name.equals("test") && s_password.equals("test")){
            valid = true;
            return valid;
        }
        else
        {
            valid = false;
            return valid;
        }
    }


}