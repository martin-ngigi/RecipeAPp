package com.example.recipeapp.DataAccessObject

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.recipeapp.Entities.Category
import com.example.recipeapp.Entities.Recipes

@Dao
interface RecipeDao {

    @get:Query("SELECT * FROM Category ORDER BY id DESC")
    val getALlCategory: List<Category>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertCategory(category: Category)
}