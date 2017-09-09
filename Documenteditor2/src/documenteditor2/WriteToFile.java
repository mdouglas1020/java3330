/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package documenteditor2;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Michael
 */
public class WriteToFile {

    public BufferedWriter writer;
    

    public void WriteToFile2(String savedText) {
        try {
            this.writer = new BufferedWriter( new FileWriter(".\\test.txt"));
            
            writer.write(savedText);
            
            writer.close();
        } catch (IOException ex) {
            Logger.getLogger(WriteToFile.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
