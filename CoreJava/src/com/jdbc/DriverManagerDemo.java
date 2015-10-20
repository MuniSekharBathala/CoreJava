package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
class DriverManagerDemo{
public static void main(String[] args) throws ClassNotFoundException, SQLException 
{
Class.forName("oracle.jdbc.driver.OracleDriver");
Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","system");
Statement stmt=con.createStatement();
stmt.execute("create table sekhar(sno int,name varchar(90),age int)");
System.out.println("done.....");

}
}
