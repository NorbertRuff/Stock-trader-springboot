package com.codecool.stocktraderspringboot.controller;
import com.codecool.stocktraderspringboot.logger.FileLogger;
import com.codecool.stocktraderspringboot.service.Trader;
import org.json.JSONException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.IOException;

@Controller
public class BuyController {
    private final Trader trader;
    private final FileLogger logger;

    @Autowired
    public BuyController(Trader trader, FileLogger logger) {
        this.trader = trader;
        this.logger = logger;
    }

    @GetMapping("/buy/{stock}")
    @ResponseBody
    public String buyStock(@PathVariable("stock") String stock) {
        return "Format: " + stock + " price";
    }

    @GetMapping("/buy/{stock}/{price}")
    @ResponseBody
    public String buy(@PathVariable("stock") String stock, @PathVariable("price") Integer price) throws JSONException, IOException {
            return trader.buy(stock, price);
    }


}