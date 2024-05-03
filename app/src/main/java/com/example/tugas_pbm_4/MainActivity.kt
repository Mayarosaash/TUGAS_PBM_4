package com.example.tugas_pbm_4

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.RadioButton
import android.widget.RadioGroup
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val NIK = findViewById<EditText>(R.id.editNIK)
        val nama = findViewById<EditText>(R.id.editnama)
        val ttl = findViewById<EditText>(R.id.editttl)
        val kelamin = findViewById<RadioGroup>(R.id.jnsk)
        val goldar = findViewById<EditText>(R.id.editgoldar)
        val alamat = findViewById<EditText>(R.id.editalamat)
        val pekerjaan = findViewById<EditText>(R.id.editpekerjaan)
        val kwn = findViewById<EditText>(R.id.editkewarganegaraan)

        val save = findViewById<Button>(R.id.ssave)


        save.setOnClickListener(View.OnClickListener {
            val NIK = NIK.text.toString()
            val nama = nama.text.toString()
            val ttl = ttl.text.toString()
            val goldar = goldar.text.toString()
            val alamat = alamat.text.toString()
            val pekerjaan = pekerjaan.text.toString()
            val kelamin = kelamin.checkedRadioButtonId
            val kelaminn = findViewById<RadioButton>(kelamin)
            val isigender = kelaminn?.text.toString()
            val kwn = kwn.text.toString()

            val isidata = Intent(this, MainActivity2::class.java).also{
                it.putExtra("NIK ", NIK)
                it.putExtra("Nama ", nama)
                it.putExtra("Tanggal lahir ", ttl)
                it.putExtra("Jenis kel ", isigender)
                it.putExtra("Golongan darah ", goldar)
                it.putExtra("Alamat ", alamat)
                it.putExtra("Pekerjaan ", pekerjaan)
                it.putExtra("Kewarganegaraan ", kwn)


                startActivity(it)
            }
        })
    }
}