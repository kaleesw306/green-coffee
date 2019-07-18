package com.example.myapplication;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class aboutmeclass extends AppCompatActivity {
    TextView r;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.aboutlayout);
        r=(TextView)findViewById(R.id.appCompatTextView);
        r.setText("This is  KALEESWARAN.D"+
        "\nIm am a Creator of this APP."+
                "Share more of your friends and releatives that one is i want from you."+
                "Please keep Supprt And ENCOURAGE me." +
               " \n\n\n\nGITHUB-"+
                "\nINSTAGRAM-"
        +"\nEMAIL-kaleesw306@gmail.com");
    }
}
