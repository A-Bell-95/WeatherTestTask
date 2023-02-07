package com.bignerdranch.android.weathertesttask

import android.graphics.drawable.Drawable
import android.widget.ImageView
import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import java.util.*

class WeatherViewModel : ViewModel() {
    var currentTemperature = 0
    var currentCity = ""
    lateinit var updateDate: Date

//    fun setImageDrawable(view: ImageView, drawable: Drawable) {
//        view.setImageDrawable(drawable)
//    }
    fun updateInfo(){

    }
    fun translateRu(){

    }
    fun translateEn(){

    }
}