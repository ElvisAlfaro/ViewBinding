package com.example.viewbinding;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.example.viewbinding.databinding.ActivityMainJavaBinding;

public class MainActivityJava extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMainJavaBinding javaBinding = ActivityMainJavaBinding.inflate(getLayoutInflater());
        setContentView(javaBinding.getRoot());

        javaBinding.btnClickmeJava.setOnClickListener(v-> {
            javaBinding.tvMainTextJava.setText("View Binding Java");
            javaBinding.tvMessageJava.setText("Ejemplo de VB");
        });
    }
}