package com.example.navyapisi.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.navyapisi.R
import com.example.navyapisi.databinding.FragmentXBinding

class XFragment : Fragment() {

    private lateinit var binding: FragmentXBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment


        binding = FragmentXBinding.inflate(inflater,container,false)

        binding.goToYButtonfromX.setOnClickListener{
            Navigation.findNavController(it).navigate(R.id.x_to_y)
        }
        return binding.root
    }

}