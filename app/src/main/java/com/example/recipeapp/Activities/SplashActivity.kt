package com.example.recipeapp.Activities

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import retrofit2.Callback
import androidx.appcompat.app.AppCompatActivity
import com.example.recipeapp.Entities.Category
import com.example.recipeapp.Interface.GetDataService
import com.example.recipeapp.R
import com.example.recipeapp.RetrofitClient.RetrofitClientInstance
import kotlinx.android.synthetic.main.activity_splash.*
import retrofit2.Call
import retrofit2.Response

class SplashActivity : BaseActivity() {
    //private lateinit var getStartedBtn: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        //getStartedBtn = findViewById(R.id.getStartedBtn)

        getStartedBtn.setOnClickListener{
            val intent = Intent(this@SplashActivity, HomeActivity::class.java)
            startActivity(intent)
            finish()
        }
    }

    fun getCategories(){
        val service = RetrofitClientInstance.retrofitInstance.create(GetDataService::class.java)
        val call = service.getCategoryList()
        call.enqueue(object : Callback<List<Category>>{
            override fun onResponse(
                call: Call<List<Category>>,
                response: Response<List<Category>>
            ) {
                progress_bar.visibility = View.INVISIBLE
                insertDataIntoRoomDb(response.body())
            }

            override fun onFailure(call: Call<List<Category>>, t: Throwable) {
                Toast.makeText(this@SplashActivity, "Something went wrong", Toast.LENGTH_SHORT).show()
            }

        })
    }



    private fun insertDataIntoRoomDb(body: List<Category>?) {

    }
}