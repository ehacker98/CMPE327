package assignment2SourceCode;

import java.io.FileNotFoundException;
import java.io.UnsupportedEncodingException;
import java.util.Scanner;

public class planner{
    Scanner scan = new Scanner(System.in);
    String x;
    String y;
    String z;
    int cancelTicketCount = 0;

    public String createservice(){
        //Need to check validity of service number, date, name
        System.out.println("What is the service number?");
        x = scan.nextLine();
        System.out.println("What is the service date?");
        y = scan.nextLine();
        System.out.println("What is the service name?");
        z = scan.nextLine();
        return ("CAS " + x + " 0 " + " 00000 " + z + " " + y + "\n");
    }

    public String sellticket(){
        //Need to check for valid service number and number of tickets
        System.out.println("For what service would you like to sell tickets?");
        x = scan.nextLine();
        System.out.println("How many tickets would you like to sell?");
        y = scan.nextLine();
        return ("SEL " + x + " " + y + " 00000 " + " **** " + " 0 \n");
    }

    public String cancelticket(){
        //Need to check that no more than 20 tickets are being cancelled for specific service within this session
        //Need to check tickets are being cancelled for a valid service
        System.out.println("For what service would you like to cancel tickets?");
        x = scan.nextLine();
        System.out.println("How many tickets would you like to cancel?");
        y = scan.nextLine();
        cancelTicketCount += Integer.parseInt(y);
        if (cancelTicketCount <= 20)
            return ("CAN " + x + " " + y + " 00000 " + " **** " + " 0 \n");
        else
            return ("");
    }

    public planner() throws FileNotFoundException, UnsupportedEncodingException {
    }
}
