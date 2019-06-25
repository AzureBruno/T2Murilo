package com.example.t2_kot

import android.arch.persistence.room.Room
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private lateinit var userDataDao: UserDataDAO

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val database = Room.databaseBuilder(
            this,
            AppDatabase::class.java,
            "carvalho_database")
            .allowMainThreadQueries()
            .build()
        userDataDao = database.userDataDao()

        btn_register_main.setOnClickListener {
            nextActivity(RegisterActivity())
        }

        btn_Login.setOnClickListener {
            val userName = edText_user.text.toString()
            val userPass = edText_pass.text.toString()
            checkLogin(userName, userPass)
        }
    }

    fun nextActivity(Activity : AppCompatActivity) {
        val intent = Intent(applicationContext, Activity::class.java)
        startActivity(intent)
    }

    private fun checkLogin(userName : String, userPass : String) {
        val userVerify = userDataDao.getLoginUser(userName)
        val passVerify = userDataDao.getLoginPass(userPass)

        if (!userVerify.isEmpty() && !passVerify.isEmpty()) {
            nextActivity(ListMoviesActivity())
        } else if (userVerify.isEmpty()){
            edText_user.error = "Usuário Inválido!"
        } else if (passVerify.isEmpty()){
            edText_pass.error = "Senha Incorreta!"
        }
    }

}
