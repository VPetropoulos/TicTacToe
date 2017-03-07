package com.myfirstapp.billys.tictactoe;

import android.os.Bundle;
import android.os.SystemClock;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by Billys on 25.01.2017.
 */

public class OnePlayerHard extends AppCompatActivity {
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
        setContentView(R.layout.activity_one_player_hard);
        oLinks = (Button) findViewById(R.id.btnObenLinks);
        oMitte = (Button) findViewById(R.id.btnObenMitte);
        oRechts = (Button) findViewById(R.id.btnObenRechts);

        mLinks = (Button) findViewById(R.id.btnMitteLinks);
        mMitte = (Button) findViewById(R.id.btnMitteMitte);
        mRechts = (Button) findViewById(R.id.btnMitteRechts);

        uLinks = (Button) findViewById(R.id.btnUntenLinks);
        uMitte = (Button) findViewById(R.id.btnUntenMitte);
        uRechts = (Button) findViewById(R.id.btnUntenRechts);


        oLinks.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (oLinks.getText().toString().isEmpty()) {
                    oLinks.setText("X");
                    b++;
                    if (b <= 5) {
                        autoPlayer();
                    }

                } else if (oLinks.getText() == "O")
                {

                }
                foundWinner();
            }
        });

        oMitte.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                if (oMitte.getText().toString().isEmpty()) {
                    oMitte.setText("X");
                    b++;
                    if (b <= 5) {
                        autoPlayer();
                    }
                } else if (oMitte.getText() == "O") {

                }
                foundWinner();

            }
        });

        oRechts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                if (oRechts.getText().toString().isEmpty()) {
                    oRechts.setText("X");
                    b++;
                    if (b <= 5) {
                        autoPlayer();
                    }
                } else if (oRechts.getText() == "O") {

                }
                foundWinner();

            }
        });

        mLinks.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                if (mLinks.getText().toString().isEmpty()) {
                    mLinks.setText("X");
                    b++;
                    if (b <= 5) {
                        autoPlayer();
                    }
                } else if (mLinks.getText() == "O") {

                }
                foundWinner();
            }
        });

        mMitte.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                if (mMitte.getText().toString().isEmpty()) {
                    mMitte.setText("X");
                    b++;
                    if (b <= 5) {
                        autoPlayer();
                    }
                } else if (mMitte.getText() == "O") {

                }
                foundWinner();
            }
        });

        mRechts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                if (mRechts.getText().toString().isEmpty()) {
                    mRechts.setText("X");
                    b++;
                    if (b <= 5) {
                        autoPlayer();
                    }
                } else if (mRechts.getText() == "O") {

                }
                foundWinner();
            }
        });

        uLinks.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                if (uLinks.getText().toString().isEmpty()) {
                    uLinks.setText("X");
                    b++;
                    if (b <= 5) {
                        autoPlayer();
                    }

                } else if (uLinks.getText() == "O") {

                }
                foundWinner();
            }
        });

        uMitte.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                if (uMitte.getText().toString().isEmpty()) {
                    uMitte.setText("X");
                    b++;
                    if (b <= 5) {
                        autoPlayer();
                    }
                } else if (uMitte.getText() == "O") {

                }
                foundWinner();

            }
        });

        uRechts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                if (uRechts.getText().toString().isEmpty()) {
                    uRechts.setText("X");

                    b++;
                    if (b <= 5) {
                        autoPlayer();
                    }

                } else if (uRechts.getText() == "O") {

                }
                foundWinner();

            }
        });
    }

    public void autoPlayer() {


        if (oLinks.getText() == "O" && oMitte.getText() == "O" && oRechts.getText().toString().isEmpty())
        {
            oRechts.setText("O");

        }
        else if (oLinks.getText() == "O" && oRechts.getText()  == "O" && oMitte.getText().toString().isEmpty())
        {
            oMitte.setText("O");

        }
        else if (oRechts.getText() == "O" && oMitte.getText() == "O" && oLinks.getText().toString().isEmpty())
        {
            oLinks.setText("O");

        }
        else if (mLinks.getText() == "O" && mMitte.getText() == "O" && mRechts.getText().toString().isEmpty())
        {
            mRechts.setText("O");

        }
        else if (mLinks.getText() == "O" && mRechts.getText() == "O" && mMitte.getText().toString().isEmpty())
        {
            mMitte.setText("O");

        }
        else if (mRechts.getText() == "O" && mMitte.getText() == "O" && mLinks.getText().toString().isEmpty())
        {
            mLinks.setText("O");

        }
        else if (uLinks.getText() == "O" && uMitte.getText() == "O" && uRechts.getText().toString().isEmpty())
        {
            uRechts.setText("O");

        }
        else if (uLinks.getText()  == "O" && uRechts.getText() == "O" && uMitte.getText().toString().isEmpty())
        {
            uMitte.setText("O");

        }
        else if (uRechts.getText()  == "O" && uMitte.getText() == "O" && uLinks.getText().toString().isEmpty())
        {
            uLinks.setText("O");

        }
        else if (oLinks.getText()  == "O" && mLinks.getText() == "O" && uLinks.getText().toString().isEmpty())
        {
            uLinks.setText("O");

        }
        else if (mLinks.getText() == "O"&& uLinks.getText() == "O" && oLinks.getText().toString().isEmpty())
        {
            oLinks.setText("O");

        }
        else if (oLinks.getText() == "O" && uLinks.getText() == "O" && mLinks.getText().toString().isEmpty())
        {
            mLinks.setText("O");

        }
        else if (oMitte.getText() == "O" && mMitte.getText() == "O" && uMitte.getText().toString().isEmpty())
        {
            uMitte.setText("O");

        }
        else if (oMitte.getText() == "O" && uMitte.getText() == "O" && mMitte.getText().toString().isEmpty())
        {
            mMitte.setText("O");
        }
        else if (mMitte.getText() == "O" && uMitte.getText() == "O" && oMitte.getText().toString().isEmpty())
        {
            oMitte.setText("O");

        }
        else if (oRechts.getText() == "O" && mRechts.getText() == "O" && uRechts.getText().toString().isEmpty())
        {
            uRechts.setText("O");

        }
        else if (uRechts.getText() == "O" && oRechts.getText() == "O" && mRechts.getText().toString().isEmpty())
        {
            mRechts.setText("O");

        }
        else if (uRechts.getText() == "O" && mRechts.getText() == "O" && oRechts.getText().toString().isEmpty())
        {
            oRechts.setText("O");
        }
        else if (oLinks.getText() == "O" && mMitte.getText() == "O" && uRechts.getText().toString().isEmpty())
        {
            uRechts.setText("O");

        }
        else if (oLinks.getText() == "O" && uRechts.getText() == "O" && mMitte.getText().toString().isEmpty())
        {
            mMitte.setText("O");

        }
        else if (mMitte.getText() == "O" && uRechts.getText() == "O" && oLinks.getText().toString().isEmpty())
        {
            oLinks.setText("O");

        }
        else if (oRechts.getText() == "O" && mMitte.getText() == "O" && uLinks.getText().toString().isEmpty())
        {
            uLinks.setText("O");

        }
        else if (oRechts.getText() == "O" && uLinks.getText() == "O" && mMitte.getText().toString().isEmpty())
        {
            mMitte.setText("O");

        }
        else if (mMitte.getText() == "O" && uLinks.getText() == "O" && oRechts.getText().toString().isEmpty())
        {
            oRechts.setText("O");

        }

        else if (oLinks.getText() == "X" && oMitte.getText() == "X" && oRechts.getText().toString().isEmpty())
        {
            oRechts.setText("O");


        }
        else if (oLinks.getText() == "X" && oRechts.getText()  == "X" && oMitte.getText().toString().isEmpty())
        {
            oMitte.setText("O");

        }
        else if (oRechts.getText() == "X" && oMitte.getText() == "X" && oLinks.getText().toString().isEmpty())
        {
            oLinks.setText("O");

        }
        else if (mLinks.getText() == "X" && mMitte.getText() == "X" && mRechts.getText().toString().isEmpty())
        {
            mRechts.setText("O");

        }
        else if (mLinks.getText() == "X" && mRechts.getText() == "X" && mMitte.getText().toString().isEmpty())
        {
            mMitte.setText("O");

        }
        else if (mRechts.getText() == "X" && mMitte.getText() == "X" && mLinks.getText().toString().isEmpty())
        {
            mLinks.setText("O");

        }
        else if (uLinks.getText() == "X" && uMitte.getText() == "X" && uRechts.getText().toString().isEmpty())
        {
            uRechts.setText("O");
        }
        else if (uLinks.getText()  == "X" && uRechts.getText() == "X" && uMitte.getText().toString().isEmpty())
        {
            uMitte.setText("O");

        }
        else if (uRechts.getText()  == "X" && uMitte.getText() == "X" && uLinks.getText().toString().isEmpty())
        {
            uLinks.setText("O");

        }
        else if (oLinks.getText()  == "X" && mLinks.getText() == "X" && uLinks.getText().toString().isEmpty())
        {
            uLinks.setText("O");

        }
        else if (mLinks.getText() == "X"&& uLinks.getText() == "X" && oLinks.getText().toString().isEmpty())
        {
            oLinks.setText("O");

        }
        else if (oLinks.getText() == "X" && uLinks.getText() == "X" && mLinks.getText().toString().isEmpty())
        {
            mLinks.setText("O");

        }
        else if (oMitte.getText() == "X" && mMitte.getText() == "X" && uMitte.getText().toString().isEmpty())
        {
            uMitte.setText("O");

        }
        else if (oMitte.getText() == "X" && uMitte.getText() == "X" && mMitte.getText().toString().isEmpty())
        {
            mMitte.setText("O");
        }
        else if (mMitte.getText() == "X" && uMitte.getText() == "X" && oMitte.getText().toString().isEmpty())
        {
            oMitte.setText("O");

        }
        else if (oRechts.getText() == "X" && mRechts.getText() == "X" && uRechts.getText().toString().isEmpty())
        {
            uRechts.setText("O");

        }
        else if (uRechts.getText() == "X" && oRechts.getText() == "X" && mRechts.getText().toString().isEmpty())
        {
            mRechts.setText("O");

        }
        else if (uRechts.getText() == "X" && mRechts.getText() == "X" && oRechts.getText().toString().isEmpty())
        {
            oRechts.setText("O");
        }
        else if (oLinks.getText() == "X" && mMitte.getText() == "X" && uRechts.getText().toString().isEmpty())
        {
            uRechts.setText("O");

        }
        else if (oLinks.getText() == "X" && uRechts.getText() == "X" && mMitte.getText().toString().isEmpty())
        {
            mMitte.setText("O");

        }
        else if (mMitte.getText() == "X" && uRechts.getText() == "X" && oLinks.getText().toString().isEmpty())
        {
            oLinks.setText("O");

        }
        else if (oRechts.getText() == "X" && mMitte.getText() == "X" && uLinks.getText().toString().isEmpty())
        {
            uLinks.setText("O");

        }
        else if (oRechts.getText() == "X" && uLinks.getText() == "X" && mMitte.getText().toString().isEmpty())
        {
            mMitte.setText("O");

        }
        else if (mMitte.getText() == "X" && uLinks.getText() == "X" && oRechts.getText().toString().isEmpty())
        {
            oRechts.setText("O");

        }
        else {
                int zahl = (int) ((Math.random()) * 8);

                switch (zahl) {
                    case 0:
                        if (oLinks.getText().toString().isEmpty()) {
                            oLinks.setText("O");
                            break;
                        }


                    case 1:
                        if (oMitte.getText().toString().isEmpty()) {
                            oMitte.setText("O");
                            break;

                        }


                    case 2:
                        if (oRechts.getText().toString().isEmpty()) {
                            oRechts.setText("O");
                            break;
                        }

                    case 3:
                        if (mLinks.getText().toString().isEmpty()) {
                            mLinks.setText("O");
                            break;
                        }

                    case 4:
                        if (mMitte.getText().toString().isEmpty()) {
                            mMitte.setText("O");
                            break;
                        }

                    case 5:
                        if (mRechts.getText().toString().isEmpty()) {
                            mRechts.setText("O");
                            break;
                        }

                    case 6:
                        if (uLinks.getText().toString().isEmpty()) {
                            uLinks.setText("O");
                            break;
                        }


                    case 7:
                        if (uMitte.getText().toString().isEmpty()) {
                            uMitte.setText("O");
                            break;
                        }

                    case 8:
                        if (uRechts.getText().toString().isEmpty()) {
                            uRechts.setText("O");
                            break;
                        }



            }
        }

    }

    public void foundWinner() {

        //final Intent start_MainActivity = new Intent(this, MainActivity.class);

        AlertDialog ad = new AlertDialog.Builder(this).create();


        if (oLinks.getText() == oMitte.getText() && oMitte.getText() == oRechts.getText() && !oMitte.getText().toString().isEmpty()) {
            ad.setMessage(oMitte.getText() + " hat Gewonnen");
            ad.show();
            wipeGame();
        } else if (mLinks.getText() == mMitte.getText() && mMitte.getText() == mRechts.getText() && !mMitte.getText().toString().isEmpty()) {
            ad.setMessage(mMitte.getText() + " hat Gewonnen");
            ad.show();
            wipeGame();
        } else if (uLinks.getText() == uMitte.getText() && uMitte.getText() == uRechts.getText() && !uMitte.getText().toString().isEmpty()) {
            ad.setMessage(uMitte.getText() + " hat Gewonnen");
            ad.show();
            wipeGame();
        } else if (oLinks.getText() == mLinks.getText() && mLinks.getText() == uLinks.getText() && !mLinks.getText().toString().isEmpty()) {
            ad.setMessage(mLinks.getText() + " hat Gewonnen");
            ad.show();
            wipeGame();
        } else if (oMitte.getText() == mMitte.getText() && mMitte.getText() == uMitte.getText() && !mMitte.getText().toString().isEmpty()) {
            ad.setMessage(mMitte.getText() + " hat Gewonnen");
            ad.show();
            wipeGame();
        } else if (oRechts.getText() == mRechts.getText() && mRechts.getText() == uRechts.getText() && !mRechts.getText().toString().isEmpty()) {
            ad.setMessage(mRechts.getText() + " hat Gewonnen");
            ad.show();
            wipeGame();
        } else if (oLinks.getText() == mMitte.getText() && mMitte.getText() == uRechts.getText() && !mMitte.getText().toString().isEmpty()) {
            ad.setMessage(mMitte.getText() + " hat Gewonnen");
            ad.show();
            wipeGame();
        } else if (oRechts.getText() == mMitte.getText() && mMitte.getText() == uLinks.getText() && !mMitte.getText().toString().isEmpty()) {
            ad.setMessage(mMitte.getText() + " hat Gewonnen");
            ad.show();
            wipeGame();
        } else if (!oLinks.getText().toString().isEmpty() && !oMitte.getText().toString().isEmpty() && !oRechts.getText().toString().isEmpty() && !mLinks.getText().toString().isEmpty() && !mMitte.getText().toString().isEmpty() && !mLinks.getText().toString().isEmpty() && !uLinks.getText().toString().isEmpty() && !uMitte.getText().toString().isEmpty() && !uRechts.getText().toString().isEmpty()) {
            ad.setMessage("Unentschieden");
            ad.show();
            wipeGame();
        }
    }

    public void wipeGame()
    {
        oLinks.setText(null);
        oMitte.setText(null);
        oRechts.setText(null);
        mLinks.setText(null);
        mMitte.setText(null);
        mRechts.setText(null);
        uLinks.setText(null);
        uMitte.setText(null);
        uRechts.setText(null);
        b = 1;
    }
}
