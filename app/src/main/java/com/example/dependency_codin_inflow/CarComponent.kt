package com.example.dependency_codin_inflow

import dagger.Component
import dagger.Module

@Component(modules = [CarProvider::class])
interface CarComponent {

    fun getCar():Car

    fun inject(mainActivity: MainActivity)

}