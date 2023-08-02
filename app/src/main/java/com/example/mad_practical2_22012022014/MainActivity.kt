package com.example.mad_practical2_22012022014

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Message
import android.util.Log
import android.widget.Toast
import androidx.constraintlayout.widget.ConstraintLayout
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {
    var TAG="MainActivity"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        showMessage("oncreatemethodiscall")

    }

    fun showMessage(message: String){
        Log.i(TAG, message)
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
        val obj:ConstraintLayout?=findViewById(R.id.mainconstraint)
        if(obj!=null){
            Snackbar.make(obj,message,Snackbar.LENGTH_SHORT).show()
        }
    }

    override fun onStart() {
        super.onStart()
        showMessage("onstart method is called")
    }

    override fun onResume() {
        super.onResume()
        showMessage("on resume method is called")
    }

    override fun onPause() {
        super.onPause()
        showMessage("on pause method is called ")
    }

    override fun onStop() {
        super.onStop()
        showMessage("On stop method is called")
    }

    override fun onDestroy() {
        super.onDestroy()
        showMessage("On destroy method is called")
    }

}