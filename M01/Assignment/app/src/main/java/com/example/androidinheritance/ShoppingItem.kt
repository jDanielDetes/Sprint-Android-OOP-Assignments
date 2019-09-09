package com.example.androidinheritance

open class ShoppingItem (val colorId : Int , val productName : String) {

   open fun getdisplayName() : String {
        return "The product is a $productName"
    }

    class fruitItem (colorId: Int, productName: String, val isRefrigerated: Boolean) : ShoppingItem(colorId,productName){
        override  fun getdisplayName():String {
            return "It's a $productName and the color is $colorId great for snacking but does this item need to be  refrigerated true or false? " +
                    ".. well obviously it is $isRefrigerated "
        }
    }

    class winterClothes (colorId: Int,productName: String, val size : String) : ShoppingItem(colorId,productName) {
        override fun getdisplayName(): String {
            return "Its a $productName great for cold weather the color is $colorId size is $size"
        }

    }


    class newCar (colorId: Int,productName: String, val carBrand: String): ShoppingItem(colorId,productName) {
        override fun getdisplayName(): String {
            return "Its a brand new $productName pretty expensive but the color $colorId looks great not to mention it is a $carBrand "
        }
    }




}
