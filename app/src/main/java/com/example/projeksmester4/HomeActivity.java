package com.example.projeksmester4;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class HomeActivity extends AppCompatActivity implements View.OnClickListener{
    private SessionHandler session;
    private CardView transaksiku;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        transaksiku = (CardView) findViewById(R.id.pinjam);
        //add
        transaksiku.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        Intent i ;

        switch (v.getId()) {
            case R.id.pinjam : i = new Intent(this,LoginActivity.class);startActivity(i); break ;
            default:break ;
        }

    }




}
