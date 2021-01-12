package com.example.dependency_codin_inflow

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject lateinit var car1:Car
    @Inject lateinit var car2:Car

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val carComponent = (application as DaggerExample).getCarComponent().activityComponentFactory().create(1500,160)
//        car = carComponent.getCar()
        carComponent.inject(this)

        car1.drive()
        car2.drive()
    }
}