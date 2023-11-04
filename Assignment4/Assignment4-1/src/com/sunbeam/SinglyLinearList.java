package com.sunbeam;

//import com.sunbeam.LinearMain.Node;

public class SinglyLinearList {

	public class Node {
		private int data;
		private Node next;

		public Node(int value) {
			data = value;
			next = null;
		}
	}

	private Node head;

	public SinglyLinearList() {
		head = null;
	}

	public boolean isEmpty() {
		return head == null;
	}

	public void addFirst(int value) {
		Node newnode = new Node(value);
		if (isEmpty()) {
			head = newnode;
		} else {
			newnode.next = head;
			head = newnode;
		}
	}
	
	public void addLast(int value)
	{
		Node newnode =  new Node(value);
		if (isEmpty())
		{
			head =  newnode;
		}
		else
		{
			Node trav = head;
			while(trav.next != null)
				trav = trav.next;
		trav.next = newnode;
		}
		
	}
	
	public void deleteFirst()
	{
		if (isEmpty())
		{
			System.out.println("List is Empty.");
		}
		else
		{
			head = head.next;
		}
	}
	public void deleteLast()
	{
		if (isEmpty())
		{
			System.out.println("List is Empty.");
		}
		else if (head.next == null) 
		{
			head = null;
		}
		else
		{
			Node trav = head;
			while (trav.next.next != null)
			{
				trav = trav.next;
			}
			trav.next = null;
		}
	}
	
	public void display()
	{
		Node trav = head;
		System.out.print(" List : ");
		
		while (trav != null)
		{
			System.out.print(" " + trav.data);
			trav = trav.next;
		}
//		System.out.println("");
	}

}
