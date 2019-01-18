package com.github.rezalotfi01.bwallet.ui.favourite

import com.github.rezalotfi01.bwallet.data.db.WalletRecord
import com.github.rezalotfi01.bwallet.ui.history.HistoryViewModel
import com.github.rezalotfi01.bwallet.ui.main.MainRepository
import com.github.rezalotfi01.bwallet.ui.main.MainViewModel
import com.github.rezalotfi01.bwallet.utils.SingleLiveEvent
import javax.inject.Inject

class FavouriteViewModel @Inject constructor (private val mainRepository: MainRepository): MainViewModel(mainRepository) {

    override val TAG = HistoryViewModel::class.java.simpleName

    val unfavouritedItem = SingleLiveEvent<WalletRecord>()

    override fun unfavouriteRecord(record: WalletRecord) {
        val recordCopy= record.copy()
        unfavouritedItem.value = recordCopy

        super.unfavouriteRecord(record)
    }

    init {
        mainRepository.getFavourite().subscribe { _data.value = it }
    }
}