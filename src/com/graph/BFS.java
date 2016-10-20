/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.graph;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 *
 * @author masud
 */
public class BFS {
    
    // graph's adjacency matrix
    int matrix[][] = {
        {0, 1, 1, 0},
        {0, 0, 1, 0},
        {1, 0, 0, 1},
        {0, 0, 0, 1}
    };
    // visited node array
    int visited[] = {0, 0, 0, 0};
    Queue queue = new LinkedList();
    
    public void executeBFS(int start) {
        
        queue.add(start);
        visited[start] = 1;
        
        System.out.print("Result: ");
        
        while(!queue.isEmpty()) {
            
            int node = (int) queue.poll();
            System.out.print(node + ", ");
            
            for(int i=0; i<visited.length; i++) {
                if(matrix[node][i] == 1 && visited[i] == 0) {
                    queue.add(i);
                    visited[i] = 1;
                }
            }
        }        
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter start node : ");
        int start = sc.nextInt();
        
        BFS bfs = new BFS();
        bfs.executeBFS(start);  
    }    
}
