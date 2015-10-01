package com.serilization;
//http://www.mkyong.com/
import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class DeserializerDemo{

	   public static void main (String args[]) {
	    
		   DeserializerDemo deserializer = new DeserializerDemo();
		   Employee employee = deserializer.deserialzeAddress();
		   System.out.println(employee);
	   }

	   public Employee deserialzeAddress(){
		   
		   Employee employee;
		 
		   try{
			    
			   FileInputStream fin = new FileInputStream("d:\\Muni.txt");
			   ObjectInputStream ois = new ObjectInputStream(fin);
			   employee = (Employee) ois.readObject();
			   ois.close();
			  
			   return employee;
			   
		   }catch(Exception ex){
			   ex.printStackTrace();
			   return null;
		   } 
	   }}