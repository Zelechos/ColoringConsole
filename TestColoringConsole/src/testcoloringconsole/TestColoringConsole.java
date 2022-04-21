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
        String code;
        code  = cc.selectColors("Type a hello world in JavaScript : "+ input.nextLine(), cc.ANSI_YELLOW_BACKGROUND, cc.ANSI_BLACK);
        System.out.print(code);
        System.out.println(cc.yellowBg(code));
        
        
        
    }
    
}
