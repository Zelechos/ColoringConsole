/**
 * Class to execute all the methods of the ColoringConsole library
 * @author: Pragmatic Coder
 * @repository: https://github.com/Zelechos/PragmaticMorphoide
 */
package testcoloringconsole;

import color.cc;
import java.util.Scanner;


public class TestColoringConsole {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String message = "error 404 : source not find";
        System.out.println(cc.selectColors(message, cc.ANSI_CYAN_BACKGROUND, cc.ANSI_WHITE));
        
        Scanner input = new Scanner(System.in);
        System.out.println("Type a hello world in JavaScript : ");
        String code = input.nextLine();
        System.out.println(cc.selectColors(code, cc.ANSI_RED_BACKGROUND, cc.ANSI_BLACK));
    }
    
}
