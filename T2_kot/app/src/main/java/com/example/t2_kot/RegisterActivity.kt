package com.example.t2_kot

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_register.*

class RegisterActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        btn_register.setOnClickListener {
            var userName: String = ed_txt_register_user.text.toString()
            var userPass: String = ed_txt_register_pass.text.toString()
            var userPassConfirm: String = ed_txt_register_pass2.text.toString()
            if (userPass == userPassConfirm) {
                val newUser = UserDataObject.builder(userName,userPass)
            } else if (userPass.isEmpty()) {
                ed_txt_register_pass.error = getString(R.string.campo_obrigatorio)
            } else if (userPassConfirm.isEmpty()) {
                ed_txt_register_pass2.error = getString(R.string.campo_obrigatorio)
            } else {
                ed_txt_register_pass2.error = getString(R.string.senhas_dif)
            }
        }
    }
}