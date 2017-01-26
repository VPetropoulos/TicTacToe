package com.myfirstapp.billys.tictactoe;



import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;


public class MultiPlayerLocal extends AppCompatActivity
{
    //Spielzug des Spielers auf 1 setzen
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
                // after_move function to check the result and decide.
                foundWinner();
            }
        };
        //Buttons mit dem globalen Listener versehen
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

    //START Gewinner ermitteln
    public void foundWinner()
    {

        //final Intent start_MainActivity = new Intent(this, MainActivity.class);

        AlertDialog ad = new AlertDialog.Builder(this).create();

        //Wenn 3 Felder nebeinander mit dem selben Symbol ausgefüllt und die mitte davon nicht leer ->
        // -> Zeichen in der Mitte bestimmt den Sieger
        //Alertdialog aufrufen
        //Spielfeld / Spielzugzähler mit wipeGame() zurücksetzen
        if (oLinks.getText() == oMitte.getText() && oMitte.getText() == oRechts.getText() && !oMitte.getText().toString().isEmpty())
        {
            ad.setMessage(oMitte.getText() + " hat Gewonnen");
            ad.show();
            wipeGame();
        }
        else if (mLinks.getText() == mMitte.getText() && mMitte.getText() == mRechts.getText() && !mMitte.getText().toString().isEmpty())
        {
            ad.setMessage(mMitte.getText() + " hat Gewonnen");
            ad.show();
            wipeGame();
        }
        else if (uLinks.getText() == uMitte.getText() && uMitte.getText() == uRechts.getText() && !uMitte.getText().toString().isEmpty())
        {
            ad.setMessage(uMitte.getText() + " hat Gewonnen");
            ad.show();
            wipeGame();
        }
        else if (oLinks.getText() == mLinks.getText() && mLinks.getText() == uLinks.getText() && !mLinks.getText().toString().isEmpty())
        {
            ad.setMessage(mLinks.getText() + " hat Gewonnen");
            ad.show();
            wipeGame();
        }
        else if (oMitte.getText() == mMitte.getText() && mMitte.getText() == uMitte.getText() && !mMitte.getText().toString().isEmpty())
        {
            ad.setMessage(mMitte.getText() + " hat Gewonnen");
            ad.show();
            wipeGame();
        }
        else if (oRechts.getText() == mRechts.getText() && mRechts.getText() == uRechts.getText() && !mRechts.getText().toString().isEmpty())
        {
            ad.setMessage(mRechts.getText() + " hat Gewonnen");
            ad.show();
            wipeGame();
        }
        else if (oLinks.getText() == mMitte.getText() && mMitte.getText() == uRechts.getText() && !mMitte.getText().toString().isEmpty())
        {
            ad.setMessage(mMitte.getText() + " hat Gewonnen");
            ad.show();
            wipeGame();
        }
        else if (oRechts.getText() == mMitte.getText() && mMitte.getText() == uLinks.getText() && !mMitte.getText().toString().isEmpty())
        {
            ad.setMessage(mMitte.getText() + " hat Gewonnen");
            ad.show();
            wipeGame();
        }
        else if(!oLinks.getText().toString().isEmpty() && !oMitte.getText().toString().isEmpty() && !oRechts.getText().toString().isEmpty() && !mLinks.getText().toString().isEmpty() && !mMitte.getText().toString().isEmpty() && !mLinks.getText().toString().isEmpty() && !uLinks.getText().toString().isEmpty() && !uMitte.getText().toString().isEmpty() && !uRechts.getText().toString().isEmpty())
        {
            ad.setMessage("Unentschieden");
            ad.show();
            wipeGame();
        }
    }
    //ENDE Gewinner ermitteln

    //Alle Felder leeren und Spielzug auf 0 setzen
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