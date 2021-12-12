package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_bakery_products.*


class BakeryProducts : AppCompatActivity() {

    var bakeryProducts_check : Int = 0
    var bakeryProducts_order : String = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bakery_products)

        back.setOnClickListener(){
            val back = Intent(this,MainActivity::class.java)
            back.putExtra("bakeryProducts_order",bakeryProducts_order)
            back.putExtra("bakeryProducts_check",bakeryProducts_check)
            Log.d("bakeryProducts_order",bakeryProducts_order)
            Log.d("bakeryProducts_check", bakeryProducts_check.toString())
            startActivity(back)
        }

        SamsaMeat.setOnClickListener(){
            AddToBakeryProductsCheck(200)
            AddToBakeryProductsOrder("Самса с говядиной - 200тг\n")
        }

        SamsaChicken.setOnClickListener(){
            AddToBakeryProductsCheck(180)
            AddToBakeryProductsOrder("Самса с курицей - 180тг\n")
        }

        SamsaCheese.setOnClickListener(){
            AddToBakeryProductsCheck(150)
            AddToBakeryProductsOrder("Самса с сыром - 150тг\n")
        }

        Khachapuri.setOnClickListener(){
            AddToBakeryProductsCheck(1000)
            AddToBakeryProductsOrder("Хачапури по аджарски - 1000тг\n")
        }

        Tortilla.setOnClickListener(){
            AddToBakeryProductsCheck(100)
            AddToBakeryProductsOrder("Лепешка - 100тг\n")
        }
    }

    fun AddToBakeryProductsCheck(price : Int){
        bakeryProducts_check += price
    }


    fun AddToBakeryProductsOrder(dish : String){
        bakeryProducts_order += dish
    }
}