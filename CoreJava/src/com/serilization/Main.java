package com.serilization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

 class Address implements Serializable{
     private static final long serialVersionUID = 4L;  


	   String street;
	   String country;

	   public void setStreet(String street){
		   this.street = street;
	   }
	   
	   public void setCountry(String country){
		   this.country = country;
	   }
	   
	   public String getStreet(){
		   return this.street;
	   }
	   
	   public String getCountry(){
		   return this.country;
	   }
	   
	   @Override
	   public String toString() {
 	   return new StringBuffer(" Street : ")
 	   .append(this.street)
 	   .append(" Country : ")
 	   .append(this.country).toString();
	   }
	   
}
public class Main {

	   public static void main (String args[]) {
	    
		   Main serializer = new Main();
		   serializer.serializeAddress("wall street", "united state");
	   }

	   public void serializeAddress(String street, String country){
		   
		   Address address = new Address();
		   address.setStreet(street);
		   address.setCountry(country);
		   
		   try{
			   
			FileOutputStream fout = new FileOutputStream("d:\\address1.ser");
			ObjectOutputStream oos = new ObjectOutputStream(fout);   
			oos.writeObject(address);
			oos.close();
			System.out.println("Done");
			   
		   }catch(Exception ex){
			   ex.printStackTrace();
		   }
	   }
	}
