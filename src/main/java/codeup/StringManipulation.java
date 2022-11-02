package codeup;

import org.apache.commons.lang3.StringUtils;
import util.Input;

public class StringManipulation {
    public static void main(String[] arg) {
        Input inpt = new Input();
        String userInput = inpt.getString("Enter a string: ");
        System.out.println("You entered: " + userInput);
        if(!StringUtils.isNumeric(userInput)) {
            System.out.println(userInput + " is not a number.");
            System.out.println(StringUtils.swapCase(userInput));
            System.out.println(StringUtils.reverse(userInput));
        } else {
            System.out.println(userInput + " is a number!");
        }
    }
}
