package com.example.architectures.model;

public class Result {

    private int result = 0;

    public Result() {
    }

    public Result(int result) {
        this.result = result;
    }

    public int getResult() {
        return result;
    }

    public void setResult(int result) {
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
