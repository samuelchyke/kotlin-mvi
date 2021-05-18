package com.example.kotlin_mvi_architecture.ui.main

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.kotlin_mvi_architecture.R

class MainActivity : AppCompatActivity()
{


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        showMainFragment()

    }
    
    private fun showMainFragment(){
        supportFragmentManager.beginTransaction()
            .replace(R.id.fragment_container, MainFragment(), "MainFragment")
            .commit()
    }


}























