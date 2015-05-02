package com.metricsconverter.barath.metricsconverter;

/**
 * Created by barath on 3/22/2015.
 */
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class m extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.meter);

        final   EditText  meter       =  (EditText)findViewById(R.id.editText5);

        final   EditText  kilometer  = (EditText)findViewById(R.id.editText6);

        Button buttonConvert = (Button)findViewById(R.id.button6);

        buttonConvert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                double m = Double.valueOf(meter.getText().toString());
                double km =  m  * 3.6;
                kilometer.setText(String.valueOf(km));
            }
        });



    }



}
