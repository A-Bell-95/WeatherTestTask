package com.bignerdranch.android.weathertesttask

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.bignerdranch.android.weathertesttask.databinding.FragmentRootBinding

private const val TAG = "WeatherFragment"

class WeatherFragment : Fragment() {

    private lateinit var binding: FragmentRootBinding
    private val weatherViewModel: WeatherViewModel by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentRootBinding.inflate(layoutInflater, container, false)

        binding.currentCity.text = weatherViewModel.currentCity
        binding.temperature.text = weatherViewModel.currentTemperature.toString()
        binding.dateTime.text = weatherViewModel.updateDate.toString()


        //binding.currentWeather = weatherViewModel.setImageDrawable()
        binding.updateButton.setOnClickListener { weatherViewModel.updateInfo() }
        binding.russianButton.setOnClickListener { weatherViewModel.translateRu() }
        binding.usaButton.setOnClickListener { weatherViewModel.translateEn() }

        return binding.root
    }
}
