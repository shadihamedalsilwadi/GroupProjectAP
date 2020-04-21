package com.example.app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.Switch;
import android.widget.Toast;

import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.List;

public class Act2 extends AppCompatActivity {
    private Button button;
    private Spinner spinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_act2);
        spinner=findViewById(R.id.spinner);
        List<Car> car=new ArrayList<>();
        Car c1=new Car("Z4","2011","2500");
        Car c2=new Car("M3","2015","1600");
        Car c3=new Car("i8","2017","3000");
        Car c4=new Car("M8","2019","2500");
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
    private  Spinner spinner2;

    private CheckBox ch_1;
    private CheckBox ch_2;
    private CheckBox ch_3;

    private RadioButton r_Black;
    private RadioButton r_White;
    private RadioButton r_Green;
    private RadioButton r_Blue;

    private Switch sw;

    public void openAct3(){
        spinner2 = findViewById(R.id.spinner);
        ch_1 = findViewById(R.id.checkBox);
        ch_2 = findViewById(R.id.checkBox2);
        ch_3 = findViewById(R.id.checkBox3);
        r_Black = findViewById(R.id.radioButton4);
        r_White = findViewById(R.id.radioButton5);
        r_Green = findViewById(R.id.radioButton6);
        r_Blue = findViewById(R.id.radioButton7);
        sw=findViewById(R.id.switch1);


        Car c;
        c = (Car) spinner2.getSelectedItem();

        String adds=" ";
        if(ch_1.isChecked())adds+="Sunroof, ";
        if(ch_2.isChecked())adds+="Tires, ";
        if(ch_3.isChecked())adds+="Backup Camera, ";
        String col="";
        if(r_Black.isChecked())col="Black";
        if(r_White.isChecked())col="White";
        if(r_Green.isChecked())col="Green";
        if(r_Blue.isChecked())col="Blue";
        boolean jeep=false;
        if(sw.isChecked())jeep=true;

        CarList caros = new CarList(c.getModel(),c.getYear(),c.getMotor(),col,jeep,adds);

       SharedPreferences pref = PreferenceManager.getDefaultSharedPreferences(this);
       SharedPreferences.Editor editor = pref.edit();
       Gson gson = new Gson();
       String carsString = gson.toJson(caros);
       editor.putString("123",carsString);
       editor.commit();
        Toast.makeText(this,"Data Saved",Toast.LENGTH_SHORT).show();

        Intent intent = new Intent(this,Act3.class);
        startActivity(intent);
    }
}
