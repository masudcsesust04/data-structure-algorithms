package com.uva;

import java.util.Scanner;
import java.lang.Math;

/**
 * @problem #10469
 * @author masud
 */
public class ToCarryOrNotToCarry {
    
    static final short SIZE = 32;
    static int[][] binaries = new int[2][SIZE];
    static int[] sum = new int[SIZE];
    
    public int binaryToDecimal() {
        
        int total = 0;
        
        for(int i=(SIZE - 1); i>=0; i--) {     
            int pow = (int) Math.pow(2, i);            
            total = total + sum[i] * pow;            
        }
                        
        return total;
    }
            
    public void toCarryOrNotToCarry() {        
        
        int bitSum;
        
        for(int j=(SIZE - 1); j >= 0; j--) {
            
            bitSum = binaries[0][j] + binaries[1][j];
           
            if( bitSum == 2) {
                sum[j] = 0;
            } else {
                sum[j] = bitSum;
            }                                
        }        
    }
    
    public void decimalToBinary(int row, int num) {
        
        int count = 0;
        
        while(true) {
                  
            if(num == 1) {
                binaries[row][count] = 1;
                break;
            }                        
                                    
            if(num % 2 == 0) {
                binaries[row][count] = 0;
                count = count + 1;
            } else {
                binaries[row][count] = 1;
                count = count + 1;
            }
            
            num = num / 2;                        
        }                
    }
    
    public void initDecimalToBinaries() {
        for(int i=0; i<2; i++) {
            for(int j= 0; j<SIZE; j++) {
                binaries[i][j] = 0;                
            }            
        }
    }
    
    public void display(int[] binArray) {
        for(int j=(SIZE - 1); j >= 0; j--) {
            System.out.print(binArray[j]);
            if(j % 8 == 0) {
                System.out.print(" ");
            }
        }
    }
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number1 and number 2 : ");
                
        ToCarryOrNotToCarry conc = new ToCarryOrNotToCarry();
        
        while(true) {
            
            int num1 = sc.nextInt();
            int num2 = sc.nextInt();
            
            if(num1 == 0 && num2 == 0) {
                break;
            }
            
            conc.initDecimalToBinaries();
            conc.decimalToBinary(0, num1);
            conc.decimalToBinary(1, num2);
            conc.display(binaries[0]);
            System.out.println("");   
            conc.display(binaries[1]); 
            System.out.println("");   
            conc.toCarryOrNotToCarry();            
            System.out.println("---------------------------------------------");
            conc.display(sum);
            
            System.out.println("");            
            System.out.println(conc.binaryToDecimal());
        }                                  
    }    
}
