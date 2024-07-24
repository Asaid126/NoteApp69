package com.example.noteapp69.ui.adapters

import android.provider.ContactsContract.CommonDataKinds.Note
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.example.noteapp69.data.models.NoteModel
import com.example.noteapp69.databinding.ItemNoteBinding

class NoteAdapter:ListAdapter<NoteModel,NoteAdapter.ViewHolder>(DiffCallback()){
    class ViewHolder(private val binding:ItemNoteBinding ):RecyclerView.ViewHolder(binding.root) {

        fun onBind(item: NoteModel) {              //привязываем нашу модельку с версткой

            binding.itemTitle.text=item.title
            binding.itemDescription.text=item.description

        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int):ViewHolder {
      return ViewHolder(
          ItemNoteBinding.inflate(
              LayoutInflater.from(parent.context),
              parent,
              false
          )
      )
    }

    override fun onBindViewHolder(holder:ViewHolder, position: Int) {
        holder.onBind(getItem(position))  //для Айтемок
    }

    class DiffCallback: DiffUtil.ItemCallback<NoteModel>(){
        override fun areItemsTheSame(oldItem: NoteModel, newItem: NoteModel): Boolean {
           return oldItem.id==newItem.id
        }

        override fun areContentsTheSame(oldItem: NoteModel, newItem: NoteModel): Boolean {
           return oldItem==newItem
        }

    }

}