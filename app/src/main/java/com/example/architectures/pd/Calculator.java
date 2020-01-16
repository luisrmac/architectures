package com.example.architectures.pd;

import com.example.architectures.model.Result;

public interface Calculator<T> {

    Result<T> add(T arg1, T arg2);

    Result<T> subtract(T arg1, T arg2);

    Result<T> divide(T arg1, T arg2) throws IllegalArgumentException;

    Result<T> multiply(T arg1, T arg2);

}
