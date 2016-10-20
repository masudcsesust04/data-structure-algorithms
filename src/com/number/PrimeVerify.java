/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.number;

import java.util.Scanner;

/**
 *
 * @author rana
 */
public class PrimeVerify {
    
    // Trial division method
    public boolean isPrime(int n) {
        
        boolean isAprime = true;
                
        System.out.println("Square root of n is : " + (int) Math.sqrt(n));
        
        for(int i = 2; i<= (int) Math.sqrt(n); i++){            
            if(n%i == 0) {
                isAprime = false;
            }             
        }
        
        return isAprime;
    }
    
    public static void main(String[] args) {
        
        int n;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a number : ");
        n = sc.nextInt();
        
        PrimeVerify pv = new PrimeVerify();
        
        if(pv.isPrime(n)) {
            System.out.println(n + " is a prime number!");
        } else {
            System.out.println(n + " is not a prime number!");
        }                        
    }    
}
