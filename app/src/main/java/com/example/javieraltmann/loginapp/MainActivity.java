package com.example.javieraltmann.loginapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_activity);

        final EditText txtusuario = (EditText)findViewById(R.id.usuario);
        final  EditText txtcontraseña = (EditText)findViewById(R.id.contraseña);
        Button boton = (Button)findViewById(R.id.ingresar);


        boton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String usuario = txtusuario.getText().toString();
                String contraseña = txtcontraseña.getText().toString();

                Usuario user = new Usuario(usuario,contraseña,MainActivity.this);
                user.validarIngreso(usuario,contraseña);


            }

        });
    }
}
