package jdbcexample;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class ProductManagementSystem {
	
	static Connection con=null;
	static Statement stmt=null;
	static PreparedStatement pstmt=null;
	static ResultSet rs=null;
	static Scanner sc=new Scanner(System.in);
	public Connection dbConnection() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","sagnik1234");
		}catch(Exception e) {
			e.printStackTrace();
		}
		return con;
	}//close of dbconnection method
	
	public void createTable() {
		try {
			stmt=con.createStatement();
			String createTable="create table product(pid number primary key,pname varchar2(20),price number(10,2))";
			int i=stmt.executeUpdate(createTable);
			System.out.println(i);
			if(i==0) {
				System.out.println("Table Created Successfully");
			}else {
				System.out.println("Table Not Created Successfully");
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				stmt.close();
			}
			catch(SQLException e) {
				e.printStackTrace();
			}
		}
	}
	
	
	public void insertIntoProduct() {
		try {
			stmt=con.createStatement();
			String insertData="insert into product values(123,'Pen',25.45)";
			int i = stmt.executeUpdate(insertData);
			if(i!=0) {
				System.out.println("data inserted successfully");
			}else {
				System.out.println("data is not inserted successfully");
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			try {
				stmt.close();
			}catch(SQLException e) {
				e.printStackTrace();
			}
		}
	}

	// insert data into product table using prepared statement
	public void insertIntoProductUsingPs() {
		try {
			String insertData="insert into product values(?,?,?)";

			pstmt=con.prepareStatement(insertData);
			System.out.println("Enter the product Details");
			System.out.println("Enter the product id");
			int productId=sc.nextInt();
			System.out.println("Enter the product name");
			sc.nextLine();
			String productName=sc.nextLine();
			System.out.println("Enter the product price");
			float productPrice=sc.nextFloat();
			pstmt.setInt(1, productId);
			pstmt.setString(2, productName);
			pstmt.setFloat(3, productPrice);
			
			int i=pstmt.executeUpdate();
			
			if(i !=0) {
				System.out.println("Item inserted Successfully");
			}
			else
			{
				System.out.println("Item not inserted Successfully");
			}
		}catch (Exception e) {
				e.printStackTrace();
			}
			finally {
				try {
					pstmt.close();
				}
				catch(SQLException e) {
					e.printStackTrace();
				}
			}
	}
	
	public void getAllProducts() {
		
	}
	
	public void getDataById() {
		
	}
	
public void updateDataByUsingId() {
		
	}
}