package com.bzl.stockaccount;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StockAccount {
    private String share;
    private int numOfStock;
    private int numOfShare;
    private double sharePrice;
    private double totalValue;
    public StockAccount(String share,int numOfShare,double sharePrice){
        this.share = share;
        this.numOfShare = numOfShare;
        this.sharePrice = sharePrice;
        totalValue = numOfShare * sharePrice;

    }

    public int getNumOfStock() {
        return numOfStock;
    }

    public void setShare(String share) {
        this.share = share;
    }

    public double getSharePrice() {
        return sharePrice;
    }

    public double getTotalValue() {
        return totalValue;
    }

    public int getNumOfShare() {
        return numOfShare;
    }

    public String toString(){
        return share + " total number of shares is " + numOfShare + " price per share is " + sharePrice + "$" + " total value of share " + totalValue +"$";
    }

    public static void main(String[] args) {
       List<StockAccount> share = new ArrayList<StockAccount>();
        double totalAccount = 0;
        System.out.println("Enter number of stocks : ");
        Scanner sc = new Scanner(System.in);
        int numOfStocks = sc.nextInt();
        for(int i = 0; i < numOfStocks; i++) {
            System.out.println("Enter share name : ");
            Scanner sb = new Scanner(System.in);
            String shares = sb.nextLine();
            System.out.println("Enter number of shares : ");
            int numOfShares = sb.nextInt();
            System.out.println("Enter price per share : ");
            double price = sb.nextDouble();
            double total = numOfShares * price;
            totalAccount += total;
            share.add(new StockAccount(shares,numOfShares,price));
        }
        for(StockAccount i: share){
            System.out.println(i);
        }
        System.out.println("Total Stock Account Value : "+totalAccount +"$");
    }

}