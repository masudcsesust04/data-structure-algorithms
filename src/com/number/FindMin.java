/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.number;

/**
 *
 * @author rana
 */
public class FindMin {
    
    public static void main(String[] args) {
        int[] list = { 2, 1, 40, 12, 50, 45, 100, 25, 55};
        int min = list[0];
        
        for(int i=1; i<list.length; i++) {
            if(list[i] < min) {
                min = list[i];
            }
        }
        
        System.out.println("Min is : " + min);
    }    
}
