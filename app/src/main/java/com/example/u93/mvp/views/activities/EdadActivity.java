package com.example.u93.mvp.views.activities;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.example.u93.mvp.R;
import com.example.u93.mvp.presenters.EdadPresenter;
import com.example.u93.mvp.views.interfaces.IEdadView;

public class EdadActivity extends BaseActivity<EdadPresenter> implements IEdadView {

    private EditText etAhora;
    private EditText etNacimiento;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edad);

        setComponents();

        setPresenter(new EdadPresenter());
        getPresenter().inject(this, getValidateInternet());
    }

    private void setComponents() {
        etAhora = findViewById(R.id.etAhora);
        etNacimiento = findViewById(R.id.etNacimiento);
    }

    public void clickCalcularEdad(View view) {
        int ahora = Integer.parseInt(etAhora.getText().toString().trim());
        int nacimiento = Integer.parseInt(etNacimiento.getText().toString().trim());

        if (nacimiento>ahora){

        }else{
            getPresenter().calcularEdad(ahora, nacimiento);
        }
    }

    @Override
    public void showResult(int edad) {
        Toast.makeText(this,"Tu edad: "+edad, Toast.LENGTH_SHORT).show();
    }
}
