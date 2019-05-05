package AKB11.com.walkthrough;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import AKB11.com.R;

public class SplashScreenActivity extends AppCompatActivity {

    private int SPLASH_TIME_OUT = 4000;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_splash);
            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {
                    Intent walkthrough = new Intent(SplashScreenActivity.this, WalkthroughActivity.class);
                    startActivity(walkthrough);
                    finish();
                }
            },SPLASH_TIME_OUT);
        }
}
