package com.example.interfaces.dummy

import com.example.interfaces.model.Vehicle
import com.example.interfaces.model.air_vehicles
import com.example.interfaces.model.land_vehicles
import com.example.interfaces.model.sea_vehicles
import java.util.ArrayList
import java.util.HashMap

/**
 * Helper class for providing sample content for user interfaces created by
 * Android template wizards.
 *
 * TODO: Replace all uses of this class before publishing your app.
 */
object DummyContent {

    /**
     * An array of sample (dummy) items.
     */
    val ITEMS: MutableList<Vehicle> = ArrayList()

    /**
     * A map of sample (dummy) items, by ID.
     */
    val ITEM_MAP: MutableMap<String, Vehicle> = HashMap()



    init {
        // Add some sample items.
       ITEMS.add(land_vehicles.car("toyota","Blue","Driving",true))
        ITEMS.add(sea_vehicles.Yacht("Ocean Pearl","Red","Sailing",false))
        ITEMS.add(air_vehicles.Jet("Embraer Phenom","gray","Flying",true))
        ITEMS.add(land_vehicles.train("Rail-Star","black","Driving"))
        ITEMS.add(sea_vehicles.Boat("SeaRay","red","Sailing"))
        ITEMS.add(air_vehicles.Helicopter("Sikorsky","gray","Flying"))


        ITEM_MAP[ITEMS[0].id] = ITEMS[0]

        ITEM_MAP[ITEMS[1].id] = ITEMS[1]

        ITEM_MAP[ITEMS[2].id] = ITEMS[2]

        ITEM_MAP[ITEMS[3].id] = ITEMS[3]

        ITEM_MAP[ITEMS[4].id] = ITEMS[4]

        ITEM_MAP[ITEMS[5].id] = ITEMS[5]

    }


}
