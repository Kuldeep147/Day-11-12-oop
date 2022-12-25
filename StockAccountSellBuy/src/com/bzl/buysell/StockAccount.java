package com.bzl.buysell;

import java.time.LocalDateTime;
import java.util.LinkedList;

public class StockAccount {
    private double valueOfAccount;
    private LinkedList<Stocks> stockAccount = new LinkedList<Stocks>();

    public void setValueOfAccount(double valueOfAccount) {
        this.valueOfAccount = valueOfAccount;
    }

    public double getValueOfAccount() {
        return valueOfAccount;
    }

    public LinkedList<Stocks> getStockAccount() {
        return stockAccount;
    }
    public void buyStock(double amount, String symbol){
       Stocks share = new Stocks();
       share.setSymbol(symbol);
       share.setValue(amount);
       valueOfAccount += amount;
        LocalDateTime time =  LocalDateTime.now();
        share.setTime(time);
        stockAccount.add(share);
    }
    public  void sellStock(double amount, String symbol){
        if(amount <= valueOfAccount) {
            Stocks share = new Stocks();
            share.setValue(amount);
            share.setSymbol("selled " + symbol);
            valueOfAccount -= amount;
            LocalDateTime time = LocalDateTime.now();
            share.setTime(time);
            stockAccount.add(share);
        }else{
            System.out.println("sell amount exceeded than total balance");
        }
    }
    public void printReport(LinkedList<Stocks> list){
        for(Stocks s : list){
            System.out.println(s);
        }
        System.out.println("Current Value of Account : "+valueOfAccount);
    }
}
