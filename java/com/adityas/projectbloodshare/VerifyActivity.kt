package com.adityas.projectbloodshare

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

//NIM      : 10120240
//Nama     : aditya sukmadinata
//Kelas    : IF6
//Tanggal  : 28/04/2023
class VerifyActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_verify)

        val button = findViewById<Button>(R.id.btn_verifysend)
        button.setOnClickListener{
            val intent = Intent(this,ProfileActivity::class.java)
            startActivity(intent)
        }
    }
}
