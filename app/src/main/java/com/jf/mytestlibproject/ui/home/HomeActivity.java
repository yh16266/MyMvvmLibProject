package com.jf.mytestlibproject.ui.home;

import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.support.v4.widget.SimpleCursorAdapter;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.jf.mytestlibproject.R;
import com.jf.mytestlibproject.databinding.HomeActivityBinding;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.home_activity);
        HomeActivityBinding binding =  DataBindingUtil.setContentView(this,R.layout.home_activity);
        HomeVM viewMode = new HomeVM();
        viewMode.setTitle("测试！！");
        binding.setVm(viewMode);
    }
}
