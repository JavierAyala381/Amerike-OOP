package org.bookyourflight.flights;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Flight extends AbstractFlight {
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
	public String getDepatureDate() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getDepatureGate() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Ticket getTicket() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<char[]> getMap() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setMap(List<char[]> map) {
		// TODO Auto-generated method stub
		
	}
	//

}
