package com.example.shaloin.sixthassignmentb;

import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements ListFragment.OnItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void onRssItemSelected(String link) {

        FragmentManager manager=getSupportFragmentManager();
        FragmentTransaction transaction= manager.beginTransaction();

        Layout1 layout1;
        Layout2 layout2;
        Layout3 layout3;
        Layout4 layout4;

        if(link.equals("layout1")){
            layout1=new Layout1();
            transaction.replace(R.id.fragment2,layout1);
            transaction.commit();
        }else if(link.equals("layout 2")){
            layout2=new Layout2();
            transaction.replace(R.id.fragment2,layout2);
            transaction.commit();
        }else if(link.equals("layout 3")){
            layout3=new Layout3();
            transaction.replace(R.id.fragment2,layout3);
            transaction.commit();
        }else if(link.equals("layout 4")){
            layout4=new Layout4();
            transaction.replace(R.id.fragment2,layout4);
            transaction.commit();
        }




    }
}
