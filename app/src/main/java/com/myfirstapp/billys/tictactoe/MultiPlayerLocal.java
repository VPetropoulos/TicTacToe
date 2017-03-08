package com.myfirstapp.billys.tictactoe;



import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;


public class MultiPlayerLocal extends AppCompatActivity
{

    int b = 0;
    Button oLinks;
    Button oMitte;
    Button oRechts;

    Button mLinks;
    Button mMitte;
    Button mRechts;

    Button uLinks;
    Button uMitte;
    Button uRechts;

    int player = 1;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_multiplayer_local);
        oLinks = (Button) findViewById(R.id.btnObenLinks);
        oMitte = (Button) findViewById(R.id.btnObenMitte);
        oRechts = (Button) findViewById(R.id.btnObenRechts);

        mLinks = (Button) findViewById(R.id.btnMitteLinks);
        mMitte = (Button) findViewById(R.id.btnMitteMitte);
        mRechts = (Button) findViewById(R.id.btnMitteRechts);

        uLinks = (Button) findViewById(R.id.btnUntenLinks);
        uMitte = (Button) findViewById(R.id.btnUntenMitte);
        uRechts = (Button) findViewById(R.id.btnUntenRechts);

        //Globalen Listener für die Buttons erstellen
        View.OnClickListener button_listener = new View.OnClickListener() {
            public void onClick(View v) {
                b++;

                Button button = (Button) v;

                if ((b % 2 != 0)) {
                    player = 1;
                    button.setText("X");
                    button.setClickable(false);
                }
                else if ((b % 2 == 0)) {
                    player = 2;         // human player.
                    button.setText("O");
                    button.setClickable(false);
                }

                foundWinner();
            }
        };
        oLinks.setOnClickListener(button_listener);
        oMitte.setOnClickListener(button_listener);
        oRechts.setOnClickListener(button_listener);
        mLinks.setOnClickListener(button_listener);
        mMitte.setOnClickListener(button_listener);
        mRechts.setOnClickListener(button_listener);
        uLinks.setOnClickListener(button_listener);
        uMitte.setOnClickListener(button_listener);
        uRechts.setOnClickListener(button_listener);

    }

    public void foundWinner()
    {
        AlertDialog ad = new AlertDialog.Builder(this).create();


        if (oLinks.getText() == "X" && oMitte.getText() == "X" && oRechts.getText() == "X") {
            ad.setMessage(oMitte.getText() + " HAS WON!");
            ad.show();
            wipeGame();
        } else if (mLinks.getText() == "X" && mMitte.getText() == "X" && mRechts.getText() == "X") {
            ad.setMessage(mMitte.getText() + " HAS WON!");
            ad.show();
            wipeGame();
        } else if (uLinks.getText() == "X" && uMitte.getText()== "X" && uRechts.getText()== "X") {
            ad.setMessage(uMitte.getText() + " HAS WON!");
            ad.show();
            wipeGame();
        } else if (oLinks.getText()== "X" && mLinks.getText()== "X" && uLinks.getText()== "X") {
            ad.setMessage(mLinks.getText() + " HAS WON!");
            ad.show();
            wipeGame();
        } else if (oMitte.getText() == "X" && mMitte.getText() == "X" && uMitte.getText() == "X") {
            ad.setMessage(mMitte.getText() + " HAS WON!");
            ad.show();
            wipeGame();
        } else if (oRechts.getText() == "X" && mRechts.getText() == "X" && uRechts.getText() == "X") {
            ad.setMessage(mRechts.getText() + " HAS WON!");
            ad.show();
            wipeGame();
        } else if (oLinks.getText() == "X" && mMitte.getText() == "X" && uRechts.getText() == "X") {
            ad.setMessage(mMitte.getText() + " HAS WON!");
            ad.show();
            wipeGame();
        } else if (oRechts.getText() == "X" && mMitte.getText()== "X" && uLinks.getText() == "X") {
            ad.setMessage(mMitte.getText() + " HAS WON!");
            ad.show();
            wipeGame();
        }
        else if (oLinks.getText() == "O" && oMitte.getText() == "O" && oRechts.getText() == "O") {
            ad.setMessage(oMitte.getText() + " HAS WON!");
            ad.show();
            wipeGame();
        } else if (mLinks.getText() == "O" && mMitte.getText() == "O" && mRechts.getText() == "O") {
            ad.setMessage(mMitte.getText() + " HAS WON!");
            ad.show();
            wipeGame();
        } else if (uLinks.getText() == "O" && uMitte.getText()== "O" && uRechts.getText()== "O") {
            ad.setMessage(uMitte.getText() + " HAS WON!");
            ad.show();
            wipeGame();
        } else if (oLinks.getText()== "O" && mLinks.getText()== "O" && uLinks.getText()== "O") {
            ad.setMessage(mLinks.getText() + " HAS WON!");
            ad.show();
            wipeGame();
        } else if (oMitte.getText() == "O" && mMitte.getText() == "O" && uMitte.getText() == "O") {
            ad.setMessage(mMitte.getText() + " HAS WON!");
            ad.show();
            wipeGame();
        } else if (oRechts.getText() == "O" && mRechts.getText() == "O" && uRechts.getText() == "O") {
            ad.setMessage(mRechts.getText() + " HAS WON!");
            ad.show();
            wipeGame();
        } else if (oLinks.getText() == "O" && mMitte.getText() == "O" && uRechts.getText() == "O") {
            ad.setMessage(mMitte.getText() + " HAS WON!");
            ad.show();
            wipeGame();
        } else if (oRechts.getText() == "O" && mMitte.getText()== "O" && uLinks.getText() == "O") {
            ad.setMessage(mMitte.getText() + " HAS WON!");
            ad.show();
            wipeGame();
        }
        else if (!oLinks.getText().toString().isEmpty() && !oMitte.getText().toString().isEmpty() && !oRechts.getText().toString().isEmpty() && !mLinks.getText().toString().isEmpty() && !mMitte.getText().toString().isEmpty() && !mLinks.getText().toString().isEmpty() && !uLinks.getText().toString().isEmpty() && !uMitte.getText().toString().isEmpty() && !uRechts.getText().toString().isEmpty()) {
            ad.setMessage("DRAW!!");
            ad.show();
            wipeGame();
        }
    }

    public void wipeGame()
    {
        oLinks.setText(null);
        oLinks.setClickable(true);
        oMitte.setText(null);
        oMitte.setClickable(true);
        oRechts.setText(null);
        oRechts.setClickable(true);
        mLinks.setText(null);
        mLinks.setClickable(true);
        mMitte.setText(null);
        mMitte.setClickable(true);
        mRechts.setText(null);
        mRechts.setClickable(true);
        uLinks.setText(null);
        uLinks.setClickable(true);
        uMitte.setText(null);
        uMitte.setClickable(true);
        uRechts.setText(null);
        uRechts.setClickable(true);
        b=0;
    }
}