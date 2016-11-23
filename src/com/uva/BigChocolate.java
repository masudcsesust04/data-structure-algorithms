package com.uva;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * @problem #10970
 * @author masud
 */
public class BigChocolate {
        
    public static void main(String[] args) throws FileNotFoundException {
        int rows;
        int columns;
        int result;
        
        File text = new File("/home/rana/projects/personal/data-structures-algorithms/uva-inputs/10970.txt");
        
        try(Scanner sc = new Scanner(text)) {
            while(sc.hasNextLine()) {
                String line = sc.nextLine();
                String[] inputs;
                inputs = line.split(" ");                
                rows = Integer.parseInt(inputs[0]);
                columns = Integer.parseInt(inputs[1]);
                
                if((rows >= 1 && rows <= 300) && (columns >= 1 && columns <= 300)) {
                    result = rows * columns - 1;
                    System.out.println(result);                
                }
                
            }
        }        
    }
}
