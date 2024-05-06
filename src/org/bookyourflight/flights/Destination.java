package org.bookyourflight.flights;

// Enum is a special class
public enum Destination {
	UK("United Kingdom", "London","Europe"),
	MX("Mexico", "Mexico City", "Latam"),
	USA("United States", "Washinton","America");
	
	private String Country;
	private String CapitalCity;
	private String Continent;
	
	// We need a constructor
	private Destination(String country, String capital, String continent){
		this.Country = country;
		this.CapitalCity = capital;
		this.Continent = continent;
	}
	
	// Getter methods
    public String getCountry() {
        return Country;
    }

    public String getCapitalCity() {
        return CapitalCity;
    }
    
    public String getContinent() {
    	return Continent;
    }
}
