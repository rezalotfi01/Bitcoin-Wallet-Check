package com.github.rezalotfi01.bwallet.di

import android.arch.lifecycle.ViewModel
import android.arch.lifecycle.ViewModelProvider
import com.github.rezalotfi01.bwallet.ui.MainActivity
import com.github.rezalotfi01.bwallet.ui.detail.DetailFragmentModule
import com.github.rezalotfi01.bwallet.ui.edit.EditDialogModule
import com.github.rezalotfi01.bwallet.ui.favourite.FavouriteFragmentModule
import com.github.rezalotfi01.bwallet.ui.history.HistoryFragmentModule
import com.github.rezalotfi01.bwallet.ui.main.MainActivityViewModel
import com.github.rezalotfi01.bwallet.ui.qrdialog.QrDialogModule
import com.github.rezalotfi01.bwallet.ui.settings.SettingDialogModule
import dagger.Binds
import dagger.Module
import dagger.android.ContributesAndroidInjector
import dagger.multibindings.IntoMap

@Module
internal abstract class MainActivityModule {

    @Binds
    @IntoMap
    @ViewModelKey(MainActivityViewModel::class)
    abstract fun bindViewModel( viewModel: MainActivityViewModel): ViewModel

    @Binds
    abstract fun bindViewModelFactory(factory: ViewModelFactory): ViewModelProvider.Factory

    @ContributesAndroidInjector(modules = [
        DetailFragmentModule::class,
        HistoryFragmentModule::class,
        FavouriteFragmentModule::class,
        SettingDialogModule::class,
        QrDialogModule::class,
        EditDialogModule::class])

    internal abstract fun contributeMainActivity(): MainActivity
}