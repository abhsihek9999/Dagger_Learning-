package com.example.dependency_codin_inflow

import android.content.Context
import android.util.Log
import javax.inject.Inject

class Remote @Inject constructor() {

    private val TAG = "Remote"

    fun setRemoteConnected(car:Car){

        Log.d(TAG, "Remote connected...")
    }

}