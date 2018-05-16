package com.example.admin.fragment1;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Switch;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btn1,btn2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1 = findViewById(R.id.button1);
        btn2 = findViewById(R.id.button2);


        FragmentManager fragmentManager = getFragmentManager();
        final FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();


    }

    public void AddFragment(View view){

        FragmentManager fragmentManager = getFragmentManager();
        FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();

        //khai bao doi tuong fragment rong
        Fragment fragment = null;

        switch (view.getId()){
            case (R.id.button1):

                //tao doi tuong fragment1
                fragment = new Fragment1();

                break;

            case (R.id.button2):

                //tao doi tuong fragment2
                fragment = new Fragment2();

                break;
        }


        fragmentTransaction.replace(R.id.frame, fragment);

        //xac nhan fragment dc them vao
        fragmentTransaction.commit();

    }


}


