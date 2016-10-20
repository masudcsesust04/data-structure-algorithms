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
public class InsertionSort {
    
    static int[] data = {14, 33, 27, 10, 35, 19, 42, 44};
    static int len;
    
    public InsertionSort() {
        len = data.length;
    }
    
    public void sort() {
        
        int holePosition;
        int valueToInsert;
        
        for(int i=0; i<len; i++) {
            
            valueToInsert = data[i];
            holePosition = i;
            
            while(holePosition > 0 && data[holePosition - 1] > valueToInsert) {
                data[holePosition] = data[holePosition - 1];
                holePosition = holePosition - 1;
            }
            
            data[holePosition] = valueToInsert;
        }        
    }
    
    public void display() {
        for(int i=0; i<len; i++) {
            System.out.print(data[i] + " ");
        }
        
        System.out.println("");
    }
    
    public static void main(String[] args) {
        
        InsertionSort is = new InsertionSort();
        
        System.out.print("Before sort: ");
        is.display();
        
        System.out.print("After sort: ");
        is.sort();
        is.display();        
    }        
}
