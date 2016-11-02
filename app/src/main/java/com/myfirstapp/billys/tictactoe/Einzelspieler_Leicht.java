package com.myfirstapp.billys.tictactoe;


import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;

public class Einzelspieler_Leicht extends Activity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_einzelspieler__leicht);

        final Button obenLinks = (Button) findViewById(R.id.btnObenLinks);
        final Button obenMitte = (Button) findViewById(R.id.btnObenMitte);
        final Button obenRechts = (Button) findViewById(R.id.btnObenRechts);

        final Button mitteLinks = (Button) findViewById(R.id.btnMitteLinks);
        final Button mitteMitte = (Button) findViewById(R.id.btnMitteMitte);
        final Button mitteRechts = (Button) findViewById(R.id.btnMitteRechts);

        final Button untenLinks = (Button) findViewById(R.id.btnUntenLinks);
        final Button untenMitte = (Button) findViewById(R.id.btnUntenMitte);
        final Button untenRechts = (Button) findViewById(R.id.btnUntenRechts);

        obenLinks.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                obenLinks.setText("X");
            }
        });


    }
}
