package com.metricsconverter.barath.metricsconverter;

/**
 * Created by barath on 3/22/2015.
 */
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class pounds extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pounds);

        final   EditText  pounds      =  (EditText)findViewById(R.id.editText13);

        final   EditText  kilogram  = (EditText)findViewById(R.id.editText14);

        Button buttonConvert = (Button)findViewById(R.id.button15);

        buttonConvert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                double p = Double.valueOf(pounds.getText().toString());
                double kg =   p*0.453592;
                kilogram.setText(String.valueOf(kg));
            }
        });



    }



}
