package com.example.javieraltmann.loginapp;

import android.content.Context;
import android.content.Intent;

/**
 * Created by javier.altmann on 16/9/2017.
 */

public class Usuario {
    private String username;
    private String password;
    private Context context;


    public Usuario(String username, String password, Context context){
        this.username = username;
        this.password = password;
        this.context = context;
    }

    public Context getContext() {
        return context;
    }

    public String getPassword() {
        return password;
    }

    public String getUsername() {
        return username;
    }

    public void setContext(Context context) {
        this.context = context;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setUsername(String username) {
        this.username = username;
    }


    public void validarIngreso(String username, String password) {
        if (username.equals("javier.altmann") && password.equals("123")) {
            Intent intent = new Intent(context, PruebaActivity.class);
            context.startActivity(intent);
        }

    }



}
