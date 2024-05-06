package org.bookyourflight.flights;

import java.time.LocalDateTime;
import java.util.List;

public interface FlightInterface {
	public String getId();
	public LocalDateTime getDepatureDate();
	public String getDepartueGate();
	public Destination getOrigin();
	public Destination getDestination();
	public Ticket getTicket();
	public Ticket assignTicket();
	public List<char[]> getFlightMap();
	public void setFlightMap(List<char[]> map);
	public boolean isInternational();
	public double calculateDuration();
	public double calculateTicketPrice();
	public void getLuggageAllowance();

}
