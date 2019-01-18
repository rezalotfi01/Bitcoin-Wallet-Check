package com.github.rezalotfi01.bwallet.ui.history

import android.arch.lifecycle.ViewModel
import com.github.rezalotfi01.bwallet.di.ViewModelKey
import dagger.Binds
import dagger.Module
import dagger.android.ContributesAndroidInjector
import dagger.multibindings.IntoMap

@Module
internal abstract class HistoryFragmentModule {
    @Binds
    @IntoMap
    @ViewModelKey(HistoryViewModel::class)
    abstract fun bindViewModel( viewModel: HistoryViewModel): ViewModel

    @ContributesAndroidInjector
    abstract fun contributeFragment(): HistoryFragment
}