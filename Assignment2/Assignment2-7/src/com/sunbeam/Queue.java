package com.sunbeam;

public class Queue {
    private int arr[];
    private int rear, front;
    private final int SIZE;

    public Queue(int size) {
        SIZE = size;
        arr = new int[SIZE];
        front = -1;
        rear = -1;
    }

    public void push(int data) {
        if (!isFull()) {
            rear++;
            arr[rear] = data;
        } else {
            System.out.println("Queue is full. Cannot push " + data);
        }
    }

    public void pop() {
        if (!isEmpty()) {
            front++;
        } else {
            System.out.println("Queue is empty. Cannot pop.");
        }
    }

    public int peek() {
        if (!isEmpty()) {
            return arr[front + 1];
        } else {
            System.out.println("Queue is empty. Cannot peek.");
            return -1; // Return a sentinel value to indicate an empty queue
        }
    }

    public boolean isFull() {
        return rear == SIZE - 1;
    }

    public boolean isEmpty() {
        return rear == front;
    }
    public void printQueue() {
        System.out.print("Queue: ");
        for (int i = front + 1; i <= rear; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}

