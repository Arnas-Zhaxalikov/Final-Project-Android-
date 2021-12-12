package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_check.*

class Check : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        var delete_checker : Boolean = false
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_check)

        var order = intent.getStringExtra("All_Order")
        var price : Int = intent.getIntExtra("All_Price",0)

        if (order != "") {
            var txt_order = findViewById(R.id.textView_order) as TextView
            txt_order.setText(order)

            var txt_price = findViewById(R.id.texView_price) as TextView
            txt_price.setText(price.toString() + " тг")
        }else{
            var txt_order = findViewById(R.id.textView_order) as TextView
            txt_order.setText("Вы ничего не выбрали")

            var txt_price = findViewById(R.id.texView_price) as TextView
            txt_price.setText(price.toString() + " тг")
        }

        back.setOnClickListener(){
            if (delete_checker == true){
                order = ""
                price = 0
            }
            Log.d("aaaaaaa",delete_checker.toString())

            var intent = Intent(this,MainActivity::class.java)
            intent.putExtra("AllOrder",order)
            intent.putExtra("AllPrice",price)
            startActivity(intent)


        }

        button.setOnClickListener(){
            var txt_order = findViewById(R.id.textView_order) as TextView
            txt_order.setText("Вы ничего не выбрали")

            var txt_price = findViewById(R.id.texView_price) as TextView
            txt_price.setText("0 тг")

            Log.d("checker",delete_checker.toString())
            delete_checker = true
            Log.d("checker_after",delete_checker.toString())
        }
    }


}