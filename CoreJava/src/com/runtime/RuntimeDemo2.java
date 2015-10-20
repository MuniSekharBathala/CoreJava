package com.runtime;

public class RuntimeDemo2 
{
public static void main(String[] args) {
	Runtime runtime=Runtime.getRuntime();
	System.out.println("Total Memory in Yor System:"+runtime.totalMemory());
	System.out.println("Free Memory in Yor System:"+runtime.freeMemory());
	for (int i = 0; i < 1000; i++) 
	{
	//new RuntimeDemo2();
	}
	System.out.println("Creating instance "+runtime.totalMemory());
	System.gc();
	System.out.println("After Calling Gc"+runtime.freeMemory());
	System.out.println(runtime.getRuntime()
			);

}
}
