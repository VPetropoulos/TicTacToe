package com.myfirstapp.billys.tictactoe;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.AppCompatButton;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Createaccscreen extends AppCompatActivity {

    EditText _inputPassword;
    EditText _inputName;
    String s_name;
    String s_password;
    SQLDatabase dbmgr;

    Createaccscreen instance = this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_createaccscreen);

        _inputPassword = (EditText) findViewById(R.id.InputPassword);
        _inputName = (EditText) findViewById(R.id.InputName);
        AppCompatButton _btn_createAcc = (AppCompatButton) findViewById(R.id.btn_createAcc);

        final Intent start_loginscreen = new Intent(this, Loginscreen.class);
        dbmgr = new SQLDatabase(this);



        _btn_createAcc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (validate())
                {
                    //Hier muss noch der User in die SQL Datenbank geschrieben werden
                    SQLDatabase.getinstance(instance).CreateAccSQL(s_name, s_password);

                    Toast.makeText(getBaseContext(), "Account created", Toast.LENGTH_LONG).show();
                    startActivity(start_loginscreen);
                }
            }
        });

    }

    protected void onPause(){
        super.onPause();
        dbmgr.close();
    }

    protected void onResume(){
        super.onResume();
    }


    //Logik für die Prüfung der Kontodaten
    public boolean validate() {
        boolean valid = true;

        s_name = _inputName.getText().toString();
        s_password = _inputPassword.getText().toString();

        if (s_name.isEmpty()|| s_name.length() < 4 || s_name.length() > 10) {
            _inputName.setError("Your Username has to be 4 to 10 characters long");
            valid = false;
        }

        if (s_password.isEmpty() || s_password.length() < 4 || s_password.length() > 10) {
            _inputPassword.setError("4 to 10 characters allowed");
            valid = false;
        }


        return valid;
    }
}
