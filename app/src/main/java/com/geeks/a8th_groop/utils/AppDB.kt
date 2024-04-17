package com.geeks.a8th_groop.utils

import android.app.Application
import androidx.room.Room
import com.geeks.a8th_groop.data.db.ShopDatabase

class AppDB : Application() {

    override fun onCreate() {
        super.onCreate()
        db = Room.databaseBuilder(
            applicationContext,
            ShopDatabase::class.java, "database-name"
        ).allowMainThreadQueries().build()
    }

    companion object {
        lateinit var db: ShopDatabase
    }
}