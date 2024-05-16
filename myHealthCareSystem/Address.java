package myHealthCareSystem;


/**
 * @author Ava Barzegar
 * version 1
 * @since java version "21.0.1" 2023-10-17 LTS
  * Description: HealthCareSystem
 */ 

public class Address {
	
	
	/*	Attributes			************************************/
	/** patient address street */
    private String street;
    /** patient number */
    private String number;
    /** patient address city */
    private String city;
    /** patient address country */
    private String country;
    /** patient address postal code */
    private String postalCode;
    
	/*	Constructors		************************************/
    public Address(String street, String number, String city, String country, String postalCode) {
    	if (street != null && number != null && city != null && postalCode != null) {
    	this.street = street;
    	this.number = number;
    	this.city = city;
    	this.country = country;
    	this.postalCode = postalCode;
    	}
    }

    	
	/*	Accessors			************************************/

	/**
	 * @return the street
	 */
	public String street() {
		if(street != null) {
			return street;
		}
		else return " ";
		
	}

	
	/**
	 * @return the number
	 */
	public String getNumber() {
		return number;
	}

	/**
	 * @return the city
	 */
	public String getCity() {
		if(city != null) {
		return city;
		}
		else return " ";
	}

	/**
	 * @return the country
	 */
	public String getCountry() {
		return country;
	}

	/**
	 * @return the postalCode
	 */
	public String getPostalCode() {
		return postalCode;
	}
	
	/* Modifiers			************************************/

	/**
	 * @param street the street to set
	 */
	public void setStreet(String street) {
		if(street != null) {
		this.street = street;
		}
	}


	/**
	 * @param number the number to set
	 */
	public void setNumber(String number) {
		this.number = number;
	}

	/**
	 * @param city the city to set
	 */
	public void setCity(String city) {
		if(city != null) {
		  this.city = city;
		}
	}


	/**
	 * @param country the country to set
	 */
	public void setCountry(String country) {
		if(country != null) {
			this.country = country;
		}
		
	}


	/**
	 * @param postalCode the postalCode to set
	 */
	public void setPostalCode(String postalCode) {
		if(postalCode != null) {
		  this.postalCode = postalCode;
		}
	}
	
	/*	Normal Behavior	************************************/
	
	/**
	 * Format the address
	 * @return the formatted address string
	 */
	public String formattedAddress() {
	   return street + " " + number + " " + city + " " + country + " " + postalCode;
	}


	/**
	 * Method to override toString method of class Address
	 * @return the formatted address string
	 */
	public String toString() {
		return getClass().getName() + "[street=" + street + ", number=" + number + ", city=" + city + ", country=" + country + ", postalCode=" + postalCode + "]";		
	}
	


}
