package com.example.betdirectory

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.betdirectory.databinding.FragmentTypesBinding
import com.example.betdirectory.domain.retroDetail.ApiDetail
import com.example.betdirectory.model.TypesOfBets
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class TypesFragment : Fragment() {
lateinit var binding: FragmentTypesBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentTypesBinding.inflate(layoutInflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val bundleText = Bundle()
        init(bundleText)
    }


    private fun init(bundleText: Bundle){
        binding.btn1.setOnClickListener {
            bundleText.putInt("id", 0)
            APP.navController.navigate(R.id.action_typesFragment_to_detailFragment, bundleText)
        }
        binding.btn2.setOnClickListener {
            bundleText.putInt("id", 1)
            APP.navController.navigate(R.id.action_typesFragment_to_detailFragment, bundleText)
        }
        binding.btn3.setOnClickListener {
            bundleText.putInt("id", 2)
            APP.navController.navigate(R.id.action_typesFragment_to_detailFragment, bundleText)
        }
        binding.btn4.setOnClickListener {
            bundleText.putInt("id", 3)
            APP.navController.navigate(R.id.action_typesFragment_to_detailFragment, bundleText)
        }
        binding.btn5.setOnClickListener {
            bundleText.putInt("id", 4)
            APP.navController.navigate(R.id.action_typesFragment_to_detailFragment, bundleText)
        }
        binding.btn6.setOnClickListener {
            bundleText.putInt("id", 5)
            APP.navController.navigate(R.id.action_typesFragment_to_detailFragment, bundleText)
        }
        binding.btn7.setOnClickListener {
            bundleText.putInt("id", 6)
            APP.navController.navigate(R.id.action_typesFragment_to_detailFragment, bundleText)
        }
        binding.btn8.setOnClickListener {
            bundleText.putInt("id", 7)
            APP.navController.navigate(R.id.action_typesFragment_to_detailFragment, bundleText)
        }
        binding.btn9.setOnClickListener {
            bundleText.putInt("id", 8)
            APP.navController.navigate(R.id.action_typesFragment_to_detailFragment, bundleText)
        }
        binding.btn10.setOnClickListener {
            bundleText.putInt("id", 9)
            APP.navController.navigate(R.id.action_typesFragment_to_detailFragment, bundleText)
        }
        binding.btn11.setOnClickListener {
            bundleText.putInt("id", 10)
            APP.navController.navigate(R.id.action_typesFragment_to_detailFragment, bundleText)
        }


    }



}