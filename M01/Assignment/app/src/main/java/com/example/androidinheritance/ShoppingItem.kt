package com.example.androidinheritance

class ShoppingItem (val colorId : Int , val productName : String) {

    fun getdisplayName() : String {
        return "The product is a $productName"
    }

    class Apple(colorId: Int=1, productName: String)

}
