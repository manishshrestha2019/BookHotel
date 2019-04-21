package com.example.bookhotel;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity  implements View.OnClickListener  {
    private Button btnSignup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        btnSignup= findViewById(R.id.btnSignup);

        btnSignup.setOnClickListener(this);
    }

    @Override
    public void onClick(View v){
        setContentView(R.layout.activity_signup);
    }
}
