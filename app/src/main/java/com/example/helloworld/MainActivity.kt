package com.example.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val button =findViewById<Button>(R.id.button)//reference views from layout file
        button.setOnClickListener{
            Log.v("hello", "clicked")//check communicating button
            Toast.makeText(this,"Sneak attack!!!", Toast.LENGTH_SHORT).show()
        }
        val button2 =findViewById<Button>(R.id.button2)
        button2.setOnClickListener{
            Toast.makeText(this,"Blocked attack", Toast.LENGTH_SHORT).show()
        }
        val button3 =findViewById<Button>(R.id.button3)
        button3.setOnClickListener{
            Toast.makeText(this,"Reload gas, replace sword", Toast.LENGTH_SHORT).show()
        }

    }
}