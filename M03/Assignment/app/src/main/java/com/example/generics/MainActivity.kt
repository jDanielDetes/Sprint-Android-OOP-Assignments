package com.example.generics

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val Task1  = mutableListOf("test1", "test2","test3")
        Task1.add("test4")
        Task1.add(5.toString())
    }



class task2(): String {


}
}
