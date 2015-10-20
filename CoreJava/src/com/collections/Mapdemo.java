package com.collections;

import java.util.Hashtable;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.WeakHashMap;

public class Mapdemo {
	public static void main(String[] args) {
		Map<Integer, Comparable> map = new IdentityHashMap<Integer, Comparable>();
		map.put(1, 23);
		map.put(2, "sekhar");
		map.put(3, "sekhar");
		map.put(4, 501);
		System.out.println(map);
		Map<Integer, Comparable> map2 = new WeakHashMap<Integer, Comparable>();
		map2.putAll(map);
		// map2.put(null, null);
		// map2.put(null, 201);
		System.out.println(map2);
		Map<Integer, Comparable> map3 = new Hashtable<Integer, Comparable>();
		map3.putAll(map2);
		System.out.println(map3);
		Map map4 = new TreeMap();
		map4.putAll(map3);
	}
}
