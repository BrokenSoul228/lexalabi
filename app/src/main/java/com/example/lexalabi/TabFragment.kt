package com.example.lexalabi

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TabHost
import com.example.lexalabi.databinding.FragmentTabBinding
import com.example.lexalabi.databinding.FragmentWebBinding

class TabFragment : Fragment() {

    private lateinit var binding: FragmentTabBinding
    private lateinit var tabhost : TabHost

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentTabBinding.inflate(inflater, container, false)
        return inflater.inflate(R.layout.fragment_tab, container, false)

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }
}