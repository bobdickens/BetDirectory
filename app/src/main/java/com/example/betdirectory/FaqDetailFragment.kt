package com.example.betdirectory

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.betdirectory.databinding.FragmentFaqDetailBinding
import com.example.betdirectory.domain.retroDetail.retroFaq
import com.example.betdirectory.domain.retroDetail.retroStrategy
import com.example.betdirectory.model.FAQ.Faq
import com.example.betdirectory.model.strategy.Strategy
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response


class FaqDetailFragment : Fragment() {
    lateinit var binding: FragmentFaqDetailBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentFaqDetailBinding.inflate(layoutInflater, container,false)
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
        val apiInterface = retroFaq.create().getFaq()

        apiInterface.enqueue( object : Callback<Faq> {
            override fun onResponse(call: Call<Faq>?, response: Response<Faq>?) {

                if(response?.body() != null) {
                    Log.d("Retro", response.body().toString())
                    parser(response, id)
                }
            }
            override fun onFailure(call: Call<Faq>?, t: Throwable?) {
            }
        })
    }

    private fun parser(response: Response<Faq>, id: Int) {
        val text = response.body()?.get(id)?.text
        val title = response.body()?.get(id)?.title
        binding.btnBack.setOnClickListener {
            APP.navController.navigate(R.id.action_faqDetailFragment_to_FAQFragment)
        }
        binding.tvText.text = text.toString()
        binding.textView.text = title.toString()
    }


}