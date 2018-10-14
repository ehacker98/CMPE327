package assignment2SourceCode;

import java.io.FileNotFoundException;
import java.io.UnsupportedEncodingException;
import java.util.Scanner;

public class agent {
    Scanner scan = new Scanner(System.in);
    String x;
    String y;
    String z;
    //serviceCancels = [0] create array of 0s, length of array is number of services in valid services file

    public String sellticket(){
        //Need to check for valid service number and number of tickets
        System.out.println("For what service would you like to sell tickets?");
        x = scan.nextLine();
        System.out.println("How many tickets would you like to sell?");
        y = scan.nextLine();
        //if x in valid service file
        //if y <= 1000 && y >=1
        return ("SEL " + x + " " + y + " 00000 " + " **** " + " 0 \n");
    }

    public String cancelticket(){
        //Need to check that no more than 20 tickets are being cancelled for specific service within this session
        //Need to check tickets are being cancelled for a valid service
        System.out.println("For what service would you like to cancel tickets?");
        x = scan.nextLine();
        System.out.println("How many tickets would you like to cancel?");
        y = scan.nextLine();
        return ("CAN " + x + " " + y + " 00000 " + " **** " + " 0 \n");
    }

    public String changeticket(){
        System.out.println("From which service would you like to change tickets?");
        x = scan.nextLine();
        System.out.println("How many tickets would you like?");
        z = scan.nextLine();
        System.out.println("Please enter your new service number.");
        y = scan.nextLine();
        return ("CHG " + x + " " + z + " " + y + " **** " + " 0 \n");
    }

}
