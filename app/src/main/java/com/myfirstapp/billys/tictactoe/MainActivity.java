package com.myfirstapp.billys.tictactoe;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_main);

        final Button einzelspieler = (Button) findViewById(R.id.btnEinzelspieler);
        final Button mehrspieler = (Button) findViewById(R.id.btnMehrspieler);
        final Button leicht = (Button) findViewById(R.id.btnLeicht);
        final Button schwer = (Button) findViewById(R.id.btnSchwer);
        final Button back = (Button) findViewById(R.id.btnBack);




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

    }
}


