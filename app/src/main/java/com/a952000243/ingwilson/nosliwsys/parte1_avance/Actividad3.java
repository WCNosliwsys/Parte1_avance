package com.a952000243.ingwilson.nosliwsys.parte1_avance;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Actividad3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actividad3);
    }
    public void actividad2(View view){
        startActivity(new Intent(this, MainActivity.class));
    }
    public void mispinner(View view){
        startActivity(new Intent(this, MiSpinner.class));
    }
    public void mifragmenttabhost(View view){
        startActivity(new Intent(this, MiFragmentTabHost.class));
    }
}
