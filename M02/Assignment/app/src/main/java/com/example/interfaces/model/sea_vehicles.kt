package com.example.interfaces.model

class sea_vehicles {

    data class Boat  (
        val model : String = "Sea Ray",
        val color:String = "red",
        val waterTravel: WaterTravel


    ) : Vehicle("Boat", 2871,true) {

        override fun toString(): String {
            return "my favorite way of traveling by sea is $waterTravel in my $id it's color is $color  "

        }
    }

    data class Yacht (
        val model : String ="Ocean Pearl",
        val color:String,
        val waterTravel: WaterTravel


    ) : Vehicle("Yacht", 18000,false) {

        override fun toString(): String {
            return "When i visit my dad in the bahamas he likes to take out his  $id it's huge and the best way to" +
                    "$waterTravel he just got the new model $model "

        }
    }
}