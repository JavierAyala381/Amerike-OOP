package org.bookyourflight.flights;

public class InternationalFlight extends AbstractFlight {
	// Flight constructor
	public InternationalFlight(Destination origin, Destination destination, String Id) {
		// call abstract class constructor
		super(origin, destination);
	}

	@Override
	public Ticket getTicket() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Ticket assignTicket() {
		// TODO Auto-generated method stub
		return null;
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
