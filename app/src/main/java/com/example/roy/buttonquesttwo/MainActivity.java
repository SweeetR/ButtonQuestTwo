package com.example.roy.buttonquesttwo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btn;
    int i;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = (Button) findViewById(R.id.btn) ;
        i = 0;
    }

    public void click(View view) {
        i=i+1;
        btn.setText("This is the click number:"+i);
    }
}
