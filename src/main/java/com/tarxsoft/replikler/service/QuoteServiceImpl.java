package com.tarxsoft.replikler.service;

import com.tarxsoft.replikler.model.Quote;
import com.tarxsoft.replikler.repository.QuoteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class QuoteServiceImpl implements QuoteService{

    @Autowired
    private QuoteRepository quoteRepository;

    @Override
    public List<Quote> getAllQuotes() {
        return quoteRepository.findAll();
    }

    @Override
    public void saveQuote(Quote quote) {
        this.quoteRepository.save(quote);
    }

    @Override
    public Quote getQuoteById(long id) {
        Optional<Quote> optional = quoteRepository.findById(id);
        Quote quote = null;
        if (optional.isPresent()) {
            quote = optional.get();
        }else{
            throw new RuntimeException(" Quote not found for id: "+id);
        }
        return quote;
    }

    @Override
    public void deleteQuoteById(long id) {
        this.quoteRepository.deleteById(id);
    }

}
