package fr.esiea.ail.ihm.scm.model.contact;

import java.util.List;
import java.util.Map;

public class Address {

	private Country country;
	
	private String line1, postcode, city, state;

	public String getLine1() {
		return line1;
	}

	public void setLine1(String line1) {
		this.line1 = line1;
	}

	public Country getCountry() {
		return country;
	}

	public void setCountry(Country country) {
		this.country = country;
	}

	public String getPostcode() {
		return postcode;
	}

	public void setPostcode(String postcode) {
		this.postcode = postcode;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}
	
	public static Address builder(String street, String postCode, String city, String state, String country) {
		
		Address newAddress = new Address();
		
		newAddress.setLine1(street);
		newAddress.setCity(city);
		newAddress.setPostcode(postCode);
		newAddress.setState(state);
		
		Country newCountry = new Country();
		newCountry.setName(country);
		
		newAddress.setCountry(newCountry);
		
		return newAddress;
	}
}
