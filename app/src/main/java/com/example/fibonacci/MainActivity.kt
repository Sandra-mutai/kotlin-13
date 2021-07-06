package com.example.fibonacci

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import java.math.BigInteger

class MainActivity : AppCompatActivity() {
    lateinit var rvNumber: RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        rvNumber=findViewById(R.id.rvNumbers)
        rvNumber.layoutManager=LinearLayoutManager(baseContext)
        var numberAdpater=NumberAdapterRecycleView(fibonacci(100))
        rvNumber.adapter=numberAdpater

    }
    fun fibonacci(number: Int):List<BigInteger>{
        val result= MutableList<BigInteger>(number,{BigInteger.ZERO })
        var number1=BigInteger.ZERO
        var number2=BigInteger.ONE
        result[0]=number1
        result[1]=number2
        for (x in 1..number){
            var sum=number1+number2
            number1=number2
            number2=sum
            result[x -1]=number1
        }
        return result
    }
}