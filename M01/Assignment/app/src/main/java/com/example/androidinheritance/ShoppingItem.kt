package com.example.androidinheritance

open class ShoppingItem (val colorId : Int , val productName : String) {

   open fun getdisplayName() : String {
        return "The product is a $productName"
    }

    class fruitItem (colorId: Int, productName: String) : ShoppingItem(colorId,productName){
        override  fun getdisplayName():String {
            return "It's a $productName and the color is $colorId great for snacking and must be refrigerated "
        }
    }

    class winterClothes (colorId: Int,productName: String) : ShoppingItem(colorId,productName) {
        override fun getdisplayName(): String {
            return "Its a $productName great for cold weather the color is $colorId size is medium"
        }

    }


    class newCar (colorId: Int,productName: String): ShoppingItem(colorId,productName) {
        override fun getdisplayName(): String {
            return "Its a brand new $productName pretty expensive but the color $colorId looks great "
        }
    }




}
