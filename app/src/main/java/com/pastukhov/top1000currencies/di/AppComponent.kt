package com.pastukhov.top1000currencies.di

import com.pastukhov.top1000currencies.activities.MainActivity
import com.pastukhov.top1000currencies.activities.ChartActivity
import com.pastukhov.top1000currencies.chart.LatestChart
import com.pastukhov.top1000currencies.fragments.CurrenciesListFragment
import com.pastukhov.top1000currencies.mvp.presenter.CurrenciesPresenter
import com.pastukhov.top1000currencies.mvp.presenter.LatestChartPresenter
import dagger.Component
import javax.inject.Singleton

@Component(modules = [AppModule::class, RestModule::class, MvpModule::class, ChartModule::class])
@Singleton
interface AppComponent {

    fun inject(mainActivity: MainActivity)
    fun inject(presenter: CurrenciesPresenter)
    fun inject(presenter: LatestChartPresenter)
    fun inject(fragment: CurrenciesListFragment)
    fun inject(chart: LatestChart)
    fun inject(activity: ChartActivity)
}