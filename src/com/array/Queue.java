/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.array;

/**
 *
 * @author masud
 */
public class Queue {
    
    int MAXSIZE = 10;
    int[] queue = new int[MAXSIZE];
    int front, rear;
    
    public Queue() {
        front = 0;
        rear = -1;
    }
    
    public boolean isFull() {
        
        return rear == MAXSIZE - 1;
    }
    
    public boolean isEmpty() {
        
        return front < 0 || front >  rear;
    }
    
    public int peek() {
        
        return queue[front];
    }
    
    public void enqueue(int data) {
        if(!isFull()) {
            rear = rear + 1;
            queue[rear] = data;
        } else {
            System.out.print("Queue is overflow!");
        }
    }
    
    public int dequeue() {
        if(!isEmpty()) {                        
            return queue[front++];
        } else {
            System.out.println("Queue is underflow!");           
        }
        
        return 0;
    }
    
    public static void main(String[] args) {
        
        Queue q = new Queue();
        
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.enqueue(40);
        q.enqueue(50);
        
        System.out.println("Peek item is : "+ q.peek());
        
        while(!q.isEmpty()) {
            System.out.print(" ");
            System.out.print(q.dequeue());
            System.out.print(" ");
        }
        
    }    
}
