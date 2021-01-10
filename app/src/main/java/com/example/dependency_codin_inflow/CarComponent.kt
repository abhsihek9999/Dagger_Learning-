package com.example.dependency_codin_inflow

import dagger.BindsInstance
import dagger.Component
import dagger.Module
import javax.inject.Named

@Component(modules = [CarProvider::class,PetrolEngineModule::class])
interface CarComponent {

//    fun getCar():Car

    fun inject(mainActivity: MainActivity)

    @Component.Builder
    interface Builder{

        @BindsInstance
        fun horsePower(@Named("horse power")horsePower:Int) : Builder

        @BindsInstance
        fun engineCapacity(@Named("engine capacity") engineCapacity:Int) : Builder

        fun build():CarComponent
    }

}