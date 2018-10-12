package assignment2SourceCode;

import java.io.FileNotFoundException;
import java.io.UnsupportedEncodingException;
import java.util.Scanner;
import java.io.PrintWriter;

public class planner{
    Scanner scan = new Scanner(System.in);
    String x;
    String y;
    String z;

    public String createservice(){
        System.out.println("What is the service number?");
        x = scan.nextLine();
        System.out.println("What is the service date?");
        y = scan.nextLine();
        System.out.println("What is the service name?");
        z = scan.nextLine();
        return ("CAS " + x + " 0 " + " 00000 " + z + " " + y + "\n");
    }

    public void deleteservice(){
    }

    public planner() throws FileNotFoundException, UnsupportedEncodingException {
    }
}
