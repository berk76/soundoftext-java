/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cz.webstones;

import cz.webstones.soundoftext.Mp3Creator;
import cz.webstones.soundoftext.Mp3CreatorException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author jarberan
 */
public class App {
    
    private static final Logger LOGGER = Logger.getLogger(App.class.getName());
    
    public static void main(String args[]) {
        try {
                Mp3Creator.createMp3("Hello World!", "en-GB", "hello_world.mp3");
        } catch (Mp3CreatorException ex) {
                System.out.println();
                LOGGER.log(Level.SEVERE, "Error: Cannot download pronunciation.", ex);
        }
    }
}
