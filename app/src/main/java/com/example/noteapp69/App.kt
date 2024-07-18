package com.example.noteapp69

import android.app.Application
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.noteapp69.date.db.AppDatabase
import com.example.noteapp69.utils.PreferenceHelper

class App:Application() {

    companion object{
        var appDatabase:AppDatabase?=null
    }

    override fun onCreate() {
        super.onCreate()
        val sharedPreferences=PreferenceHelper()
        sharedPreferences.unit(this)
        getInstance()
    }

    private fun getInstance():AppDatabase? {
      if(appDatabase==null){
          appDatabase=applicationContext?.let{
              Room.databaseBuilder(
                  it,
                  AppDatabase::class.java,
                  "note.database"
              ).fallbackToDestructiveMigration().allowMainThreadQueries().build()
          }
      }
        return appDatabase

    }

}