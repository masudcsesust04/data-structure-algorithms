/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uva;

import java.util.Scanner;

/**
 * @problem 10018
 * @author masud
 */
public class ReverseAndAdd {
    
    static int[][] results;
    
    public int reverse(int num) {
        int temp = num;
        int reverse = 0;
                
        while(temp != 0) {
            reverse = reverse * 10;
            reverse = reverse + (temp % 10);
            temp = temp / 10;
        }
        
//        System.out.println("reverse = " + reverse);
        
        return reverse;
    }
    
    public void isPalindrom(int num, int count) {
                
        int itteration = 0;
                    
        
        while(num != reverse(num)) {                              
            num = num + reverse(num);                                                        
            itteration = itteration + 1;                        
//            System.out.println("sum = " + num);
        }
        
        results[count][0] = itteration;
        results[count][1] = num;        
    }
    
    public static void main(String[] args) {
        
        int n, count=0;
        int[] inputs;
                
        Scanner sc = new Scanner(System.in);
        ReverseAndAdd raa = new ReverseAndAdd();
//        raa.isPalindrom(195);
        
        System.out.print("Enter number of inputs : ");
        n = sc.nextInt();
        
        if(n > 0 && n <= 100) {
            inputs = new int[n];
            results = new int[n][2];
            
            System.out.println("Enter input numbers : ");
            
            while(count < n) {
                inputs[count] = sc.nextInt();
                count++;
            }
            
            for(int i = 0; i < n; i++) {
                raa.isPalindrom(inputs[i], i);
            }
            
            for(int j = 0; j < n; j++) {
                System.out.println(results[j][0] +" " + results[j][1]);
            }
            
        } else {
            System.exit(0);
            System.out.println("input should be > 0 and <=100");                    
        }                
    }
}
