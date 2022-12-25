package com.bzl.buysell;

import java.time.LocalDateTime;
import java.util.Date;

public class Stocks {
    private double value;
    private String symbol;
    private LocalDateTime time;

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public LocalDateTime getTime() {
        return time;
    }

    public void setTime(LocalDateTime time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "symbol = " + symbol + ", value = " + value + ", time=" + time ;
    }
}
