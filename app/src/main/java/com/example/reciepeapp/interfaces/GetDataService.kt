package com.example.reciepeapp.interfaces

import com.example.reciepeapp.entities.Category
import com.example.reciepeapp.entities.CategoryItems
import com.example.reciepeapp.entities.Meal
import com.example.reciepeapp.entities.MealResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface GetDataService {
    @GET("categories.php")
    fun getCategoryList(): Call<Category>

    @GET("filter.php")
    fun getMealList(@Query("c") category: String): Call<Meal>

    @GET("lookup.php")
    fun getSpecificItem(@Query("i") id: String): Call<MealResponse>


}