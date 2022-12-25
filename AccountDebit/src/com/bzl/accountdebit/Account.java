package com.bzl.accountdebit;
public class Account {
    private  double accountBalance;

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public double getAccountBalance() {
        return accountBalance;
    }
    public void debit(double amount){
        if(accountBalance >= amount) {
            accountBalance = accountBalance - amount;
            System.out.println("Debited amount " + amount + "$" + " your current account balance is "+ accountBalance + "$");
        }else{
            System.out.println("Debit amount exceeded Account Balance.");
        }
    }

    public static void main(String[] args) {
        Account ob = new Account();
        Account o = new Account();
        ob.setAccountBalance(100000);
        ob.debit(900000);
        o.setAccountBalance(23456);
        o.setAccountBalance(34);


    }

}