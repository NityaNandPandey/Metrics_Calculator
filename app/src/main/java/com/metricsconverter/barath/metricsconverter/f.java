package com.metricsconverter.barath.metricsconverter;

/**
 * Created by barath on 3/22/2015.
*/
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class f extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.farhenheit);

        final   EditText  farhenheit       =  (EditText)findViewById(R.id.editText7);

        final   EditText  celsius  = (EditText)findViewById(R.id.editText8);

        Button buttonConvert = (Button)findViewById(R.id.button10);

        buttonConvert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                double f = Double.valueOf(farhenheit.getText().toString());
                double c =   (f-32)*5/9;
                celsius.setText(String.valueOf(c));
            }
        });



    }



}
