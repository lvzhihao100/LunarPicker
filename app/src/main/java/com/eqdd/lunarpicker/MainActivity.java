package com.eqdd.lunarpicker;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.bigkoo.pickerview.TimePickerView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        View tv = findViewById(R.id.tv_content);
        tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TimePickerView timePickerView = new TimePickerView(MainActivity.this, TimePickerView.Type.YEAR_MONTH_DAY);
                timePickerView.setLunarCalendar(true);
                timePickerView.show();
            }
        });
    }
}
