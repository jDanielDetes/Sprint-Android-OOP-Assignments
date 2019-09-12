package com.example.androidinheritance

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    val shoppingList = ArrayList<ShoppingItem>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        generateTestValues()

        recycler_view.apply {
            layoutManager= LinearLayoutManager(this@MainActivity)
            setHasFixedSize(true)
            adapter = ShoppingAdapter(shoppingList)
        }
    }

        val testValues: ArrayList<ShoppingItem> = arrayListOf(

            ShoppingItem.fruitItem(Color.RED,"Apple",true),
            ShoppingItem.fruitItem(Color.YELLOW,"Banana",true),
            ShoppingItem.winterClothes(Color.GREEN,"Hoodie","Medium"),
            ShoppingItem.winterClothes(Color.DKGRAY,"Jacket","Large"),
            ShoppingItem.newCar(Color.BLUE,"Car","Tesla"),
            ShoppingItem.newCar(Color.WHITE,"Car","Toyota"),
            ShoppingItem.fruitItem(Color.CYAN,"Orange",false)

        )
    fun generateTestValues() {
        testValues.forEach {
            shoppingList.add(it)
        }
    }
}
