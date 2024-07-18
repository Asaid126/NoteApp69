package com.example.noteapp69.date.models

import android.content.ClipDescription
import android.media.audiofx.AudioEffect.Descriptor
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "noteModel")
data class NoteModel(

    val title:String,
    val description:String
){
    @PrimaryKey(autoGenerate = true)
    var id:Int =0

}
