package com.tarxsoft.replikler.controller;

import com.tarxsoft.replikler.model.Quote;
import com.tarxsoft.replikler.service.QuoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/")
public class QuoteController {

    @Autowired
    private QuoteService quoteService;

    @GetMapping
    public String viewHomePage(Model model) {
        model.addAttribute("listQuotes", quoteService.getAllQuotes());
        return "index";
    }

    @GetMapping("/newQuoteForm")
    public String newQuoteForm(Model model) {
        Quote quote = new Quote();
        model.addAttribute("quote",quote);
        return "new_quote";
    }

    @PostMapping("/saveQuote")
    public String saveQuote(@ModelAttribute("quote") Quote quote) {
        quoteService.saveQuote(quote);
        return "redirect:/";
    }

    @GetMapping("/showFormForUpdate/{id}")
    public String showFormForUpdate(@PathVariable (value = "id") long id, Model model) {
        Quote quote = quoteService.getQuoteById(id);
        model.addAttribute("quote",quote);
        return "update_quote";
    }

    @GetMapping("/deleteQuote/{id}")
    public String deleteQuote(@PathVariable (value = "id") long id) {
        this.quoteService.deleteQuoteById(id);
        return "redirect:/";
    }
}
