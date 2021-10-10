package com.example.mifirstapp20

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val ButtonSend = findViewById<Button>(R.id.ButtonSend);
        val ShowerOne = findViewById<TextView>(R.id.ShowerOne);
        val catcher = findViewById<EditText>(R.id.FieldName);

        ButtonSend.setOnClickListener {
            ShowerOne.text = "Hola "+catcher.text;
        }
    }
}