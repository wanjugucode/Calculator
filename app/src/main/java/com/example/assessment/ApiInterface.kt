package com.example.assessment

import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.POST

interface ApiInterface {
 @POST("calculator/add")
 fun addition(@Body calculationRequest: CalculationRequest):Response<CalculationResponse>

 @POST("calculator/subtract")
 fun subtraction(@Body calculationRequest: CalculationRequest):Response<CalculationResponse>

 @POST("calculator/multiply")
 fun multiplaction(@Body calculationRequest: CalculationRequest):Response<CalculationResponse>

 @POST("calculator/divide")
 fun division(@Body calculationRequest: CalculationRequest):Response<CalculationResponse>



}