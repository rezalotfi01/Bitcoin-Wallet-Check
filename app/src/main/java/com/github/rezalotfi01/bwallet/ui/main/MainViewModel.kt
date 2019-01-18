package com.github.rezalotfi01.bwallet.ui.main

import android.arch.lifecycle.LiveData
import android.arch.lifecycle.MutableLiveData
import android.arch.lifecycle.ViewModel
import com.github.rezalotfi01.bwallet.data.db.WalletRecord
import com.github.rezalotfi01.bwallet.utils.SingleLiveEvent

abstract class MainViewModel constructor(private val mainRepository: MainRepository): ViewModel() {

    open val TAG = MainViewModel::class.java.simpleName

    val deletedItem = SingleLiveEvent<WalletRecord>()

    protected val _data: MutableLiveData<List<WalletRecord>> = MutableLiveData()
    val data:LiveData<List<WalletRecord>>
        get() = _data

    fun deleteRecord(record: WalletRecord) {
        deletedItem.value = record
        mainRepository.deleteRecord(record)
    }

    fun favouriteRecord(record: WalletRecord) {
        mainRepository.favouriteRecord(record.address)
    }

    open fun unfavouriteRecord(record: WalletRecord) {
        mainRepository.unfavouriteRecord(record.address)
    }

    fun addRecord(record: WalletRecord) {
        mainRepository.saveRecordToHistory(record)
    }

    fun editRecord(record: WalletRecord) {

    }
}