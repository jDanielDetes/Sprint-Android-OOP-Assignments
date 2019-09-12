package com.lambdaschool.abstractionintpoly.model

import com.google.gson.annotations.SerializedName

/*
{
    name: "TIE Advanced x1",
    model: "Twin Ion Engine Advanced x1",
    manufacturer: "Sienar Fleet Systems",
    cost_in_credits: "unknown",
    length: "9.2",
    url: "https://swapi.co/api/starships/13/"
}
 */

// TODO 3: S05M02-3 Add class which inherits from parent class
data class Person (
    val height:String,
    val mass: String,
    val hair_color: String,
    @SerializedName("skin_color") val skinColor : String,
    @SerializedName("eye_color") val eyeColor:String


) : SwApiObject() {
    override fun info (): String = "EYES: $eyeColor\n URL= $url"

    override fun toString(): String {
        return "$name is $height cm tall, they have $S"
    }


}