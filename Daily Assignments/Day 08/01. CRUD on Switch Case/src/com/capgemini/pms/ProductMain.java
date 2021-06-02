package com.capgemini.pms;

import java.util.Scanner;

public class ProductMain {

	public static void main(String[] args) {

			Scanner sc = new Scanner(System.in);
			int ch = 0;
			
			Product p = new Product();
			Product[] pList = new Product[3];
			
			do
			{
				System.out.println("Enter your choice");
				System.out.println("1. Create Product List\n2. Update Product By ID\n3. Delete Product By ID\n4. Display All\n5. Display by ID\n6. Exit the program\n");
				try {
					ch = sc.nextInt();
					
					switch(ch)
					{
					case 1:
						pList = p.createProductList();
						break;
					case 2:
						System.out.print("Enter Product ID: ");
						int id = sc.nextInt();
						p.updateProductById(pList, id);
						System.out.println();
						break;
					case 3:
						System.out.print("Enter Product ID: ");
						int delId = sc.nextInt();
						p.deleteProductById(pList, delId);
						System.out.println();
						break;
					case 4:
						p.displayProdList(pList);
						System.out.println();
						break;
					case 5:
						System.out.print("Enter Product ID: ");
						int dispId = sc.nextInt();
						p.displayProdDetailsById(pList, dispId);
						System.out.println();
						break;
					default:
						System.out.println();
					}
				} catch (NumberFormatException e) { e.printStackTrace(); }
				
			} while(ch != 6);
			
			System.out.println("Exiting");
			
			sc.close();
	}

}
