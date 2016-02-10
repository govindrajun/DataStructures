package com.gov.lists;

public class Link {
	private int data1;
	private String data2;
	public Link nextLink;
	
	public Link(int d1, String d2){
		
		data1 = d1;
		data2 = d2;
	}
	
	public void printLink(){
		System.out.println(data1 + " " + data2);
	}
}
