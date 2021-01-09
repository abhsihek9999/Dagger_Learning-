package com.example.dependency_codin_inflow

import dagger.Module
import dagger.Provides

@Module
class CarProvider{

    @Provides
    fun providesRims():Rims{
        return Rims()
    }


    @Provides
    fun providesTires():Tires{
        val tires = Tires()
        tires.inflateTires()
        return tires
    }

    @Provides
    fun providesWheels(rims: Rims,tires: Tires):Wheels{
        return Wheels(tires,rims)
    }

}