package com.example.architectures.pd;

public class IntegerCalculator implements Calculator<Integer> {

    @Override
    public Integer add(Integer arg1, Integer arg2) {
        return arg1 + arg2;
    }

    @Override
    public Integer subtract(Integer arg1, Integer arg2) {
        return arg1 - arg2;
    }

    @Override
    public Integer divide(Integer arg1, Integer arg2) {
        if(arg2 == 0) {
            throw new IllegalArgumentException("Cannot divide by zero");
        }
        return arg1 / arg2;
    }

    @Override
    public Integer multiply(Integer arg1, Integer arg2) {
        return arg1 * arg2;
    }

}
