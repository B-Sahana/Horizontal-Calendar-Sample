package com.sahana.HorizontalCalendarExample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import com.sahana.horizontalcalendarview.CustomHorizontalCalendar;
import com.sahana.horizontalcalendarview.OnHorizontalDateSelectListener;
import com.sahana.horizontalcalendarview.model.DateModel;


public class MainActivity extends AppCompatActivity {
    private CustomHorizontalCalendar mCustomHorizontalCalendar;
    private TextView mDateTextView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mCustomHorizontalCalendar = findViewById(R.id.customHorizontal);
        mDateTextView = findViewById(R.id.dateTextView);
        mCustomHorizontalCalendar.setOnDateSelectListener(new OnHorizontalDateSelectListener() {
            @Override
            public void onDateClick(DateModel dateModel) {
                Log.d("date", dateModel != null ? dateModel.month + dateModel.day + dateModel.dayOfWeek + dateModel.year : "");
                mDateTextView.setText(dateModel != null ? dateModel.day + " " + dateModel.dayOfWeek + " " + dateModel.month + "," + dateModel.year : "");
            }
        });

    }
}
