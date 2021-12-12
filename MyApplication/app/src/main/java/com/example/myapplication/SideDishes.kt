package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main_dishes.*
import kotlinx.android.synthetic.main.activity_side_dishes.*
import kotlinx.android.synthetic.main.activity_side_dishes.back

class SideDishes : AppCompatActivity() {

    var sideDishes_check = 0
    var sideDishes_order = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_side_dishes)

        back.setOnClickListener(){
            val back = Intent(this,MainActivity::class.java)
            back.putExtra("sideDishes_order",sideDishes_order)
            back.putExtra("sideDishes_check",sideDishes_check)
            Log.d("sideDishes_order",sideDishes_order)
            Log.d("sideDishes_check", sideDishes_check.toString())
            startActivity(back)
        }

        Rice.setOnClickListener(){
            AddToSideDishesCheck(500)
            AddToSideDishesOrder("Рис с овощами - 500тг\n")
        }

        MashedPotatoes.setOnClickListener(){
            AddToSideDishesCheck(600)
            AddToSideDishesOrder("Пюре из картофеля - 600тг\n")
        }

        FrenchFries.setOnClickListener(){
            AddToSideDishesCheck(500)
            AddToSideDishesOrder("Картофель фри - 500тг\n")
        }

        GrilledVegetables.setOnClickListener(){
            AddToSideDishesCheck(700)
            AddToSideDishesOrder("Овощи гриль - 700тг\n")
        }

    }

    fun AddToSideDishesCheck(price : Int){
        sideDishes_check += price
    }


    fun AddToSideDishesOrder(dish : String){
        sideDishes_order += dish
    }

}