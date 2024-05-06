package org.bookyourflight.flights;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public abstract class AbstractFlight implements FlightInterface {
	// Flight parameters
	protected String Id;
	private String DepartureGate;
	private LocalDateTime DepartureDate;
	private List<char[]> FlightMap;
	private Map<String, Ticket> Tickets = new HashMap<String, Ticket>();
	private Destination Origin;
	private Destination Destination;
	
	// Constructor for the abstract class
	public AbstractFlight(Destination org, Destination dest) {
		this.Origin = org;
		this.Destination = dest;
	}
	
	@Override
	public String getId() {
		return this.Id;
	}
	
	@Override
	public AbstractFlight setId(String id) {
		this.Id = id;
		return this;
	}
	
	@Override
	public LocalDateTime getDepatureDate() {
		return this.DepartureDate;
	}
	
	@Override
	public AbstractFlight setDepatureDate(LocalDateTime dep) {
		this.DepartureDate = dep;
		return this;
	}
	
	@Override
	public String getDepartueGate() {
		return this.DepartureGate;
	}
	
	@Override
	public AbstractFlight setDepartueGate(String gate) {
		this.DepartureGate = gate;
		return this;
	}
	
	@Override
	public Destination getOrigin() {
		return this.Origin;
	}
	
	@Override
	public Destination getDestination() {
		return this.Destination;
	}
	
	@Override
	public List<char[]> getFlightMap() {
		return this.FlightMap;
	}
	
	@Override
	public void setFlightMap(List<char[]> map) {
		this.FlightMap = map;
	}
	
	@Override
	public boolean isInternational() {
		return this.Origin.getRegion().equals(Destination.getRegion());
	}
}