package com.example.interfaces.model

class Vehicle (id: String,weight:Int,favorite:Boolean)

fun fly():String {
    return ""
}


interface AirTravel {
    fun fly():String{
        return ""
    }
}

interface WaterTravel{
    fun sail():String{
        return""
    }

}
interface GroundTravel {
    fun drive():String{
        return ""

    }

}