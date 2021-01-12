package com.example.dependency_codin_inflow

import dagger.Binds
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
 class  DriverModule (var name:String){


        @Singleton
        @Provides
        fun provideDriver(): Driver = Driver(name)


}