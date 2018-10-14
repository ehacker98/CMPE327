package assignment2SourceCode;

public class agent {
  String x;
  String y;
  String z;
  int cancelTicketCount = 0;
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
        
        //add y to x's serviceCancels
        
        cancelTicketCount += Integer.parseInt(y);
        if (cancelTicketCount <= 20)
          //if serviceCancels <= 10
            return ("CAN " + x + " " + y + " 00000 " + " **** " + " 0 \n");
        else
            return ("");
    }

}
