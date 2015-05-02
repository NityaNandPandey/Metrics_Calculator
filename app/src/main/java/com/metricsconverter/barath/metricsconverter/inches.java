package com.metricsconverter.barath.metricsconverter;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

/**
 * Created by barath on 3/14/2015.
 */
public class inches extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.inches);

        final EditText newinches       =  (EditText)findViewById(R.id.editText);

        final   EditText  newcentimeters  = (EditText)findViewById(R.id.editText2);

        Button buttonnew = (Button)findViewById(R.id.button);

        buttonnew.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                double inches = Double.valueOf(newinches.getText().toString());
                double centimetres =   (inches) /( 0.393700787);
                newcentimeters.setText(String.valueOf(centimetres));
            }
        });



    }



}

