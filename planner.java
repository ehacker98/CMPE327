package assignment2SourceCode;

import java.io.FileNotFoundException; // import statements
import java.io.UnsupportedEncodingException;
import java.util.Scanner;
import java.util.ArrayList;

public class planner{ 
    Scanner scan = new Scanner(System.in); // initialize scanner for user input
    String x; // variables to store user entry
    String y;
    String z;

    public class cancelledTickets { // initialized cancel ticket information
        int cancelTicketCount = 0;
        int serviceNum;
    }

    ArrayList<cancelledTickets> cancelledTickets = new ArrayList(); // use of ArrayList for cancel ticket method

    public String createservice(){ // method to create service
        //Need to check validity of service number, date, name
        System.out.println("What is the service number?");
        x = scan.nextLine(); // allows user to input text
        System.out.println("What is the service date?");
        y = scan.nextLine();
        System.out.println("What is the service name?");
        z = scan.nextLine();
        return ("CAS " + x + " 0 " + " 00000 " + z + " " + y + "\n"); // return output file
    }

    public String sellticket(){ // method to sell ticket
        //Need to check for valid service number and number of tickets
        System.out.println("For what service would you like to sell tickets?");
        x = scan.nextLine();
        System.out.println("How many tickets would you like to sell?");
        y = scan.nextLine();
        return ("SEL " + x + " " + y + " 00000 " + " **** " + " 0 \n"); // return output file
    }

    public String cancelticket(){ // method to cancel ticket
        //Need to check that no more than 20 tickets are being cancelled for specific service within this session
        //Need to check tickets are being cancelled for a valid service
        System.out.println("For what service would you like to cancel tickets?");
        x = scan.nextLine();
        System.out.println("How many tickets would you like to cancel?");
        y = scan.nextLine();
        return ("CAN " + x + " " + y + " 00000 " + " **** " + " 0 \n"); // return output file
    }

    public String deleteservice(){ // method to delete service
        System.out.println("What type of service would you like to delete?");
        x = scan.nextLine();
        System.out.println("To delete your ticket, please enter the service number");
        return ("DEL " + y + " " + x + " 00000 " + " **** " + " 0 \n"); // return output file
    }

    public String changeticket(){ // method to change ticket
        System.out.println("From which service would you like to change tickets?");
        x = scan.nextLine();
        System.out.println("How many tickets would you like?");
        z = scan.nextLine();
        System.out.println("Please enter your new service number.");
        y = scan.nextLine();
        return ("CHG " + x + " " + z + " " + y + " **** " + " 0 \n"); // return output file
    }

    public planner() throws FileNotFoundException, UnsupportedEncodingException { // for exceptions
    }
}
