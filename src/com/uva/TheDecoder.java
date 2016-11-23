package com.uva;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * @problem #458
 * @author masud
 */
public class TheDecoder {
    
    
    public static void main(String[] args) throws FileNotFoundException {
        
        File text = new File("/home/rana/projects/personal/data-structures-algorithms/uva-inputs/458.txt");
        String str;
        
        try(Scanner sc = new Scanner(text)) {
            
            while(sc.hasNextLine()) {
                str = sc.nextLine();
        
                for(int i=0; i<str.length(); i++) {
                    System.out.print((char) ((int) str.charAt(i) - 7));
                }
                System.out.println();
            }                    
        }        
    }    
}
