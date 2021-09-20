package com.pulps.gogreen.Model;

public class Item {

    private String item;
    private double price;
    private String bank;
    private int account;
    private String address;
    private String email;
    private int mobile;

    public Item(){

    }

    public String getItem() {
        return item;
    }

    public double getPrice() {
        return price;
    }

    public String getBank() {
        return bank;
    }

    public int getAccount() {
        return account;
    }

    public String getAddress() {
        return address;
    }

    public String getEmail() {
        return email;
    }

    public int getMobile() {
        return mobile;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setBank(String bank) {
        this.bank = bank;
    }

    public void setAccount(int account) {
        this.account = account;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setMobile(int mobile) {
        this.mobile = mobile;
    }
}

