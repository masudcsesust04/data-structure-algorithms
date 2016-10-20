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
public class DirectSum {
    
    static int row1 = 2, row2 = 2;
    static int col1 = 3, col2 = 2;    
    static int sRow, sCol;
    static int[][] A; 
    static int[][] B; 
    static int[][] C; 

    public DirectSum() {
        sRow = row1 + row2;
        sCol = col1 + col2;
        A = new int[row1][col1];
        B = new int[row2][col2];
        C = new int[sRow][sCol];
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
        A[0][1] = 3;
        A[0][2] = 2;
        A[1][0] = 2;
        A[1][1] = 3;
        A[1][2] = 1;
        
        B[0][0] = 1;
        B[0][1] = 6;
        B[1][0] = 0;
        B[1][1] = 1;
    }
    
    public void dsum() {
        for (int i =0; i<sRow; i++) {
            for (int j=0; j<sCol; j++) {
                
                if(i < row1 && j < col1) {
                    C[i][j] = A[i][j];
                } else if(i >= row1 && j>= col1) {
                    C[i][j] = B[i - row1][j - col1];
                } else {
                    C[i][j] = 0;
                }                                                        
            }
        }
    }
    
    public static void main(String[] args) {
        DirectSum ds = new DirectSum();
        ds.setInput();
        
        System.out.println("Matrix A : ");
        ds.display(A, row1, col1);
        
        System.out.println("Matrix B : ");
        ds.display(B, row2, col2);
                                      
        System.out.println("Matrix A + B (* Direct sum rule): ");
        ds.dsum();
        ds.display(C, sRow, sCol);
    }
}