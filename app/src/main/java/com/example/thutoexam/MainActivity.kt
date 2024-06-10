package com.example.thutoexam

import android.app.ApplicationExitInfo
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import kotlin.system.exitProcess

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val editText = findViewById<EditText>(R.id.editText1)
        val editText2 = findViewById<EditText>(R.id.editText2)
        val editTextStudentNo = findViewById<EditText>(R.id.editTextStudentNo)
        val btnMain = findViewById<Button>(R.id.btnMain)
        val btnExit = findViewById<Button>(R.id.btnExit)
        val imageView = findViewById<ImageView>(R.id.imageView)
    }
    btnExit.setOnClickListener(val intent = intent this MainActicity::kotlin
         )
    finish up()


    }
}