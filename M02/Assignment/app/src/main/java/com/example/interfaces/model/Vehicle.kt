package com.example.interfaces.model

import java.io.Serializable

abstract class Vehicle (open val id: String,
                        open val weight:Int ,
                        open val favorite:Boolean): Serializable {

override fun toString(): String {
    return "Vehicle(name=$id, weight=$weight, id=$id, favorite =$favorite"
} }



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