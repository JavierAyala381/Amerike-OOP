package org.bookyourflight.flights;

import java.util.ArrayList;
import java.util.List;

public class DomesticFlight extends AbstractFlight {
	// Flight constructor
	public DomesticFlight(Destination origin, Destination destination) {
		// call abstract class constructor 
		// Id must be of the form RE-xxxx
		// Gate must be of the form A-xx
		super(origin, destination,"RE-[0-9]{4}","A-[0-9]{2}");
		// Set flight map
		// Domestic flight has 40
		// |A |o,o,x| |o,o,o|
		// |B |o,x,o| |o,o,o|
		// |- |1,2,3| |4,5,6|
		List<char[]> map = new ArrayList<char[]>();
		int numRows =  28;
		char[] firstRow = {'|','A','|','o','o','o','|',' ','|','o','o','o','|'};
		char[] lastRow =  {'|','-','|','1','2','3','|',' ','|','4','5','6','|'};
		// Iterate throw the number of rows and append them to the flight map
		for(int i=0; i<numRows; i++) {
			if(i == 0) {
				map.add(firstRow);
			} else {
				AbstractFlight.nextLetter(String.valueOf(firstRow[1]));
				//char[] newRor = 
			}
		}
	}
	
	@Override
	public double calculateDuration() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double calculateTicketPrice() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void getLuggageAllowance() {
		// TODO Auto-generated method stub
		
	}

	
	public Ticket getTicket(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Ticket assignTicket() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Ticket getTicket() {
		// TODO Auto-generated method stub
		return null;
	}

}
