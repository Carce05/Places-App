package com.crypto.data

import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.crypto.model.Crypto

@Database(entities = [Crypto::class], version = 1, exportSchema = false)
abstract class CryptoDatabase : RoomDatabase(){
    abstract fun cryptoDao() : CryptoDao

    companion object {

        @Volatile
        private  var INSTANCE: CryptoDatabase? = null

        fun getDatabase(context: android.content.Context) : CryptoDatabase {
            val tempInstance = INSTANCE
            if (tempInstance != null) {
                return tempInstance
            }
            synchronized(this) {
            val instance = Room.databaseBuilder(
                context.applicationContext,
                CryptoDatabase::class.java,
                "lugar_database"
            ).build()
                INSTANCE = instance
                return instance
            }
        }
    }
}