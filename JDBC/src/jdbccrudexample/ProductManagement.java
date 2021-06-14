package jdbccrudexample;

import java.util.Scanner;

import jdbcexample.ProductManagementSystem;

public class ProductManagement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		ProductManagementSystem pms=new ProductManagementSystem();
		pms.dbConnection();
		System.out.println("Enter the choice : ");
		System.out.println("insert : to insert product");
		System.out.println("update : to update product");
		System.out.println("delete : to delete product");
		System.out.println("getproduct : to get a single product");
		System.out.println("getallproducts : to get all products");
		System.out.println("exit : to exit");
		String transaction=sc.next();
		char cont='y';
		while(cont=='y') {
			switch(transaction) {
			case "insert":
				pms.insertIntoProductUsingPs();
				break;
			case "update":
				break;
			case "delete":
				break;
			case "getproduct":
				break;
			case "getallproducts":
				break;
			case "exit":
				System.out.println("Thank you for visiting....\nPlease visit again");
				System.exit(0);
			}
		}
	}

}