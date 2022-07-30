package com.example.erik

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class loginActivity : AppCompatActivity() {
    var ButtonFood: Button?= null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        ButtonFood = findViewById(R.id.btn_food)
        ButtonFood!!.setOnClickListener {
            val intent = Intent(this, foodActivity::class.java)
            startActivity(intent)
        }
    }
}