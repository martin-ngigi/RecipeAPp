package com.example.recipeapp.DataAccessObject

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.recipeapp.Entities.Recipes

@Dao
interface RecipeDao {

    @get:Query("SELECT * FROM Recipes order BY id DESC")
    val allRecipes: List<Recipes>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertRecipe(recipes: Recipes)
}