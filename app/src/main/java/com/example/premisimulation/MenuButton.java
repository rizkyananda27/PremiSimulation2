package com.example.premisimulation;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import android.service.autofill.OnClickAction;
import android.util.DisplayMetrics;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.TextView;

public class MenuButton extends Activity {

     Button btn;
     Button btn2;
     TextView txt;
     Button intentastor;
     Button intentastor2;
     View popupview;
     ImageButton ibtn;


    @Override
    public void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_button);
        ibtn =(ImageButton) findViewById(R.id.btnastor);
        btn =(Button) findViewById(R.id.button2);

        txt =(TextView) findViewById(R.id.deskripsi);
        intentastor =(Button) findViewById(R.id.lanjut);
        intentastor.setEnabled(false);
        popupview = LayoutInflater.from(this).inflate(R.layout.popup_astor, null);

            ibtn.setOnClickListener(new View.OnClickListener(){

                {
                    intentastor.setEnabled(true);
                }
            @Override
            public void onClick(View v){


                txt.setText("Ästor adalah asuransi bla bla");
                intentastor.setOnClickListener(new View.OnClickListener(){
                    public void onClick(View v){

                        Intent i = new Intent(MenuButton.this,Astorsimulation.class);
                        startActivity(i);
                        }
                    });
                }
            });


        btn.setOnClickListener(new View.OnClickListener(){

            {
                intentastor.setEnabled(true);
            }
            @Override
            public void onClick(View v){


                txt.setText("Ästor adalah asuransi bla bla bla");
                intentastor.setOnClickListener(new View.OnClickListener(){
                    public void onClick(View v){

                        Intent i = new Intent(MenuButton.this,SplashScreen.class);
                        startActivity(i);
                    }
                });
            }
        });





    }

}