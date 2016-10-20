/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.graph;

import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author masud
 */
public class DFS {  
    
    int matrix[][] = {
        {0, 1, 1, 0},
        {0, 0, 1, 0},
        {1, 0, 0, 1},
        {0, 0, 0, 1}
    };
    int visited[] = {0, 0, 0, 0};
    // creating stack        
    Stack stack = new Stack();        
    
    public void executeDFS(int start) {
        // 
        stack.push(start);
        visited[start] = 1;
                                
        System.out.print("Result : ");
        
        while(!stack.isEmpty()) {
            
            int node = (int) stack.pop();
            System.out.print(node + " ");
            
            for(int i = 0; i< visited.length; i++) {                
                if(matrix[node][i] == 1 && visited[i] == 0) {
                    stack.push(i);
                    visited[i] = 1;
                }
            }
        }
    }
    
    public static void main(String[] args) {
                
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter start node : ");
        int start = sc.nextInt();
        
        DFS dfs = new DFS();
        dfs.executeDFS(start);                
    }    
}
