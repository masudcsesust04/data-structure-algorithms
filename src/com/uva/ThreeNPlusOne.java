/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uva;

import java.util.Scanner;

/**
 * @problem #100
 * @author masud
 */
public class ThreeNPlusOne {

    static int start, end;    

    public int cycleLength(int n) {    
        int cycle = 1;
        
        while (n != 1) {
            if (n % 2 == 0) {
                n = n / 2;
                cycle = cycle + 1;
            } else {
                n = 3 * n + 1;
                cycle = cycle + 1;
            }
        }
        
        return cycle;
    }

    public void execute(int min, int max) {        
        int maxCycle = 0;
        int cycle;
        
        for (int i = min; i <= max; i++) {            
            cycle = cycleLength(i);
            if ( cycle > maxCycle) {
                maxCycle = cycle;
            }
        }

        System.out.println(start + " " + end + " " + maxCycle);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter start : ");
        start = sc.nextInt();
        System.out.print("Enter end : ");
        end = sc.nextInt();

        int temp;

        if (start > end) {
            temp = start;
            start = end;
            end = temp;
        }

        System.out.println("start = " + start + " end = " + end);

        ThreeNPlusOne tnpo = new ThreeNPlusOne();
        tnpo.execute(start, end);

    }
}
