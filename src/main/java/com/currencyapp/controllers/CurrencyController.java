package com.currencyapp.controllers;

import com.currencyapp.client.NBPClient;
import com.currencyapp.models.CurrencyCode;
import org.springframework.web.bind.annotation.*;
import java.io.IOException;
import java.net.URISyntaxException;
import java.util.Arrays;


@RestController
@RequestMapping(value = "/currency")
public class CurrencyController {

    private NBPClient nbpClient;

    public CurrencyController(NBPClient nbpClient) {
        this.nbpClient = nbpClient;
    }

    @GetMapping(value = "/{code}")
    @ResponseBody
    public double getCurrencyMid(@PathVariable String code) throws URISyntaxException, IOException, InterruptedException {
        return nbpClient.getNBPCurrencies(code).getRates().get(0).getMid();
    }

    @GetMapping(value = "/{code}/{amount}/convert-to/{newCode}")
    @ResponseBody
    public double convertCurrency(@PathVariable(name = "code") String code,@PathVariable(name = "amount") double amount,@PathVariable(name = "newCode") String newCode) throws URISyntaxException, IOException, InterruptedException {
        return (getCurrencyMid(code) * amount) / getCurrencyMid(newCode);
    }

    @GetMapping(value = "/codes")
    @ResponseBody
    public String getCurrenciesCodes() {
        return Arrays.asList(CurrencyCode.values()).toString();
    }
}
