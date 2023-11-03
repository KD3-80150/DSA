package com.sunbeam;

public class QueueMain 
{

    public static void main(String[] args) {
        Queue queue = new Queue(5);

        System.out.println("Is the queue empty? " + queue.isEmpty());
        System.out.println("");

        queue.push(10);
        queue.push(20);
        queue.push(30);
        queue.push(40);
        queue.push(50);
        
        queue.printQueue();
        System.out.println("");


        System.out.println("Front of the queue: " + queue.peek());
        System.out.println("Is the queue full? " + queue.isFull());
        System.out.println("");


        queue.pop();
        queue.pop();

        System.out.println("Front of the queue: " + queue.peek());

        queue.printQueue();
        
    }
}
