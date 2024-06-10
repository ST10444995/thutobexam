package com.example.thutoexam

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class DetailView : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_view)

        val daydetail = findViewById<TextView>(R.id.daydetail)
        intent.getStringExtra("Monday")
        daydetail.text
        val temp = findViewById<TextView>(R.id.num1)
        intent.getStringExtra("10,21")
        val condition = findViewById<TextView>(R.id.humid)
    }

    val daydetail = findViewById<TextView>(R.id.daydetail)
    intent.getStringExtra("Tuesday")
    val temp = findViewById<TextView>(R.id.num2)
    intent.getStringExtra("13,25")
    val condition = findViewById<TextView>(R.id.cold)


        val daydetail = findViewById<TextView>(R.id.daydetail)
    intent.getStringExtra("Wednesday")
    val temp = findViewById<TextView>(R.id.num3)
    intent.getStringExtra("9,15")
    val condition=findViewById<TextView>(R.id.cold)



        val daydetail = findViewById<TextView>(R.id.daydetail)
        intent.getStringExtra("Thursday")
        val temp = findViewById<TextView>(R.id.num4)
        intent.getStringExtra("16,34")
        val condition=findViewById<TextView>(R.id.sunny)


        val daydetail = findViewById<TextView>(R.id.daydetail)
        intent.getStringExtra("Friday")
        val temp = findViewById<TextView>(R.id.num5)
        intent.getStringExtra("1,19")
        val condition=findViewById<TextView>(R.id.cold)

        val daydetail = findViewById<TextView>(R.id.daydetail)
        intent.getStringExtra("Saturday")
        val temp = findViewById<TextView>(R.id.num6)
        intent.getStringExtra("16,34")
        val condition=findViewById<TextView>(R.id.sunny)

    val daydetail = findViewById<TextView>(R.id.daydetail)
    intent.getStringExtra("Sunday")
    val temp = findViewById<TextView>(R.id.num7)
    intent.getString.("16,20")
    val condition = findViewById<TextView>(R.id.)
    }
    val cnodition = findViewById<TextView>(R.id.textView27)



    }

}