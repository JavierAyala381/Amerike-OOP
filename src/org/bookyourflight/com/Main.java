package org.bookyourflight.com;

import org.bookyourflight.flights.AbstractFlight;
import org.bookyourflight.flights.Destination;
import org.bookyourflight.flights.DomesticFlight;
import org.bookyourflight.flights.Ticket;

public class Main {

	public static void main(String[] args) {
		DomesticFlight f = (DomesticFlight) new DomesticFlight(Destination.UK, Destination.MX)
				.setId("RE-4356")
				.setDepartueGate("A-4")
				.setDepatureDate(null);
		
		
		// TODO Auto-generated method stub
		System.out.println(Destination.UK.getCapitalCity());
		
	}

}
