package com.jdbc;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.sql.Clob;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class FileRetrive {
public static void main(String[] args) throws ClassNotFoundException, SQLException, IOException  {
Class.forName("oracle.jdbc.driver.OracleDriver");	
Connection connection=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","system");
PreparedStatement preparedStatement=connection.prepareStatement("select * from filetable");
ResultSet rs=preparedStatement.executeQuery();
rs.next();
Clob c=rs.getClob(2);
Reader r=c.getCharacterStream();
	FileWriter fileWriter=new FileWriter("d:\\ravi.txt");
	int i;
	while((i=r.read())!=-1)
	{
		fileWriter.write((char)i);
	}
	fileWriter.close();
	connection.close();
	System.out.println("retriving done....");
}
}
