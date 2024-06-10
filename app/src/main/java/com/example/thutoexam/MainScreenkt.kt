package com.example.thutoexam

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class MainScreenkt : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_screenkt)
    }

    val TextView= findViewById<TextView>(R.id.maintitle)
    val textView = findViewById<TextView>(R.id.one)
    val textview = findViewById<TextView>(R.id.tuesday)
    val textview = findViewById<TextView>(R.id.wednesday)
    val textView = findViewById<TextView>(R.id.thursday)
    val textView = findViewById<TextView>(R.id.friday)
    val textView = findViewById<TextView>(R.id.saturday)
    val textview = findViewById<TextView>(R.id.sunday)
    val imageView = findViewById<ImageView>(R.id.imageView)
}
val weekdays = arrayListOf<String>("Monday", "Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday") // The array will store all the days of the week in order
val temperature = arrayListOf<Int>(12,15,10,25,2,19,10,22,16,30,11,20) // The array is storing the min and max temperature of each weekday.
val condition = arrayListOf<String>("Sunday","Sunny","Partly Cloudy", "Cold","Sunny","Humid","Cold") // The array is storing the weather condition of a particular weekday





}