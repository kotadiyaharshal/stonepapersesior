package com.example.stonepapersesior

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.result.contract.ActivityResultContracts

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btnPlayWithOther = findViewById<Button>(R.id.btnplaywithother)
        btnPlayWithOther.setOnClickListener {
            val intent=Intent(this,PlayWithOther::class.java)
            startActivity(intent)

        }
        val btnPlayWithComp: Button = findViewById(R.id.btnplaywithcomputer)
        btnPlayWithComp.setOnClickListener {

        }
        val tvInstruction: TextView = findViewById(R.id.tvInstruction)
        tvInstruction.setOnClickListener {

        }

    }
}

