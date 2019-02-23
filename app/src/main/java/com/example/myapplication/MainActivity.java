package com.example.myapplication;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

   // private Context context;
   SharedPreferences sharedpreferences;

    @Override
        protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
      //  context=this;
        SharedPreferences preferences = getSharedPreferences("aman",MODE_PRIVATE);
        SharedPreferences.Editor editor = preferences.edit();
        //SharedPreferences.Editor editor = sharedpreferences.edit();
        editor.putBoolean("isFirstTimeUser",true);
        editor.commit();

boolean isFirstTimeUser=preferences.getBoolean("isFirstTimeUser",true);

if(isFirstTimeUser)
{
    Intent intent=new Intent(MainActivity.this,MainActivity.class);
    startActivity(intent);
//    else
//    {
//        Intent intent=new Intent(MainActivity.this,MainActivity.class);
//        startActivity(intent);
//
//    }
}






    }
}
