/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package displayingafile;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author kendrabooker
 */
public class DisplayingAFile {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) throws FileNotFoundException {
        
        Scanner keyboard = new Scanner(System.in);
        String file;
        
        System.out.print("Open which file: ");
        file = keyboard.next();
        
        Scanner input = new Scanner(new File(file));
        
        while(input.hasNext()){
        
            String a = input.nextLine();
            System.out.println(a);
        }
        
    }
    
}
