package com.example.setalarm;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Vibrator;
import android.widget.Toast;

public class broad extends BroadcastReceiver {
    MediaPlayer m;
    @Override
    public void onReceive(Context context, Intent intent) {
        Toast.makeText(context,"Alarm is ringing",Toast.LENGTH_LONG).show();
        m = MediaPlayer.create(context, R.raw.a);
        m.start();
        Vibrator vibrator =(Vibrator) context.getSystemService(context.VIBRATOR_SERVICE);
        vibrator.vibrate(2000);
    }
}

