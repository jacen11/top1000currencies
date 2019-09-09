package com.pastukhov.top1000currencies.di

import com.pastukhov.top1000currencies.MainActivity
import dagger.Component
import javax.inject.Singleton

@Component(modules = [AppModule::class, RestModule::class, MvpModule::class, ChartModule::class])
@Singleton
interface AppComponent {

    fun inject(mainActivity: MainActivity)

}