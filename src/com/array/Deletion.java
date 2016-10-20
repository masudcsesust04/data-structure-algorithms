/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.array;

import java.util.Scanner;

/**
 *
 * @author masud
 */
public class Deletion {
    
    public Deletion() {
        
    }
    
    public static void main(String[] args) {
        int[] data = {10, 20, 30, 40, 50};
        int pos, start;
        int len = data.length;
        
        System.out.println("Original array elementes are:");
        for(int i = 0; i < len; i++) {
            System.out.println("data["+ i + "] = "+ data[i]);
        }
        
        Scanner sc = new Scanner(System.in);
  
        System.out.println("Enter position : ");
        pos = sc.nextInt();        
        start = pos;
        
        while(start < len) {
            data[start - 1] = data[start];
            start = start + 1;
        }
        
        len = len -1;
        
        System.out.println("Array elementes after deletion :");
        for(int i = 0; i < len; i++) {
            System.out.println("data["+ i + "] = "+ data[i]);
        }
    }
}
