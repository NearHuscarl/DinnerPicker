package com.nearhuscarl.dinnerpicker

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {
    val foods = arrayListOf("Chinese", "Hamburger", "Pizza", "Taco", "Pho")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        decideBtn.setOnClickListener {
            val random = Random()
            val randomFood = random.nextInt(foods.count())
            selectedFoodTxt.text = foods[randomFood]
        }

        addFoodBtn.setOnClickListener {
            val newFood = addFoodTxt.text.toString()
            foods.add(newFood)
            addFoodTxt.text.clear()
            println(foods)
        }
    }
}
