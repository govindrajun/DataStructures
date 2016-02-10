package com.gov.lists;

public class LinkedList {

	private Link first;
	
	public LinkedList(){
		first = null;
	}
	
	public boolean isEmpty(){
		return (first==null);
	}
	
	public void insert(int d1, String d2){
		Link link = new Link(d1,d2);
		link.nextLink = first;
		first = link;
	}
	
	public Link delete(){
		
		Link temp = first;
		first = first.nextLink;
		return temp;
	}
	
	public void printList(){
		
		Link currentLink = first;
		
		while(currentLink.nextLink != null){
			currentLink.printLink();
			currentLink = currentLink.nextLink;
		}
		currentLink.printLink();
	}
	
	
	public static void main(String[] args) {
		
		LinkedList ll = new LinkedList();
		ll.insert(1, "One");
		ll.insert(2, "Two");
		ll.insert(3, "Three");
		ll.insert(4, "Four");
		
		ll.printList();
	}

}
