package com.example.dependency_codin_inflow

import android.app.Application

class DaggerExample : Application() {
    private lateinit var component: AppComponent

    override fun onCreate() {
        super.onCreate()

        component = DaggerAppComponent.factory().create(DriverModule("Abhishek"))

    }

    fun getCarComponent() : AppComponent = component

}