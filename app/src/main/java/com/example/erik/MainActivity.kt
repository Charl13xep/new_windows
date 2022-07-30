package com.example.erik

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    var ButtonLogin:Button ?= null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        ButtonLogin=findViewById(R.id.btn_food)
        ButtonLogin!!.setOnClickListener {
            val intent= Intent(this,loginActivity::class.java)
            startActivity(intent)
        }
    }
}