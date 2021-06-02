package com.capgemini.pms;

import java.util.Scanner;

public class Product {

	private int pId;
	private String pname;
	private double price;
	
	Scanner sc = new Scanner(System.in);
	
//	Getters
	public int getpId() { return pId; }
	public String getPName() { return pname; }
	public double getPrice() { return price; }
	
//	Setters
	public void setpId(int pId) { this.pId = pId; }
	public void setPName(String pname) { this.pname = pname; }
	public void setPrice(double price) { this.price = price; }
	
//	Constructors
	public Product() { super(); }
	public Product(int pId, String pname, double price) {
		super();
		this.pId = pId;
		this.pname = pname;
		this.price = price;
	}
	
	Product[] pList = new Product[3];
	
	public Product[] createProductList()
	{
		for(int i=0; i<pList.length; i++)
		{
			System.out.println("Enter Details for Product "+(i+1)+":");
			pList[i] = new Product();
			System.out.print("Enter Product ID: ");
			pList[i].setpId(sc.nextInt());
			System.out.print("Enter Product Name: ");
			pList[i].setPName(sc.nextLine());
			sc.nextLine();
			System.out.print("Enter Product Price: ");
			pList[i].setPrice(sc.nextDouble());
		}
		return pList;
	}
	
	public void updateProductById(Product[] pList, int prodId)
	{
		for(int i=0; i<pList.length; i++)
		{
			if(pList[i].getpId() == prodId)
			{
				System.out.println("ID Matched for Product " + (i+1));
				System.out.println("Enter new Product Name:");
				pList[i].setPName(sc.nextLine());
				sc.nextLine();
				System.out.println("Enter new Product Price:");
				pList[i].setPrice(sc.nextDouble());
				System.out.println("Updated Product Details:");
				System.out.println("pId: " + (pId+1) + ", prodName:" + pname + ", prodPrice: " + price + "\n");
				return;
			}
		}
		System.out.println("Product not found for this ID!!!\n");
	}
	
	public Product[] deleteProductById(Product[] pList, int id) {
		int originalLength = pList.length;
		boolean found = false;
		for(int i=0; i<originalLength; i++) {
			if(pList[i].getpId() == id)
			{
				System.out.println("ID matched for Product: " + (i+1) + "\n");
				if(i == originalLength - 1)
				{
					pList[i] = null;
					break;
				}
				pList[i] = pList[originalLength-1];
				originalLength--;
				found = true;
				break;
			}
		}
		if(!found)
			System.out.println("Product not found for this id\n");
		return pList;
	}
	
	public void displayProdList(Product[] pList)
	{
		for(int i=0; i<pList.length; i++)
		{
			if(pList[i] != null)
				System.out.println("pId: " + pList[i].getpId()+1 +  ", prodName:" + pList[i].getPName() + ", prodPrice: " + pList[i].getPrice() + "\n");
		}
	}
	
	public void displayProdDetailsById(Product[] pList, int id)
	{
		for(int i=0; i<pList.length; i++)
		{
			if(pList[i].getpId() == id)
			{
				if(pList[i] != null)
					System.out.println("pId: " + pList[i].getpId()+1 + ", Product Name:" + pList[i].getPName() + ", Product Price: " + pList[i].getPrice());
				System.out.println();
				return;
			}
			System.out.println("Product not found!!!\n");
		}
	}
}
