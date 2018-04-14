package com.example.pankaj.testthemes;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    static boolean theme1 = true;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void changeMyTheme(View view) {
//        setTheme(R.style.MyTheme2);


        if(theme1) {
            setTheme(R.style.MyTheme_Orange_Small);
            theme1 = false;
        }
        else {
            setTheme(R.style.MyTheme_Orange_Large);
            theme1 = true;
        }

        setContentView(R.layout.activity_main);

    }
}
