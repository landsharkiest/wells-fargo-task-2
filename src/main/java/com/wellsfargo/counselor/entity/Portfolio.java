package com.wellsfargo.counselor.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Portfolio {

    @Id
    @GeneratedValue
    private long portfolioId;

    @Column(nullable = false)
    private long clientId;

    @Column(nullable = false)
    private String creationDate;

    protected Portfolio(){

    }

    public Portfolio(long clientId, String creationDate){
        this.clientId = clientId;
        this.creationDate = creationDate;
    }

    public void setClientId(long clientId){
        this.clientId = clientId;
    }

    public long getClientId(){
        return this.clientId;
    }

    public void setCreationDate(String date){
        this.creationDate = date;
    }

    public String getCreationDate(){
        return this.creationDate;
    }
}
