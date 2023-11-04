package com.sunbeam;

public class ReversedListMain {


	public static void main(String[] args) 
	{
		ReversedList r1=new ReversedList();
		r1.addFirst(10);
		r1.addFirst(20);
		r1.addFirst(30);
		r1.addFirst(40);
		r1.addLast(50);
		
		r1.display();
		r1.revList();
		r1.display();
	}

}