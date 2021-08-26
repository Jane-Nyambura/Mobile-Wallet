package com.example.sindetimobileapp.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.sindetimobileapp.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        var btnCredit = findViewById<Button>(R.id.btnCredit)
        var btnDebit = findViewById<Button>(R.id.btnDebit)
        btnCredit.setOnClickListener {
            var intent = Intent(baseContext, RegisterAccount::class.java)
            startActivity(intent)

            btnDebit.setOnClickListener {
                var intent = Intent(baseContext, DebitAccount::class.java)
                startActivity(intent)


            }
        }


    }
}