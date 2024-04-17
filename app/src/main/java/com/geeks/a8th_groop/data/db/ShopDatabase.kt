package com.geeks.a8th_groop.data.db

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(entities = [ShopEntity::class], version = 1)
abstract class ShopDatabase : RoomDatabase() {

    abstract fun shopDao(): ShopDao
}
