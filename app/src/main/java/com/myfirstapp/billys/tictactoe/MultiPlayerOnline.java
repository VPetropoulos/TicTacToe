package com.myfirstapp.billys.tictactoe;



import android.os.Bundle;
import android.os.StrictMode;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;



public class MultiPlayerOnline extends AppCompatActivity
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
    //final AlertDialog ad = new AlertDialog.Builder(this).create();
    //final PIRCBOT bot = new PIRCBOT();
    int player = 1;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);



        //Dirty fix: Needed to fix NetworkOnMainThread Exception!
        if (android.os.Build.VERSION.SDK_INT > 9) {
            StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder().permitAll().build();
            StrictMode.setThreadPolicy(policy);
        }

        setContentView(R.layout.activity_multiplayer_online);
        oLinks = (Button) findViewById(R.id.btnObenLinks);
        oMitte = (Button) findViewById(R.id.btnObenMitte);
        oRechts = (Button) findViewById(R.id.btnObenRechts);

        mLinks = (Button) findViewById(R.id.btnMitteLinks);
        mMitte = (Button) findViewById(R.id.btnMitteMitte);
        mRechts = (Button) findViewById(R.id.btnMitteRechts);

        uLinks = (Button) findViewById(R.id.btnUntenLinks);
        uMitte = (Button) findViewById(R.id.btnUntenMitte);
        uRechts = (Button) findViewById(R.id.btnUntenRechts);


        //bot.setVerbose(true);
       /* try {
            System.out.println("Attempting to join server");
            bot.connect("irc.rd9.eu");
            bot.joinChannel("#xTiTaTocv888");

        } catch (IOException e) {
            e.printStackTrace();

        } catch (Exception e) {
            e.printStackTrace();
        }
        if (bot.isConnected()) {
            Toast.makeText(getBaseContext(), "Connected", Toast.LENGTH_LONG).show();
        }
        else {
            Toast.makeText(getBaseContext(), "Connection failed", Toast.LENGTH_LONG).show();
            return;
        }*/

       /* ad.setMessage("Wait for another player");
        ad.setCancelable(false);
        ad.show();
        if (bot.getUsers("#TiTaToxcv888").length == 3) {
            ad.hide();
        }*/





        //START SPIELZÜGE
        //Felder onClick auf X setzen und den Spielzug hochzählen. COMPUTER wird nicht gezählt.
        //COMPUTER ist nach dem Spieler dran wenn der 6. Spielzug des Spielers nicht angefangen hat
        oLinks.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (oLinks.getText().toString().isEmpty())
                {
                    //bot.sendMessage("#TiTaToxcv888", "x on 1");
                    oLinks.setText("X");
                    b++;
                }
                //Prüfung nach Gewinner nach jeder Runde (Runde= SPIELER + COMPUTER waren beide dran)
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
                }

                foundWinner();

            }
        });
    }

    //START Gewinner ermitteln
    public void foundWinner()
    {
        final AlertDialog ad = new AlertDialog.Builder(this).create();
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