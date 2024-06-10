package com.example.thutoexam

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import arrayOf

(android.widget)

(andriod.widegt)

class MainScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_screen)
    }
    val title = findViewById<TextView>(R.id.maintitle)
    val temp = findViewById<TextView>(R.id.texttemp)
    val weekday = findViewById<TextView>(R.id.weekday)
    val condition = findViewById<TextView>(R.id.textcondition)
    val clearbutton = findViewById<Button>(R.id.clearbutton)
    val exitapp = findViewById<Button>(R.id.exitbutton)
    val detailview = findViewById<Button>(R.id.btnDetailView)
    val calulatebutton = findViewById<Button>(R.id.calbutton)


    private val weekday = arrayListOf<String>("Monday","Tuesday","Wednesday","Thursday","Friday","Saurday","Sunday") //The array is storing the weekdays
    val temp = arrayListOf<Int>(10,20,13,25,9,15,16,34,1,19,12,39,16,20) // The array is storing the temperture of the specif week
    val condition = arrayListOf<String>("Humid","Cold","Cold","Sunny","Cold","Sunny","Partly Cloudly") // The array is storing the condition of the specific week

    while 



}
    fun total temp average = sum (temp)
        return total temp / len

