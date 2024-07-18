package com.example.noteapp69.date.db

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.noteapp69.date.db.daos.NoteDao
import com.example.noteapp69.date.models.NoteModel

@Database(entities=[NoteModel::class],version=1)
abstract class AppDatabase:RoomDatabase() {

abstract fun noteDao():NoteDao

}