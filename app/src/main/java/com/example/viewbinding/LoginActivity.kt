package com.example.viewbinding

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.viewbinding.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val loginBinding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(loginBinding.root)

        loginBinding.apply {
            btnLogin.setOnClickListener {
                startActivity(Intent(this@LoginActivity, MainActivity::class.java))
            }
            btnOpenFragment.setOnClickListener {
                supportFragmentManager.beginTransaction()
                    .setCustomAnimations(android.R.anim.fade_in, android.R.anim.fade_out)
                    .add(R.id.fc_demo, DemmoFragment.newInstance())
                    .commit()
            }
        }
    }
}