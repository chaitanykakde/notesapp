package com.example.notesapp.UI

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.notesapp.R
import com.example.notesapp.databinding.FragmentCreateNotesBinding
import com.example.notesapp.databinding.FragmentHomeBinding


class CreateNotesFragment : Fragment() {
    lateinit var binding: FragmentCreateNotesBinding
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding=FragmentCreateNotesBinding.inflate(layoutInflater,container,false)
        return binding.root
    }


}