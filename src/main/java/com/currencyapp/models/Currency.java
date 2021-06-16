package com.currencyapp.models;

public class Currency {

    private String name;
    private String shortcutName;
    private int amount;


    public Currency(String name, String shortcutName, int amount) {
        this.name = name;
        this.shortcutName = shortcutName;
        this.amount = amount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getShortcutName() {
        return shortcutName;
    }

    public void setShortcutName(String shortcutName) {
        this.shortcutName = shortcutName;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
}
