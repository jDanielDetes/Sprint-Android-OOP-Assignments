package com.example.interfaces.model

abstract class Vehicle (open val id: String,
                        open val weight:Int ,
                        open val favorite:Boolean)

fun travel():String {
    return ""
}


interface AirTravel {
    fun fly():String{
        return "flying"
    }
}

interface WaterTravel{
    fun sail():String{
        return "Sailing"
    }

}
open interface GroundTravel {
    open fun drive():String{
        return "Driving"

    }

}