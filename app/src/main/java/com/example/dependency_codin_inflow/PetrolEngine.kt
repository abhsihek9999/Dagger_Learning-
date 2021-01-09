package com.example.dependency_codin_inflow

import android.util.Log
import dagger.Module
import javax.inject.Inject

@Module
class PetrolEngine @Inject constructor() : Engine {

    private  val TAG = "Car"

    override fun start(){
        Log.d(TAG, "Petrol engine started.")
    }

}