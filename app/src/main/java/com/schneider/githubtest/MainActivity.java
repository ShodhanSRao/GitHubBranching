package com.schneider.githubtest;

import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import java.util.Locale;

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

    public  Locale getCurrentLocale() {
        Locale locale = null;
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
            locale = this.getResources().getConfiguration().getLocales().get(0);
        } else {
            locale = this.getResources().getConfiguration().locale;
        }
        return locale;
    }
}
