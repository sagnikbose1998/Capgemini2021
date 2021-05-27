package com.capgemini.Collections;

import java.util.Scanner;

public class Flower {
    private int fid;
    private String fName;
    private double pricePerKg;
    private int qty;

//    Constructors
    Flower() {}
    public Flower(int fid, String fName, double pricePerKg, int qty) {
        super();
        this.fid = fid;
        this.fName = fName;
        this.pricePerKg = pricePerKg;
        this.qty = qty;
    }

//    Getters
    public String getfName() { return fName; }
    public int getFid() { return fid; }
    public double getPricePerKg() { return pricePerKg; }
    public int getQty() { return qty; }

//    Setters

    public void setFid(int fid) { this.fid = fid; }
    public void setfName(String fName) { this.fName = fName; }
    public void setPricePerKg(double pricePerKg) { this.pricePerKg = pricePerKg; }
    public void setQty(int qty) { this.qty = qty; }

}
