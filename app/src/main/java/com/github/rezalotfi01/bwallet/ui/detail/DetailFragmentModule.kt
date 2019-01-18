package com.github.rezalotfi01.bwallet.ui.detail

import android.arch.lifecycle.ViewModel
import com.github.rezalotfi01.bwallet.di.ViewModelKey
import dagger.Binds
import dagger.Module
import dagger.android.ContributesAndroidInjector
import dagger.multibindings.IntoMap

@Module
internal abstract class DetailFragmentModule {

    @Binds
    @IntoMap
    @ViewModelKey(DetailViewModel::class)
    abstract fun bindJobsViewModel( viewModel: DetailViewModel): ViewModel

    @ContributesAndroidInjector
    abstract fun contributeDetailFragment(): DetailFragment
}