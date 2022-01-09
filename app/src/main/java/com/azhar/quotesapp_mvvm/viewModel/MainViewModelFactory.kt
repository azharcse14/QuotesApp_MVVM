package com.azhar.quotesapp_mvvm.viewModel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.azhar.quotesapp_mvvm.Repository.QuoteRepository

class MainViewModelFactory(private val quoteRepository: QuoteRepository): ViewModelProvider.Factory {
    override fun <T : ViewModel?> create(modelClass: Class<T>):T{
        return MainViewModel(quoteRepository) as T
    }
}