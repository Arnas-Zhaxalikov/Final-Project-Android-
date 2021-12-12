package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_salads.*

class Salads : AppCompatActivity() {

    var salads_check : Int = 0
    var salads_order : String = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_salads)

        back.setOnClickListener(){

            val back = Intent(this,MainActivity::class.java)
            back.putExtra("salads_order",salads_order)
            back.putExtra("salads_check",salads_check)
            Log.d("SaladsOrder",salads_order)
            Log.d("SaladCheck", salads_check.toString())
            startActivity(back)

        }

        Greek.setOnClickListener(){
            AddToSaladsCheck(800)
            AddToSaladsOrder("Греческий салат - 800тг\n")
        }

        Vinegret.setOnClickListener(){
            AddToSaladsCheck(600)
            AddToSaladsOrder("Винегрет - 600тг\n")
        }

        Vitamin.setOnClickListener(){
            AddToSaladsCheck(600)
            AddToSaladsOrder("Витаминный салат - 600тг\n")
        }

        Olivier.setOnClickListener(){
            AddToSaladsCheck(900)
            AddToSaladsOrder("Салат Оливье - 900тг\n")
        }

        Caesar.setOnClickListener(){
            AddToSaladsCheck(900)
            AddToSaladsOrder("Салат Цезарь - 900тг\n")
        }

        Funchosa.setOnClickListener(){
            AddToSaladsCheck(700)
            AddToSaladsOrder("Салат Фунчоза овощная - 700тг\n")
        }


    }

    fun AddToSaladsCheck(price : Int){
        salads_check += price
    }


    fun AddToSaladsOrder(dish : String){
        salads_order += dish
    }



}