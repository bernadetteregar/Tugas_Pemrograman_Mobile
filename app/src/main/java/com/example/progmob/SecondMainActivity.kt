package com.example.progmob

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat


class SecondMainActivity : AppCompatActivity(), View.OnClickListener {
    private lateinit var edNilaiTugas1: EditText
    private lateinit var edNilaiTugas2: EditText
    private lateinit var edNilaiTugas3: EditText
    private lateinit var edNilaiUTS: EditText
    private lateinit var edNilaiUAS: EditText
    private lateinit var btnCalculate: Button
    private lateinit var tvResult: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second_main)

        val tvDataReceived = findViewById<TextView>(R.id.tv_datareceived)
        val edNama = intent.getStringExtra("Nama")
        val edNIM = intent.getStringExtra("NIM")
        val edMatkul = intent.getStringExtra("Mata Kuliah")

        tvDataReceived.text = "Nama: $edNama\nNIM: $edNIM\nMata Kuliah: $edMatkul"

        edNilaiTugas1 = findViewById(R.id.ed_nilaitugas1)
        edNilaiTugas2 = findViewById(R.id.ed_nilaitugas2)
        edNilaiTugas3 = findViewById(R.id.ed_nilaitugas3)
        edNilaiUTS = findViewById(R.id.ed_nilaiuts)
        edNilaiUAS = findViewById(R.id.ed_nilaiuas)
        btnCalculate = findViewById(R.id.btn_calculate)
        tvResult = findViewById(R.id.tv_result)
        btnCalculate.setOnClickListener(this)
    }
    override fun onClick(view: View?){
        if (view?.id == R.id.btn_calculate){
            val inputNilaiTugas1 = edNilaiTugas1.text.toString().trim().toDouble()
            val inputNilaiTugas2 = edNilaiTugas2.text.toString().trim().toDouble()
            val inputNilaiTugas3 = edNilaiTugas3.text.toString().trim().toDouble()
            val inputNilaiUTS = edNilaiUTS.text.toString().trim().toDouble()
            val inputNilaiUAS = edNilaiUAS.text.toString().trim().toDouble()
            val totalNilai = inputNilaiTugas1 + inputNilaiTugas2 + inputNilaiTugas3 + inputNilaiUTS + inputNilaiUAS
            val nilaiAkhir = totalNilai / 5
            tvResult.text = nilaiAkhir.toString()
        }
    }
}