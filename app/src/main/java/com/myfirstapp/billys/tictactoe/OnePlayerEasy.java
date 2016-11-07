package com.myfirstapp.billys.tictactoe;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class OnePlayerEasy extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_one_player_easy);


        final Button oLinks = (Button) findViewById(R.id.btnObenLinks);

        oLinks.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                oLinks.setText("X");
            }
        });
    }
}
