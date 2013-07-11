package com.eddierangel.greatscott;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.EditText;
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
	private EditText tipCustomeEditText;
	private EditText totalCustomEditText;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		
		if(savedInstanceState == null)
		{
			currentBillTotal = 0.0;
			currentCustomPercent = 18;
		}
			
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	

	
	

}
