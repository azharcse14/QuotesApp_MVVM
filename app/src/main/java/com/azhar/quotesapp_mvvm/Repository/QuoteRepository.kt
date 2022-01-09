package com.azhar.quotesapp_mvvm.Repository

import androidx.lifecycle.LiveData
import com.azhar.quotesapp_mvvm.model.Quote
import com.azhar.quotesapp_mvvm.model.QuoteDao

class QuoteRepository(private val quoteDao: QuoteDao) {

    fun getQuotes(): LiveData<List<Quote>>{
        return quoteDao.getQuotes()
    }

    suspend fun insertQuote(quote: Quote){
        quoteDao.insertQuote(quote)
    }
}