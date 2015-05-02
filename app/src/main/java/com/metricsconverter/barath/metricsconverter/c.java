package com.metricsconverter.barath.metricsconverter;

/**
 * Created by barath on 3/22/2015.
 */
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class c extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.celsius);

        final   EditText  celsius       =  (EditText)findViewById(R.id.editText9);

        final   EditText  farhenheit  = (EditText)findViewById(R.id.editText10);

        Button buttonConvert = (Button)findViewById(R.id.button11);

        buttonConvert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                double c = Double.valueOf(celsius.getText().toString());
                double f =   ((c*9)/5)+32;
                farhenheit.setText(String.valueOf(f));
            }
        });



    }



}
