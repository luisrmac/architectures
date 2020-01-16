package com.example.architectures;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.architectures.model.Operation;
import com.example.architectures.model.Result;

public class MainActivity extends AppCompatActivity implements HomeContract.View, View.OnClickListener {

    private HomeContract.Presenter<Integer> presenter;

    private EditText arg1ET;
    private EditText arg2ET;

    private TextView resultTV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
        presenter = new HomePresenter(this);
    }

    private void initViews() {
        arg1ET = findViewById(R.id.arg1ET);
        arg2ET = findViewById(R.id.arg2ET);
        resultTV = findViewById(R.id.resultTV);
        Button addBt = findViewById(R.id.addBT);
        addBt.setOnClickListener(this);
        Button subtractBt = findViewById(R.id.subtractBT);
        subtractBt.setOnClickListener(this);
        Button divideBt = findViewById(R.id.divideBT);
        divideBt.setOnClickListener(this);
        Button multiplyBt = findViewById(R.id.multiplyBT);
        multiplyBt.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.addBT:
                int arg1 = Integer.parseInt(arg1ET.getText().toString());
                int arg2 = Integer.parseInt(arg2ET.getText().toString());
                presenter.performOperation(Operation.ADD, arg1, arg2);
                break;
            case R.id.subtractBT:
                arg1 = Integer.parseInt(arg1ET.getText().toString());
                arg2 = Integer.parseInt(arg2ET.getText().toString());
                presenter.performOperation(Operation.SUBTRACT, arg1, arg2);
                break;
            case R.id.multiplyBT:
                arg1 = Integer.parseInt(arg1ET.getText().toString());
                arg2 = Integer.parseInt(arg2ET.getText().toString());
                presenter.performOperation(Operation.MULTIPLY, arg1, arg2);
                break;
            case R.id.divideBT:
                arg1 = Integer.parseInt(arg1ET.getText().toString());
                arg2 = Integer.parseInt(arg2ET.getText().toString());
                presenter.performOperation(Operation.DIVIDE, arg1, arg2);
                break;
        }
    }

    @Override
    public void showResult(Result result, Operation operation) {
        resultTV.setText(result.resultToString(operation));
    }

    @Override
    public void showError(String error) {
        resultTV.setText(error);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        presenter.tearDown();
        presenter = null;
    }
}
