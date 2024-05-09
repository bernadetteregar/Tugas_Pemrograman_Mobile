package com.example.progmob

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    private lateinit var btnMenuCalculate: Button
    private lateinit var btnMenu: Button

    override fun onCreate(savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnMenuCalculate = findViewById(R.id.btn_menucalculate)
        btnMenu = findViewById(R.id.btn_menu)

        btnMenuCalculate.setOnClickListener{
            val intent = Intent(this, SecondMainActivity::class.java)
            val edNama = findViewById<EditText>(R.id.ed_nama).text.toString()
            val edNIM = findViewById<EditText>(R.id.ed_nim).text.toString()
            val edMatkul = findViewById<EditText>(R.id.ed_matakuliah).text.toString()

            intent.putExtra("Nama", edNama)
            intent.putExtra("NIM", edNIM)
            intent.putExtra("Mata Kuliah", edMatkul)

            startActivity(intent)
        }

        btnMenu.setOnClickListener{
            val phoneNumber = "08111"
            val dialPhoneIntent = Intent(Intent.ACTION_DIAL, Uri.parse("tel:$phoneNumber"))

            startActivity(dialPhoneIntent)

        }
    }
}