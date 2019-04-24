package com.github.rezalotfi01.bwallet

import android.content.Context

import dagger.android.AndroidInjector
import dagger.android.DaggerApplication
import androidx.multidex.MultiDex
import com.github.rezalotfi01.bwallet.di.DaggerAppComponent

class App: DaggerApplication() {

    override fun attachBaseContext(base: Context) {
        super.attachBaseContext(base)
        MultiDex.install(this)
    }

    override fun applicationInjector(): AndroidInjector<out DaggerApplication> {
        val builder = DaggerAppComponent.builder().application(this).build()
        builder.inject(this)
        return builder
    }

}