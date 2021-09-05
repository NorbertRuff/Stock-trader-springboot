package com.codecool.stocktraderspringboot.controller;

import com.codecool.stocktraderspringboot.logger.FileLogger;
import com.codecool.stocktraderspringboot.service.Trader;
import org.json.JSONException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.IOException;

@Controller
public class ListStocksController {
    private final Trader trader;

    @Autowired
    public ListStocksController(Trader trader) {
        this.trader = trader;
    }

    @GetMapping("/liststocks")
    @ResponseBody
    public String listStocks() throws JSONException, IOException {
        return trader.listAllStocks();
    }


}
