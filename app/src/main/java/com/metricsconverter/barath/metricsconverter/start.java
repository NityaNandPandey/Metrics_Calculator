package com.metricsconverter.barath.metricsconverter;

/**
 * Created by barath on 3/14/2015.
 */

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by barath on 3/14/2015.
 */
public class start extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.start);

        Button cm = (Button) findViewById(R.id.button2);
        Button inches = (Button) findViewById(R.id.button3);
        Button km = (Button) findViewById(R.id.button5);
        Button m = (Button) findViewById(R.id.button7);
        Button f = (Button) findViewById(R.id.button8);
        Button c = (Button) findViewById(R.id.button9);
        Button kgs = (Button) findViewById(R.id.button12);
        Button pou = (Button) findViewById(R.id.button13);

        cm.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                Intent nextScreen = new Intent(getApplicationContext(), MainActivity.class);

                startActivity(nextScreen);
                //finish();
            }
        });

        inches.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                Intent auxScreen = new Intent(getApplicationContext(), inches.class);

                startActivity(auxScreen);
                //finish();
            }
        });


        km.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                Intent auxScreen = new Intent(getApplicationContext(), km.class);

                startActivity(auxScreen);
                //finish();
            }
        });

        m.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                Intent auxScreen = new Intent(getApplicationContext(), m.class);

                startActivity(auxScreen);
                //finish();
            }
        });
        f.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                Intent nextScreen = new Intent(getApplicationContext(), f.class);

                startActivity(nextScreen);
                //finish();
            }
        });
        c.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                Intent nextScreen = new Intent(getApplicationContext(), c.class);

                startActivity(nextScreen);
                //finish();
            }
        });
        kgs.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                Intent nextScreen = new Intent(getApplicationContext(), kg.class);

                startActivity(nextScreen);
                //finish();
            }
        });
        pou.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                Intent nextScreen = new Intent(getApplicationContext(), pounds.class);

                startActivity(nextScreen);
                //finish();
            }
        });
    }

}
