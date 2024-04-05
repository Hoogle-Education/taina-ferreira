package model;

public class Account {
    private int id;
    private String holder;
    private double balance;

    public Account() {
    }

    public Account(int id, String holder, double balance) {
        this.id = id;
        this.holder = holder;
        this.balance = balance;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        if(balance < amount){
            System.out.println("not enough balance");
            return;
        }

        balance -= amount;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        if(holder != null && !holder.isEmpty()){
            this.holder = holder;
        }
    }
}