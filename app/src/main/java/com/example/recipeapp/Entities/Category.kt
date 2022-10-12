package com.example.recipeapp.Entities


import com.google.gson.annotations.SerializedName
import androidx.annotation.Keep
import androidx.room.*
import com.example.recipeapp.Entities.Converter.CategoryListConverter
import com.google.gson.annotations.Expose

@Keep
@Entity(tableName = "Category")
data class Category(
    @PrimaryKey(autoGenerate = true)
    var id:Int,

    @ColumnInfo(name = "categoryItems")
    @Expose
    @SerializedName("categories")
    @TypeConverters(CategoryListConverter::class)
    val categoryItems: List<CategoryItems>
)
