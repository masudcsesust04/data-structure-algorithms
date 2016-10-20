/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.search;

import java.util.Scanner;

/**
 *
 * @author masud
 */
public class LinearSearch {
      
    int[] data = {
        5, 10, 15, 20, 25, 30, 35, 40, 45, 50,
        55, 60, 65, 70, 75, 80, 85, 90, 95, 100 };   
    int len = data.length;
    static int item;
    
    public LinearSearch() {
        
    }
    
    public int search(int item) {
        for(int i=0; i<len; i++) {
            if(data[i] == item) {
                return i;
            }
        }
        
        return 0;
    }
    
    public void display() {
                
        int count = 0;
               
        while(count < len) {
            System.out.print(data[count] + " ");
            count++;
        }
        
        System.out.println();        
    }
    
    public static void main(String[] args) {
        
        LinearSearch ls = new LinearSearch();                       
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Items are : ");
        ls.display();
        
        System.out.print("Enter search item : ");
        item = sc.nextInt();
        
        int index = ls.search(item);
        
        if(index >= 0) {
            System.out.println("Item found in location " + index);
        } else {
            System.out.println("Item not found!");
        }       
    }
}
