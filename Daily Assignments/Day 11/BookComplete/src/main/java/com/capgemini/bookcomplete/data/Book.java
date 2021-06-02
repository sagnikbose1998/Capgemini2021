package com.capgemini.bookcomplete.data;

import com.capgemini.bookcomplete.exceptions.BookIDCannotBeNegativeException;
import com.capgemini.bookcomplete.exceptions.BookNameCannotBeNull;
import com.capgemini.bookcomplete.exceptions.PriceIsNotValidException;

public class Book {
	private int bid;
	private String bname;
	private double price;
	
//	Constructors
	public Book() {
		
	}
	public Book(int bid, String bname, double price) {
		super();
		this.bid = bid;
		this.bname = bname;
		this.price = price;
	}
	
//	Getters and Setters
	public int getBid() {
		return bid;
	}
	public void setBid(int bid) {
		this.bid = bid;
	}
	public String getBname() {
		return bname;
	}
	public void setBname(String bname) {
		this.bname = bname;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
//	Hashcode and equals
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + bid;
		result = prime * result + ((bname == null) ? 0 : bname.hashCode());
		long temp;
		temp = Double.doubleToLongBits(price);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		if (bid != other.bid)
			return false;
		if (bname == null) {
			if (other.bname != null)
				return false;
		} else if (!bname.equals(other.bname))
			return false;
		if (Double.doubleToLongBits(price) != Double.doubleToLongBits(other.price))
			return false;
		return true;
	}
	
//	Check methods
	public void checkBookID() throws BookIDCannotBeNegativeException {
		if (this.bid < 0)
			throw new BookIDCannotBeNegativeException("Book ID cannot be negative");
	}
	public void checkBookName() throws BookNameCannotBeNull {
		if (this.bname.isBlank())
			throw new BookNameCannotBeNull("Book Name cannot be null");
	}
	public void checkPriceValidity() throws PriceIsNotValidException {
		if (this.price == 0 || this.price < 0 )
			throw new PriceIsNotValidException("Price cannot be 0 or less than 0");
	}
	
	public void checker(Book b) throws Exception {
		b.checkBookID();
		b.checkBookName();
		b.checkPriceValidity();
	}
	
}
