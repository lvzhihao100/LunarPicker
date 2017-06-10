package com.eqdd.lunarpicker;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.LinearLayout;

import com.eqdd.lunarView.TimePickerView;

import java.util.Calendar;
import java.util.Date;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        View tv = findViewById(R.id.tv_content);
        final LinearLayout ll = (LinearLayout) findViewById(R.id.ll_root);
        tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TimePickerView timePickerView = new TimePickerView(MainActivity.this, TimePickerView.Type.YEAR_MONTH_DAY,ll);
                timePickerView.setLunarCalendar(true);
                Calendar calendar = Calendar.getInstance();
                calendar.setTime(new Date());
                timePickerView.setRange(1900, calendar.get(Calendar.YEAR));
                timePickerView.setTime(new Date());
            }
        });
    }
}
