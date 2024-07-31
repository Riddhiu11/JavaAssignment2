package org.example;

import java.util.InputMismatchException;
import java.util.NoSuchElementException;

public class ExceptionHandler {
    public static void handleException(Exception e) {
        System.out.println("An error occurred: " + e.getMessage());
    }

    public static void handleInputMismatchException(InputMismatchException e) {
        System.out.println("Input mismatch: Please enter the correct data type.");
    }

    public static void handleNoSuchElementException(NoSuchElementException e) {
        System.out.println("No such element: Please enter a valid option.");
    }

    public static void handleIllegalArgumentException(IllegalArgumentException e) {
        System.out.println("Illegal argument: " + e.getMessage());
    }
}
