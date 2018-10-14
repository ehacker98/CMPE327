//Group 3 Assignment 2

//Front end class calls the planner and agent classes and their respective methods as called by the user inputs
//The program takes in the valid services file (to be used later in Assignment 3) and outputs a list of transactions to the transaction output file
//The program is intended to be run a Java IDE or through the command terminal

package assignment2SourceCode;  //Put all classes in same package

//Import packages
import java.util.ArrayList;
import java.util.Scanner;
import java.io.*;

public class FrontEnd{

    //Run main class
    public static void main(String[] args) throws IOException {
        //Set up writer for transaction output file
        PrintWriter writer = new PrintWriter("C:\\Users\\ehack\\Desktop\\TransactionOutputFIle.txt", "UTF-8");

        //Set up scanner for user input and define x to store input
        Scanner scan = new Scanner(System.in);
        String x;

        //Read valid services file and store valid services in an array list
        ArrayList<Integer> validServices = new ArrayList<>();
        BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\ehack\\Desktop\\ValidServicesFile.txt"));
        String st;
        while (!(st = br.readLine()).equals("00000"))   //If line does not equal "00000" (end of file)
            validServices.add(Integer.parseInt(st));    //Add to valid services array list

        System.out.println("Please login"); //Prompt user to login
        x = scan.nextLine();                //Get user input

        if (x.equals("login")) {                //If user has logged in
            System.out.println("Who are you?"); //Ask for user permissions
            x = scan.nextLine();                //Get user permissions

            if (x.equals("planner")) {                                      //If user chooses planner permissions
                planner planner = new planner();                            //Create new planner object
                while (!x.equals("logout")) {                               //While planner has not logged out
                    System.out.println("What would you like to do today?"); //Ask planner for a transaction to perform
                    x = scan.nextLine();                                    //Get planner input
                    if (x.equals("createservice")){                         //If planner would like to create a service
                        writer.println(planner.createservice());            //Run the create service method in the planner class and print to transaction output file
                    }
                    if (x.equals("sellticket")){                            //If planner would like to sell tickets
                        writer.println(planner.sellticket());               //Run the sell ticket method in the planner class and print to transaction output file
                    }
                    if (x.equals("cancelticket")){                          //If planner would like to cancel tickets
                        writer.println(planner.cancelticket());             //Run the cancel ticket method in the planner class and print to transaction output file
                    }
                    if (x.equals("deleteservice")) {                        // If planner would like to delete a service
                        writer.println(planner.deleteservice());            //Run the delete service method in the planner class and print to transaction output file
                    }
                    if (x.equals("changeticket")) {                         //If planner would like to change tickets
                        writer.println(planner.changeticket());             //Run the change ticket method in the planner class and print to transaction output file
                    }
                }
            }
            else if (x.equals("agent")) {                                   //If user chooses agent permissions
                agent agent = new agent();                                  //Create new agent object
                while (!x.equals("logout")) {                               //While agent has not logged out
                    System.out.println("What would you like to do today?"); //Ask agent for a transaction to perform
                    x = scan.nextLine();                                    //Get agent input
                    if (x.equals("sellticket")){                            //If agent would like to sell tickets
                        writer.println(agent.sellticket());                 //Run the sell ticket method in the agent class and print to transaction output file
                    }
                    if (x.equals("cancelticket")){                          //If agent would like to cancel tickets
                        writer.println(agent.cancelticket());               //Run the cancel ticket method in the agent class and print to transaction output file
                    }
                    if (x.equals("changeticket")){                          //If agent would like to change tickets
                        writer.println(agent.changeticket());               //Run the change ticket method in the agent class and print to transaction output file
                    }
                }
            }
        }
        else {
            System.out.println("Incorrect input."); //If user has not logged in correctly, output error message
        }
        writer.println("EOS 00000 0 00000 **** 0"); //Write end of session line to transaction output file
        writer.close();
    }
}
