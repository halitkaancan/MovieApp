package com.example.navyapisi.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.navyapisi.R
import com.example.navyapisi.databinding.FragmentHomeBinding


class HomeFragment : Fragment() {
    private lateinit var binding: FragmentHomeBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = FragmentHomeBinding.inflate(inflater,container,false)

        binding.goToAButton.setOnClickListener{

            Navigation.findNavController(it).navigate(R.id.homePage_to_A)
        }
        binding.goToXButton.setOnClickListener{

            Navigation.findNavController(it).navigate(R.id.homepage_to_X)

        }

        return binding.root
    }

}