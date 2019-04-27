package com.github.rezalotfi01.bwallet.di

import android.app.Application
import android.content.Context
import com.github.rezalotfi01.bwallet.data.api.NetworkModule
import com.github.rezalotfi01.bwallet.data.db.DatabaseModule
import com.github.rezalotfi01.bwallet.data.db.PrefsModule
import dagger.Binds
import dagger.Module

@Module(includes = [NetworkModule::class, DatabaseModule::class, PrefsModule::class, BarcodeModule::class])
abstract class AppModule {
    @Binds
    abstract fun provideContext(application: Application): Context
}