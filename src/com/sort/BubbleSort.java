/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sort;

/**
 *
 * @author masud
 */
public class BubbleSort {
    
    static int MAX_SIZE = 10;
    static int[] data = {14, 33, 27, 35, 10};
    static int len;
    
    public BubbleSort() {
        len = data.length;
    }
        
    public void sort() {
        int temp;
        
        if(len > 1) {
            for (int i=0; i<len - 1; i++) {
                for(int j=0; j<len - 1; j++) {

                    System.out.println("Item compared : "+ data[j] +" "+ data[j+1]);

                    if(data[j] > data[j+1]) {
                        temp = data[j];
                        data[j] = data[j+1];
                        data[j+1] = temp;
                    }
                }
            }
        } else {
            System.out.println("Item already sorted!");
        }                
    }
    
    public void display() {
        for(int i=0; i<len; i++) {
            System.out.print(data[i] + " ");
        }
        
        System.out.println("");
    }
    
    public static void main(String[] args) {    
        
        BubbleSort bs = new BubbleSort();
        
        System.out.print("Before sort: ");
        bs.display();
                        
        bs.sort();
        System.out.print("After sort: ");
        bs.display();
    }
}
