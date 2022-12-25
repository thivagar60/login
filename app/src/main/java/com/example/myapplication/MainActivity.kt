package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

btn1.setOnClickListener {
    val username = username1.text.toString().trim()
    val password = password1.text.toString().trim()

    if (username.isEmpty())
    {
        username1.error="enter username"
        username1.requestFocus()
    }

    else if (password.isEmpty())
    {

        password1.error="enter password"
        password1.requestFocus()

    }

    else {

           val intent=Intent(this,HomeActivity::class.java)
        startActivity(intent)

    }
}


    }
}