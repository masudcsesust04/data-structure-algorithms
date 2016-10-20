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
public class Insertion {
    
    static int[] data = new int[10]; 
    static int pos = 2;
    static int item = 30;
    static int len = 5;
    
    public Insertion() {           
    }
    
    public static void main(String[] args) {               
        
        System.out.println("Initial array : ");
        data[0] = 10;
        data[1] = 20;
        data[2] = 40;
        data[3] = 50;
        data[4] = 60;   
        
        for(int i = 0; i < data.length; i++) {
            System.out.println("data["+ i + "] = "+ data[i]);
        }
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter position : ");
        pos = sc.nextInt();
        
        if(pos < data.length) {
            System.out.println("Enter item : ");
            item = sc.nextInt();

            while(len >= pos) {
                data[len + 1] = data[len];
                len = len -1;
            }

            data[pos] = item;

            System.out.println("After insertion :");

            for(int i = 0; i < data.length; i++) {
                System.out.println("data["+ i + "] = "+ data[i]);
            }
        } else {
            System.out.println("Exception: Array out of bound!");
        }        
    }    
}
