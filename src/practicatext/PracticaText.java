/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicatext;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Estudiante
 */
public class PracticaText {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            String input;
            BufferedReader b = new BufferedReader(new FileReader("universidad.txt"));
            while((input=b.readLine())!=null){
              
              String token[] =input.split(",");
              for (String t:token){
                  System.out.println(t);
              }
            
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(PracticaText.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(PracticaText.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
