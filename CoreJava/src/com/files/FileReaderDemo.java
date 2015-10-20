package com.files;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.StringTokenizer;

public class FileReaderDemo {
	public static void main(String[] args) throws IOException {
		FileInputStream fileInputStream=new FileInputStream("C:\\Users\\Anilkumar J\\Desktop\\muni.txt");
		FileOutputStream outputStream=new FileOutputStream("C:\\Users\\Anilkumar J\\Desktop\\munisekhar.txt");
		
		int i;
		while((i=fileInputStream.read())!=-1)
		{
			outputStream.write((byte)i);
		}

	System.out.println("Done the project");
		
	}

}
