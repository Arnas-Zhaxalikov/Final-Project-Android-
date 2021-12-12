package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main_dishes.*
import kotlinx.android.synthetic.main.activity_main_dishes.back
import kotlinx.android.synthetic.main.activity_salads.*

class MainDishes : AppCompatActivity() {

    var mainDishes_check = 0
    var mainDishes_order = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_dishes)

        back.setOnClickListener(){
            val back = Intent(this,MainActivity::class.java)
            back.putExtra("mainDishes_order",mainDishes_order)
            back.putExtra("mainDishes_check",mainDishes_check)
            Log.d("mainDishes_order",mainDishes_order)
            Log.d("mainDishes_check", mainDishes_check.toString())
            startActivity(back)
        }

        Manty.setOnClickListener(){
            AddToMainDishesCheck(1400)
            AddToMainDishesOrder("Манты с говядиной - 1400тг\n")
        }

        Roast.setOnClickListener(){
            AddToMainDishesCheck(1600)
            AddToMainDishesOrder("Жаркое - 1600тг\n")
        }

        Pilaf.setOnClickListener(){
            AddToMainDishesCheck(1300)
            AddToMainDishesOrder("Плов с говядиной - 1300тг\n")
        }

        Lagman.setOnClickListener(){
            AddToMainDishesCheck(1200)
            AddToMainDishesOrder("Лагман - 1200тг\n")
        }

        Borsch.setOnClickListener(){
            AddToMainDishesCheck(1050)
            AddToMainDishesOrder("Украинский борщ - 1050тг\n")
        }

        Okroshka.setOnClickListener(){
            AddToMainDishesCheck(1150)
            AddToMainDishesOrder("Окрошка на сыворотке - 1150тг\n")
        }
        FishSoup.setOnClickListener(){
            AddToMainDishesCheck(1350)
            AddToMainDishesOrder("Уха по фински - 1350тг\n")
        }
    }

    fun AddToMainDishesCheck(price : Int){
        mainDishes_check += price
    }


    fun AddToMainDishesOrder(dish : String){
        mainDishes_order += dish
    }

}