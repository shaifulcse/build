package org.example;

/**
 * Hello world!
 *
 */
import java.util.Scanner;
public class Main
{
    public static void main( String[] args )
    {
        boolean valid = false;
        Scanner scanner = new Scanner(System.in);
        passwordChecker passwordChecker = new passwordChecker();
        String password = "";
        while(!valid){
            System.out.print ( "Enter the password: " );
            password = scanner.nextLine();
            if(passwordChecker.isValid(password)){
                valid = true;
            }
        }

        System.out.println("The password is set to: "+ password);

    }
}
