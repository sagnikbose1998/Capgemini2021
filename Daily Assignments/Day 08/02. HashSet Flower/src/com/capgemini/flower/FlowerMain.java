package com.capgemini.flower;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class FlowerMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashSet<Flower> f = new HashSet<>();
        int ch = 0;
        do {
            System.out.println("Press\n1. Create the list of flowers\n2. Display the list\n3. Remove the flower based on qty\n4. Exit\n");
            try {
                ch = sc.nextInt();
                switch (ch) {
                    case 1:
                        System.out.print("Enter the number of flowers to add: ");
                        int number = sc.nextInt();
                        for (int i = 0; i < number; i++) {
                            System.out.println("Enter the details: ");
                            System.out.print("Enter the flower name: ");
                            String fName = sc.next();
                            System.out.print("Enter the flower id: ");
                            int fid = sc.nextInt();
                            System.out.print("Enter the flower price: ");
                            double pricePerKg = sc.nextDouble();
//                            sc.next();
                            System.out.print("Enter the quantity: ");
                            int qty = sc.nextInt();
                            f.add(new Flower(fid, fName, pricePerKg, qty));
                        }
                        break;
                    case 2:
                        Iterator<Flower> itr = f.iterator();
                        System.out.println("Flower values using iterator: ");
                        while (itr.hasNext()) {
                            Flower fl = itr.next();
                            System.out.print("Name: " + fl.getfName() + ", ID: " + fl.getFid() + ", Price: " + fl.getPricePerKg() + ", Quantity: " + fl.getQty() + "\n");
                        }
                        break;
                    case 3:
                        System.out.println("Enter the flower id to delete: ");
                        Iterator<Flower> itrator = f.iterator();
                        int id = sc.nextInt();
                        while (itrator.hasNext()) {
                            Flower flower = itrator.next();
                            if (flower.getFid() == id)
                                itrator.remove();

                        }
                        break;
                    default:
                        System.out.println("Exiting!");
                }
            } catch (NumberFormatException e) { e.printStackTrace(); }

        } while(ch != 4);
        sc.close();
    }
}
