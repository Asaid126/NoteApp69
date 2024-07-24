package com.example.noteapp69

import android.app.Application
import androidx.room.Room
import com.example.noteapp69.data.db.AppDataBase
import com.example.noteapp69.utils.PreferenceHelper

//class App {


    class App: Application() {

        companion object{
            var appDatabase: AppDataBase?=null
        }

        override fun onCreate() {
            super.onCreate()
            val sharedPreferences= PreferenceHelper()
            sharedPreferences.unit(this)
            getInstance()
        }

         fun getInstance(): AppDataBase? {
           if (appDatabase==null){
            appDatabase=applicationContext?.let{
                Room.databaseBuilder(
                    it,
                    AppDataBase::class.java,
                    "note.database"
                ).fallbackToDestructiveMigration().allowMainThreadQueries().build()
               }
           }
            return appDatabase
        }

    }

//}