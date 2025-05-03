package com.wellsfargo.counselor.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Security {

    @Id
    @GeneratedValue()
    private long securityId;

    @Column(nullable = false)
    private long portfolioId;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String category;

    @Column(nullable = false)
    private long purchasePrice;

    @Column(nullable = false)
    private String purchaseDate;

    @Column(nullable = false)
    private long quantity;

    public Security(String name, String cat, long price, String purchaseDate, long quantity, long portfolioId){
        this.portfolioId = portfolioId;
        this.name = name;
        this.category = cat;
        this.purchasePrice = price;
        this.purchaseDate = purchaseDate;
        this.quantity = quantity;
    }

    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getCategory(){
        return this.category;
    }
    public void setCategory(String cat){
        this.category = cat;
    }
    public String getPurchaseDate(){
        return this.purchaseDate;
    }
    public void setPurchaseDate(String date){
        this.purchaseDate = date;
    }
    public void setPurchasePrice(long price){
        this.purchasePrice = price;
    }
    public long getPurchasePrice(){
        return this.purchasePrice;
    }
    public long getQuantity(){
        return this.quantity;
    }
    public void setQuantity(long quant){
        this.quantity = quant;
    }

    public long getSecurityId(){
        return this.securityId;
    }
    public void setPortfolioId(long id){
        this.portfolioId = id;
    }

    public long getPortfolioId(){
        return this.portfolioId;
    }

}
