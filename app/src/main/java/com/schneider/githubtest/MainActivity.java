package com.schneider.githubtest;

import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;


import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       
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

    public static String getFormattedDate(String date){
        try {
            SimpleDateFormat sdfdate = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.getDefault());
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(sdfdate.parse(date));
            SimpleDateFormat sdf = new SimpleDateFormat("dd MMM yyyy", Locale.getDefault());
            String formattedDate = sdf.format(calendar.getTime());
            return formattedDate;
        }
        catch (Exception ex){
            ex.printStackTrace();
            return "";
        }
    }
}
