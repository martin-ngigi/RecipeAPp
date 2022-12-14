package com.example.recipeapp.Database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.recipeapp.DataAccessObject.RecipeDao
import com.example.recipeapp.Entities.Category
import com.example.recipeapp.Entities.CategoryItems
import com.example.recipeapp.Entities.Converter.CategoryListConverter
import com.example.recipeapp.Entities.Recipes

@Database(entities = [Recipes::class, CategoryItems::class, Category::class, CategoryListConverter::class], version = 1, exportSchema = false)
abstract class RecipeDatabase:RoomDatabase() {
    companion object{
        var recipeDatabase:RecipeDatabase?=null

        @Synchronized
        fun getDatabase(context: Context): RecipeDatabase{
            if (recipeDatabase != null){
                recipeDatabase = Room.databaseBuilder(
                    context,
                    RecipeDatabase::class.java,
                    "recipe.db"
                ).build()
            }
            return recipeDatabase!!
        }
    }

    abstract  fun recipeDao():RecipeDao
}