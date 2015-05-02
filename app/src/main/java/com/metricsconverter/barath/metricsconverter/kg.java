package com.metricsconverter.barath.metricsconverter;

/**
 * Created by barath on 3/22/2015.
 */
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class kg extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.kilogram);

        final   EditText  kilogram       =  (EditText)findViewById(R.id.editText11);

        final   EditText  pounds  = (EditText)findViewById(R.id.editText12);

        Button buttonConvert = (Button)findViewById(R.id.button14);

        buttonConvert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                double kg = Double.valueOf(kilogram.getText().toString());
                double p =   kg*2.20462;
                pounds.setText(String.valueOf(p));
            }
        });



    }



}
