package com.cts;

import com.service.SomeService;

public class Main {
	public static void main(String args[]){

		System.out.println("Hello world");

		SomeService ss=new SomeService();
		System.out.println(ss.findLength("Gowtham"));

	}
}
