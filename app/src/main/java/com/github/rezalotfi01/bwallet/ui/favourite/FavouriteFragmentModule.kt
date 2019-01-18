package com.github.rezalotfi01.bwallet.ui.favourite

import android.arch.lifecycle.ViewModel
import com.github.rezalotfi01.bwallet.di.ViewModelKey
import dagger.Binds
import dagger.Module
import dagger.android.ContributesAndroidInjector
import dagger.multibindings.IntoMap

@Module
internal abstract class FavouriteFragmentModule {
    @Binds
    @IntoMap
    @ViewModelKey(FavouriteViewModel::class)
    abstract fun bindViewModel( viewModel: FavouriteViewModel): ViewModel

    @ContributesAndroidInjector
    abstract fun contributeFragment(): FavouriteFragment
}