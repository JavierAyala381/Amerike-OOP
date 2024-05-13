package org.bookyourflight.user;

import org.bookyourflight.flights.Destination;
import org.bookyourflight.util.Utilities;

public class User implements UserInterface{
	private String FullName;
	private String Email;
	private String PhoneNumber;
	private Destination Country;
	
	//Sets the initial state of the class :)
	public User(String fullName,String email,String phoneNumber,Destination country) {
			
	}
	
	@Override
	public String getFullName() {
		return this.FullName;
	}

	@Override
	public void setFullName(String fullName) throws UserException{
		String regex = "[^ a-zA-Z]+";
		if (Utilities.matchRegex(regex, fullName)) {
			throw new UserException("Invalid user name, characters and numbers unavalible");
		}
		this.FullName = fullName;
	}

	@Override
	public String getEmail() {
		// TODO Auto-generated method stub
		
		return null;
	}

	@Override
	public void setEmail(String email) throws UserException{
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getPhoneNumber() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setPhoneNumber(String phoneNumber) throws UserException{
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getCountry() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setCountry(Destination country) {
		// TODO Auto-generated method stub
		
	}

}