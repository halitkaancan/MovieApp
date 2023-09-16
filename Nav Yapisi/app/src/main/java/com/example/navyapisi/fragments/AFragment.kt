package com.example.navyapisi.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.navyapisi.R
import com.example.navyapisi.databinding.FragmentABinding
import com.example.navyapisi.databinding.FragmentHomeBinding


class AFragment : Fragment() {

    private lateinit var binding: FragmentABinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentABinding.inflate(inflater, container, false)

        binding.goToBButton.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.A_to_B)
        }

        return binding.root
    }

}