package com.sunbeam;

import java.util.List;

public class SinglyLinearMain {
	public static void main(String[] args) {

		SinglyLinearList l1 = new SinglyLinearList();
		l1.addFirst(40);
		l1.addFirst(30);
		l1.addFirst(20);
		l1.addFirst(10);
		l1.addLast(50);
		l1.addLast(60);
		l1.display();
		l1.deleteFirst();
		System.out.println("");
		l1.display();
		l1.deleteLast();
		System.out.println("");
		l1.display();		
	}

}
