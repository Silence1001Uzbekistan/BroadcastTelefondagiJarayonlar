package uz.artikov.broadcastandalarm

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.widget.Toast

class MyBroadCastReceiver:BroadcastReceiver() {
    override fun onReceive(p0: Context?, p1: Intent?) {

        Toast.makeText(p0, "Broadcast working", Toast.LENGTH_SHORT).show()

    }
}