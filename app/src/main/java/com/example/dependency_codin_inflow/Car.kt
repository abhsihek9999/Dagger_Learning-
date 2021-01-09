package com.example.dependency_codin_inflow

import android.util.Log
import javax.inject.Inject

class Car @Inject constructor() {

    @Inject
    lateinit var engine:Engine

    @Inject
    lateinit var wheels: Wheels

    private val TAG = "Car"

    fun drive(){
        Log.d(TAG, "driving....")
    }

    @Inject
    fun remoteConnected(remote: Remote){
        remote.setRemoteConnected(this);
    }

}