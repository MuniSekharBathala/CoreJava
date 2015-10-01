package com.serilization;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Employee implements Serializable
{
private static final long serialVersionUID=-8355081662051442374L;
 volatile String firstName;
   static String lastName;
  int age;
  
public String getFirstName() {
	return firstName;
}
public void setFirstName(String firstName) {
	this.firstName = firstName;
}
public String getLastName() {
	return lastName;
}
public void setLastName(String lastName) {
	this.lastName = lastName;
}
@Override
	public String toString() {
		return new StringBuffer("FirstName :").append(this.firstName).append("  LastName :").append(this.lastName).toString();
	}
}
public class SerializationDemo 
{
public static void main(String[] args) throws IOException {
	SerializationDemo sd=new SerializationDemo();
	sd.serializEmployee("munisekhar", "bathala");
	


}
public void serializEmployee(String firstName,String lastName) throws IOException
{
	Employee employee=new Employee();
	employee.setFirstName(firstName);
	employee.setLastName(lastName);
	FileOutputStream fos=new FileOutputStream("d://Muni.txt");
	ObjectOutputStream oos=new ObjectOutputStream(fos);
	oos.writeObject(employee);
	oos.flush();
	System.out.println("done");
}
}
