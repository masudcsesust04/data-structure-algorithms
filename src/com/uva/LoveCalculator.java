/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uva;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * @problem #10424
 * @author masud
 */
public class LoveCalculator {
    
    static char[] letters = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 
                            'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't',
                            'u', 'v', 'w', 'x', 'y', 'z'
                        };
    
    static String person1, person2;
            
    public int processWaight(String name) {
        int sum = 0;
        
        for(int i=0; i<name.length(); i++) {
            char x = Character.toLowerCase(name.charAt(i));            
            for(int j=0; j<letters.length; j++) {                                               
                if(x == letters[j]) {
                    sum = sum + (j + 1); 
                    break;
                }
            }
        }
        
        System.out.println(name + " = " + sum);
       
        return sum;
    }
    
    public int calculateSumOfDigits(int num) {       
        
        while(true) {
            
            if(num <= 9) {
                break;
            }
            
            String str = Integer.toString(num);            
            int digitSum = 0;
            
            for(int i=0; i<str.length(); i++) {    
                digitSum = digitSum + Character.getNumericValue(str.charAt(i));    
            }
            
            num = digitSum;
        }
                
        return num;
    }
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);                
        DecimalFormat df = new DecimalFormat();
        df.setMinimumFractionDigits(2);
        df.setMaximumFractionDigits(2);
                
        System.out.print("Person 1 : ");
        person1 = sc.nextLine();
        
        System.out.print("Person 2 : ");
        person2 = sc.nextLine();      

        LoveCalculator lc = new LoveCalculator();        
                                
        int person1Weight = lc.calculateSumOfDigits(lc.processWaight(person1));
        int person2Weight = lc.calculateSumOfDigits(lc.processWaight(person2));
        float percentLove;
        
        System.out.println(person1Weight + " " + person2Weight);
                        
        if(person1Weight < person2Weight) {
            percentLove = (float) (person1Weight * 100) / person2Weight;
        } else {            
            percentLove = (float) (person2Weight * 100) / person1Weight;
        }
                
        System.out.println(df.format(percentLove) + " %");
        sc.close();
    }            
}
