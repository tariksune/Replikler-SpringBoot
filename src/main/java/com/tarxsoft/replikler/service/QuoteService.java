package com.tarxsoft.replikler.service;

import com.tarxsoft.replikler.model.Quote;

import java.util.List;

public interface QuoteService {
    List<Quote> getAllQuotes();
    void saveQuote(Quote quote);
    Quote getQuoteById(long id);
    void deleteQuoteById(long id);
}
