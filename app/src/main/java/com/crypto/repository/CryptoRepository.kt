package com.crypto.repository

import androidx.lifecycle.LiveData
import com.crypto.data.CryptoDao
import com.crypto.model.Crypto

class CryptoRepository(private val cryptoDao: CryptoDao) {
    //Se implementan las funciones de la interface
    //Se crea un objeto que contiene el arrayListo de los registros de la tabla lugar... cubiertos por LiveData
    val getAllData: LiveData<List<Crypto>> = cryptoDao.getAllData()

    //Se define la función para insertar un Lugar en la tabla lugar
    suspend fun addLugar(crypto: Crypto) {
        cryptoDao.addCrypto(crypto)
    }

    //Se define la función para actualizar un Lugar en la tabla lugar
    suspend fun updateLugar(crypto: Crypto) {
        cryptoDao.updateCrypto(crypto)
    }

    //Se define la función para eliminar un Lugar en la tabla lugar
    suspend fun deleteLugar(crypto: Crypto) {
        cryptoDao.deleteCrypto(crypto)
    }
}