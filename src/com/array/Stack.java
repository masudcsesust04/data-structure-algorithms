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
public class Stack {
    int MAXSIZE = 10;
    int top;
    int[] data = new int[MAXSIZE];
    
    public Stack() {
        top = -1;
    }
    
    public boolean isFull() {
        
        return top == MAXSIZE - 1;
    } 
    
    public boolean isEmpty() {
        
        return top == -1;                   
    }
    
    public int peek() {
        
        return data[top];
    }
    
    public void push(int item) {
        if(isFull()) {
            System.out.println("Stack is full!");            
        } else {
            top = top + 1;
            data[top] = item;
        }
    }
    
    public int pop() {
        int popItem;
        
        if(isEmpty()) {
            System.out.println("Stack is empty!");
        } else {
            popItem = data[top];
            data[top] = 0;
            top--;
            
            return popItem;
        }
        
        return 0;
    }
    
    public void display() {
        System.out.println("");
        System.out.print("Stack items: ");
        for(int i=0; i<data.length; i++) {
            System.out.print(data[i]);
            System.out.print(" ");
        }
        System.out.println("");
    }
    
    public static void main(String[] args) {
        
        Stack stack = new Stack();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);
        
        System.out.println("Peek item is = "+ stack.peek());
        
        while(!stack.isEmpty()) {
            int item = stack.pop();
            System.out.print(item);
            System.out.print(" ");
        }
        
//        while(!stack.isFull()) {
        stack.push(60); 
        stack.display();
        System.out.println("Peek item is = "+ stack.peek());
        
//        }         
    }
    
    
}
