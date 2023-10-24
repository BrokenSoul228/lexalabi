package com.example.lexalabi

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.fragment.findNavController
import com.example.lexalabi.databinding.FragmentLinearBinding

class LinearFragment : Fragment() {

    private lateinit var binding: FragmentLinearBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentLinearBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.navigation.setOnClickListener {
            findNavController().navigate(R.id.action_linearFragment_to_relativeFragment5)
        }
    }

}