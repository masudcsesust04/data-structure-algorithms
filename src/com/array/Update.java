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
public class Update {
    public static void main(String[] args) {
        int[] data = {10, 20, 30, 40, 50};
        int len = data.length;
        int pos, item;
        
        System.out.println("Original array elementes are:");
        for(int i = 0; i < len; i++) {
            System.out.println("data["+ i + "] = "+ data[i]);
        }
        
        Scanner sc = new Scanner(System.in);
 
        System.out.println("Enter position : ");
        pos = sc.nextInt(); 
        
        System.out.println("Enter item : ");
        item = sc.nextInt(); 
        
        if(pos <= len) {
            data[pos] = item;
            
            System.out.println("After updating array elementes : ");
            for(int i = 0; i < len; i++) {
                System.out.println("data["+ i + "] = "+ data[i]);
            }
            
        } else {
            System.out.println("Exception: Array out of bound!");
        }                        
    }
}
