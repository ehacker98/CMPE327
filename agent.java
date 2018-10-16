package assignment2SourceCode;

import java.io.FileNotFoundException;
import java.io.UnsupportedEncodingException;
import java.util.Scanner;

public class agent {
    Scanner scan = new Scanner(System.in);
    String x;
    String y;
    String z;
    public String sellticket(){ //if sellticket called, ask for service and number of tickets to sell, then push results to output file
        System.out.println("For what service would you like to sell tickets?");
        x = scan.nextLine();
        System.out.println("How many tickets would you like to sell?");
        y = scan.nextLine();

        return ("SEL " + x + " " + y + " 00000 " + " **** " + " 0 \n");
    }

    public String cancelticket(){ //if cancelticket called, ask for service and number of tickets to cancel, then push results to output file
        System.out.println("For what service would you like to cancel tickets?");
        x = scan.nextLine();
        System.out.println("How many tickets would you like to cancel?");
        y = scan.nextLine();
        return ("CAN " + x + " " + y + " 00000 " + " **** " + " 0 \n");
    }

    public String changeticket(){ //if changeticket called, ask for service and number of tickets to change, and service number to change to, then push results to output file
        System.out.println("From which service would you like to change tickets?");
        x = scan.nextLine();
        System.out.println("How many tickets would you like?");
        z = scan.nextLine();
        System.out.println("Please enter your new service number.");
        y = scan.nextLine();
        return ("CHG " + x + " " + z + " " + y + " **** " + " 0 \n");
    }

}
