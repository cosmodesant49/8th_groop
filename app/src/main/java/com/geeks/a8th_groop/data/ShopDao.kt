package com.geeks.a8th_groop.data

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query

@Dao
interface ShopDao {
    @Query("SELECT * FROM shop")
    fun getAllShop(): LiveData<List<ShopEntity>>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertShop(weather: ShopEntity)

    @Delete
    fun deleteShop(weatherEntities: ShopEntity)
}