package com.ghawadedilip.gymmanagemant.Fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.ghawadedilip.gymmanagemant.R;

/**
 * Created by Dilip on 07-Dec-17.
 */

public class Fragment_Login extends Fragment implements View.OnClickListener {
  EditText edtusername,edtpassword;
  Button btnlogin,btnsignup;

  @Nullable
  @Override
  public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
    View v = inflater.inflate(R.layout.fragment_login,container,false);
    edtusername = v.findViewById(R.id.editTextEmailAddress);
    edtpassword = v.findViewById(R.id.editText_Password);

    btnlogin = v.findViewById(R.id.btn_login);
    btnsignup = v.findViewById(R.id.btn_signup);

    btnlogin.setOnClickListener(this);
    btnsignup.setOnClickListener(this);



    return v;
  }

  public void userLogin()
  {
    String name = edtusername.getText().toString();
    String password = edtpassword.getText().toString();
    if (name.equals("Admin")&& password.equals("1234"))
    {
      /*Replace_Fragment replace_fragment = new Replace_Fragment();
      replace_fragment.replacementFragment(new Fragment_home(),true);*/
      replacementFragment(new Fragment_home(),true);
      Toast.makeText(getContext(),"Login Successfully",Toast.LENGTH_LONG).show();

    }
    else {
      Toast.makeText(getContext(),"Error Login",Toast.LENGTH_LONG).show();


    }
  }

  @Override
  public void onClick(View view) {
    switch (view.getId())
    {
      case R.id.btn_login:
        userLogin();
        break;
    }
  }
  public void replacementFragment(Fragment fragment, boolean addToBack)
  {
    FragmentManager fm = getFragmentManager();
    FragmentTransaction ft = fm.beginTransaction();
    ft.replace(R.id.main_Container,fragment,fragment.getClass().getName());
    if (addToBack)
      ft.commit();

  }
}
