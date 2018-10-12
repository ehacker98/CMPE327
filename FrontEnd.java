package assignment2SourceCode;

import java.io.FileNotFoundException;
import java.io.UnsupportedEncodingException;
import java.util.Scanner;
import java.io.PrintWriter;

public class FrontEnd extends planner {

    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException {
        Scanner scan = new Scanner(System.in);

        String x;

        System.out.println("Please login");
        x = scan.nextLine();

        if (x.equals("login")) {
            System.out.println("What would you like to do today?");
            x = scan.nextLine();

            while (!x.equals("logout")){
                if (x.equals("planner")) {
                    planner planner = new planner();
                }
                else if (x.equals("agent")) {
                    agent agent = new agent();
                }
            }
            PrintWriter writer = new PrintWriter("C:\\Users\\ehack\\Desktop\\TransactionOutputFIle.txt", "UTF-8");
            writer.println("EOS 00000 0 00000 **** 0");
            writer.close();
        }
    }
}
