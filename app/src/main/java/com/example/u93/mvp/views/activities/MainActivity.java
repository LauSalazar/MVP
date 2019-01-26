package com.example.u93.mvp.views.activities;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.example.u93.mvp.R;
import com.example.u93.mvp.presenters.MainPresenter;
import com.example.u93.mvp.views.interfaces.IMainView;

public class MainActivity extends BaseActivity<MainPresenter> implements IMainView {

    private EditText etNumber;
    private EditText etNumber2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setComponents();

        setPresenter(new MainPresenter());
        getPresenter().inject(this, getValidateInternet());

    }

    private void setComponents() {

        etNumber = findViewById(R.id.etNumber);
        etNumber2 = findViewById(R.id.etNumber2);
    }

    public void clickCalcular(View view) {
        /*int suma = getPresenter().calcularSuma(Integer.parseInt(etNumber.getText().toString()),
                Integer.parseInt(etNumber2.getText().toString()));
        Toast.makeText(this,"Resultado"+suma, Toast.LENGTH_SHORT);*/

        /*getPresenter().calculate(Integer.parseInt(etNumber.getText().toString()),
                Integer.parseInt(etNumber2.getText().toString()));*/

        getPresenter().calcular(Integer.parseInt(etNumber.getText().toString()),
                Integer.parseInt(etNumber2.getText().toString()));
    }

    @Override
    public void showResult(int result) {
        Toast.makeText(this,"Resultado "+result, Toast.LENGTH_SHORT).show();
    }


}
