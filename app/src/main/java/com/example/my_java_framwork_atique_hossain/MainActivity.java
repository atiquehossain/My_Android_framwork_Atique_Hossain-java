package com.example.my_java_framwork_atique_hossain;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.my_java_framwork_atique_hossain.validation.Validation;

public class MainActivity extends AppCompatActivity {

    EditText n,p;
    String na,pa;
    Validation validation=new Validation();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        n= (EditText)findViewById(R.id.emailname);
        p=  (EditText)findViewById(R.id.password);


        na=n.getText().toString();
        pa=p.getText().toString();
        Log.d("Atique", "onCreate: "+pa+ " "+na );


    }



    public void login(View view) {
        Log.d("Atique", "onCreate: "+pa+ " "+na );
        if(!validation.loginvalidation(pa,na)){
            Toast.makeText(MainActivity.this, "success", Toast.LENGTH_SHORT).show();
        }
        else {
            Toast.makeText(MainActivity.this, "Failed", Toast.LENGTH_SHORT).show();
        }
    }
}