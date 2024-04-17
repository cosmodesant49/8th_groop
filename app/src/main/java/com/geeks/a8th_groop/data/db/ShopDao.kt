package com.geeks.a8th_groop.data.db

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Update

@Dao
interface ShopDao {

@Insert
fun insert(shop: ShopEntity)

    @Delete
    fun delete(shop: ShopEntity)

    @Update
    fun update(shop: ShopEntity)

    @Query("SELECT * FROM shop ORDER BY name ASC")
    fun getAll(): List<ShopEntity>
}
