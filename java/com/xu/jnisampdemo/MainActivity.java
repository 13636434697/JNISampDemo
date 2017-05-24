package com.xu.jnisampdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public JNI jni;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        jni = new JNI();
    }

    public void click(View v){

        Toast.makeText(getApplicationContext(), jni.add(3, 4)+"", Toast.LENGTH_SHORT).show();
    }

    public void passString(View v){
        Toast.makeText(getApplicationContext(), jni.sayHelloInC("abcd"), Toast.LENGTH_SHORT).show();
    }

    public void passIntArray(View v){
        int[] array = new int[]{1,2,3,4,5};
        jni.arrElementsIncrease(array);
        for(int i: array){
            Log.d("test", i+"");
        }
    }
}