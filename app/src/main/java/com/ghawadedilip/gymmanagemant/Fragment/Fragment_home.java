package com.ghawadedilip.gymmanagemant.Fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.ghawadedilip.gymmanagemant.R;

/**
 * Created by Dilip on 07-Dec-17.
 */

public class Fragment_home extends Fragment {
  @Nullable
  @Override
  public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
    View v = inflater.inflate(R.layout.fragment_home,container,false);
    return v;
  }
}
