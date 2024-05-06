package org.bookyourflight.flights;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Flight implements FlightInterface {
	// Flight Arguments
	private String Id;
	private String DepartureGate;
	private List<char[]> Map;
	private Map<String, Ticket> Tickets = new HashMap<String, Ticket>();
	private Destination Origin;
	private Destination Destination;
	
	// Flight constructor
	public Flight(Destination origin, Destination destination) {
		// Flight id
		
		// Assign the origin and destination
		this.Origin = origin; 
		this.Destination = destination;
		
		
	}
	
	@Override
	public String getId() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Ticket getTicket() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<char[]> getFlightMap() {
		return this.Map;
	}

	@Override
	public void setFlightMap(List<char[]> map) {
		Map = map;
	}
	//

	@Override
	public LocalDateTime getDepatureDate() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getDepartueGate() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public org.bookyourflight.flights.Destination getOrigin() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public org.bookyourflight.flights.Destination getDestination() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Ticket assignTicket() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isInternational() {
		// TODO Auto-generated method stub
		return false;
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

}
