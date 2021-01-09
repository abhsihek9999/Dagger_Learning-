package com.example.dependency_codin_inflow

import android.util.Log
import javax.inject.Inject

class Car @Inject constructor(var engine: Engine,var wheels: Wheels) {

    private val TAG = "Car"

    fun drive(){
        Log.d(TAG, "driving....")
    }

}