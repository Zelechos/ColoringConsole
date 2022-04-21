/**
 * @author: Pragmatic Coder
 * @repository: https://github.com/Zelechos/ColoringConsole
 */
package color;

/**
 * ColoringConsole is script to change the colors of the text 
 * in our Java console applications in an easy and simple way
 */
public final class cc {
    
    
//---------------------------------------------------------------
//                     COLORS PRE-PROCESSING     
//---------------------------------------------------------------
    
    /**
     * Reset Color
     */
    public static final String ANSI_RESET = "\u001B[0m";
    
    /**
     * Text Colors
     */  
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";
    
    /**
     * Background Colors
     */  
    public static final String ANSI_BLACK_BACKGROUND = "\u001B[40m";
    public static final String ANSI_RED_BACKGROUND = "\u001B[41m";
    public static final String ANSI_GREEN_BACKGROUND = "\u001B[42m";
    public static final String ANSI_YELLOW_BACKGROUND = "\u001B[43m";
    public static final String ANSI_BLUE_BACKGROUND = "\u001B[44m";
    public static final String ANSI_PURPLE_BACKGROUND = "\u001B[45m";
    public static final String ANSI_CYAN_BACKGROUND = "\u001B[46m";
    public static final String ANSI_WHITE_BACKGROUND = "\u001B[47m";
    
    
//---------------------------------------------------------------
//                     COLOR TEXTS FUNCTIONS
//---------------------------------------------------------------
    
    /**
     * Convierte el texto en color negro
     * @param text
     * @return text in color black
     */
    public static String blackText(String text){
        return ANSI_BLACK + text + ANSI_RESET;
    }
    
    
    /**
     * Convierte el texto en color rojo
     * @param text
     * @return text in color red
     */
    public static String redText(String text){
        return ANSI_RED + text + ANSI_RESET;
    }
    
    
    /**
     * Convierte el texto en color verde
     * @param text
     * @return text in color green
     */
    public static String greenText(String text){
        return ANSI_GREEN + text + ANSI_RESET;
    }
    
    /**
     * Convierte el texto en color amarillo
     * @param text
     * @return text in color amarillo
     */
    public static String yellowText(String text){
        return ANSI_YELLOW + text + ANSI_RESET;
    }
    
    /**
     * Convierte el texto en color azul
     * @param text
     * @return text in color blue
     */
    public static String blueText(String text){
        return ANSI_BLUE + text + ANSI_RESET;
    }
    
    /**
     * Convierte el texto en color purpura
     * @param text
     * @return text in color purple
     */
    public static String purpleText(String text){
        return ANSI_PURPLE + text + ANSI_RESET;
    }
    
    /**
     * Convierte el texto en color verde azulado
     * @param text
     * @return text in color cyan
     */
    public static String cyanText(String text){
        return ANSI_CYAN + text + ANSI_RESET;
    }
    
    /**
     * Convierte el texto en color blanco
     * @param text
     * @return text in color white
     */
    public static String whiteText(String text){
        return ANSI_WHITE + text + ANSI_RESET;
    }
    
    
    
//---------------------------------------------------------------
//                     BACKGROUND COLOR FUNCTIONS
//---------------------------------------------------------------
    
    /**
     * Convierte el background en color negro y el texto en 
     * color blanco.
     * @param text
     * @return background in color black, text in color white
     */
    public static String blackBg(String text){
        return ANSI_BLACK_BACKGROUND + ANSI_WHITE + text;
    }
    
    
    /**
     * Convierte el background en color rojo y el texto en 
     * color blanco.
     * @param text
     * @return background in color red, text in color white
     */
    public static String redBg(String text){
        return ANSI_RED_BACKGROUND + ANSI_WHITE + text;
    }
    
    /**
     * Convierte el background en color verde y el texto en 
     * color blanco.
     * @param text
     * @return background in color green, text in color white
     */
    public static String greenBg(String text){
        return ANSI_GREEN_BACKGROUND + ANSI_WHITE + text;
    }
    
    /**
     * Convierte el background en color amarillo y el texto en 
     * color negro.
     * @param text
     * @return background in color yellow, text in color black.
     */
    public static String yellowBg(String text){
        return ANSI_YELLOW_BACKGROUND + ANSI_BLACK + text;
    }
    
    /**
     * Convierte el background en color azul y el texto en 
     * color blanco.
     * @param text
     * @return background in color blue, text in color white
     */
    public static String blueBg(String text){
        return ANSI_BLUE_BACKGROUND + ANSI_WHITE + text;
    }
    
    /**
     * Convierte el background en color purpura y el texto en 
     * color blanco.
     * @param text
     * @return background in color purple, text in color white
     */
    public static String purpleBg(String text){
        return ANSI_PURPLE_BACKGROUND + ANSI_WHITE + text;
    }
    
    /**
     * Convierte el background en color verde azulado y el 
     * texto en color negro.
     * @param text
     * @return background in color cyan, text in color black.
     */
    public static String cyanBg(String text){
        return ANSI_CYAN_BACKGROUND + ANSI_BLACK + text;
    }
    
    
//---------------------------------------------------------------
//                     DINAMIC COLOR FUNCTIONS
//---------------------------------------------------------------
    
    public static String selectColors(String text, String background, String color){
        return background + color + text;
    }
}