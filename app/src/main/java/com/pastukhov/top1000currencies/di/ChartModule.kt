package com.pastukhov.top1000currencies.di


import com.pastukhov.top1000currencies.chart.LatestChart
import com.pastukhov.top1000currencies.formatters.YearValueFormatter
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class ChartModule {
    @Provides
    @Singleton
    fun provideLatestChart() = LatestChart()

    @Provides
    @Singleton
    fun provideYearFormatter() = YearValueFormatter()
}