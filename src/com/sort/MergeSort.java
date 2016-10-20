/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sort;

/**
 *
 * @author masud
 */
public class MergeSort {
    
//    static int[] list = {14, 33, 27, 10, 35, 19, 42, 44};
    static int[] list = {38, 27, 43, 3, 9, 82, 10};
    static int[] temp;
    static int len;
    
    public MergeSort() {
        len = list.length;
        temp = new int[len];
    }
    
    public void display() {
        for(int i=0; i<len; i++) {
            System.out.print(list[i] + ", ");
        }
        System.out.println("");
    }
    
    public void merge(int low, int mid, int high) {
        System.out.println("merge = "+ low +" "+ mid +" "+ high);
//        System.out.println("---------------------");
        
        for(int i = low; i <= high; i++) {
            temp[i] = list[i];
        }
        
        int left = low;
        int right = mid + 1; 
        int k = low;
        
        while(left <= mid && right <= high) {
            
            if(temp[left] <= temp[right]) {
                list[k] = temp[left];
                left++;
            } else {
                list[k] = temp[right];
                right++;
            }
            k++;
        }        
        
        while(left <= mid) {
            list[k] = temp[left];
            left++;
            k++;                
        }

        while(right <= high) {
            list[k] = temp[right];
            right++;                
            k++;                
        }                               
    }
    
    public void sort(int low, int high) {
        
        int mid;
        
        if(low < high) {
            mid = (low + high) / 2;            
            sort(low, mid);
//            System.out.println("low = "+ low + " mid = "+ mid);
            sort(mid+1, high);
//            System.out.println("mid + 1 = "+ (mid + 1) + " high = "+ high);
            merge(low, mid, high);
            display();
        }
    }
    
    public static void main(String[] args) {
        
        MergeSort ms = new MergeSort();
        
        System.out.print("Before sort : ");
        ms.display();
                
        ms.sort(0, len - 1);
        System.out.print("After sort : ");
        ms.display();
    }    
}
