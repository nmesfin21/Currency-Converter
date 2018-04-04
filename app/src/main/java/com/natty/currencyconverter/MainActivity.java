package com.natty.currencyconverter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void convertCurrency(View view){
        EditText amountOFMoney = (EditText) findViewById(R.id.amoutText);
        double amountOFMoneyDouble = Double.parseDouble(amountOFMoney.getText().toString());
        
        EditText rate = (EditText) findViewById((R.id.rateText));
        double rateDouble = Double.parseDouble((rate.getText().toString()));
        
        double result = rateDouble * amountOFMoneyDouble;
        String resString = Double.toString(result);
        
        EditText convertionResult = (EditText) (findViewById(R.id.resultText));
        convertionResult.setText(resString);
        
        

    }
}
