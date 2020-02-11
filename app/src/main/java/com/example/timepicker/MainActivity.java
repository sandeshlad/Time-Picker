package com.example.timepicker;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.TimePicker;

public class MainActivity extends AppCompatActivity {

    TextView textView;
    TimePicker timePicker;
    Button button;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = (TextView) findViewById(R.id.textView);
        timePicker = (TimePicker) findViewById(R.id.timepicker);
        button = (Button) findViewById(R.id.button);

        timePicker.setIs24HourView(true);
        textView.setText(getCurrentTime());

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                textView.setText(getCurrentTime());
            }
        });


    }

    private String getCurrentTime() {
        String currentTime = "Current Time : " + timePicker.getCurrentHour()+":"+timePicker.getCurrentMinute();
        return currentTime;
    }
}
