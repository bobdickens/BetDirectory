package com.example.betdirectory.screens

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.betdirectory.APP
import com.example.betdirectory.R
import com.example.betdirectory.databinding.FragmentStrategyDetailBinding
import com.example.betdirectory.domain.retroDetail.retroStrategy
import com.example.betdirectory.model.strategy.Strategy
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response


class StrategyDetailFragment : Fragment() {
lateinit var binding: FragmentStrategyDetailBinding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentStrategyDetailBinding.inflate(layoutInflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val id = arguments?.getInt("ids")
        if (id != null) {
            retro(id)
        }
    }

    private fun retro(id: Int){
        val apiInterface = retroStrategy.create().getTypes()

        apiInterface.enqueue( object : Callback<Strategy> {
            override fun onResponse(call: Call<Strategy>?, response: Response<Strategy>?) {

                if(response?.body() != null) {
                    Log.d("Retro", response.body().toString())
                    parser(response, id)
                }
            }
            override fun onFailure(call: Call<Strategy>?, t: Throwable?) {
            }
        })
    }

    private fun parser(response: Response<Strategy>, id: Int) {
        val text = response.body()?.get(id)?.text
        val title = response.body()?.get(id)?.title
        binding.btnBack.setOnClickListener {
            APP.navController.navigate(R.id.action_strategyDetailFragment_to_strategyFragment)
        }
        binding.tvText.text = text.toString()
        binding.textView.text = title.toString()
    }


}