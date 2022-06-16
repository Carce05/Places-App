package com.crypto.viewmodel

import androidx.lifecycle.LiveData
<<<<<<< HEAD:app/src/main/java/com/crypto/viewmodel/LugarViewModel.kt
import androidx.lifecycle.viewModelScope
import com.crypto.data.CryptoDatabase
import com.crypto.model.Crypto
import com.crypto.repository.CryptoRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class LugarViewModel(application: Application) : AndroidViewModel(application) {
    val getAllData: LiveData<List<Crypto>>
    //Esta es la manera como accedo al repositorio desde el viewModel
    private val repository: CryptoRepository
    //Se procede a inicializar los atributos de arriba de esta clase LugarViewModel
    init {
        val lugarDao = CryptoDatabase.getDatabase(application).cryptoDao()
        repository = CryptoRepository(lugarDao)
        getAllData = repository.getAllData
    }
    //Esta función de alto nivel llama al subproceso de I/O para grabar un registro Lugar
    fun addLugar (crypto: Crypto) {
        viewModelScope.launch(Dispatchers.IO) {
            repository.addLugar(crypto)
        }
    }
    //Esta función de alto nivel llama al subproceso de I/O para actualizar un registro Lugar
    fun updateLugar (crypto: Crypto) {
        viewModelScope.launch(Dispatchers.IO) {
            repository.updateLugar(crypto)
        }
    }
    //Esta función de alto nivel llama al subproceso de I/O para eliminar un registro Lugar
    fun deleteLugar (crypto: Crypto) {
        viewModelScope.launch(Dispatchers.IO) {
            repository.deleteLugar(crypto)
        }
    }
}
=======
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class LugarViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is home Fragment"
    }
    val text: LiveData<String> = _text
}
>>>>>>> parent of 4c90b23 (clase03 Finalizada):app/src/main/java/com/lugares/viewmodel/LugarViewModel.kt