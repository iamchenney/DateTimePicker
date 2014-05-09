package com.chenney.demo;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.List;

import android.app.Activity;
import android.app.Dialog;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

import com.amo.demo.R;
import com.chenney.demo.wheelview.NumericWheelAdapter;
import com.chenney.demo.wheelview.OnWheelChangedListener;
import com.chenney.demo.wheelview.WheelView;

public class MainActivity extends Activity {
	private Button btn;
	private Dialog dialog;
	private static int START_YEAR = 1990, END_YEAR = 2100;

	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		btn = (Button) findViewById(R.id.button1);
		btn.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
                showDateTime();
			}
		});
	}

    /**
     * @Description: TODO 弹出日期时间选择器
     */

    private void showDateTime(){
        DateTimeDialog dateTimeDialog = new DateTimeDialog(this);
        dateTimeDialog.init(null);
        dateTimeDialog.setOnDateTimeChanged(new DateTimeDialog.DateTimeChange() {
            @Override
            public void onDateTimeChange(String dateTime) {
                Toast.makeText(MainActivity.this,dateTime,Toast.LENGTH_LONG).show();
            }
        });
    }



}