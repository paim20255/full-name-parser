package com.pluralsight;

import java.util.Objects;
import java.util.Scanner;

public class FullNameParser {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter your name: ");
        String name = input.nextLine().trim();

        System.out.println("Enter your middle name: ");
        String middleName = input.nextLine();

        System.out.println("Enter your last name: ");
        String lastName = input.nextLine();



        System.out.println();
        System.out.println("First name: " + name);
        System.out.println("Middle name: " + middleName);
        System.out.println("Last name: " + lastName);





    }
    }