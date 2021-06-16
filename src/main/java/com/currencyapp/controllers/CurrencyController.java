package com.currencyapp.controllers;

import com.currencyapp.models.Currency;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CurrencyController {

    @GetMapping("/currency")
    @ResponseBody
    public Currency getCurrency(){
        return new Currency("Test", "TST", 5);
    }
}
