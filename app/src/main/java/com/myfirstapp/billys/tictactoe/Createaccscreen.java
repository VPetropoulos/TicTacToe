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
        //Oberfläche erstellen
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_createaccscreen);

        _inputPassword = (EditText) findViewById(R.id.InputPassword);
        _inputName = (EditText) findViewById(R.id.InputName);
        AppCompatButton _btn_createAcc = (AppCompatButton) findViewById(R.id.btn_createAcc);

        final Intent start_loginscreen = new Intent(this, Loginscreen.class);
        dbmgr = new SQLDatabase(this);


        //Button: Account erstellen -- ONCLICK
        _btn_createAcc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (validate())
                {
                    //Account erstellen wenn validate() true ist (4-10 Zeichen; nicht leer)
                    SQLDatabase.getinstance(instance).CreateAccSQL(s_name, s_password);

                    //User eine Rückmeldung geben und auf Loginscreen wechseln
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

        //IF Benutzername Leer oder not 4-10 Zeichen -- Fehler mit prompt
        if (s_name.isEmpty()|| s_name.length() < 4 || s_name.length() > 10) {
            _inputName.setError("Your Username has to be 4 to 10 characters long");
            valid = false;
        }

        //IF Passwort Leer oder not 4-10 Zeichen -- Fehler mit prompt
        if (s_password.isEmpty() || s_password.length() < 4 || s_password.length() > 10) {
            _inputPassword.setError("4 to 10 characters allowed");
            valid = false;
        }

        //Ansonsten True
        return valid;
    }
}
