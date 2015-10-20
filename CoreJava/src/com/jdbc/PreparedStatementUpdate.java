package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class PreparedStatementUpdate {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","system");
		PreparedStatement stmt=con.prepareStatement("update sekhar set age=? where 	sno=?");
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the age...");
		int n1=scanner.nextInt();
		stmt.setInt(1,n1);//1 specifies the first parameter in the query i.e. name  
		System.out.println("Enter the sno...");
		int n2=scanner.nextInt();
		stmt.setInt(2,n2);  
		  
		int i=stmt.executeUpdate();  
		System.out.println(i+" records updated");  
		System.out.println("done");
	}

}
