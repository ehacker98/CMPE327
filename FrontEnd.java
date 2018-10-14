package assignment2SourceCode;

import java.util.ArrayList;
import java.util.Scanner;
import java.io.*;

public class FrontEnd{

    public static void main(String[] args) throws IOException {
        PrintWriter writer = new PrintWriter("C:\\Users\\ehack\\Desktop\\TransactionOutputFIle.txt", "UTF-8");
        Scanner scan = new Scanner(System.in);
        String x;

        ArrayList<Integer> validServices = new ArrayList<>();
        BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\ehack\\Desktop\\ValidServicesFile.txt"));
        String st;
        while (!(st = br.readLine()).equals("00000"))
            validServices.add(Integer.parseInt(st));

        System.out.println("Please login");
        x = scan.nextLine();

        if (x.equals("login")) {
            System.out.println("Who are you?");
            x = scan.nextLine();

            if (x.equals("planner")) {
                planner planner = new planner();
                while (!x.equals("logout")) {
                    System.out.println("What would you like to do today?");
                    x = scan.nextLine();
                    if (x.equals("createservice")){
                        writer.println(planner.createservice());
                    }
                    if (x.equals("sellticket")){
                        writer.println(planner.sellticket());
                    }
                    if (x.equals("cancelticket")){
                        writer.println(planner.cancelticket());
                    }
                    if (x.equals("deleteservice")) {
                        writer.println(planner.deleteservice());
                    }
                    if (x.equals("changeticket")) {
                        writer.println(planner.changeticket());
                    }
                }
            }
            else if (x.equals("agent")) {
                agent agent = new agent();
                while (!x.equals("logout")) {
                    System.out.println("What would you like to do today?");
                    x = scan.nextLine();
                    if (x.equals("sellticket")){
                        writer.println(agent.sellticket());
                    }
                    if (x.equals("cancelticket")){
                        writer.println(agent.cancelticket());
                    }
                    if (x.equals("changeticket")){
                        writer.println(agent.changeticket());
                    }
                }
            }
        }
        else{
            System.out.println("Incorrect input.");
        }
        writer.println("EOS 00000 0 00000 **** 0");
        writer.close();
    }

    public FrontEnd() throws FileNotFoundException, UnsupportedEncodingException {
    }
}
