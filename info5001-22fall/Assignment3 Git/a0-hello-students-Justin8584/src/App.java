/**
 * 
 * Information Systems Program @ Northeastern University College of Engineering
 * Info 5001 | Application Modeling & Design
 * 
 * This is a sample project to make sure Visual Studio Code and all necessary components have been successfully installed.
 * 
 */

public class App {
    private static final String ANSI_RESET = "\u001B[0m";
    private static final String ANSI_RED = "\u001B[31m";
    private static final String ANSI_WHITE = "\u001B[37m";
    private static final String WELCOME_MSG = ANSI_WHITE + "\n Hello, Students!" + ANSI_RED + "\n Welcome to Info 5001 - Application Modeling & Design Course." + ANSI_RESET;

    public static void main(String[] args) throws Exception {
        System.out.println(WELCOME_MSG);
        System.out.println("Hey, my name is Jiading Zhou. I am happy to submit to my first assignment.");
        System.out.println("Hey, my name is Jiading Zhou. I am gonna try again to push to git desktop");
        System.out.println("Hey, I am Jiading Zhou, I am going to try again git.");
    }
}
