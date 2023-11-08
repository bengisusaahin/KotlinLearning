package com.bengisusahin.kotlinlearning

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // variables && constants

         //Integer
        var x = 5
        var y = 4

        println(x*y)
        var age = 35
        val result = age / 7 * 5
        println(result)

        val myInteger : Int
        //Initialize
        myInteger = 10

        val a : Int = 23

        println(a/2)



    }
}