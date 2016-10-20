/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uva;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * @problem #10370
 * @author masud
 */
public class AboveAverage {
    
    
    public static void main(String[] args) {
        int c;
        int n;
        int[] inputs;        
        
        
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat();
        df.setMinimumFractionDigits(3);
        df.setMaximumFractionDigits(3);
        
        System.out.println("Number of test cases (c) : ");
        c = sc.nextInt();       
        
        while(c != 0) {
            System.out.println("Number of students (N) : ");
            n = sc.nextInt();
            inputs = new int[n];
            int sum = 0;
            
            for(int i=0; i<n; i++) {
                inputs[i] = sc.nextInt();
                sum = sum + inputs[i];
            }
            
            int avg = sum / n;
            int count = 0;
            
            for(int i=0; i<n; i++) {
                if(inputs[i] > avg) {
                    count++;
                }
            }
            
            float result = (float) (count * 100) / n; 
            System.out.println(df.format(result) + "%");
            c--;
        }                        
    }
}
