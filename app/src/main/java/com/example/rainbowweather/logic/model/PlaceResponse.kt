package com.example.rainbowweather.logic.model

import com.google.gson.annotations.SerializedName


data class PlaceResponse(val status:String, val places: List<Place>)

data class Place(val name: String, val location: Location,
            @SerializedName("formatted") val address: String)

data class Location(val lng: String, val lat:String)