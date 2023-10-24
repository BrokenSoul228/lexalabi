package com.example.lexalabi

import android.R
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.example.lexalabi.databinding.FragmentListBinding
import java.util.Arrays


class ListFragment : Fragment() {

    private lateinit var binding: FragmentListBinding
    private lateinit var listView : ListView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentListBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        listView = binding.listView
        val r = resources
        val array = listOf<String>("Уручье", "Борисовский тракт", "Восток", "Московская" ,"Парк Челюскинцев" ,"Академия наук" , "Площадь Якуба Коласа" ,"Площадь Победы","Октябрьская","Площадь Ленина","Институт Культуры","Грушевка","Михалово","Петровщина","Малиновка","Каменная Горка","Кунцевщина","Спортивная","Пушкинская","Молодёжная","Фрунзенская","Немига","Купаловская","Первомайская","Пролетарская","Тракторный завод","Партизанская","Автозаводская","Могилёвская")
        val aa: ArrayAdapter<String> = ArrayAdapter(requireContext(), android.R.layout.simple_list_item_1, array)
        listView.adapter = aa
        listView.setOnItemClickListener { parent, view, position, id ->
            val selectedItem = parent.getItemAtPosition(position) as String
            Toast.makeText(requireContext(), "Выбранное метро: $selectedItem", Toast.LENGTH_SHORT).show()
        }
    }
}