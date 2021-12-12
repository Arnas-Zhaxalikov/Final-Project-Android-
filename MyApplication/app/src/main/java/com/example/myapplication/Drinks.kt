package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_drinks.*
import kotlinx.android.synthetic.main.activity_drinks.view.*

class Drinks : AppCompatActivity() {

    var drinks_check : Int = 0
    var drinks_order : String = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_drinks)

        back.setOnClickListener(){
            val back = Intent(this,MainActivity::class.java)
            back.putExtra("drinks_order",drinks_order)
            back.putExtra("drinks_check",drinks_check)
            Log.d("drinks_order",drinks_order)
            Log.d("drinks_check", drinks_check.toString())
            startActivity(back)
        }

        Latte.setOnClickListener(){
            AddToDrinksCheck(700)
            AddToDrinksOrder("Кофе Латте - 700тг\n")
        }

        Americano.setOnClickListener(){
            AddToDrinksCheck(600)
            AddToDrinksOrder("Кофе Американо - 600тг\n")
        }

        Orange.setOnClickListener(){
            AddToDrinksCheck(1100)
            AddToDrinksOrder("Апельсиновый сок - 1100тг\n")
        }

        Apple.setOnClickListener(){
            AddToDrinksCheck(900)
            AddToDrinksOrder("Яблочный сок - 900тг\n")
        }
    }

    fun AddToDrinksCheck(price : Int){
        drinks_check += price
    }


    fun AddToDrinksOrder(dish : String){
        drinks_order += dish
    }
}