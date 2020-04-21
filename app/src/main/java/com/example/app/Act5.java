package com.example.app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

import java.util.ArrayList;
import java.util.List;

public class Act5 extends AppCompatActivity {
    private Button button;
    private Spinner spinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_act2);
        spinner=findViewById(R.id.spinner);
        List<Car> car=new ArrayList<>();
        Car c1=new Car("Jetta GLI","2011","2500");
        Car c2=new Car("TSI","2015","1600");
        Car c3=new Car("Polo","2017","3000");
        Car c4=new Car("GTI","2019","2500");
        car.add(c1);
        car.add(c2);
        car.add(c3);
        car.add(c4);
        ArrayAdapter<Car> adapter = new ArrayAdapter<Car>(this,android.R.layout.simple_spinner_item,car);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);

        button =(Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openAct3();
            }
        });
    }
    public void openAct3(){
        Intent intent = new Intent(this,Act3.class);
        startActivity(intent);
    }
}
