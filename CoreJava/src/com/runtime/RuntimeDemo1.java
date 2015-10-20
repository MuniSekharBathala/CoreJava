package com.runtime;

import java.io.IOException;

public class RuntimeDemo1 
{
public static void main(String[] args) {
	try {
		Runtime.getRuntime().exec("notepad");
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}

}
