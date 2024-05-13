package org.bookyourflight.com;

import java.time.LocalDateTime;

import org.bookyourflight.flights.AbstractFlight;
import org.bookyourflight.flights.Destination;
import org.bookyourflight.flights.DomesticFlight;
import org.bookyourflight.flights.FlightException;
import org.bookyourflight.flights.Ticket;

public class Main {

	public static void main(String[] args) {
		
		try {
			String B = AbstractFlight.nextLetter("C");
			System.out.println(B);
		}  finally {
			System.out.println(" This is happening no matter what");
		}
		
		// TODO Auto-generated method stub
		//System.out.println(ex);
		
	}

}
