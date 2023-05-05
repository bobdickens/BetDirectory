package com.example.betdirectory

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.betdirectory.databinding.FragmentDetailBinding
import com.example.betdirectory.domain.retroDetail.ApiDetail
import com.example.betdirectory.model.TypesOfBets
import com.example.betdirectory.model.TypesOfBetsItem
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class DetailFragment : Fragment() {
    lateinit var binding: FragmentDetailBinding


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentDetailBinding.inflate(layoutInflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val id = arguments?.getInt("id")
        if (id != null) {
            retro(id)
        }

    }


    private fun retro(id: Int){
        val apiInterface = ApiDetail.create().getTypes()

        apiInterface.enqueue( object : Callback<TypesOfBets> {
            override fun onResponse(call: Call<TypesOfBets>?, response: Response<TypesOfBets>?) {

                if(response?.body() != null) {
                    Log.d("Retro", response.body().toString())
                    parser(response, id)
                }
            }
            override fun onFailure(call: Call<TypesOfBets>?, t: Throwable?) {
            }
        })
    }

    private fun parser(response: Response<TypesOfBets>, id: Int) {
        val text = response.body()?.get(id)?.text
        val title = response.body()?.get(id)?.title
        binding.btnBack.setOnClickListener {
            APP.navController.navigate(R.id.action_detailFragment_to_typesFragment)
        }
        binding.tvText.text = text.toString()
        binding.textView.text = title.toString()
    }
}