package com.bengisusahin.kotlinlearning

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // variables && constants

         //Integer
        println("------Integer--------")
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

        //Long
        var myLong : Long = 100

        //Double & Float
        println("------Double & Float--------")

        val pi = 3.14
        println(pi*2) //bazi programlama dillerinde izin vermez
        //println(pi*2.0)//ama kotlin veriyor

        //genelde floatın limitlemesinden dolayı double ile calisiriz
        val myFloat = 3.14f
        println(myFloat * 2)

        var myAge : Double
        myAge = 23.0
        println(myAge / 2)

        //String
        println("------String--------")

        val myString = "atil samancioglu"
        val name = "James"
        val surname = "Hetfield"

        val fullname = name +" "+surname
        println(fullname)

        val larsName : String = "Lars"
        println(myString.capitalize())

        //Boolean
        println("------Boolean--------")

        var myBoolean : Boolean = true
        myBoolean = false

        var isAlive = true

        println(3<5)
        println(6<3)

    }
}