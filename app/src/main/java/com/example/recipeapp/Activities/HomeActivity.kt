package com.example.recipeapp.Activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.recipeapp.Adapters.MainCategoryAdapter
import com.example.recipeapp.Adapters.SubCategoryAdapter
import com.example.recipeapp.Entities.Recipes
import com.example.recipeapp.R
import kotlinx.android.synthetic.main.activity_home.*

class HomeActivity : AppCompatActivity() {
    var arrMainCategory = ArrayList<Recipes>()
    var arrSubCategory = ArrayList<Recipes>()

    var mainCategoryAdapter = MainCategoryAdapter()
    var subCategoryAdapter = SubCategoryAdapter()

    //private lateinit var subCategoryRV : RecyclerView
    //private lateinit var mainCategoryRV : RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        //subCategoryRV = findViewById(R.id.subCategoryRV)
        //mainCategoryRV = findViewById(R.id.mainCategoryRV)

        //set dummy data for testing
        arrMainCategory.add(Recipes(1, "Beef"))
        arrMainCategory.add(Recipes(2, "Chicken"))
        arrMainCategory.add(Recipes(3, "Dessert"))
        arrMainCategory.add(Recipes(4, "Lamb"))
        arrMainCategory.add(Recipes(5, "Pork"))

        mainCategoryAdapter.setData(arrMainCategory)

        arrSubCategory.add(Recipes(1, "Beef"))
        arrSubCategory.add(Recipes(2, "Chicken"))
        arrSubCategory.add(Recipes(3, "Dessert"))
        arrSubCategory.add(Recipes(4, "Lamb"))
        arrSubCategory.add(Recipes(5, "Pork"))

        subCategoryAdapter.setData(arrSubCategory)

        mainCategoryRV.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        subCategoryRV.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)

        //set adapters
        mainCategoryRV.adapter = mainCategoryAdapter
        subCategoryRV.adapter = subCategoryAdapter
    }
}