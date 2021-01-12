package com.example.dependency_codin_inflow

import android.util.Log
import javax.inject.Inject

@PerActivity
class Car @Inject constructor() {

    @Inject
    lateinit var engine:Engine

    @Inject
    lateinit var wheels: Wheels

    @Inject
    lateinit var driver: Driver

    private val TAG = "Car"

    fun drive(){
        engine.start()
        Log.d(TAG, "${driver.name} driving $this")
    }

    @Inject
    fun remoteConnected(remote: Remote){
        remote.setRemoteConnected(this);
    }

}