package com.metricsconverter.barath.metricsconverter;

/**
 * Created by barath on 3/22/2015.
 */
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class splash extends Activity {

    /** Duration of wait **/
    private final int SPLASH_DISPLAY_LENGTH = 3000;

    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle icicle) {
        super.onCreate(icicle);
        setContentView(R.layout.splash);

        /* New Handler to start the Menu-Activity
         * and close this Splash-Screen after some seconds.*/
        new Handler().postDelayed(new Runnable(){
            @Override
            public void run() {
                /* Create an Intent that will start the Menu-Activity. */
                Intent mainIntent = new Intent(splash.this,start.class);
                splash.this.startActivity(mainIntent);
                splash.this.finish();
            }
        }, SPLASH_DISPLAY_LENGTH);
    }
}