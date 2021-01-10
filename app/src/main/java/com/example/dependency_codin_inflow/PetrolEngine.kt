package com.example.dependency_codin_inflow

import android.util.Log
import dagger.Module
import javax.inject.Inject
import javax.inject.Named

@Module
class PetrolEngine @Inject constructor(@Named("horse power")var horsePower:Int, @Named("engine capacity")val engineCapacity:Int) : Engine {

    private  val TAG = "Car"

    override fun start(){
        Log.d(TAG, "Petrol engine started with horse power $horsePower and engine capacity $engineCapacity")
    }

}