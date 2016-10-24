package com.uva;

import java.util.Scanner;

/**
 * @problem #10035
 * @author masud
 */
public class PrimaryArithmetic {
    
    int carryCount = 0;
    
    public void hasCarry(int digit1, int digit2) {
        
        if((digit1 + digit2) > 9) {
            carryCount = carryCount + 1;
        }                
    }
    
    public void carryCounter(int num1, int num2) {
        int temp1, temp2;
        carryCount = 0;                
        
        while(num1 != 0 && num2 != 0) {
            temp1 = num1 % 10;
            temp2 = num2 %10;
            
            hasCarry(temp1, temp2);
            num1 = num1 / 10;
            num2 = num2 / 10;                        
        }
        
        if(carryCount > 0 ) {
            System.out.println(carryCount + " carry operations.");
        } else {
            System.out.println("No carry operation");
        }
    }
    
    public static void main(String[] args) {
        
        int num1, num2;
        int num1Temp, num2Temp;
                
        Scanner sc = new Scanner(System.in);
        PrimaryArithmetic pa = new PrimaryArithmetic();
        
        while(true) {
            
            System.out.println("Enter num1 and num2 : ");
            
            num1 = sc.nextInt();
            num2 = sc.nextInt();
        
            if(num1 == 0 && num2 == 0) {
                break;
            }
            
            pa.carryCounter(num1, num2);                       
        }                
    }    
}
