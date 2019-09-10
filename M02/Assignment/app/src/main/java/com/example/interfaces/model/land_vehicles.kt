package com.example.interfaces.model

/*
data class Starship(
    val model: String,
    val manufacturer: String,
    @SerializedName("cost_in_credits") val costInCredits: String,
    val length: String

override fun toString(): String {
        return "$name, model $model is manufactured by $manufacturer, is $length m in length, and was built at a cost of $costInCredits credits. Url is $url"
    }

 */

class land_vehicles {

    data class car (
        val model : String = "Toyota",
        val color:String = "Blue",
        val groundTravel: GroundTravel


    ) : Vehicle("Car", 2871,true) {

        override fun toString(): String {
            return "my favorite way of traveling is $groundTravel my $id it's color is $color  "

        }
    }

    data class train (
        val model : String ="Rail-Star",
        val color:String,
        val groundTravel: GroundTravel


    ) : Vehicle("train", 18000,false) {

        override fun toString(): String {
            return "When its a nice day my favorite way to travel is by $id it's always the " +
                    "same $id Conductor i see $groundTravel the brand new $model  "

        }
    }




}