/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.matrix;

/**
 *
 * @author masud
 */
public class Zero {
    
    static int row = 3;
    static int col = 3;
    static int total;
    static int[][] A; 
    static int[][] B;         

    public Zero() {
        A = new int[row][col];  
        total = row * col;
    }
    
    public void display(int[][] matrix, int row, int col) {
        
        for(int i=0; i<row; i++) {
            for(int j=0; j<col; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println("");
        }
        
        System.out.println("--------------------------");
    };
    
    public void setInput() {
        A[0][0] = 0;
        A[0][1] = 0;
        A[0][2] = 0;
        
        A[1][0] = 0;
        A[1][1] = 1;
        A[1][2] = 0;

        A[2][0] = 0;
        A[2][1] = 0;
        A[2][2] = 0;
    }
    
    public boolean zero() {                        
                
        boolean isZero;
        
        for (int i =0; i<row; i++) {
            for (int j=0; j<col; j++) {                
                if(A[i][j] == 0) {
                    total = total - 1;
                }
            }
        }  
                
        isZero = total == 0;
        
        return isZero;
    }
    
    public static void main(String[] args) {                                       
        
        Zero zr = new Zero();
        zr.setInput();
        
        System.out.println("Matrix A : ");
        zr.display(A, row, col);
        
        System.out.print("Matrix A is ");
        
        if(zr.zero()) {
            System.out.println("zero matrix");
        } else {
            System.out.println("not a zero matrix");
        }     
    }
}