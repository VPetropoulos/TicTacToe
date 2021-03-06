package com.myfirstapp.billys.tictactoe;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;

public class MainActivity extends Activity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        //Oberfläche für das Menü erstellen
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_main);

        final Button einzelspieler = (Button) findViewById(R.id.btnEinzelspieler);
        final Button mehrspieler = (Button) findViewById(R.id.btnMehrspieler);
        final Button leicht = (Button) findViewById(R.id.btnLeicht);
        final Button schwer = (Button) findViewById(R.id.btnSchwer);
        final Button back = (Button) findViewById(R.id.btnBack);

        final Intent start_OnePlayerEasy = new Intent(this, OnePlayerEasy.class);
        final Intent start_OnePlayerHard = new Intent(this, OnePlayerHard.class);
        final Intent start_MultiPlayerLocal = new Intent(this, MultiPlayerLocal.class);

        //Schwierigkeitsstufe Einzelspieler auswählen
        einzelspieler.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                einzelspieler.setVisibility(View.INVISIBLE);
                mehrspieler.setVisibility(View.INVISIBLE);
                leicht.setVisibility(View.VISIBLE);
                schwer.setVisibility(View.VISIBLE);
                back.setVisibility(View.VISIBLE);
            }
        });

        //Zum Menü ZURÜCK wechseln und nur Einzel- und Mehrspieler anzeigen
        back.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                einzelspieler.setVisibility(View.VISIBLE);
                mehrspieler.setVisibility(View.VISIBLE);
                leicht.setVisibility(View.INVISIBLE);
                schwer.setVisibility(View.INVISIBLE);
                back.setVisibility(View.INVISIBLE);
            }
        });

        //Einzelspieler leicht starten onClick
        leicht.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                startActivity(start_OnePlayerEasy);
            }
        });

        //Einzelspieler Schwer starten onClick
        schwer.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                startActivity(start_OnePlayerHard);
            }
        });

        //Mehrspieler local starten onClick
        mehrspieler.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                startActivity(start_MultiPlayerLocal);
            }
        });

    }
}


