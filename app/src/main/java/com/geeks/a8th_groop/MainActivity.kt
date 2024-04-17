package com.geeks.a8th_groop

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.geeks.a8th_groop.ui.home.HomeFragment
import com.geeks.a8th_groop.ui.main_fragment.MainFragment
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportFragmentManager.beginTransaction().add(R.id.container, MainFragment()).commit()

        handleIntent()
    }

    private fun handleIntent() {
        val itemName = intent.getStringExtra("itemName")
        if (itemName != null) {
            Log.d("MainActivity", "Received item name: $itemName")
        }
    }
}