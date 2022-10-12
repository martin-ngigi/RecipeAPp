package com.example.recipeapp.Entities


import com.google.gson.annotations.SerializedName
import androidx.annotation.Keep
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.Expose

@Keep
@Entity(tableName = "CategoryItems")
data class CategoryItems(
    @PrimaryKey(autoGenerate = true)
    var id:Int,

    @ColumnInfo(name = "idCategory")
    @Expose
    @SerializedName("idCategory")
    val idCategory: String,

    @ColumnInfo(name = "strCategory")
    @Expose
    @SerializedName("strCategory")
    val strCategory: String,

    @ColumnInfo(name = "strCategoryDescription")
    @Expose
    @SerializedName("strCategoryDescription")
    val strCategoryDescription: String,

    @ColumnInfo(name = "strCategoryThumb")
    @Expose
    @SerializedName("strCategoryThumb")
    val strCategoryThumb: String
)
