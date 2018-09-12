package com.appli.picot.meteoapp.openweathermap

data class Weather(val description: String,
                   val temperature: Float,
                   val humidity: Int,
                   val pressure: Int,
                   val iconUrl: String)
