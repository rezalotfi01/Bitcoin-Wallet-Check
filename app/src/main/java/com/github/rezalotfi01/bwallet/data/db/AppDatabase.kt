package com.github.rezalotfi01.bwallet.data.db

import androidx.room.RoomDatabase
import androidx.room.Database


@Database(entities = [WalletRecord::class], version = 1)
abstract class AppDatabase : RoomDatabase() {
    abstract fun walletRecordDao(): AppDatabaseDao
}