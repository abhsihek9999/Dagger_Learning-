package com.example.dependency_codin_inflow

import android.util.Log
import javax.inject.Inject

class Tires @Inject constructor(){
    private val TAG = "Tires"

    fun inflateTires(){
        Log.d(TAG, "tires inflated")
    }


}