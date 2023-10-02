package com.example.testfragment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button acsbtn = findViewById(R.id.ACS);
        acsbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ACSFragment acsfrag = ACSFragment.newInstance("name","name");
                FragmentManager fragmgr = getSupportFragmentManager();
                FragmentTransaction fragtransrit = fragmgr.beginTransaction();
                fragtransrit = fragtransrit.replace(R.id.fragmentContainerView2,acsfrag);
                fragtransrit.addToBackStack("name");
                fragtransrit.commit();
            }
        });
        Button isbtn = findViewById(R.id.IS);
        isbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ACSFragment isfrag = ACSFragment.newInstance("name","name");
                FragmentManager fragmgr = getSupportFragmentManager();
                FragmentTransaction fragtransrit = fragmgr.beginTransaction();
                fragtransrit = fragtransrit.replace(R.id.fragmentContainerView2,isfrag);
                fragtransrit.addToBackStack("name");
                fragtransrit.commit();
            }
        });
        Button dsbtn = findViewById(R.id.DS);
        dsbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ACSFragment dsfrag = ACSFragment.newInstance("name","name");
                FragmentManager fragmgr = getSupportFragmentManager();
                FragmentTransaction fragtransrit = fragmgr.beginTransaction();
                fragtransrit = fragtransrit.replace(R.id.fragmentContainerView2,dsfrag);
                fragtransrit.addToBackStack("name");
                fragtransrit.commit();
            }
        });

    }
}