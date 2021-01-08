import jdk.swing.interop.SwingInterOpUtils;
import org.apache.commons.lang3.StringUtils;

import java.util.Scanner;

public class MavenExercises {
    //Creating Scanner
    private Scanner scanner;

    public MavenExercises() {
        this.scanner = new Scanner(System.in);
    }

    public String getString() {
        return this.scanner.nextLine();
    }

    //Main Method
    public static void main(String[] args) {
        //Creating a new instance of Scanner
        MavenExercises userInput = new MavenExercises();

//        //TODO: Tells whether or not what the user entered is a number
//        System.out.println("Enter Something"); //Ha13rry OR 43dfd543 (both equate to false)
//        System.out.println(StringUtils.isNumeric(userInput.getString())); //false


//        //TODO: Flips the case of the string
//        System.out.println("Enter a String"); //Harry Potter
//        System.out.println(StringUtils.swapCase(userInput.getString())); //hARRY pOTTER


        //TODO: Reverses the string
        System.out.println("Enter a String"); //Harry
        System.out.println(StringUtils.reverse(userInput.getString())); //yrraH
    }
}
