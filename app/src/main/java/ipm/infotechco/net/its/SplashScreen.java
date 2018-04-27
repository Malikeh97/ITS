package ipm.infotechco.net.its;

import android.app.ActivityOptions;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.os.Handler;
import android.content.Intent;


public class SplashScreen extends AppCompatActivity {
    private static int SPLASH_TIME_OUT = 2000;
    ViewPager mImageViewPager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent i = new Intent(SplashScreen.this, SplashActivity2.class);
                ActivityOptions options =
                        ActivityOptions.makeCustomAnimation(SplashScreen.this, android.R.anim.fade_in, android.R.anim.fade_out);
                SplashScreen.this.startActivity(i, options.toBundle());
                finish();
            }
        }, SPLASH_TIME_OUT);

    }
}
