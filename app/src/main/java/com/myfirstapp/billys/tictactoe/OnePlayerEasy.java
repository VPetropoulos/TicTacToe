package com.myfirstapp.billys.tictactoe;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class OnePlayerEasy extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_one_player_easy);


        final Button oLinks = (Button) findViewById(R.id.btnObenLinks);
        final Button oMitte = (Button) findViewById(R.id.btnObenMitte);
        final Button oRechts = (Button) findViewById(R.id.btnObenRechts);

        final Button mLinks = (Button) findViewById(R.id.btnMitteLinks);
        final Button mMitte = (Button) findViewById(R.id.btnMitteMitte);
        final Button mRechts = (Button) findViewById(R.id.btnMitteRechts);

        final Button uLinks = (Button) findViewById(R.id.btnUntenLinks);
        final Button uMitte = (Button) findViewById(R.id.btnUntenMitte);
        final Button uRechts = (Button) findViewById(R.id.btnUntenRechts);


        oLinks.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {


                if (oLinks.getText().toString().isEmpty())
                {
                    oLinks.setText("X");
                }
                else if (oLinks.getText() == "O")
                {

                }
                else
                {
                    oLinks.setText("");
                }
            }
        });

        oMitte.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {


                if (oMitte.getText().toString().isEmpty())
                {
                    oMitte.setText("X");
                }
                else if (oMitte.getText() == "O")
                {

                }
                else
                {
                    oMitte.setText("");
                }
            }
        });

        oRechts.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {


                if (oRechts.getText().toString().isEmpty())
                {
                    oRechts.setText("X");
                }
                else if (oRechts.getText() == "O")
                {

                }
                else
                {
                    oRechts.setText("");
                }
            }
        });

        mLinks.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {


                if (mLinks.getText().toString().isEmpty())
                {
                    mLinks.setText("X");
                }
                else if (mLinks.getText() == "O")
                {

                }
                else
                {
                    mLinks.setText("");
                }
            }
        });

        mMitte.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {


                if (mMitte.getText().toString().isEmpty())
                {
                    mMitte.setText("X");
                }
                else if (mMitte.getText() == "O")
                {

                }
                else
                {
                    mMitte.setText("");
                }
            }
        });

        mRechts.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {


                if (mRechts.getText().toString().isEmpty())
                {
                    mRechts.setText("X");
                }
                else if (mRechts.getText() == "O")
                {

                }
                else
                {
                    mRechts.setText("");
                }
            }
        });

        uLinks.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {


                if (uLinks.getText().toString().isEmpty())
                {
                    uLinks.setText("X");
                }
                else if (uLinks.getText() == "O")
                {

                }
                else
                {
                    uLinks.setText("");
                }
            }
        });

        uMitte.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {


                if (uMitte.getText().toString().isEmpty())
                {
                    uMitte.setText("X");
                }
                else if (uMitte.getText() == "O")
                {

                }
                else
                {
                    uMitte.setText("");
                }
            }
        });

        uRechts.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {

                if (uRechts.getText().toString().isEmpty())
                {
                    uRechts.setText("X");
                }
                else if (uRechts.getText() == "O")
                {

                }
                else
                {
                    uRechts.setText("");
                }
            }
        });


    }

}
