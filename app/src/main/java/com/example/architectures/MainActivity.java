package com.example.architectures;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.architectures.model.Operation;
import com.example.architectures.model.Result;
import com.example.architectures.pd.Calculator;
import com.example.architectures.pd.IntegerCalculator;

public class MainActivity extends AppCompatActivity
        implements View.OnClickListener {

    private Calculator<Integer> calculator;

    private EditText arg1ET;
    private EditText arg2ET;

    private TextView resultTV;

    private Button addBt;
    private Button subtractBt;
    private Button multiplyBt;
    private Button divideBt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
        calculator = new IntegerCalculator();
    }

    private void initViews() {
        arg1ET = findViewById(R.id.arg1ET);
        arg2ET = findViewById(R.id.arg2ET);
        resultTV = findViewById(R.id.resultTV);
        addBt = findViewById(R.id.addBT);
        addBt.setOnClickListener(this);
        subtractBt = findViewById(R.id.subtractBT);
        subtractBt.setOnClickListener(this);
        divideBt = findViewById(R.id.divideBT);
        divideBt.setOnClickListener(this);
        multiplyBt = findViewById(R.id.multiplyBT);
        multiplyBt.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.addBT:
                processOperation(Operation.ADD);
                break;
            case R.id.subtractBT:
                processOperation(Operation.SUBTRACT);
                break;
            case R.id.multiplyBT:
                processOperation(Operation.MULTIPLY);
                break;
            case R.id.divideBT:
                processOperation(Operation.DIVIDE);
                break;
        }
    }

    private void processOperation(Operation operation) {
        int arg1 = Integer.parseInt(arg1ET.getText().toString());
        int arg2 = Integer.parseInt(arg2ET.getText().toString());

        Result result = null;

        switch (operation) {
            case ADD:
                result = calculator.add(arg1, arg2);
                break;
            case SUBTRACT:
                result = calculator.subtract(arg1, arg2);
                break;
            case MULTIPLY:
                result = calculator.multiply(arg1, arg2);
                break;
            case DIVIDE:
                try {
                    result = calculator.divide(arg1, arg2);
                } catch (IllegalArgumentException ie) {
                    resultTV.setText(ie.getMessage());
                }
                break;
        }

        if (result != null) {
            resultTV.setText(result.resultToString(operation));
        }
    }

}
