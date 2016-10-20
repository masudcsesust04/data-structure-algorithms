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
public class BinarySearch {
    int[] data = {  5, 10, 15, 20, 25, 30, 35, 40, 45, 
                    50, 55, 60, 65, 70, 75, 80, 85, 90};
    
    public int search(int item) {
        int low = 0;
        int high = data.length - 1;
        int mid;
        int index = -1;
        int comparisons = 0;
        
        if(low == high) {
            return 0;
        } else {
            while(low <= high) {
                
                comparisons++;
                System.out.println("Comparison : "+ comparisons);
                
                mid = low + (high - low) / 2;
                
                if(data[mid] == item) {
                    index = mid;
                    break;
                } else if(data[mid] < item) {
                    low = mid +1;                    
                } else {
                    high = mid - 1;
                }
            }
        }
        
        System.out.println("Total comparison made : "+ comparisons);
        
        return index;
    };
    
    public static void main(String[] args) {
                        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter search item : ");
        int item = sc.nextInt();
        
        BinarySearch bs = new BinarySearch();
        int location = bs.search(item);
        
        if(location >= 0) {
            System.out.println("Item found in : " + location);
        } else {
            System.out.println("No match found!");
        }        
    }
}
