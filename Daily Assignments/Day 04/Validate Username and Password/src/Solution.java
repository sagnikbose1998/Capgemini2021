import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        User input
        System.out.print("Enter username: ");
        String userName = sc.next();
        System.out.print("Enter password: ");
        String pass = sc.next();
        System.out.print("Enter email: ");
        String email = sc.next();
        System.out.print("Enter mobile number: ");
        String mob = sc.next();
        System.out.print("Enter city: ");
        String city = sc.next();
        System.out.print("Enter Pin code: ");
        String pin = sc.next();

//        Username validation
        String regUser = "^[a-zA-Z0-9]{8}$";
        Pattern pattern1 = Pattern.compile(regUser);
        Matcher matcher1 = pattern1.matcher(userName);
        boolean b1 = matcher1.matches();
        if (b1)
            System.out.println("User name is valid");
        else
            System.out.println("User name is invalid");

//        Password validation
        String regPass = "^(?=.[0-9])(?=.[a-z])(?=.[A-Z])(?=.[@#$%^&+=])(?=\\\\S+$).{8,}$";
        Pattern pattern2 = Pattern.compile(regPass);
        Matcher matcher2 = pattern2.matcher(pass);
        boolean b2 = matcher2.matches();
        if (b2)
            System.out.println("Password is valid");
        else
            System.out.println("Password is invalid");

//        Email validation
        String regEmail = "^(.+)@(.+)$";
        Pattern pattern3 = Pattern.compile(regEmail);
        Matcher matcher3 = pattern3.matcher(email);
        boolean b3 = matcher3.matches();
        if (b3)
            System.out.println("Email is valid");
        else
            System.out.println("Email is invalid");

//        Mobile number validation
        String regMob = "^[7-9]\\d{9}$";
        Pattern pattern4 = Pattern.compile(regMob);
        Matcher matcher4 = pattern4.matcher(mob);
        boolean b4 = matcher4.matches();
        if (b4)
            System.out.println("Mobile number is valid");
        else
            System.out.println("Mobile number is invalid");

//        City validation
        String regCity = "^[a-zA-Z]*$";
        Pattern pattern5 = Pattern.compile(regCity);
        Matcher matcher5 = pattern5.matcher(city);
        boolean b5 = matcher5.matches();
        if (b5)
            System.out.println("City entered is valid");
        else
            System.out.println("City entered is invalid");

//        Pin code validation
        String regPin = "^[0-9]{6}$";
        Pattern pattern6 = Pattern.compile(regPin);
        Matcher matcher6 = pattern6.matcher(pin);
        boolean b6 = matcher6.matches();
        if (b6)
            System.out.println("Pin code is valid");
        else
            System.out.println("Pin code is invalid");


        sc.close();
    }
}
