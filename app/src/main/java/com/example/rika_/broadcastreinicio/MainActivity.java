package com.example.rika_.broadcastreinicio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    public void dialogo (){

        AlertDialog.Builder alt_bld = new AlertDialog.Builder(this);
        alt_bld.setMessage("hola")
                .setCancelable(false)
                .setNegativeButton("Muy bien", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
//  Action for ‘NO’ Button
                        dialog.cancel();
                    }
                });
        AlertDialog alert = alt_bld.create();
// Title for AlertDialog
        alert.setTitle("Móvil reiniciado");
        alert.show();
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//     setContentView(R.layout.main);
        dialogo();
    }
}
