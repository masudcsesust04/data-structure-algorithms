/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uva;

import java.util.Scanner;

/**
 * @problem #10783
 * @author masud
 */
public class OddSum {
        
    public static void main(String[] args) {
        int[][] a;
        int[] sumList;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Number of test cases (1<=t<=100) : ");
        int testCases = sc.nextInt();
        
        if(testCases <= 0 || testCases >= 100) {
            System.out.println("Test case shouldn't be less than 1 and greater than 100");
            System.exit(0);
        } else {
            a = new int[testCases][2];            
            sumList = new int[testCases];
            int temp;
            int tempInput;
            
            System.out.println("Enter ranges : ");
            
            for(int i=0; i<testCases; i++) {
                for(int j=0; j<2; j++) {
                    tempInput = sc.nextInt();
                    
                    if(tempInput >= 0 && tempInput <= 100) {
                        a[i][j] = tempInput;
                    } else {
                        System.out.println("input can't be < 0 and >100");
                        System.exit(0);
                    }
                                                            
                    if(j == 1) {
                        if(a[i][0] > a[i][1]) {
                            temp = a[i][0];
                            a[i][0] = a[i][1];
                            a[i][1] = temp;
                        }
                    }
                }
            }
            
            // execute odd sum
            for(int i=0; i<testCases; i++) {
                int start = a[i][0];
                int end = a[i][1];
                int sum = 0;
                
                for(int j=start; j<=end; j++) {
                    if(j % 2 != 0) {
                        sum += j;
                    }
                }
                sumList[i] = sum;                
            }
            
            // output
            for(int i=0; i<testCases; i++) {
                System.out.println("Case "+ (i+1) +": " + sumList[i]);
            }
        }             
    }
}
