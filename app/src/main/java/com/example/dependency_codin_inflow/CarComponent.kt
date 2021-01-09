package com.example.dependency_codin_inflow

import dagger.Component

@Component
interface CarComponent {

    fun getCar():Car

    fun inject(mainActivity: MainActivity)

}