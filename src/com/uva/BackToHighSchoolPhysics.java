/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uva;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * @problem #10071
 * @author masud
 */
public class BackToHighSchoolPhysics {
    
    public static void main(String[] args) throws FileNotFoundException {
        
        File file = new File("/home/masud/projects/data-structures-algorithms/uva-inputs/10071.txt");
        Scanner sc = new Scanner(file);
                
        while(sc.hasNextLine()) {
            String line = sc.nextLine();
            String[] words;
            words = line.split(" ");
            
            short v = Short.parseShort(words[0]);
            short t = Short.parseShort(words[1]);
            
            int s = 2 * (v * t);
            
            System.out.println(s);            
        }        
    }    
}
