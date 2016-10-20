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
public class Recursion {
    
    public void recur(int y) {
        if(y > 0) {
            System.out.print(y + " ");
            recur(y - 1);           
            System.out.print(y + " ");
        }
    }
    
    public int factorial(int n) {
        if(n == 0) {
            return 1;
        } else {
            return n * factorial(n-1);
        }
    }
    
    public int fibonacci(int n) {
        
        if(n == 0) {                        
            return 0;
        } else if(n == 1) {
            return 1;
        } else {            
            return fibonacci(n-1) + fibonacci(n - 2);
        }
    }
    
    public static void main(String[] args) {
        
        Recursion re = new Recursion();
//        re.recur(5);
//        System.out.println(re.factorial(5));
        for(int i = 0; i<5; i++) {
            System.out.print(re.fibonacci(i) + " ");
        }        
    }
}
