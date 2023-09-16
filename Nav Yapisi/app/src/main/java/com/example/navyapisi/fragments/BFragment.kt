package com.example.navyapisi.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.navyapisi.R
import com.example.navyapisi.databinding.FragmentBBinding
import com.example.navyapisi.databinding.FragmentHomeBinding

class BFragment : Fragment() {

    private lateinit var binding: FragmentBBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        binding = FragmentBBinding.inflate(inflater, container, false)
        binding.goToYButton.setOnClickListener {

            Navigation.findNavController(it).navigate(R.id.B_to_Y)
        }


        return binding.root
    }

}