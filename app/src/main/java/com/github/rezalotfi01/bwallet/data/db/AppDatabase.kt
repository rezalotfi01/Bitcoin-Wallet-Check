package com.github.rezalotfi01.bwallet.data.db

import android.arch.persistence.room.RoomDatabase
import android.arch.persistence.room.Database


@Database(entities = [WalletRecord::class], version = 1)
abstract class AppDatabase : RoomDatabase() {
    abstract fun walletRecordDao(): AppDatabaseDao
}