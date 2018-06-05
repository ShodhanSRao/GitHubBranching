package com.schneider.githubtest;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public static void setFontForEditables(View parent, String inFontPath) {
        for (int i = ((ViewGroup)parent).getChildCount() - 1; i >= 0; i--) {
            final View child = ((ViewGroup)parent).getChildAt(i);
            if (child instanceof ViewGroup) {
                setFontForEditables((ViewGroup) child,inFontPath);
            } else if (child instanceof TextView) {
               // ((TextView) child).setTypeface(getFont(inFontPath));
            }
            else if (child instanceof EditText) {
             //   ((EditText) child).setTypeface(getFont(inFontPath));
            }
        }
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
