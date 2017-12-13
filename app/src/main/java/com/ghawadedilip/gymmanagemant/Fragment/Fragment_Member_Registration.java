package com.ghawadedilip.gymmanagemant.Fragment;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.ghawadedilip.gymmanagemant.R;

/**
 * Created by Dilip on 08-Dec-17.
 */

public class Fragment_Member_Registration extends Fragment {

  @Nullable
  @Override
  public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
    View v = inflater.inflate(R.layout.fragment_mem_registration,container,false);
    return v;
  }

  public void replacementFragment(Fragment fragment,boolean addToBack)
  {
    FragmentManager fm=getFragmentManager();
    FragmentTransaction ft = fm.beginTransaction();
    ft.replace(R.id.main_Container,fragment,fragment.getClass().getName());
    if (addToBack);
       ft.addToBackStack(null);
       ft.commit();
  }
}
