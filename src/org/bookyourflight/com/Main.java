package org.bookyourflight.com;

import java.time.LocalDateTime;

import org.bookyourflight.flights.AbstractFlight;
import org.bookyourflight.flights.Destination;
import org.bookyourflight.flights.DomesticFlight;
import org.bookyourflight.flights.FlightException;
import org.bookyourflight.flights.Ticket;
import org.bookyourflight.user.User;
import org.bookyourflight.user.UserException;
import org.bookyourflight.util.Utilities;

public class Main {

	public static void main(String[] args) {
		
		/*try {
			String B = AbstractFlight.nextLetter("C");
			System.out.println(B);
		}  finally {
			System.out.println(" This is happening no matter what");
		}*/
		String regex = "[^ a-zA-Z]+";
		if (Utilities.matchRegex(regex, "Joel")) {
			System.out.println("Invalid user name, characters and numbers unavalible");
		}
		System.out.println();
		
		// TODO Auto-generated method stub
		//System.out.println(ex);
		
	}

}
