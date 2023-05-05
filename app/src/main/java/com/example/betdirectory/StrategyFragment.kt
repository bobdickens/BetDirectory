package com.example.betdirectory

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.betdirectory.databinding.FragmentStrategyBinding


class StrategyFragment : Fragment() {
lateinit var binding: FragmentStrategyBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentStrategyBinding.inflate(layoutInflater, container, false)
        return binding.root
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val bundle = Bundle()
        init(bundle)
    }

    private fun init(bundle: Bundle){
        binding.btnBack.setOnClickListener { APP.navController.navigate(R.id.action_strategyFragment_to_menuFragment) }
        binding.btnTypes1.setOnClickListener {
            bundle.putInt("ids", 0)
            APP.navController.navigate(R.id.action_strategyFragment_to_strategyDetailFragment, bundle)
        }
        binding.btnTypes2.setOnClickListener {
            bundle.putInt("ids", 1)
            APP.navController.navigate(R.id.action_strategyFragment_to_strategyDetailFragment, bundle)
        }
        binding.btnTypes3.setOnClickListener {
            bundle.putInt("ids", 2)
            APP.navController.navigate(R.id.action_strategyFragment_to_strategyDetailFragment, bundle)
        }
        binding.btnTypes4.setOnClickListener {
            bundle.putInt("ids", 3)
            APP.navController.navigate(R.id.action_strategyFragment_to_strategyDetailFragment, bundle)
        }
        binding.btnTypes5.setOnClickListener {
            bundle.putInt("ids", 4)
            APP.navController.navigate(R.id.action_strategyFragment_to_strategyDetailFragment, bundle)
        }
        binding.btnTypes6.setOnClickListener {
            bundle.putInt("ids", 5)
            APP.navController.navigate(R.id.action_strategyFragment_to_strategyDetailFragment, bundle)
        }
        binding.btnTypes7.setOnClickListener {
            bundle.putInt("ids", 6)
            APP.navController.navigate(R.id.action_strategyFragment_to_strategyDetailFragment, bundle)
        }
        binding.btnTypes8.setOnClickListener {
            bundle.putInt("ids", 7)
            APP.navController.navigate(R.id.action_strategyFragment_to_strategyDetailFragment, bundle)
        }
        binding.btnTypes9.setOnClickListener {
            bundle.putInt("ids", 8)
            APP.navController.navigate(R.id.action_strategyFragment_to_strategyDetailFragment, bundle)
        }
        binding.btnTypes10.setOnClickListener {
            bundle.putInt("ids", 9)
            APP.navController.navigate(R.id.action_strategyFragment_to_strategyDetailFragment, bundle)
        }
        binding.btnTypes11.setOnClickListener {
            bundle.putInt("ids", 10)
            APP.navController.navigate(R.id.action_strategyFragment_to_strategyDetailFragment, bundle)
        }
        binding.btnTypes12.setOnClickListener {
            bundle.putInt("ids", 11)
            APP.navController.navigate(R.id.action_strategyFragment_to_strategyDetailFragment, bundle)
        }
        binding.btnTypes13.setOnClickListener {
            bundle.putInt("ids", 12)
            APP.navController.navigate(R.id.action_strategyFragment_to_strategyDetailFragment, bundle)
        }
        binding.btnTypes14.setOnClickListener {
            bundle.putInt("ids", 13)
            APP.navController.navigate(R.id.action_strategyFragment_to_strategyDetailFragment, bundle)
        }
        binding.btnTypes15.setOnClickListener {
            bundle.putInt("ids", 14)
            APP.navController.navigate(R.id.action_strategyFragment_to_strategyDetailFragment, bundle)
        }
    }


}