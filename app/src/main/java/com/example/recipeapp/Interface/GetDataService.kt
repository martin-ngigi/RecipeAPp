package com.example.recipeapp.Interface

import com.example.recipeapp.Entities.Category
import retrofit2.Call
import retrofit2.http.GET


interface GetDataService {
    @GET("/categories.php")
    fun getCategoryList(): Call<List<Category>>
}