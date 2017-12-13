package com.ghawadedilip.gymmanagemant.Fragment;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;

import com.ghawadedilip.gymmanagemant.R;

/**
 * Created by Dilip on 07-Dec-17.
 */

public class Replace_Fragment extends Fragment {
  public void replacementFragment(Fragment fragment, boolean addToBack)
  {
    FragmentManager fm = getFragmentManager();
    FragmentTransaction ft = fm.beginTransaction();
    ft.replace(R.id.main_Container,fragment,fragment.getClass().getName());
    if (addToBack)
      ft.commit();

  }
}
