package com.example.u93.mvp.presenters;

import com.example.u93.mvp.views.interfaces.IEdadView;

public class EdadPresenter extends BasePresenter<IEdadView> {
    public void calcularEdad(int ahora, int nacimiento) {
        getView().showResult(ahora-nacimiento);
    }
}
