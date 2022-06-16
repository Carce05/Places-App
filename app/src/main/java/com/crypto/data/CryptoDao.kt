package com.crypto.data

import androidx.lifecycle.LiveData
import androidx.room.*
import com.crypto.model.Crypto


@Dao
interface CryptoDao {

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun addCrypto(crypto: Crypto)

    @Update(onConflict = OnConflictStrategy.IGNORE)
    suspend fun  updateCrypto(crypto: Crypto)

    @Delete
    suspend fun deleteCrypto(crypto: Crypto)

    @Query ("SELECT * FROM CRYPTO")
    fun getAllData() : LiveData<List<Crypto>>
}