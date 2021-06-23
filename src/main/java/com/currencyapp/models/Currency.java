package com.currencyapp.models;

import javax.persistence.*;

@Entity
public class Currency {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String currency;
    private String code;
    private int mid;

    public Currency(String currency, String code, int mid) {
        this.currency = currency;
        this.code = code;
        this.mid = mid;
    }

    public Currency() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String name) {
        this.currency = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String shortcutName) {
        this.code = shortcutName;
    }

    public int getMid() {
        return mid;
    }

    public void setMid(int amount) {
        this.mid = amount;
    }
}
