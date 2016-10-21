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
 * @problem #10055
 * @author masud
 */
public class HashmatTheBraveWarrior {
    
    public static void main(String[] args) throws FileNotFoundException {
                
        File text = new File("/home/masud/projects/data-structures-algorithms/uva-inputs/10055.txt");
        
        try (Scanner sc = new Scanner(text)) {
            while(sc.hasNextLine()) {
                String line = sc.nextLine();
                String[] words;
                words = line.split(" ");
                int hasmotsAramy = Integer.parseInt(words[0]);
                int opponentsAramy = Integer.parseInt(words[1]);
                int difference;
                
                if(hasmotsAramy > opponentsAramy) {
                    int temp = hasmotsAramy;
                    hasmotsAramy = opponentsAramy;
                    opponentsAramy = temp;
                }
                
                difference = opponentsAramy - hasmotsAramy;            
//                System.out.println("hasmotsAramy : " + hasmotsAramy + " opponentsAramy : " + opponentsAramy);
                System.out.println(difference);
            }
        }
    }
}
