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
public class SievePrime {
    
    static int[] primes;
    
    public SievePrime(int n) {
        primes = new int[n+1];
    }
    
    public void findPrimes(int n) {
        
        for(int i = 0; i<= n; i++) {
            primes[i] = 1;
        }
        
        primes[0] = 0;
        primes[1] = 0;
        
        
        for(int i= 2; i<= (int) Math.sqrt(n); i++) {
            for(int j=2; i*j <= n; j++) {
                primes[i*j] = 0;
            }
        }
    };
    
    public static void main(String[] args) {
        
        int n;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a number : ");
        n = sc.nextInt();
        
        SievePrime sp = new SievePrime(n);
        
        sp.findPrimes(n);
        
        System.out.println("Primes from 2 - " + n + " : ");
        
        int count = 0;
        
        for(int i=2; i<=n; i++) {
            if(primes[i] == 1) {
                count++;
                System.out.print(i + ", ");
            }            
        }
        System.out.println("\nTotal = "+ count);
    }    
}
