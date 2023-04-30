package com.adityas.projectbloodshare

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

//NIM      : 10120240
//Nama     : aditya sukmadianta
//Kelas    : IF-6
//Tanggal  : 28/04/2023

class AlmostActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hampir)

        val button = findViewById<Button>(R.id.btn_verify)
        button.setOnClickListener{
            val intent = Intent(this,VerifyActivity::class.java)
            startActivity(intent)
        }
    }
}
