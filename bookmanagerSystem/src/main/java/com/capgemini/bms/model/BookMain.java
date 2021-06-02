package com.capgemini.bms.model;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

import com.capgemini.bms.Book;
import com.capgemini.bms.exceptions.ArrayListisNullException;
import com.capgemini.bms.exceptions.BookAlreadyFoundExceptionException;
import com.capgemini.bms.exceptions.BookIDCannotBeNegativeException;
import com.capgemini.bms.exceptions.BookNameCannotBeNullException;
import com.capgemini.bms.exceptions.BookNotFoundExceptionException;
import com.capgemini.bms.exceptions.PriceNotValidException;

/**
 * 
 * @author SagnikB
 *
 */
public class BookMain {

	static ArrayList<Book> books = new ArrayList<Book>();
	static Scanner sc = new Scanner(System.in);
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static Book book;
	static int index = 0;
	/**
	 * SagnikB creates Create Operation
	 * @throws IOException
	 */
	public static void create() throws IOException {
		int temp = 0;
		if (books.size() < 1) {
			int bid = 0;
			String bname = "";
			double price = 0.0;
			do {
				try {
					System.out.print("\nEnter the Book ID : ");
					bid = sc.nextInt();
					if (bid <= 0) {
						throw new BookIDCannotBeNegativeException("Book ID cannot be zero or negative");
					}
				} catch (BookIDCannotBeNegativeException e) {
					System.out.println("Error Message : " + e.getMessage());
				}
			} while (bid <= 0);
			do {
				try {
					System.out.print("\nEnter the Book Name : ");
					bname = br.readLine();
					if (bname == null) {
						throw new BookNameCannotBeNullException("Book Name cannot be null");
					}
				} catch (BookNameCannotBeNullException e) {
					System.out.println("Error Message : " + e.getMessage());
				}
			} while (bname == null);
			do {
				try {
					System.out.print("\nEnter the Book Price : ");
					price = sc.nextDouble();
					if (price <= 0) {
						throw new PriceNotValidException("Price is not valid");
					}
				} catch (PriceNotValidException e) {
					System.out.println("Error Message : " + e.getMessage());
				}
			} while (price <= 0);
			book = new Book(bid, bname, price);

			books.add(book);
			System.out.println("Book Created");
			index++;
		} else {
			do {
				try {
					int bid = 0;
					String bname = "";
					double price = 0.0;
					do {
						try {
							System.out.print("\nEnter the Book ID : ");
							bid = sc.nextInt();
							if (bid < 0) {
								throw new BookIDCannotBeNegativeException("Book ID cannot be zero or negative");
							}
						} catch (BookIDCannotBeNegativeException e) {
							System.out.println("\nError Message : " + e.getMessage());
						}
					} while (bid < 0);
					int k = 0;
					for (int i = 0; i < books.size(); i++) {
						if (bid == books.get(i).getBid()) {
							temp = 1;
							k = i;
							break;
						}

					}
					if (temp == 1) {
						books.remove(k);
						throw new BookAlreadyFoundExceptionException("Book Already Found...It Cannot be added");
					} else {
						do {
							try {
								System.out.print("\nEnter the Book Name : ");
								bname = br.readLine();
								if (bname.length() == 0) {
									throw new BookNameCannotBeNullException("Book Name cannot be null");
								}
							} catch (BookNameCannotBeNullException e) {
								System.out.println("\nError Message : " + e.getMessage());
							}
						} while (bname.length() == 0);
						do {
							try {
								System.out.print("\nEnter the Book Price : ");
								price = sc.nextDouble();
								if (price <= 0) {
									throw new PriceNotValidException("Price is not valid");
								}
							} catch (PriceNotValidException e) {
								System.out.println("\nError Message : " + e.getMessage());
							}
						} while (price <= 0);
						book = new Book(bid, bname, price);
						books.add(book);
						System.out.println("Book Created");
					}
				} catch (BookAlreadyFoundExceptionException e) {
					System.out.println("\nError Message : " + e.getMessage());
				}
			} while (temp == 1);
		}

	}
	/**
	 * SagnikB Creates Read Operation
	 */
	public static void read() {
		try {
			if (books.size() < 1) {
				throw new ArrayListisNullException("ArrayList is null.");
			} else {
				for (int i = 0; i < books.size(); i++) {
					System.out.println(books.get(i));
				}
			}
		} catch (ArrayListisNullException e) {
			System.out.println("\nError Message : " + e.getMessage());
		}
	}
	/**
	 * Sagnik Creates Update Operation
	 */
	public static void update() {
		try {
			if (books.size() < 1) {
				throw new ArrayListisNullException("ArrayList is null.");
			} else {
				int temp = 0;
				int k = 0;
				int id = 0;
				String bname = "";
				double price = 0;
				try {
					System.out.print("\nEnter the book id you want to update : ");
					id = sc.nextInt();

					for (int i = 0; i < books.size(); i++) {
						if (books.get(i).getBid() == id) {
							temp = 1;
							k = i;
						}
					}
					if (temp == 0) {
						throw new BookNotFoundExceptionException("Book Not Found!!!");
					} else {
						books.remove(k);
						do {
							try {
								System.out.print("\nEnter the new Book Name : ");
								bname = sc.next();
								if (bname.isBlank()) {
									throw new BookNameCannotBeNullException("Book Name cannot be null");
								}
							} catch (BookNameCannotBeNullException e) {
								System.out.println("\nError Message : " + e.getMessage());
							}
						} while (bname.isBlank());
						do {
							try {
								System.out.print("\nEnter the new Book Price : ");
								price = sc.nextDouble();
								if (price <= 0) {
									throw new PriceNotValidException("Price is not valid");
								}
							} catch (PriceNotValidException e) {
								System.out.println("\nError Message : " + e.getMessage());
							}
						} while (price <= 0);
					}
				} catch (BookNotFoundExceptionException e) {
					System.out.println("\nError Message : " + e.getMessage());
				}
				book = new Book(id, bname, price);
				books.add(book);
				System.out.println("Book Updated");
			}
		} catch (ArrayListisNullException e) {
			System.out.println("\nError Message : " + e.getMessage());
		}
	}
	/**
	 * SagnikB creates delete operation
	 */
	public static void delete() {
		try {
			if (books.size() < 1) {
				throw new ArrayListisNullException("ArrayList is null.");
			} else {
				int temp = 0;
				int k = 0;
				int id = 0;
				try {
					System.out.print("\nEnter the book id you want to delete : ");
					id = sc.nextInt();

					for (int i = 0; i < books.size(); i++) {
						if (books.get(i).getBid() == id) {
							temp = 1;
							k = i;
						}
					}
					if (temp == 0) {
						throw new BookNotFoundExceptionException("Book Not Found!!!");
					} else {
						books.remove(k);

						System.out.println("Book Deleted");
					}
				} catch (BookNotFoundExceptionException e) {
					System.out.println("\nError Message : " + e.getMessage());
				}
			}

		} catch (ArrayListisNullException er) {
			System.out.println("\nError Message : " + er.getMessage());
		}
	}
	/**
	 * Sagnik Creates the Main Method
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {

		char c;
		char choice = 'y';
		while (choice == 'y') {
			System.out.print(
					"C - Create Books list\nR - Read the Books\nU - Update Book List\nD - Delete Book List\nEnter your choice : ");
			c = sc.next().trim().charAt(0);
			switch (c) {
			case 'c':
			case 'C':
				create();
				break;
			case 'r':
			case 'R':
				read();
				break;
			case 'u':
			case 'U':
				update();
				break;
			case 'd':
			case 'D':
				delete();
				break;
			}
			System.out.println("\nDo you want to continue? (y/n) ");
			choice = sc.next().trim().charAt(0);
		}
	}

}