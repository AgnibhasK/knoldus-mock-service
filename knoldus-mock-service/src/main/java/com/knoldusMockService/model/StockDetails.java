package com.knoldusMockService.model;

public class StockDetails {
    private Integer id;
    private String stockName;
    private Double currentStockValue;
    private Double increaseInValue;
    private Double decreaseInValue;

    public StockDetails() {
    }

    public StockDetails(Integer id, String stockName, Double currentStockValue, Double increaseInValue, Double decreaseInValue) {
        this.id = id;
        this.stockName = stockName;
        this.currentStockValue = currentStockValue;
        this.increaseInValue = increaseInValue;
        this.decreaseInValue = decreaseInValue;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getStockName() {
        return stockName;
    }

    public void setStockName(String stockName) {
        this.stockName = stockName;
    }

    public Double getCurrentStockValue() {
        return currentStockValue;
    }

    public void setCurrentStockValue(Double currentStockValue) {
        this.currentStockValue = currentStockValue;
    }

    public Double getIncreaseInValue() {
        return increaseInValue;
    }

    public void setIncreaseInValue(Double increaseInValue) {
        this.increaseInValue = increaseInValue;
    }

    public Double getDecreaseInValue() {
        return decreaseInValue;
    }

    public void setDecreaseInValue(Double decreaseInValue) {
        this.decreaseInValue = decreaseInValue;
    }
}
