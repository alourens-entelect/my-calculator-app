package org.example;

import java.util.Objects;
import java.util.Scanner;

public class Main {
    /**
        Don't touch this logic, it's there for you to test your code.
        You can test your code by following the prompts.
        For example an input of "5.5+4.5" should yield 10.0.
    */
    public static void main(String[] args) {
        while(true) {
            Scanner userInput = new Scanner(System.in);
            System.out.println("Please input your equation, to exit type end:");
            String input = userInput.nextLine();

            if(Objects.equals(input, "end")) {
                break;
            } else {
                Double result = Calculator.getCalculationResult(input);
                System.out.println(result);
            }
        }

    }
}