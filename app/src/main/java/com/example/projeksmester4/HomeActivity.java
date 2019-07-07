package com.example.projeksmester4;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.ViewFlipper;


public class HomeActivity extends AppCompatActivity implements View.OnClickListener{
    private SessionHandler session;
    private CardView transaksiku, mobil, supir;
    ViewFlipper v_flipper;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        //view flipper
        int images[] = {R.drawable.v_mobil,R.drawable.v_mobil1,R.drawable.v_mobil2,R.drawable.v_mobil3,R.drawable.v_mobil4};

        v_flipper = findViewById(R.id.v_flipper);

        mobil = (CardView) findViewById(R.id.mobilpinjam);
        supir = (CardView) findViewById(R.id.supir);

        mobil.setOnClickListener(this);
        supir.setOnClickListener(this);

        for(int image:images){
            flipperImages(image);
        }
    }
    public void flipperImages(int image){
        ImageView imageView = new ImageView(this);
        imageView.setBackgroundResource(image);

        v_flipper.addView(imageView);
        v_flipper.setFlipInterval(4000);//4 sec
        v_flipper.setAutoStart(true);

        //animation
        v_flipper.setInAnimation(this,android.R.anim.slide_in_left);
        v_flipper.setOutAnimation(this,android.R.anim.slide_out_right);



        //endv_flipper

        transaksiku = (CardView) findViewById(R.id.pinjam);
        //add
        transaksiku.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        Intent i ;

        switch (v.getId()) {
            case R.id.pinjam : i = new Intent(this,LoginActivity.class);startActivity(i); break;
            case R.id.mobilpinjam : i = new Intent(this,Cars.class);startActivity(i); break;
            case R.id.supir : i = new Intent(this,DaftarSupir.class);startActivity(i); break;
            default:break ;

        }

    }






}
