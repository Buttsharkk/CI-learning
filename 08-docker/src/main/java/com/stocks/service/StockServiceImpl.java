package com.stocks.service;

import java.util.HashMap;
import java.util.Map;

public class StockServiceImpl implements StockService {
    private Map<String, Stock> stocks = new HashMap<>();

    @Override
    public Stock addStock(Stock stock) {
        if (stocks.containsKey(stock.symbol())) {
            throw new IllegalArgumentException("Stock with symbol " + stock.symbol() + " already exists");
        }
        stocks.put(stock.symbol(), stock);
        return stock;
    }

    @Override
    public Stock getStock(String symbol) {
        return stocks.get(symbol);
    }

    @Override
    public void deleteStock(String symbol) {
        stocks.remove(symbol);
    }
}



