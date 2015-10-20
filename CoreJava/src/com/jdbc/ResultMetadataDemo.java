package com.jdbc;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

public class ResultMetadataDemo {
	public static void main(String[] args) throws ClassNotFoundException,
			SQLException {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con = DriverManager.getConnection(
				"jdbc:oracle:thin:@localhost:1521:XE", "system", "system");
		DatabaseMetaData damd=	con.getMetaData();
		PreparedStatement stmt = con.prepareStatement("select * from sekhar");
		ResultSet rs = stmt.executeQuery();
		ResultSetMetaData resultSetMetaData = rs.getMetaData();
		System.out.println("Total Number of colums"
				+ resultSetMetaData.getColumnCount());
		System.out.println("Column name " + resultSetMetaData.getColumnName(1));
		System.out.println("Column name "
				+ resultSetMetaData.getColumnTypeName(1));

		System.out.println("Column name " + resultSetMetaData.getColumnName(2));
		System.out.println("Column name "
				+ resultSetMetaData.getColumnTypeName(2));

		System.out.println("Column name " + resultSetMetaData.getColumnName(3));
		System.out.println("Column name "
				+ resultSetMetaData.getColumnTypeName(3));
		System.out.println("Driver name  "+damd.getDriverName());
		System.out.println("Driver version  "+damd.getDriverVersion());
		System.out.println("Driver name  "+damd.getDriverName());
		System.out.println("User name  "+damd.getUserName());
		System.out.println("Database Product Name  "+damd.getDatabaseProductName());
		System.out.println("Database Product Version  "+damd.getDatabaseProductVersion());





	}
}
