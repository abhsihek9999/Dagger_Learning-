package com.example.dependency_codin_inflow

import dagger.Binds
import dagger.Module
import dagger.Provides
import kotlin.properties.Delegates

@Module
 class DieselEngineModule(var horsePower : Int){

    @Provides
     fun providesEngine() : Engine{
        return DieselEngine(horsePower)
    }

}
