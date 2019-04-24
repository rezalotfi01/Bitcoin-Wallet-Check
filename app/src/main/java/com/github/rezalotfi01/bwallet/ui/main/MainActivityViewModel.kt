package com.github.rezalotfi01.bwallet.ui.main

import androidx.lifecycle.ViewModel
import android.os.Handler
import com.github.rezalotfi01.bwallet.data.db.RateMePrefs
import javax.inject.Inject

class MainActivityViewModel @Inject constructor(private val mainActivityRepository: MainActivityRepository, val rateMePrefs: RateMePrefs) :ViewModel() {

    val UPDATE_DELAY = 10*60*1000L //10 min

    val TAG = MainActivityViewModel::class.simpleName

    private val handler = Handler()
    private val runnable:Runnable = object:Runnable {
        override fun run() {
            mainActivityRepository.updateCurrency()
            handler.postDelayed(this, UPDATE_DELAY)
        }
    }

    override fun onCleared() {
        handler.removeCallbacks(runnable)
        mainActivityRepository.clear()
        super.onCleared()
    }

    fun onPause() {
        handler.removeCallbacks(runnable)
    }

    fun onResume() {
        val lastUpdate = mainActivityRepository.getLastCurrencyUpdate()
        val timeDiff = System.currentTimeMillis() - lastUpdate
        handler.postDelayed(runnable,UPDATE_DELAY - timeDiff)
    }

}