package com.example.noteapp69

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.noteapp69.data.models.NoteModel
import com.example.noteapp69.databinding.FragmentNoteBinding
import com.example.noteapp69.databinding.FragmentNoteDetailBinding


class NoteDetailFragment : Fragment() {

    private lateinit var binding: FragmentNoteDetailBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
       binding=FragmentNoteDetailBinding.inflate(inflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setupListner()
    }

    private fun setupListner() {
        binding.btnAddText.setOnClickListener{
            val etTitle=binding.etTitle.text.toString()
            val etDescriptor=binding.etDescription.text.toString()
            App().getInstance()?.noteDao()?.insertNote(NoteModel(etTitle,etDescriptor)) //сохраняет в РУУМ
            findNavController().navigateUp()
        }
    }


}
