package com.github.rezalotfi01.bwallet.ui.edit

import androidx.lifecycle.ViewModel
import com.github.rezalotfi01.bwallet.di.ViewModelKey
import dagger.Binds
import dagger.Module
import dagger.android.ContributesAndroidInjector
import dagger.multibindings.IntoMap

@Module
interface EditDialogModule {
    @Binds
    @IntoMap
    @ViewModelKey(EditDialogViewModel::class)
    abstract fun bindViewModel( viewModel: EditDialogViewModel): ViewModel

    @ContributesAndroidInjector
    abstract fun contributeDialog(): EditDialog
}