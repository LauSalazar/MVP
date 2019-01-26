package com.example.u93.mvp.presenters;

import com.example.u93.mvp.views.interfaces.IMainView;

public class MainPresenter extends BasePresenter<IMainView> {
    public int calcularSuma(int i, int i1) {
        return i+i1;
    }

    public void calculate(int i, int i1) {
        getView().showResult(i+i1);

    }

    public void calcular(int i, int i1) {
        getView().showResultBase(i+i1);

    }
}
