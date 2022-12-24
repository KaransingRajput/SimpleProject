package com.simpleproject;

import java.util.ArrayList;

public class Test {
	public static void main(String[] args) {
		ArrayList<String> list =new ArrayList<String>();
		list.add("karan");
		list.add("Ram");
		list.add("sagar");
		System.out.println(list);
		for(String s:list) {
			System.out.println(s);
		}
	}

}
