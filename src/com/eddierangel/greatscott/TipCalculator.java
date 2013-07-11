package com.eddierangel.greatscott;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.EditText;
import android.widget.SeekBar;
import android.widget.SeekBar.OnSeekBarChangeListener;
import android.widget.TextView;

public class TipCalculator extends Activity {
	
	private static final String BILL_TOTAL = "BILL_TOTAL";
	private static final String CUSTOM_PERCENT = "CUSTOM_PERCENT";
	
	private double currentBillTotal;
	private int currentCustomPercent;
	private EditText tipTenEditText;
	private EditText totalTenEditText;
	private EditText tipFifteenEditText;
	private EditText totalFifteenEditText;
	private EditText tipTwentyEditText;
	private EditText totalTwentyEditText;
	private TextView customTipTextView;
	private EditText tipCustomEditText;
	private EditText totalCustomEditText;
	private EditText billEditText;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		
		if(savedInstanceState == null)
		{
			currentBillTotal = 0.0;
			currentCustomPercent = 18;
		}
		else
		{
			currentBillTotal = savedInstanceState.getDouble(BILL_TOTAL);
			currentCustomPercent = savedInstanceState.getInt(CUSTOM_PERCENT);
		}
		
		tipTenEditText = (EditText) findViewById(R.id.tipTenEditText);
		totalTenEditText = (EditText) findViewById(R.id.totalTenEditText);
		tipFifteenEditText = (EditText) findViewById(R.id.tipFifteenEditText);
		totalFifteenEditText = (EditText) findViewById(R.id.totalFifteenEditText);
		
		tipTwentyEditText = (EditText) findViewById(R.id.tipTwentyEditText);
		totalTwentyEditText = (EditText) findViewById(R.id.totalTwentyEditText);
		
		customTipTextView = (TextView) findViewById(R.id.customTipTextView);
		
		tipCustomEditText = (EditText) findViewById(R.id.tipCustomEditText);
		totalCustomEditText = (EditText) findViewById(R.id.totalCustomEditText);
		
		billEditText = (EditText) findViewById(R.id.billEditText);
		SeekBar customSeekBar = (SeekBar) findViewById(R.id.customSeekBar);		
		
		customSeekBar.setOnSeekBarChangeListener(customSeekBarChangeListener);
		
		
			
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	
	//TODO
	private OnSeekBarChangeListener customSeekBarChangeListener;

	

	
	

}
