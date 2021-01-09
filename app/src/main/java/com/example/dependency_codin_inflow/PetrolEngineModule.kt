package com.example.dependency_codin_inflow

import dagger.Binds
import dagger.Module
import dagger.Provides

@Module
abstract class PetrolEngineModule{

    @Binds
    abstract fun bindsEngine(petrolEngine: PetrolEngine) : Engine

}