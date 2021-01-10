package com.example.dependency_codin_inflow

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject lateinit var car:Car

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val carComponent = DaggerCarComponent.builder()
            .horsePower(150)
            .engineCapacity(1400)
            .build()
//        car = carComponent.getCar()
        carComponent.inject(this)

        car.drive()
    }
}