package com.example.t2_kot

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_register_main.setOnClickListener {
            nextActivity(RegisterActivity())
        }

        btn_Login.setOnClickListener {
            nextActivity(ListMoviesActivity())
        }
    }

    private fun nextActivity(Activity : AppCompatActivity) {
        val intent = Intent(applicationContext, Activity::class.java)
        startActivity(intent)
    }

    private fun checkLogin(userName : String, passWord : String) {

    }

}
