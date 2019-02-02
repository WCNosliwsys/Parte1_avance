package com.a952000243.ingwilson.nosliwsys.parte1_avance;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

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
    public void manipulando(View view){
        startActivity(new Intent(this, Manipulacion.class));
    }
    public void myrecycler(View view){
        startActivity(new Intent(this, MiRecyclerView.class));
    }
    public void AcercaDe(View view){
        startActivity(new Intent(this, AcercaDe.class));
    }
    @Override protected void onStart() {
        super.onStart();
        Toast.makeText(this, "onStart", Toast.LENGTH_SHORT).show();
    }
    @Override protected void onResume() {
        super.onResume();
        Toast.makeText(this, "onResume", Toast.LENGTH_SHORT).show();
    }
    @Override protected void onPause() {
        Toast.makeText(this, "onPause", Toast.LENGTH_SHORT).show();
        super.onPause();
    }
    @Override protected void onStop() {
        super.onStop();
        Toast.makeText(this, "onStop", Toast.LENGTH_SHORT).show();
    }
    @Override protected void onRestart() {
        super.onRestart();
        Toast.makeText(this, "onRestart", Toast.LENGTH_SHORT).show();
    }
    @Override protected void onDestroy() {
        Toast.makeText(this, "onDestroy", Toast.LENGTH_SHORT).show();
        super.onDestroy();
    }
    public void dialogo(View view){
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setMessage("Este es mi dialogo")
                .setTitle("Mi primer dialogo...")
                .setCancelable(false)
                .setNeutralButton("Aceptar",
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {
                                dialog.cancel();
                            }
                        });
        AlertDialog alert = builder.create();
        alert.show();
    }
}
