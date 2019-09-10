package com.example.interfaces.model

class sea_vehicles {

    data class Boat  (
        val model : String = "Sea Ray",
        val color:String = "red",
        val groundTravel: GroundTravel


    ) : Vehicle("Car", 2871,true) {

        override fun toString(): String {
            return "my favorite way of traveling is $groundTravel my $id it's color is $color  "

        }
    }

    data class Submarine (
        val model : String ="",
        val color:String,
        val groundTravel: GroundTravel


    ) : Vehicle("train", 18000,false) {

        override fun toString(): String {
            return "When its a nice day my favorite way to travel is by $id it's always the " +
                    "same $id Conductor i see $groundTravel the brand new $model  "

        }
    }
}