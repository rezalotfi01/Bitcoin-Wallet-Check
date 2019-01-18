package com.github.rezalotfi01.bwallet.ui.history

import android.arch.lifecycle.ViewModel
import com.github.rezalotfi01.bwallet.R
import com.github.rezalotfi01.bwallet.ui.main.MainFragment

class HistoryFragment: MainFragment() {

    override fun getViewModelClass(): Class<out ViewModel> = HistoryViewModel::class.java

    override fun getEmptyText(): CharSequence = getText(R.string.history_is_empty)

    companion object {
        val TAG = HistoryFragment::class.java.simpleName

        fun newInstance(): HistoryFragment {
            return HistoryFragment()
        }
    }
}