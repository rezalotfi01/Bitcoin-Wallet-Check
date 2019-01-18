package com.github.rezalotfi01.bwallet.ui.history

import com.github.rezalotfi01.bwallet.ui.main.MainRepository
import com.github.rezalotfi01.bwallet.ui.main.MainViewModel
import javax.inject.Inject

class HistoryViewModel @Inject constructor (private val mainRepository: MainRepository): MainViewModel(mainRepository) {

    override val TAG = HistoryViewModel::class.java.simpleName

    init {
        mainRepository.getHistory().subscribe { _data.value = it }
    }
}