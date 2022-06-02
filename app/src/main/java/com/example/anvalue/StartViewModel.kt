package com.example.anvalue

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch
import retrofit2.Response

class StartViewModel: ViewModel() {

    var repo = Repositoriy()
    val Valuelist: MutableLiveData<Response<privatbank>> = MutableLiveData()

    fun getvalueprivat(){
        viewModelScope.launch {
            Valuelist.value = repo.getprivat()
        }
    }
}