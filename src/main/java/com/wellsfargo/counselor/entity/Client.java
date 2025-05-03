package com.wellsfargo.counselor.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Client{

    @Id
    @GeneratedValue()
    private long clientId;

    @Column(nullable = false)
    private long advisorId;

    @Column(nullable = false)
    private String firstName;

    @Column(nullable = false)
    private String lastName;

    @Column(nullable = false)
    private String address;

    @Column(nullable = false)
    private String phone;

    @Column(nullable = false)
    private String email;

    protected Client() {

    }

    public Client(String first, String last, String add, String phoneNum, String emailAd, long advisorId){
        this.firstName = first;
        this.advisorId = advisorId;
        this.lastName = last;
        this.phone = phoneNum;
        this.address = add;
        this.email = emailAd;
    }

    public long getAdvisorId(){
        return this.advisorId;
    }

    public void setAdvisorId(long id){
        this.advisorId = id;
    }

    public long getClientId(){
        return clientId;
    }

    public String getFirstName(){
        return firstName;
    }

    public void setFirstName(String name){
        this.firstName = name;
    }

    public String getLastName(){
        return this.lastName;
    }

    public void setLastName(String name){
        this.lastName = name;
    }

    public String getAddress(){
        return this.address;
    }

    public void setAddress(String add){
        this.address = add;
    }

    public String getPhone(){
        return this.phone;
    }

    public void setPhone(String ph){
        this.phone = ph;
    }

    public String getEmail(){
        return this.email;
    }

    public void setEmail(String mail){
        this.email = mail;
    }

}
