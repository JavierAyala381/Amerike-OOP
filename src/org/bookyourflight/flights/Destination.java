package org.bookyourflight.flights;

// Enum is a special class
public enum Destination {
	UK("United Kingdom"),
	MX("Mexico"),
	USA("United States");
	
	private String Country;
	
	// We need a constructor
	private Destination(String country){
		this.Country = country;
	}
}
