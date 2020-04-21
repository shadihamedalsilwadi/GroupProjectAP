package com.example.app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.widget.TextView;
import android.widget.Toast;

import com.google.gson.Gson;

public class Act3 extends AppCompatActivity {
    private TextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        SharedPreferences pref = PreferenceManager.getDefaultSharedPreferences(this);
        Gson gson = new Gson();
        String str = pref.getString("123","");
        Car x = gson.fromJson(str,Car.class);

        Toast.makeText(this,"method Work",Toast.LENGTH_SHORT).show();

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_act3);
        text=findViewById(R.id.textView6);
        text.setText("Car BMW, Model "+x.getModel()+", Motor "+x.getMotor()+", year "+x.getYear()+"\n ");

    }
}
