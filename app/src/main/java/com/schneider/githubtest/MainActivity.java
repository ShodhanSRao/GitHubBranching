package com.schneider.githubtest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    int variable = 1;
    String variableForIndia = "variable for thailand";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(this,"This is an thailand build",Toast.LENGTH_SHORT)
                .show();
    }
}
