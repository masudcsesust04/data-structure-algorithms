/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sort;

/**
 *
 * @author rana
 */
public class SelectionSort {
    
    static int[] data = {14, 33, 27, 10, 35, 19, 42, 44};
    static int len;
    
    public SelectionSort() {
        len = data.length;
    }
    
    public void display() {
        for(int i=0; i<len; i++) {
            System.out.print(data[i] + " ");
        }
        System.out.println("");
    }
    
    public void sort() {
        
        int minIndex, temp;
       
        for(int i=0; i<len; i++) {
            minIndex = i;
            
            for(int j=i+1; j<len; j++) {                
                if(data[j] < data[minIndex]) {                    
                    minIndex = j;
                }
            }
            
            if(minIndex != i) {                
                temp = data[i];
                data[i] = data[minIndex];
                data[minIndex] = temp;                       
            }            
        }            
    }
    
    public static void main(String[] args) {
        
        SelectionSort ss = new SelectionSort();
        
        System.out.print("Before sort : ");
        ss.display();
        
        System.out.print("After sort : ");
        ss.sort();
        ss.display();
    }    
}
