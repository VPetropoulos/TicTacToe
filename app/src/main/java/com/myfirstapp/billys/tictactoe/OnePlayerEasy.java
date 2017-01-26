package com.myfirstapp.billys.tictactoe;



import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;




public class OnePlayerEasy extends AppCompatActivity
{
    //Spielzug des Spielers auf 1 setzen
    int b = 1;
    Button oLinks;
    Button oMitte;
    Button oRechts;

    Button mLinks;
    Button mMitte;
    Button mRechts;

    Button uLinks;
    Button uMitte;
    Button uRechts;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_one_player_easy);
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
                Button button = (Button) v;

                button.setText("X");
                button.setClickable(false);
                b++;

                if (b <= 5)
                {
                    autoPlayer();
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

    //COMPUTER
    public void autoPlayer()
    {
        mainloop:
        while (true)
        {
            //Zufälliger Case für 0-8 -> Für die 9 möglichen Felder
            int zahl = (int)((Math.random()) * 8);
            //Ist ein Feld bereits mit X belegt => continue
            switch (zahl)
            {
                case 0:
                    if (oLinks.getText().toString().isEmpty())
                    {
                        oLinks.setText("O");
                        oLinks.setClickable(false);
                        break mainloop;
                    }
                    break;

                case 1:
                    if (oMitte.getText().toString().isEmpty())
                    {
                        oMitte.setText("O");
                        oMitte.setClickable(false);
                        break mainloop;

                    }
                    break;

                case 2:
                    if (oRechts.getText().toString().isEmpty())
                    {
                        oRechts.setText("O");
                        oRechts.setClickable(false);
                        break mainloop;
                    }
                    break;
                case 3:
                    if (mLinks.getText().toString().isEmpty())
                    {
                        mLinks.setText("O");
                        mLinks.setClickable(false);
                        break mainloop;
                    }
                    break;
                case 4:
                    if (mMitte.getText().toString().isEmpty())
                    {
                        mMitte.setText("O");
                        mMitte.setClickable(false);
                        break mainloop;
                    }
                    break;
                case 5:
                    if (mRechts.getText().toString().isEmpty())
                    {
                        mRechts.setText("O");
                        mRechts.setClickable(false);
                        break mainloop;
                    }
                    break;
                case 6:
                    if (uLinks.getText().toString().isEmpty())
                    {
                        uLinks.setText("O");
                        uLinks.setClickable(false);
                        break mainloop;
                    }
                    break;

                case 7:
                    if (uMitte.getText().toString().isEmpty())
                    {
                        uMitte.setText("O");
                        uMitte.setClickable(false);
                        break mainloop;
                    }
                    break;
                case 8:
                    if (uRechts.getText().toString().isEmpty())
                    {
                        uRechts.setText("O");
                        uRechts.setClickable(false);
                        break mainloop;
                    }
                    break;

            }
        }
    }
    //ENDE COMPUTER

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

    //Alle Felder leeren und Spielzug auf 1 setzen
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
        b=1;
    }
}