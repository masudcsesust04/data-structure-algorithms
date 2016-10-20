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
public class Palindrome {
        
    public static void main(String[] args) {
    
        int n, reverse = 0, temp;
        
        System.out.print("Enter a number : ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        
        temp = n;
        
        while(temp != 0) {
            reverse = reverse * 10;
            reverse = reverse + temp % 10;
            temp = temp / 10;
            System.out. println("reverse = " + reverse + " temp = " + temp);
        }            
        
        if(n == reverse) {
            System.out.println(n + " is a palindrome number.");
        } else {
            System.out.println(n + " is not a palindrome number.");
        }        
    }    
}
