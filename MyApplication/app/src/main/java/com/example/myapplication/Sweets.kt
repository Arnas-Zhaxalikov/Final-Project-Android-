package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_sweets.*

class Sweets : AppCompatActivity() {

    var sweets_check : Int = 0
    var sweets_order : String = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sweets)

        back.setOnClickListener(){
            val back = Intent(this,MainActivity::class.java)
            back.putExtra("sweets_order",sweets_order)
            back.putExtra("sweets_check",sweets_check)
            Log.d("sweets_order",sweets_order)
            Log.d("sweets_check", sweets_check.toString())
            startActivity(back)
        }

        Waffles.setOnClickListener(){
            AddToSweetsCheck(900)
            AddToSweetsOrder("Бельгийские вафли - 900тг\n")
        }

        Mousse.setOnClickListener(){
            AddToSweetsCheck(1300)
            AddToSweetsOrder("Мусс манго маракуйя - 1300тг\n")
        }

        Cheesecake.setOnClickListener(){
            AddToSweetsCheck(700)
            AddToSweetsOrder("Чизкейк - 700тг\n")
        }

        Tartletkia.setOnClickListener(){
            AddToSweetsCheck(800)
            AddToSweetsOrder("Малиновая тарталетка - 800тг\n")
        }

        Fondan.setOnClickListener(){
            AddToSweetsCheck(1550)
            AddToSweetsOrder("Шоколадный фондан - 1550тг\n")
        }

        Napoleon.setOnClickListener(){
            AddToSweetsCheck(600)
            AddToSweetsOrder("Торт \"Наполеон\" - 600тг\n")
        }

    }
    fun AddToSweetsCheck(price : Int){
        sweets_check += price
    }


    fun AddToSweetsOrder(dish : String){
        sweets_order += dish
    }
}