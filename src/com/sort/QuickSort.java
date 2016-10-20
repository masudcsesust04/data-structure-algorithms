/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sort;

/**
 *
 * @author rana
 */
public class QuickSort {
    
    static int[] list = {38, 27, 43, 3};    
    static int len;
    
    public QuickSort() {
        len = list.length;        
    }
    
    public void display() {
        for(int i=0; i<len; i++) {
            System.out.print(list[i] + ", ");
        }
        System.out.println("");
    }
    
    public void sort(int start, int end) {
        if(start < end) {
            int pIndex = partition(start, end);
            sort(start, pIndex - 1);
            sort(pIndex + 1, end);
        }
    }
    
    public int partition(int start, int end) {
        
        int pivot = list[end];
        int pIndex = start;
        
        for(int i=start; i<end; i++) {
            if(list[i] <= pivot) {
                swap(i, pIndex);
                pIndex = pIndex + 1;
            }
        }
        
        swap(pIndex, end);
        
        return pIndex;
    }
    
    public void swap(int i, int pIndex) {
        int temp = list[i];
        list[i] = list[pIndex];
        list[pIndex] = temp;
    }
    
    public static void main(String[] args) {
        
        QuickSort qs = new QuickSort();
        
        System.out.print("Before sort : ");
        qs.display();
                
        qs.sort(0, len - 1);
        System.out.print("After sort : ");
        qs.display();
    }    
}
