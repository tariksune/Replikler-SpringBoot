package com.tarxsoft.replikler.model;

import javax.persistence.*;

@Entity
@Table(name = "quotes")
public class Quote {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "quoteId")
    private String quoteId;

    @Column(name = "quoteName")
    private String quoteName;

    @Column(name = "quoteText")
    private String quoteText;

    @Column(name = "quoteLink")
    private String quoteLink;

    public Quote(long id, String quoteId, String quoteName, String quoteText, String quoteLink) {
        this.id = id;
        this.quoteId = quoteId;
        this.quoteName = quoteName;
        this.quoteText = quoteText;
        this.quoteLink = quoteLink;
    }

    public Quote(){
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getQuoteId() {
        return quoteId;
    }

    public void setQuoteId(String quoteId) {
        this.quoteId = quoteId;
    }

    public String getQuoteName() {
        return quoteName;
    }

    public void setQuoteName(String quoteName) {
        this.quoteName = quoteName;
    }

    public String getQuoteText() {
        return quoteText;
    }

    public void setQuoteText(String quoteText) {
        this.quoteText = quoteText;
    }

    public String getQuoteLink() {
        return quoteLink;
    }

    public void setQuoteLink(String quoteLink) {
        this.quoteLink = quoteLink;
    }
}

