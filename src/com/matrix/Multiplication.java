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
public class Multiplication {
    
    static int row1 = 2, row2 = 2;
    static int col1 = 2, col2 = 2;
    static int sum = 0;
    static int[][] A; 
    static int[][] B; 
    static int[][] C; 

    public Multiplication() {
        A = new int[row1][col1];
        B = new int[row2][col2];
        C = new int[row1][col2];
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
        A[0][0] = 2;
        A[0][1] = 2;
        A[1][0] = 2;
        A[1][1] = 2;
        
        B[0][0] = 2;
        B[0][1] = 2;
        B[1][0] = 2;
        B[1][1] = 2;
    }
    
    public void multiplication() {
        for (int i =0; i<row1; i++) {
            for (int j=0; j<col2; j++) {
                for( int k=0; k<row2; k++) {
                    sum = sum + (A[i][k] * B[k][j]);
                    
                }
                
                C[i][j] = sum;
                sum = 0;
            }
        }
    }
    
    public static void main(String[] args) {
        
        Multiplication mu = new Multiplication();
        mu.setInput();
        
        System.out.println("Matrix A : ");
        mu.display(A, row1, col1);
        
        System.out.println("Matrix B : ");
        mu.display(B, row2, col2);
                                              
        if(col1 == row2) {
            System.out.println("Matrix A x B : ");
            mu.multiplication();
            mu.display(C, row1, col2);
        } else {
            System.out.println("Matrix A and B is not in correct order! "
                    + "Matrix A's cloumn and Matrix B's column is not equal.");
        }
        
    }
}