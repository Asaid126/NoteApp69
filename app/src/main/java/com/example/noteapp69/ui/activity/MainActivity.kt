package com.example.noteapp69.ui.activity

import android.content.SharedPreferences
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.navigation.NavController
import androidx.navigation.findNavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.fragment.findNavController
import com.example.noteapp69.R
import com.example.noteapp69.databinding.ActivityMainBinding
import com.example.noteapp69.utils.PreferenceHelper

class MainActivity : AppCompatActivity() {

private lateinit var binding: ActivityMainBinding
private lateinit var navController: NavController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }


//    var l=PreferenceHelper().isOnBoardShown
//    if(l==true){
//        findNavController().nav
//    } //не сработало


}