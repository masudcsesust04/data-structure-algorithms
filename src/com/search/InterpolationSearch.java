/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.search;

import java.util.Scanner;

/**
 *
 * @author masud
 */
public class InterpolationSearch {

    public int search(int[] data, int item) {

        int low = 0;
        int high = data.length - 1;
        int mid;
        int index = -1;
        int comparisons = 0;        
        
        while (low <= high) {

            comparisons++;
            System.out.println("Comparison : " + comparisons);

            if (low == high || data[low] == data[high]) {
                return 0;
            }                        
            
            mid = low + (int)(((float)(high - low) / (data[high] - data[low])) * (item - data[low]));            
            System.out.println("Mid = " + mid);            
            
            if (data[mid] == item) {
                index = mid;
                break;
            } else {
                if (data[mid] < item) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }
        }

        System.out.println("Total comparison made : " + comparisons);

        return index;
    }

    public static void main(String[] args) {

        int[] data = {5, 10, 15, 20, 25, 30, 35};
        int item;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter search item : ");
        item = sc.nextInt();

        InterpolationSearch is = new InterpolationSearch();
        int loc = is.search(data, item);

        if (loc >= 0) {
            System.out.println("Item found in : " + loc);
        } else {
            System.out.println("No match found!");
        }
    }
}
