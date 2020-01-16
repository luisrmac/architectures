package com.example.architectures;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.architectures.pd.Calculator;
import com.example.architectures.pd.IntegerCalculator;

public class MainActivity extends AppCompatActivity
        implements View.OnClickListener {

    private Calculator calculator;

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
                performAdd();
                break;
            case R.id.subtractBT:
                performSubtract();
                break;
            case R.id.multiplyBT:
                performMultiply();
                break;
            case R.id.divideBT:
                performDivide();
                break;
        }
    }

    private void performDivide() {
        // TODO - Provide implementation performDivide
    }

    private void performMultiply() {
        // TODO - Provide implementation performMultiply
    }

    private void performSubtract() {
        // TODO - Provide implementation performSubtract
    }

    private void performAdd() {
        // TODO - Provide implementation performAdd
    }

}
