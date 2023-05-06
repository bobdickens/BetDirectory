package com.example.betdirectory.screens

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.betdirectory.APP
import com.example.betdirectory.R
import com.example.betdirectory.databinding.FragmentMenuBinding

class MenuFragment : Fragment() {

    lateinit var binding: FragmentMenuBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
       binding = FragmentMenuBinding.inflate(layoutInflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        init()
    }

   private fun init(){
        binding.btnTypes.setOnClickListener {
            APP.navController.navigate(R.id.action_menuFragment_to_typesFragment)
        }
       binding.btnStrategy.setOnClickListener {
           APP.navController.navigate(R.id.action_menuFragment_to_strategyFragment)
       }
       binding.btnFAQ.setOnClickListener {
           APP.navController.navigate(R.id.action_menuFragment_to_FAQFragment)
       }
    }

}