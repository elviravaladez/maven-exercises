import org.apache.commons.lang3.StringUtils;

import java.util.Scanner;

public class MavenExercises {

    //Main Method
    public static void main(String[] args) {
        System.out.print("Enter Something:");
        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.nextLine();

        //TODO: Tells whether or not what the user entered is a number
        if(StringUtils.isNumeric(userInput)) {
            System.out.printf("%s is a number %n", userInput);
        } else {
            System.out.printf("You Entered: \"%s\" %n", userInput);
            //TODO: Tells whether or not what the user entered is a number
            System.out.printf("\"%s\" is not a number %n", userInput);

            //TODO: Flips the case of the string
            System.out.printf("Flipped Case: %s %n", StringUtils.swapCase(userInput));

            //TODO: Reverses the string
            System.out.printf("Reversed: %s %n", StringUtils.reverse(userInput));
        }

        //OUTPUT:
                //Enter Something: Life, The Universe, and Everything
                //You Entered: "Life, The Universe, and Everything"
                //"Life, The Universe, and Everything" is not a number
                //Flipped Case: lIFE, tHE uNIVERSE, AND eVERYTHING
                //Reversed: gnihtyrevE dna ,esrevinU eht ,efiL
    }
}
