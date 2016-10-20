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
public class Identity {
    
    static int row = 3;
    static int col = 3;  
    static int diagonalOne = 3;
    static int nonDiagonalZero = 6;
    static int[][] A; 
    static int[][] B;         

    public Identity() {
        A = new int[row][col];        
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
        A[0][1] = 0;
        A[0][2] = 0;
        
        A[1][0] = 0;
        A[1][1] = 1;
        A[1][2] = 0;

        A[2][0] = 0;
        A[2][1] = 0;
        A[2][2] = 1;
    }
    
    public boolean identity() {                        
        
        boolean isIdentity;        
        
        for (int i =0; i<row; i++) {
            for (int j=0; j<col; j++) {                
                if(i == j && A[i][j] == 1) {
                    diagonalOne = diagonalOne - 1;
                } else if (A[i][j] == 0) {
                    nonDiagonalZero = nonDiagonalZero - 1;
                }
            }
        }  
        
        
        isIdentity = diagonalOne == 0 && nonDiagonalZero == 0;
        
        return isIdentity;
    }
    
    public static void main(String[] args) {                                       
        
        Identity it = new Identity();
        it.setInput();
        
        System.out.println("Matrix A : ");
        it.display(A, row, col);
        
        System.out.print("Matrix A is ");
        
        if(it.identity()) {
            System.out.println("identical");
        } else {
            System.out.println("not identical");
        }     
    }
}