package com.example.rika_.broadcastreinicio;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public class arrancador extends BroadcastReceiver{

    @Override
    public void onReceive(Context context, Intent intent) {

// Accion a realizar al inicir el móvil

        Intent i = new Intent(context, MainActivity.class);  // aqui llama a la clase que comienza la app

        i.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK); context.startActivity(i);

    }

}