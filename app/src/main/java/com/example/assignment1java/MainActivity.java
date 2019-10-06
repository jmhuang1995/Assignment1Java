package com.example.assignment1java;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridLayout;
import android.widget.HorizontalScrollView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        HorizontalScrollView hs = new HorizontalScrollView(this);
        HorizontalScrollView.LayoutParams cParamas = new HorizontalScrollView.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT);
        hs.setLayoutParams(cParamas);

        GridLayout gv = new GridLayout(this);
        gv.setRowCount(12);
        gv.setColumnCount(5);


        TextView tv;
        GridLayout.LayoutParams tPramas;

        tv = new TextView(this);
        tv.setText("Rule void Hello1(int hour)");
        tv.setBackgroundColor(Color.BLACK);
        tv.setTextColor(Color.WHITE);
        tv.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);
        tPramas = new GridLayout.LayoutParams(GridLayout.spec(0), GridLayout.spec(1,4));
        tPramas.setGravity(Gravity.FILL);
        tv.setLayoutParams(tPramas);
        gv.addView(tv);

        tv = new TextView(this);
        tv.setText("properties");
        tv.setPadding((int) (getResources().getDisplayMetrics().density * 16 + 0.5f),0,(int)(getResources().getDisplayMetrics().density * 16 + 0.5f),0);
        tPramas = new GridLayout.LayoutParams(GridLayout.spec(1,2),GridLayout.spec(1));
        tPramas.setGravity(Gravity.CENTER);
        gv.addView(tv);

        tv = new TextView(this);
        tv.setText("name");
        tPramas = new GridLayout.LayoutParams(GridLayout.spec(1),GridLayout.spec(2,2));
        tPramas.setGravity(Gravity.CENTER);
        gv.addView(tv);

        tv = new TextView(this);
        tv.setText("category");
        tPramas = new GridLayout.LayoutParams(GridLayout.spec(2),GridLayout.spec(2,2));
        tPramas.setGravity(Gravity.CENTER);
        gv.addView(tv);

        tv = new TextView(this);
        tv.setText("Day Hour Classfication");
        tPramas = new GridLayout.LayoutParams(GridLayout.spec(1), GridLayout.spec(4));
        tPramas.setGravity(Gravity.LEFT);
        tv.setLayoutParams(tPramas);
        gv.addView(tv);

        tv = new TextView(this);
        tv.setText("Day and Time");
        tPramas = new GridLayout.LayoutParams(GridLayout.spec(2),GridLayout.spec(4));
        tPramas.setGravity(Gravity.LEFT);
        tv.setLayoutParams(tPramas);
        gv.addView(tv);

        tv = new TextView(this);
        tv.setText("Rule");
        tv.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);
        tv.setTypeface(Typeface.DEFAULT_BOLD);
        tPramas = new GridLayout.LayoutParams(GridLayout.spec(3),GridLayout.spec(1));
        tPramas.setGravity(Gravity.FILL);
        int lightblue = Color.parseColor("#00FFFF");
        tv.setBackgroundColor(lightblue);
        tv.setLayoutParams(tPramas);
        gv.addView(tv);

        tv = new TextView(this);
        tv.setText("C1");
        tv.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);
        tv.setTypeface(Typeface.DEFAULT_BOLD);
        tPramas = new GridLayout.LayoutParams(GridLayout.spec(3), GridLayout.spec(2,2));
        tPramas.setGravity(Gravity.FILL);
        tv.setBackgroundColor(lightblue);
        tv.setLayoutParams(tPramas);
        gv.addView(tv);

        tv = new TextView(this);
        tv.setText("A1");
        tv.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);
        tv.setTypeface(Typeface.DEFAULT_BOLD);
        tPramas = new GridLayout.LayoutParams(GridLayout.spec(3), GridLayout.spec(4));
        tPramas.setGravity(Gravity.FILL);
        tv.setBackgroundColor(lightblue);
        tv.setLayoutParams(tPramas);
        gv.addView(tv);

        tv = new TextView(this);
        tPramas = new GridLayout.LayoutParams(GridLayout.spec(4),GridLayout.spec(1));
        tPramas.setGravity(Gravity.FILL);
        tv.setBackgroundColor(lightblue);
        tv.setLayoutParams(tPramas);
        gv.addView(tv);

        tv = new TextView(this);
        tv.setText("min <= hour && hour <= max");
        tPramas.setGravity(Gravity.FILL);
        tPramas = new GridLayout.LayoutParams(GridLayout.spec(4),GridLayout.spec(2,2));
        tv.setBackgroundColor(lightblue);
        tv.setLayoutParams(tPramas);
        gv.addView(tv);

        tv = new TextView(this);
        tv.setText("System.out.println(greeting + \", World!\")");
        tv.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);
        tPramas = new GridLayout.LayoutParams(GridLayout.spec(4),GridLayout.spec(4));
        tPramas.setGravity(Gravity.FILL);
        tv.setBackgroundColor(lightblue);
        tv.setLayoutParams(tPramas);
        gv.addView(tv);

        tv = new TextView(this);
        tPramas = new GridLayout.LayoutParams(GridLayout.spec(5),GridLayout.spec(1));
        tPramas.setGravity(Gravity.FILL);
        tv.setBackgroundColor(lightblue);
        tv.setLayoutParams(tPramas);
        gv.addView(tv);

        tv = new TextView(this);
        tv.setText("int min");
        tPramas = new GridLayout.LayoutParams(GridLayout.spec(5),GridLayout.spec(2));
        tv.setPadding((int)(getResources().getDisplayMetrics().density * 23 + 05f),0,(int)(getResources().getDisplayMetrics().density * 23 + 0.5f),0);
        tv.setBackgroundColor(lightblue);
        tv.setLayoutParams(tPramas);
        gv.addView(tv);

        tv = new TextView(this);
        tv.setText("int max");
        tPramas = new GridLayout.LayoutParams(GridLayout.spec(5),GridLayout.spec(3));
        tv.setPadding((int)(getResources().getDisplayMetrics().density * 23 + 05f),0,(int)(getResources().getDisplayMetrics().density * 23 + 0.5f),0);
        tv.setBackgroundColor(lightblue);
        tv.setLayoutParams(tPramas);
        gv.addView(tv);

        tv = new TextView(this);
        tv.setText("String greeting");
        tv.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);
        tPramas = new GridLayout.LayoutParams(GridLayout.spec(5),GridLayout.spec(4));
        tPramas.setGravity(Gravity.FILL);
        tv.setBackgroundColor(lightblue);
        tv.setLayoutParams(tPramas);
        gv.addView(tv);

        tv = new TextView(this);
        tv.setText("Rule");
        tv.setTypeface(Typeface.DEFAULT_BOLD);
        tPramas = new GridLayout.LayoutParams(GridLayout.spec(6),GridLayout.spec(1));
        tv.setLayoutParams(tPramas);
        gv.addView(tv);

        tv = new TextView(this);
        tv.setText("From");
        tv.setTypeface(Typeface.DEFAULT_BOLD);
        tPramas = new GridLayout.LayoutParams(GridLayout.spec(6),GridLayout.spec(2));
        tPramas.setGravity(Gravity.FILL);
        int lightyellow = Color.parseColor("#FFFFC2");
        tv.setBackgroundColor(lightyellow);
        tv.setLayoutParams(tPramas);
        gv.addView(tv);

        tv  = new TextView(this);
        tv.setText("To");
        tv.setTypeface(Typeface.DEFAULT_BOLD);
        tPramas = new GridLayout.LayoutParams(GridLayout.spec(6),GridLayout.spec(3));
        tPramas.setGravity(Gravity.FILL);
        tv.setBackgroundColor(lightyellow);
        tv.setLayoutParams(tPramas);
        gv.addView(tv);

        tv = new TextView(this);
        tv.setText("Greeting");
        tv.setTypeface(Typeface.DEFAULT_BOLD);
        tPramas = new GridLayout.LayoutParams(GridLayout.spec(6),GridLayout.spec(4));
        tPramas.setGravity(Gravity.FILL);
        int lightorange = Color.parseColor("#FF7F50");
        tv.setBackgroundColor(lightorange);
        tv.setLayoutParams(tPramas);
        gv.addView(tv);

        tv = new TextView(this);
        tv.setText("R10");
        tPramas = new GridLayout.LayoutParams(GridLayout.spec(7),GridLayout.spec(1));
        tv.setLayoutParams(tPramas);
        gv.addView(tv);

        tv = new TextView(this);
        tv.setText("0");
        tv.setGravity(Gravity.RIGHT);
        tPramas = new GridLayout.LayoutParams(GridLayout.spec(7), GridLayout.spec(2));
        tPramas.setGravity(Gravity.FILL);
        tv.setBackgroundColor(lightyellow);
        tv.setLayoutParams(tPramas);
        gv.addView(tv);

        tv = new TextView(this);
        tv.setText("11");
        tv.setGravity(Gravity.RIGHT);
        tPramas = new GridLayout.LayoutParams(GridLayout.spec(7),GridLayout.spec(3));
        tPramas.setGravity(Gravity.FILL);
        tv.setBackgroundColor(lightyellow);
        tv.setLayoutParams(tPramas);
        gv.addView(tv);

        tv = new TextView(this);
        tv.setText("Good Morning");
        tPramas = new GridLayout.LayoutParams(GridLayout.spec(7),GridLayout.spec(4));
        tPramas.setGravity(Gravity.FILL);
        tv.setBackgroundColor(lightorange);
        tv.setLayoutParams(tPramas);
        gv.addView(tv);

        tv = new TextView(this);
        tv.setText("R20");
        tPramas = new GridLayout.LayoutParams(GridLayout.spec(8),GridLayout.spec(1));
        tv.setLayoutParams(tPramas);
        gv.addView(tv);

        tv = new TextView(this);
        tv.setText("12");
        tPramas = new GridLayout.LayoutParams(GridLayout.spec(8), GridLayout.spec(2));
        tPramas.setGravity(Gravity.FILL);
        tv.setBackgroundColor(lightyellow);
        tv.setLayoutParams(tPramas);
        gv.addView(tv);

        tv = new TextView(this);
        tv.setText("17");
        tPramas = new GridLayout.LayoutParams(GridLayout.spec(8),GridLayout.spec(3));
        tPramas.setGravity(Gravity.FILL);
        tv.setBackgroundColor(lightyellow);
        tv.setLayoutParams(tPramas);
        gv.addView(tv);

        tv = new TextView(this);
        tv.setText("Good Afternoon");
        tPramas = new GridLayout.LayoutParams(GridLayout.spec(8),GridLayout.spec(4));
        tPramas.setGravity(Gravity.FILL);
        tv.setBackgroundColor(lightorange);
        tv.setLayoutParams(tPramas);
        gv.addView(tv);

        tv = new TextView(this);
        tv.setText("R30");
        tPramas = new GridLayout.LayoutParams(GridLayout.spec(9), GridLayout.spec(1));
        tv.setLayoutParams(tPramas);
        gv.addView(tv);

        tv = new TextView(this);
        tv.setText("18");
        tv.setGravity(Gravity.RIGHT);
        tPramas = new GridLayout.LayoutParams(GridLayout.spec(9),GridLayout.spec(2));
        tPramas .setGravity(Gravity.FILL);
        tv.setBackgroundColor(lightyellow);
        tv.setLayoutParams(tPramas);
        gv.addView(tv);

        tv = new TextView(this);
        tv.setText("21");
        tv.setGravity(Gravity.RIGHT);
        tPramas = new GridLayout.LayoutParams(GridLayout.spec(9),GridLayout.spec(3));
        tPramas.setGravity(Gravity.FILL);
        tv.setBackgroundColor(lightyellow);
        tv.setLayoutParams(tPramas);
        gv.addView(tv);

        tv = new TextView(this);
        tv.setText("Good Evening");
        tPramas = new GridLayout.LayoutParams(GridLayout.spec(9),GridLayout.spec(4));
        tPramas.setGravity(Gravity.FILL);
        tv.setBackgroundColor(lightorange);
        tv.setLayoutParams(tPramas);
        gv.addView(tv);

        tv = new TextView(this);
        tv.setText("R40");
        tPramas = new GridLayout.LayoutParams(GridLayout.spec(10),GridLayout.spec(1));
        tv.setLayoutParams(tPramas);
        gv.addView(tv);

        tv = new TextView(this);
        tv.setText("22");
        tv.setGravity(Gravity.RIGHT);
        tPramas = new GridLayout.LayoutParams(GridLayout.spec(10),GridLayout.spec(2));
        tPramas.setGravity(Gravity.FILL);
        tv.setBackgroundColor(lightyellow);
        tv.setLayoutParams(tPramas);
        gv.addView(tv);

        tv = new TextView(this);
        tv.setText("23");
        tv.setGravity(Gravity.RIGHT);
        tPramas = new GridLayout.LayoutParams(GridLayout.spec(10),GridLayout.spec(3));
        tPramas.setGravity(Gravity.FILL);
        tv.setBackgroundColor(lightyellow);
        tv.setLayoutParams(tPramas);
        gv.addView(tv);

        tv = new TextView(this);
        tv.setText("Good Night");
        tPramas = new GridLayout.LayoutParams(GridLayout.spec(10),GridLayout.spec(4));
        tPramas.setGravity(Gravity.FILL);
        tv.setBackgroundColor(lightorange);
        tv.setLayoutParams(tPramas);
        gv.addView(tv);

        hs.addView(gv);
        setContentView(hs);
    }
}

