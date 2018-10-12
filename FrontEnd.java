package assignment2SourceCode;

import java.util.Scanner;

public class FrontEnd extends planner {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		String x;

		x = scan.nextLine();

		if (x == "login") {
			x = scan.nextLine();
			
			while (x != "logout"){
				if (x == "planner") {
					planner planner = new planner();
				}
				else if (x == "agent") {
					agent agent = new agent();
				}
			}
		}
	}
}
