package com.example.architectures.pd;

import com.example.architectures.model.Result;

public class IntegerCalculator implements Calculator<Integer> {
    private Result<Integer> result = new Result<>();

    @Override
    public Result<Integer> add(Integer arg1, Integer arg2) {
        result.setResult(arg1+arg2);
        return result;
    }

    @Override
    public Result subtract(Integer arg1, Integer arg2) {
        result.setResult(arg1 - arg2);
        return result;
    }

    @Override
    public Result divide(Integer arg1, Integer arg2) {
        if(arg2 == 0) {
            throw new IllegalArgumentException("Cannot divide by zero");
        }
        result.setResult(arg1 / arg2);
        return result;
    }

    @Override
    public Result multiply(Integer arg1, Integer arg2) {
        result.setResult(arg1*arg2);
        return result;
    }

}
