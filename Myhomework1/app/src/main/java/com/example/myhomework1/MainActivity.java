package com.example.myhomework1;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.RadioGroup;
import android.widget.Switch;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    private Button btn;
    private ImageView mimg;
    private Switch swi;
    private TextView tv;
    private RadioGroup radioGroup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn = findViewById(R.id.button);
        mimg = findViewById(R.id.imageView);
        radioGroup = findViewById(R.id.rd);
        swi = findViewById(R.id.switch1);
        tv = findViewById(R.id.textView);



        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tv.setText("Goodbye");
                Log.i("main","改变文字");
            }
        });

        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if(i == R.id.radioButton){
                    tv.setTextColor(Color.RED);
                    Log.i("main","变红色");
                }
                if(i == R.id.radioButton2){
                    tv.setTextColor(Color.YELLOW);
                }
                if(i == R.id.radioButton3){
                    tv.setTextColor(Color.BLUE);
                }
            }
        });

        swi.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(b){
                    mimg.setImageResource(R.drawable.ic_launcher_background);
                    Log.i("main","更换图片");
                }
                else{
                    mimg.setImageResource(R.mipmap.ic_launcher);
                }
            }

        });

    }
}
