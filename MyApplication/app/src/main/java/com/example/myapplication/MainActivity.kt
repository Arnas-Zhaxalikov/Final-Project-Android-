package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*

var AllOrder = ""
var AllPrice : Int = 0

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        salads.setOnClickListener(){
            val salad_intent = Intent(this,Salads::class.java)
            startActivity(salad_intent)
        }

        var salads_order = intent.getStringExtra("salads_order")
        var salads_price = intent.getIntExtra("salads_check",0)
        if (salads_order != null){
            AllOrder += salads_order
            AllPrice += salads_price
        }


        main_dishes.setOnClickListener(){
            val main_dishes_intent = Intent(this,MainDishes::class.java)
            startActivity(main_dishes_intent)
        }

        var mainDishes_order = intent.getStringExtra("mainDishes_order")
        var mainDishes_price = intent.getIntExtra("mainDishes_check",0)
        if (mainDishes_order != null){
            AllOrder += mainDishes_order
            AllPrice += mainDishes_price
        }

        side_dishes.setOnClickListener(){
            val side_dishes_intent = Intent(this,SideDishes::class.java)
            startActivity(side_dishes_intent)
        }

        var sideDishes_order = intent.getStringExtra("sideDishes_order")
        var sideDishes_price = intent.getIntExtra("sideDishes_check",0)
        if (sideDishes_order != null){
            AllOrder += sideDishes_order
            AllPrice += sideDishes_price
        }

        bakery_products.setOnClickListener(){
            val bakery_products_intent = Intent(this, BakeryProducts::class.java)
            startActivity(bakery_products_intent)
        }

        var bakery_products_order = intent.getStringExtra("bakeryProducts_order")
        var bakery_products_price = intent.getIntExtra("bakeryProducts_check",0)
        if (bakery_products_order != null){
            AllOrder += bakery_products_order
            AllPrice += bakery_products_price
        }

        sweets.setOnClickListener(){
            val sweets_intent = Intent(this,Sweets::class.java)
            startActivity(sweets_intent)
        }

        var sweets_order = intent.getStringExtra("sweets_order")
        var sweets_price = intent.getIntExtra("sweets_check",0)
        if (sweets_order != null){
            AllOrder += sweets_order
            AllPrice += sweets_price
        }

        drinks.setOnClickListener(){
            val drinks_intent = Intent(this,Drinks::class.java)
            startActivity(drinks_intent)
        }

        var drinks_order = intent.getStringExtra("drinks_order")
        var drinks_price = intent.getIntExtra("drinks_check",0)
        if (drinks_order != null){
            AllOrder += drinks_order
            AllPrice += drinks_price
        }

        check.setOnClickListener(){
            val check_intent = Intent(this,Check::class.java)
            check_intent.putExtra("All_Order", AllOrder)
            check_intent.putExtra("All_Price", AllPrice)
            startActivity(check_intent)

            Log.d("Total", AllOrder)
            Log.d("Total price: ", AllPrice.toString())
        }

        if (intent.getStringExtra("AllOrder") != null){
            AllOrder = intent.getStringExtra("AllOrder")!!
            AllPrice = intent.getIntExtra("AllPrice",0)
        }
    }
}