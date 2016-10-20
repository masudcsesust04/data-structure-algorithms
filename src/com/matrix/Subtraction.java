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
public class Subtraction {
    
    static int row = 2;
    static int col = 2;
    static int sub = 0;
    static int[][] A; 
    static int[][] B; 
    static int[][] C; 

    public Subtraction() {
        A = new int[row][col];
        B = new int[row][col];
        C = new int[row][col];
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
        A[0][0] = 5;
        A[0][1] = 3;
        A[1][0] = 2;
        A[1][1] = 1;
        
        B[0][0] = 2;
        B[0][1] = 2;
        B[1][0] = 2;
        B[1][1] = 2;
    }
    
    public void sub() {
        for (int i =0; i<row; i++) {
            for (int j=0; j<col; j++) {
                sub = A[i][j] - B[i][j];
                C[i][j] = sub;
                sub = 0;
            }
        }  
    }
    
    public static void main(String[] args) {                                       
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter #rows & #columns : ");
//        row1 = sc.nextInt();
//        col1 = sc.nextInt();
        
        Subtraction sb = new Subtraction();
        sb.setInput();
        
        System.out.println("Matrix A : ");
        sb.display(A, row, col);
        
        System.out.println("Matrix B : ");
        sb.display(B, row, col);
                                      
        System.out.println("Matrix A - B : ");
        sb.sub();
        sb.display(C, row, col);
    }
}