package com.example.tugas_pbm_4

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main2)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val inik = intent.getStringExtra("NIK ")
        val inama = intent.getStringExtra("Nama ")
        val ittl = intent.getStringExtra("Tanggal Lahir ")
        val ikelamin = intent.getStringExtra("Jenis kel")
        val igoldar = intent.getStringExtra("Golongan darah")
        val ialamat = intent.getStringExtra("Alamat")
        val ipekerjaan = intent.getStringExtra("Pekerjaan")
        val ikewarganegaraan = intent.getStringExtra("Kewarganegaraan ")


        val nik = findViewById<TextView>(R.id.editNIK).apply {
            text = inik
        }
        val nama = findViewById<TextView>(R.id.editnama).apply {
            text = inama
        }
        val TTL = findViewById<TextView>(R.id.editttl).apply {
            text = ittl
        }
        val JKEL = findViewById<TextView>(R.id.jkelmin).apply {
            text = ikelamin
        }
        val GOLDAR = findViewById<TextView>(R.id.editgoldar).apply {
            text = igoldar
        }
        val ALAMAT = findViewById<TextView>(R.id.editalamat).apply {
            text = ialamat
        }
        val PEKERJAAN = findViewById<TextView>(R.id.editpekerjaan).apply {
            text = ipekerjaan
        }

        val Back = findViewById<Button>(R.id.bback)
        Back.setOnClickListener(View.OnClickListener {
            finish()
        })
    }
}