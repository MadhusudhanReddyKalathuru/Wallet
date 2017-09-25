package com.wallet.main;

import android.app.Activity;
import android.content.Intent;
import android.graphics.PixelFormat;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.Window;

import net.simplifiedcoding.navigationdrawerexample.R;


/**
 * Created by Madhusudhan Reddy on 7/25/2017.
 */

public class SplashScreen extends Activity
{
    Thread t;
    public void onAttachedToWindow()
    {
        super.onAttachedToWindow();
        Window w=getWindow();
        w.setFormat(PixelFormat.RGBA_8888);
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash_layout);
        splashscreen();
        //note pad
    }
        public void splashscreen()
        {
            t=new Thread()
            {
                public void run()
                {
                    try {
                        int waited = 0;
                        // Splash screen pause time
                        while (waited <5000) {
                            sleep(100);
                            waited += 100;
                        }
                        Intent intent = new Intent(SplashScreen.this,SignupActivity.class);
                        intent.setFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
                        startActivity(intent);
                        SplashScreen.this.finish();
                    } catch (Exception e) {

                    } finally {
                        SplashScreen.this.finish();
                    }
                }
            };
            t.start();

        }
    }

