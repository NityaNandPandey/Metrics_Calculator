package com.metricsconverter.barath.metricsconverter;

/**
 * Created by barath on 3/21/2015.
 */
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class km extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.kilometer);

        final   EditText  kilometer       =  (EditText)findViewById(R.id.editText3);

        final   EditText  meter  = (EditText)findViewById(R.id.editText4);

        Button buttonConvert = (Button)findViewById(R.id.button4);

        buttonConvert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                double km = Double.valueOf(kilometer.getText().toString());
                double m =   km  * 0.277778;
                meter.setText(String.valueOf(m));
            }
        });



    }



}

