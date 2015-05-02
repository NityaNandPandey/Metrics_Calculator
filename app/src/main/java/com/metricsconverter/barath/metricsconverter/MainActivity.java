package com.metricsconverter.barath.metricsconverter;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


                public class MainActivity extends Activity {

                    @Override
                    protected void onCreate(Bundle savedInstanceState) {
                        super.onCreate(savedInstanceState);
                        setContentView(R.layout.activity_main);

                        final   EditText  editCentimetres       =  (EditText)findViewById(R.id.editCentimetres);

                        final   EditText  editInches  = (EditText)findViewById(R.id.editInches);

                        Button buttonConvert = (Button)findViewById(R.id.buttonConvert);

                        buttonConvert.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {

                                double centimetres = Double.valueOf(editCentimetres.getText().toString());
                                double inches =   centimetres  * 0.393700787;
                editInches.setText(String.valueOf(inches));
            }
        });



    }



}

