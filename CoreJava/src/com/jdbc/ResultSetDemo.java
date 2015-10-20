package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;


public class ResultSetDemo {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","system");
		String sql="insert into sekhar values(?,?,?)";
		PreparedStatement ps=con.prepareStatement(sql);
		System.out.println("Eneter the sno...");
		Scanner scanner=new Scanner(System.in);
		int i0=scanner.nextInt();
		ps.setInt(1, i0);
		System.out.println("Enter the name....");
		String s1=scanner.next();
		ps.setString(2, s1);
		System.out.println("enter the Age...");
		int i1=scanner.nextInt();
		ps.setInt(3, i1);
		int i=ps.executeUpdate();
		System.out.println(i +"records inserted");
		ps.close();
		con.close();
	}
}
