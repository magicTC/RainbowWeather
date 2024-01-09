package com.example.rainbowweather.ui.place



import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.rainbowweather.logic.Repository
import com.example.rainbowweather.logic.model.Place
import androidx.lifecycle.LiveData
import androidx.lifecycle.switchMap


class PlaceViewModel: ViewModel() {
    private val searchLiveData = MutableLiveData<String>()
    val placeList = ArrayList<Place>()
    val placeLiveData = searchLiveData.switchMap { query ->
        Repository.searchPlaces(query)
    }
    fun searchPlaces(query: String) {
        searchLiveData.value = query
    }
}