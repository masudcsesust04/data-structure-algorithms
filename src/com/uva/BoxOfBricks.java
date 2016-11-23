package com.uva;

import java.util.Scanner;

/**
 * @problem #591
 * @author masud
 */
public class BoxOfBricks {
    
    public int countMoves(int stack[], int maxSize) {
        
        int moves = 0;
        
        for(int i=0; i<stack.length; i++) {
            if(stack[i] > maxSize) {
                moves = moves + (stack[i] - maxSize);
            }
        }
        
        return moves;
    }
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        BoxOfBricks bob = new BoxOfBricks();
        
        int num;
        int maxSize;
        int countSet = 0;
        int stack[];
        int sumOfStack;
        
        while(true) {  
            num = sc.nextInt();
            stack = new int[num];
            sumOfStack = 0;
            
            if(num == 0) {
                break;
            }
            
            for(int i=0; i<num; i++) {
                stack[i] = sc.nextInt();
                sumOfStack = sumOfStack + stack[i];
            }
            
            if(sumOfStack % num == 0) {
                maxSize = sumOfStack / num;
                countSet = countSet + 1;
                int minMove = bob.countMoves(stack, maxSize);                
                
                System.out.println("Set #" + countSet);
                System.out.println("The minimum number of moves is "+ minMove + ".");                                               
            } else {
                System.out.println("Can't be moveable!");
            }                                    
        }                
    }
}
