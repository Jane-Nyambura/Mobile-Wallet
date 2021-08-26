package com.example.sindetimobileapp.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import com.example.sindetimobileapp.R

class DebitAccount : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_debit_account)
        var btnTransact=findViewById<Button>(R.id.btnTransact)
        var accountNumber=findViewById<EditText>(R.id.etAccountNumber)
        btnTransact.setOnClickListener {
            var intent=Intent(baseContext,manage_transactions::class.java)
            var accountNumber=accountNumber.text.toString()
            intent.putExtra("accountNumber",accountNumber)
            startActivity(intent)
        }
    }

}