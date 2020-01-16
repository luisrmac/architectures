package com.example.architectures;

import com.example.architectures.model.Operation;
import com.example.architectures.pd.Calculator;
import com.example.architectures.pd.IntegerCalculator;

public class HomePresenter implements HomeContract.Presenter<Integer> {

    private HomeContract.View homeView;
    private Calculator<Integer> calculator;

    public HomePresenter(HomeContract.View homeView) {
        this.homeView = homeView;
        calculator = new IntegerCalculator();
    }

    @Override
    public void performOperation(Operation operation, Integer arg1, Integer arg2) {
        switch (operation) {
            case ADD:
                homeView.showResult(calculator.add(arg1, arg2), operation);
                break;
            case SUBTRACT:
                homeView.showResult(calculator.subtract(arg1, arg2), operation);
                break;
            case MULTIPLY:
                homeView.showResult(calculator.multiply(arg1, arg2), operation);
                break;
            case DIVIDE:
                try {
                    homeView.showResult(calculator.divide(arg1, arg2), operation);
                } catch (IllegalArgumentException ie) {
                    homeView.showError(ie.getMessage());
                }
                break;
        }
    }

    @Override
    public void tearDown() {
        if(homeView != null) {
            homeView = null;
        }
    }

}
