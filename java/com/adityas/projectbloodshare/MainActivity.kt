package com.adityas.projectbloodshare

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

//NIM      : 10120240
//Nama     : aditya sukmadinata
//Kelas    : IF-6
//Tanggal  : 28/04/2023
// Pembuatan halaman utama form registrasi
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val clicktext = findViewById<TextView>(R.id.txt_homeregister)
        clicktext.setOnClickListener{
            val intent = Intent(this,RegisterActivity::class.java)
            startActivity(intent)
        }
    }
}
