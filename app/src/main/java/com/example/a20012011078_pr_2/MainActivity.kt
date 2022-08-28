package com.example.a20012011078_pr_2

import android.nfc.Tag
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    val Tag = "Mainactivity"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }


    private fun showmassage(msg:String)
    {
        Log.i(Tag,msg)
        val text = "HELLO AYUSH"
        val duration = Toast.LENGTH_SHORT

        val toast = Toast.makeText(applicationContext, text, duration)
        toast.show()
    }

    override fun onStart() {
        super.onStart()
        showmassage("")

    }

    override fun onResume() {
        super.onResume()

    }

}