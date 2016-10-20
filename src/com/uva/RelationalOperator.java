/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uva;

import java.util.Scanner;

/**
 * @problem #11172
 * @author masud
 */
public class RelationalOperator {
    
    public static void main(String[] args) {
        
        short t;
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Number of test cases : ");
        t = sc.nextShort();
        
        while(t <= 15 && t >= 1) {
            int a, b;
            
            a = sc.nextInt();
            b = sc.nextInt();
            
            if(a < b) {
                System.out.println("<");
            } else if(a > b) {
                System.out.println(">");
            } else if(a == b) {
                System.out.println("=");
            }
            
            t--;
        }                
    }
}
