package com.example.assessment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import retrofit2.Retrofit
import retrofit2.http.Body
import kotlin.math.max

class MainActivity : AppCompatActivity() {
    lateinit var etNum1:EditText
    lateinit var etNum2:EditText
    lateinit var btnAdd:Button
    lateinit var btnSubtract:Button
    lateinit var btnMultiply:Button
    lateinit var btnDivide:Button
    lateinit var tvAnswer:TextView
    lateinit var btnAnswer:Button
    lateinit var tvNum1:TextView
    lateinit var tvNum2:TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        castView()

    }
    fun castView(){
        etNum1.findViewById<EditText>(R.id.etNum1)
        etNum2.findViewById<EditText>(R.id.etNum1)
        btnAdd.findViewById<Button>(R.id.btnAdd)
        btnMultiply.findViewById<Button>(R.id.btnMutliply)
        btnDivide.findViewById<Button>(R.id.btnDivide)
        btnSubtract.findViewById<Button>(R.id.btnSubtract)
        btnAnswer.findViewById<Button>(R.id.btnAnswer)
        tvAnswer.findViewById<TextView>(R.id.tvAnswer)
    }

    var retrofit=ApiClient.buildApiClient(ApiInterface::class.java)









