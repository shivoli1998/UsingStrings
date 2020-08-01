package com.example.usingstrings;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class ActivityOne extends AppCompatActivity {

    TextView txtView2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_one);
        Log.i("Lifecycle","OnCreate() invoked");
        txtView2=findViewById(R.id.textView2);
        txtView2.setText(R.string.Msg2);
    }
    public void onStart(){
        super.onStart();
        Log.i("lifecycle","onstart() invoke");
    }
    public void onRestart(){
        super.onRestart();
        Log.i("lifecycle","onRestart() invoke");
    }
    public void onResume(){
        super.onResume();
        Log.i("lifecycle","onsResume() invoke");
    }
    public void onpause(){
        super.onPause();
        Log.i("lifecycle","onPause() invoke");
    }
    public void onDestroy(){
        super.onDestroy();
        Log.i("lifecycle","onDestroy() invoke");
    }
}