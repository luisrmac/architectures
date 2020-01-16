package com.example.architectures.pd;

public interface Calculator<T> {

    T add(T arg1, T arg2);

    T subtract(T arg1, T arg2);

    T divide(T arg1, T arg2) throws IllegalArgumentException;

    T multiply(T arg1, T arg2);

}
