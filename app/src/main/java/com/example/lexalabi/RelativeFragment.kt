package com.example.lexalabi

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.fragment.findNavController
import com.example.lexalabi.databinding.FragmentLinearBinding
import com.example.lexalabi.databinding.FragmentRelative2Binding

class RelativeFragment : Fragment() {

    private lateinit var binding: FragmentRelative2Binding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentRelative2Binding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.ok.setOnClickListener {
            Toast.makeText(context, "You Press Button OK", Toast.LENGTH_SHORT).show()
        }
        binding.cancel.setOnClickListener {
            Toast.makeText(context, "You Press Button Cancel", Toast.LENGTH_SHORT).show()
        }
        binding.navigate.setOnClickListener {
            findNavController().navigate(R.id.action_relativeFragment5_to_tabFragment)
        }
        binding.navigateToWeb.setOnClickListener {
            findNavController().navigate(R.id.action_relativeFragment5_to_webFragment)
        }
        binding.navigateToList.setOnClickListener {
            findNavController().navigate(R.id.action_relativeFragment5_to_listFragment)
        }
    }
}