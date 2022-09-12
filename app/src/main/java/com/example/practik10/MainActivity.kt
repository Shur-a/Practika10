package com.example.practik10

import android.app.Application
import android.content.Context
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

private lateinit var text1 :TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var open = 0
        val opens = getSharedPreferences("pref", MODE_PRIVATE)
        open = opens.getString("str","why?").toString().toInt() + 1
        val edit = opens.edit()
        val putString = edit.putString("str", open.toString())
        edit.apply()
        Log.d("LOGS_OPEN","${opens.getString("str","why?").toString()}")
        text1 = findViewById(R.id.opens)
        text1.text = "Кол-во открытий: " + opens.getString("str","why?").toString()







    }

}
