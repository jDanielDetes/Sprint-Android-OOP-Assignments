package com.example.androidinheritance

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    val shoppingList = ArrayList<ShoppingItem>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        generateTestValues()
    }

        val testValues: ArrayList<ShoppingItem> = arrayListOf(

            ShoppingItem.fruitItem(Color.RED,"Apple",true),
            ShoppingItem.fruitItem(Color.YELLOW,"Banana",true),
            ShoppingItem.winterClothes(Color.GREEN,"Hoodie","Medium"),
            ShoppingItem.winterClothes(Color.LTGRAY,"Jacket","Large"),
            ShoppingItem.newCar(Color.BLUE,"Car","Tesla"),
            ShoppingItem.newCar(Color.WHITE,"Car","Toyota")

        )
    fun generateTestValues() {
        testValues.forEach {
            shoppingList.add(it)
        }
    }
}
