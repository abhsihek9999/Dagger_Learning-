package com.example.dependency_codin_inflow

import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [DriverModule::class])
interface AppComponent {

    fun activityComponentFactory():ActivityComponent.Factory

    @Component.Factory
    interface Factory{

        fun create(driverModule: DriverModule) : AppComponent

    }

}