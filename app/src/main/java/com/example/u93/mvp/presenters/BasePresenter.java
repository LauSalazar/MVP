package com.example.u93.mvp.presenters;

import com.example.u93.mvp.helper.ValidateInternet;
import com.example.u93.mvp.views.interfaces.IBaseView;

public class BasePresenter<T extends IBaseView> {

    private ValidateInternet validateInternet;
    private T view;

    public void inject(T view, ValidateInternet validateInternet) {
        this.validateInternet = validateInternet;
        this.view = view;
    }

    public ValidateInternet getValidateInternet() {
        return validateInternet;
    }

    public T getView() {
        return view;
    }

    public void showResultBase(int i) {
        getView().showResultBase(i);
    }
}
