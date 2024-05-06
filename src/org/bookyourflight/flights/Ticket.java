package org.bookyourflight.flights;

import java.util.Random;
import org.bookyourflight.user.User;

public class Ticket implements TicketInterface{
	// Variable type - name - value
	private String Id;
	private Flight Flight;
	private User User;
	private double TicketPriece;
	
	// default constructor Ticket()
	public Ticket(Flight flight, User user) {
		// define the ticket id
		Random rand = new Random(9999);
		this.Id = "RE-"+rand.nextInt(); 
		this.Flight = flight;
		this.User = user;
		this.TicketPriece = rand.nextDouble();
	}
	
	public String getTicketId() {
		return this.Id;
	}

	
	public Flight getFlight() {
		return this.Flight;
	}

	
	public User getUser() {
		return this.User;
	}

	
	public double TicketPriece() {
		return this.TicketPriece;
	}
	
	@Override
	public String toString() {
		return "Your ticket id is "+this.Id;
	}
}
