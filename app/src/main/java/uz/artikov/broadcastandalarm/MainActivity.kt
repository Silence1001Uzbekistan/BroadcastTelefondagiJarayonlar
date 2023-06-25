package uz.artikov.broadcastandalarm

import android.content.Intent
import android.content.IntentFilter
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    lateinit var myBroadCastReceiver: MyBroadCastReceiver

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        myBroadCastReceiver = MyBroadCastReceiver()

        //Bu yerda turli xil broadCast berish mumkin
        val intentFilter = IntentFilter(Intent.ACTION_AIRPLANE_MODE_CHANGED)
        registerReceiver(myBroadCastReceiver, intentFilter)

    }

    override fun onStop() {
        super.onStop()

        unregisterReceiver(myBroadCastReceiver)

    }

}