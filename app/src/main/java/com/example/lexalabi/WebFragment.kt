package com.example.lexalabi

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.lexalabi.databinding.FragmentWebBinding

class WebFragment : Fragment() {

    private lateinit var binding: FragmentWebBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentWebBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.web.loadUrl("https://docs.flutter.dev/add-to-app/android/project-setup#option-a---depend-on-the-android-archive-aar")
    }
}