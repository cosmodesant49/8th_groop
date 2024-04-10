package com.geeks.a8th_groop

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.geeks.a8th_groop.ui.main_fragment.MainFragment
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportFragmentManager.beginTransaction().add(R.id.container, MainFragment()).commit()
    }
}