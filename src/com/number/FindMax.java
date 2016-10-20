/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.number;

/**
 *
 * @author masud
 */
public class FindMax {
    
    public static void main(String[] args) {
        int[] list = { 2, 1, 40, 12, 50, 45, 100, 25, 55};
        int max = list[0];
        
        for(int i=1; i<list.length; i++) {
            if(list[i] > max) {
                max = list[i];
            }
        }
        
        System.out.println("Max is : " + max);
    }    
}
