package com.example.my_java_framwork_atique_hossain.validation;

import android.content.Context;
import android.widget.Toast;

import java.util.HashMap;

public class Validation {
    Context context;

    //login Validation

    public boolean loginvalidation(String username,String password){
        boolean flag=true;


    if(username.toString().isEmpty()){

        flag=false;

        }
        if(password.toString().isEmpty()){

            flag=false;

        }
        if(username.length()<2){
            Toast.makeText( context,"Username must be more then two characters", Toast.LENGTH_SHORT).show();
            flag=false;

        }
        if(password.length()<2){
            Toast.makeText( context,"Password must be more then two characters", Toast.LENGTH_SHORT).show();
            flag=false;

        }
        return flag;

    }

}
