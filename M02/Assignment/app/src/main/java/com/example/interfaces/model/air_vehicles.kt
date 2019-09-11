package com.example.interfaces.model

class air_vehicles {

    data class Helicopter (
        val model : String = "Sikorsky",
        val color:String = "Gray",
        val airTravel: AirTravel


    ) : Vehicle("Helicopter", 2871,true) {

        override fun toString(): String {
            return "my favorite hobby while traveling is $airTravel with $id tours if i bought one i'd get a $color one "

        }
    }

    data class Jet (
        val model : String ="Embraer Phenom",
        val color:String,
        val airTravel: AirTravel


    ) : Vehicle("train", 18000,false) {

        override fun toString(): String {
            return "My uncle used to love $airTravel a $id he used to be in the military and was very experienced " +
                    "his favorite $id was a $model  "

        }
    }


}