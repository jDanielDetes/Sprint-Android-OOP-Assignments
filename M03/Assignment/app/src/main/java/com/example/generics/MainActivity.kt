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

        class Task2<L> {
            private var contents:L? = null

            fun put(l: L) {
                contents = l

            }
            fun  get ():L? {
                return contents
            }

        }
        val test6 = Task2<String>()
            test6.put(" test String")
            test6.put(4)
    }




}
