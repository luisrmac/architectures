package com.example.architectures.model;

public class Result<T> {

    private T result;

    public Result() {
    }

    public Result(T result) {
        this.result = result;
    }

    public T getResult() {
        return result;
    }

    public void setResult(T result) {
        this.result = result;
    }

    public String resultToString(Operation operation) {
        switch (operation) {
            case ADD:
                return "Add operation result is " + result;
            case SUBTRACT:
                return "Subtract operation result is " + result;
            case MULTIPLY:
                return "Multiply operation result is " + result;
            case DIVIDE:
                return "Divide operation result is " + result;
            default:
                return "Result is " + result;
        }
    }
}
