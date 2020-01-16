package com.example.architectures;

import com.example.architectures.base.BasePresenter;
import com.example.architectures.model.Operation;
import com.example.architectures.model.Result;

public interface HomeContract {

    interface View {
        void showResult(Result result, Operation operation);
        void showError(String error);
    }

    interface Presenter<T> extends BasePresenter {
        void performOperation(Operation operation, T arg1, T arg2);
    }
}
