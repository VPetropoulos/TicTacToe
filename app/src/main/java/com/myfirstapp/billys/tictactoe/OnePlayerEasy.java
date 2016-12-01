package com.myfirstapp.billys.tictactoe;


import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import java.util.Timer;


public class OnePlayerEasy extends AppCompatActivity
{
    int b = 1;



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

        oLinks.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (oLinks.getText().toString().isEmpty())
                {
                    oLinks.setText("X");
                    b++;
                    if (b <= 5)
                    {
                        autoPlayer();
                    }

                }
                else if (oLinks.getText() == "O")
                {

                }
                foundWinner();
            }
        });

        oMitte.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                if (oMitte.getText().toString().isEmpty())
                {
                    oMitte.setText("X");
                    b++;
                    if (b <= 5)
                    {
                        autoPlayer();
                    }
                }
                else if (oMitte.getText() == "O")
                {

                }
                foundWinner();

            }
        });

        oRechts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                if (oRechts.getText().toString().isEmpty())
                {
                    oRechts.setText("X");
                    b++;
                    if (b <= 5)
                    {
                        autoPlayer();
                    }
                }
                else if (oRechts.getText() == "O")
                {

                }
                foundWinner();

            }
        });

        mLinks.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                if (mLinks.getText().toString().isEmpty())
                {
                    mLinks.setText("X");
                    b++;
                    if (b <= 5)
                    {
                        autoPlayer();
                    }
                }
                else if (mLinks.getText() == "O")
                {

                }
                foundWinner();
            }
        });

        mMitte.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                if (mMitte.getText().toString().isEmpty())
                {
                    mMitte.setText("X");
                    b++;
                    if (b <= 5)
                    {
                        autoPlayer();
                    }
                }
                else if (mMitte.getText() == "O")
                {

                }
                foundWinner();
            }
        });

        mRechts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                if (mRechts.getText().toString().isEmpty())
                {
                    mRechts.setText("X");
                    b++;
                    if (b <= 5)
                    {
                        autoPlayer();
                    }
                }
                else if (mRechts.getText() == "O")
                {

                }
                foundWinner();
            }
        });

        uLinks.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                if (uLinks.getText().toString().isEmpty())
                {
                    uLinks.setText("X");
                    b++;
                    if (b <= 5)
                    {
                        autoPlayer();
                    }

                }
                else if (uLinks.getText() == "O")
                {

                }
                foundWinner();
            }
        });

        uMitte.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                if (uMitte.getText().toString().isEmpty())
                {
                    uMitte.setText("X");
                    b++;
                    if (b <= 5)
                    {
                        autoPlayer();
                    }
                }
                else if (uMitte.getText() == "O")
                {

                }
                foundWinner();

            }
        });

        uRechts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                if (uRechts.getText().toString().isEmpty())
                {
                    uRechts.setText("X");
                    b++;
                    if (b <= 5)
                    {
                        autoPlayer();
                    }

                }
                else if (uRechts.getText() == "O")
                {

                }
                foundWinner();

            }
        });

    }

    public void autoPlayer()
    {
        final Button oLinks = (Button) findViewById(R.id.btnObenLinks);
        final Button oMitte = (Button) findViewById(R.id.btnObenMitte);
        final Button oRechts = (Button) findViewById(R.id.btnObenRechts);

        final Button mLinks = (Button) findViewById(R.id.btnMitteLinks);
        final Button mMitte = (Button) findViewById(R.id.btnMitteMitte);
        final Button mRechts = (Button) findViewById(R.id.btnMitteRechts);

        final Button uLinks = (Button) findViewById(R.id.btnUntenLinks);
        final Button uMitte = (Button) findViewById(R.id.btnUntenMitte);
        final Button uRechts = (Button) findViewById(R.id.btnUntenRechts);

        mainloop:
        while (true)
        {

            int zahl = (int)((Math.random()) * 8);

            switch (zahl)
            {
                case 0:
                    if (oLinks.getText().toString().isEmpty())
                    {
                        oLinks.setText("O");
                        break mainloop;
                    }
                    else if (oLinks.getText() == "X")
                    {
                        continue;
                    }
                    break;

                case 1:
                    if (oMitte.getText().toString().isEmpty())
                    {
                        oMitte.setText("O");
                        break mainloop;

                    }
                    else if (oMitte.getText() == "X")
                    {
                        continue;
                    }
                    break;

                case 2:
                    if (oRechts.getText().toString().isEmpty())
                    {
                        oRechts.setText("O");
                        break mainloop;
                    }
                    else if (oRechts.getText() == "X")
                    {
                        continue;
                    }
                    break;
                case 3:
                    if (mLinks.getText().toString().isEmpty())
                    {
                        mLinks.setText("O");
                        break mainloop;
                    }
                    else if (mLinks.getText() == "X")
                    {
                        continue;
                    }
                    break;
                case 4:
                    if (mMitte.getText().toString().isEmpty())
                    {
                        mMitte.setText("O");
                        break mainloop;
                    }
                    else if (mMitte.getText() == "X")
                    {
                        continue;
                    }
                    break;
                case 5:
                    if (mRechts.getText().toString().isEmpty())
                    {
                        mRechts.setText("O");
                        break mainloop;
                    }
                    else if (mRechts.getText() == "X")
                    {
                        continue;
                    }
                    break;
                case 6:
                    if (uLinks.getText().toString().isEmpty())
                    {
                        uLinks.setText("O");
                        break mainloop;
                    }
                    else if (uLinks.getText() == "X")
                    {
                        continue;
                    }
                    break;

                case 7:
                    if (uMitte.getText().toString().isEmpty())
                    {
                        uMitte.setText("O");
                        break mainloop;
                    }
                    else if (uMitte.getText() == "X")
                    {
                        continue;
                    }
                    break;
                case 8:
                    if (uRechts.getText().toString().isEmpty())
                    {
                        uRechts.setText("O");
                        break mainloop;
                    }
                    else if (uRechts.getText() == "X")
                    {
                        continue;
                    }
                    break;

            }
        }
    }

    public void foundWinner()
    {
        final Button oLinks = (Button) findViewById(R.id.btnObenLinks);
        final Button oMitte = (Button) findViewById(R.id.btnObenMitte);
        final Button oRechts = (Button) findViewById(R.id.btnObenRechts);

        final Button mLinks = (Button) findViewById(R.id.btnMitteLinks);
        final Button mMitte = (Button) findViewById(R.id.btnMitteMitte);
        final Button mRechts = (Button) findViewById(R.id.btnMitteRechts);

        final Button uLinks = (Button) findViewById(R.id.btnUntenLinks);
        final Button uMitte = (Button) findViewById(R.id.btnUntenMitte);
        final Button uRechts = (Button) findViewById(R.id.btnUntenRechts);

        //final Intent start_MainActivity = new Intent(this, MainActivity.class);

        AlertDialog ad = new AlertDialog.Builder(this).create();


        if (oLinks.getText() == oMitte.getText() && oMitte.getText() == oRechts.getText() && !oMitte.getText().toString().isEmpty())
        {
            ad.setMessage(oMitte.getText() + " hat Gewonnen");
            ad.show();
        }
        else if (mLinks.getText() == mMitte.getText() && mMitte.getText() == mRechts.getText() && !mMitte.getText().toString().isEmpty())
        {
            ad.setMessage(mMitte.getText() + " hat Gewonnen");
            ad.show();
        }
        else if (uLinks.getText() == uMitte.getText() && uMitte.getText() == uRechts.getText() && !uMitte.getText().toString().isEmpty())
        {
        ad.setMessage(uMitte.getText() + " hat Gewonnen");
        ad.show();
        }
        else if (oLinks.getText() == mLinks.getText() && mLinks.getText() == uLinks.getText() && !mLinks.getText().toString().isEmpty())
        {
            ad.setMessage(mLinks.getText() + " hat Gewonnen");
            ad.show();
        }
        else if (oMitte.getText() == mMitte.getText() && mMitte.getText() == uMitte.getText() && !mMitte.getText().toString().isEmpty())
        {
            ad.setMessage(mMitte.getText() + " hat Gewonnen");
            ad.show();
        }
        else if (oRechts.getText() == mRechts.getText() && mRechts.getText() == uRechts.getText() && !mRechts.getText().toString().isEmpty())
        {
            ad.setMessage(mRechts.getText() + " hat Gewonnen");
            ad.show();
        }
        else if (oLinks.getText() == mMitte.getText() && mMitte.getText() == uRechts.getText() && !mMitte.getText().toString().isEmpty())
        {
            ad.setMessage(mMitte.getText() + " hat Gewonnen");
            ad.show();
        }
        else if (oRechts.getText() == mMitte.getText() && mMitte.getText() == uLinks.getText() && !mMitte.getText().toString().isEmpty())
        {
            ad.setMessage(mMitte.getText() + " hat Gewonnen");
            ad.show();

        }

        else
        {

        }
    }

}
