package com.ghawadedilip.gymmanagemant;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Splash_Screen_Activity extends AppCompatActivity {
  private static final int Time= 6000;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_splash__screen_);

    new Handler().postDelayed(new Runnable() {
      @Override
      public void run() {
        Intent i = new Intent(Splash_Screen_Activity.this,MainActivity.class);
        startActivity(i);
        finish();
      }
    },Time);

  }
}
