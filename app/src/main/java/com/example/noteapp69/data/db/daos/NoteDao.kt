package com.example.noteapp69.data.db.daos

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.noteapp69.data.models.NoteModel

@Dao
interface NoteDao {

    @Query("SELECT*FROM noteModel")   // Чтоб достать то что есть в нотеМодел
    fun getAll():LiveData<List<NoteModel>>

    @Insert(onConflict = OnConflictStrategy.REPLACE)//эта анатация для добавления
    fun insertNote(noteModel: NoteModel)
}