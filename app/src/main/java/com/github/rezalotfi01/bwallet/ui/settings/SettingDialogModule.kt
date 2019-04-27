package com.github.rezalotfi01.bwallet.ui.settings

import androidx.lifecycle.ViewModel
import com.github.rezalotfi01.bwallet.di.ViewModelKey
import dagger.Binds
import dagger.Module
import dagger.android.ContributesAndroidInjector
import dagger.multibindings.IntoMap

@Module
interface SettingDialogModule {
    @Binds
    @IntoMap
    @ViewModelKey(SettingViewModel::class)
    abstract fun bindViewModel( viewModel: SettingViewModel): ViewModel

    @ContributesAndroidInjector
    abstract fun contributeDialog(): SettingsDialog
}