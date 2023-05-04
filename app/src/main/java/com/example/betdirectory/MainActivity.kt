package com.example.betdirectory

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.navigation.NavController
import androidx.navigation.Navigation
import com.example.betdirectory.databinding.ActivityMainBinding
import com.example.betdirectory.domain.retroDetail.ApiDetail
import com.example.betdirectory.model.TypesOfBets
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding
    lateinit var navController: NavController
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        APP = this
        navController = Navigation.findNavController(this, R.id.nav_fragment)



    }
}