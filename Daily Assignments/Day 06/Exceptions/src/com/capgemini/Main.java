package com.capgemini;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {
    static void validateNumber(String number) throws MobileNumberValidationUsingTryCatch{
        final String regexStr = "^[0-9]{10}$";

        if (!Pattern.matches(regexStr, number))
            throw new MobileNumberValidationUsingTryCatch("Number is invalid!");
        else
            System.out.println("Correct mobile number!");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the mobile number: ");
        String mob = sc.nextLine();
        try {validateNumber(mob);}
        catch (Exception e) {
            System.out.println(e);
        }
    }

}
