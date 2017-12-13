package com.ghawadedilip.gymmanagemant;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.WindowManager;

import com.ghawadedilip.gymmanagemant.Fragment.Fragment_Login;
import com.ghawadedilip.gymmanagemant.Fragment.Replace_Fragment;

public class MainActivity extends AppCompatActivity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);

   replacementFragment(new Fragment_Login(),true);
    //new Replace_Fragment().replacementFragment(new Fragment_Login(),true);
  }
  public void replacementFragment(Fragment fragment, boolean addToBack)
  {
    android.support.v4.app.FragmentManager fm = getSupportFragmentManager();
    android.support.v4.app.FragmentTransaction ft = fm.beginTransaction();
    ft.replace(R.id.main_Container,fragment,fragment.getClass().getName());
    if (addToBack)
      ft.commit();

  }

}
