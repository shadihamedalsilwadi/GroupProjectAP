package com.example.app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;

public class MainActivity extends AppCompatActivity {
    private Button button;
    private RadioButton r1;
    private RadioButton r2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button =(Button) findViewById(R.id.button);
        r1=findViewById(R.id.radioButton);
        r2=findViewById(R.id.radioButton2);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(r1.isChecked()) {
                    openAct2();
                }
                else if(r2.isChecked()){
                    openAct4();
                }
                else
                openAct5();
            }
        });
    }
    public void openAct2(){
        Intent intent = new Intent(this,Act2.class);
        startActivity(intent);
    }
    public void openAct4(){
        Intent intent = new Intent(this,Act4.class);
        startActivity(intent);
    }
    public void openAct5(){
        Intent intent = new Intent(this,Act5.class);
        startActivity(intent);
    }
}
