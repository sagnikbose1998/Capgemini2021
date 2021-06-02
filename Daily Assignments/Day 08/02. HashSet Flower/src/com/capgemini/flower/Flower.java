package com.capgemini.flower;

public class Flower {
    private int fid;
    private String fName;
    private double pricePerKg;
    private int qty;

//    Constructors
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

}
