package com.example.noteapp69.data.models

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "noteModel") //анатация дает сущность говорит что эта моделька принадлежит Руму ,а таб нейм ему дает кличку(можно сокращенную)  чтоб потом можно было обращаться
data class NoteModel(
    val title:String,
    val description:String
){
    @PrimaryKey(autoGenerate = true)//@PrimaryKey-Ключ который сравнивает данные ,а autoGenerate будет автогенировать для каждой модельки отдельные айди
    var id:Int=0

}
