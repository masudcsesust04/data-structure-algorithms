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
public class Transpose {
    
    static int row = 2;
    static int col = 3;    
    static int[][] A; 
    static int[][] B;     

    public Transpose() {
        A = new int[row][col];
        B = new int[col][row];        
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
        A[0][0] = 1;
        A[0][1] = 2;
        A[0][2] = 3;
        
        A[1][0] = 4;
        A[1][1] = 5;
        A[1][2] = 6;        
    }
    
    public void transpose() {
        for (int i =0; i<row; i++) {
            for (int j=0; j<col; j++) {                
                B[j][i] = A[i][j];
            }
        }  
    }
    
    public static void main(String[] args) {                                       
        
        Transpose tp = new Transpose();
        tp.setInput();
        
        System.out.println("Matrix A : ");
        tp.display(A, row, col);
        
        System.out.println("Transpose of A Matrix is : ");
        tp.transpose();
        tp.display(B, col, row);                          
    }
}