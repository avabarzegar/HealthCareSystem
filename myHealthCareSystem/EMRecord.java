package myHealthCareSystem;

/*
 * 
 *		This is the start of a system which would maintain Electronic Medical Records for patients.
 *		This class assumes all values passed to the set methods are correct and valid.
 *	
 */

/**
 * @author Ava Barzegar
 * version 1
 * @since java version "21.0.1" 2023-10-17 LTS
  * Description: HealthCareSystem
 */

public class EMRecord extends EMHRecord		{


	
	/*	Attributes			************************************/
	private int height;
	private int weight;
	private Name name;
	private Address address;
	private BirthDate birthDate;
	
	
	
	/*	Constructors		************************************/
	
	/**
	 * @param reportingFacilityProvince
	 * @param institutionNumber
	 * @param healthCareNumber
	 * @param charNumber
	 */
	public EMRecord(String reportingFacilityProvince, String institutionNumber, String healthCareNumber,
			String charNumber) {
		super(reportingFacilityProvince, institutionNumber, healthCareNumber, charNumber);
	}

	
	/*	Accessors			************************************/


	/**
	 * @return the height
	 */
	public int getHeight() {
		return height;
	}




	/**
	 * @return the weight
	 */
	public int getWeight() {
		if(weight > 0) {
		return weight;
		}
		else return 0;
	}



	/* Modifiers			************************************/


	/**
	 * @param height the height to set
	 */
	public void setHeight(int height) {
		if(height >0) {
		this.height = height;
		}
	}

	/**
	 * @param weight the weight to set
	 */
	public void setWeight(int weight) {
		if(weight > 0) {
			this.weight = weight;
		}
		
	}
	
	public void setBirthDate(BirthDate birthDate) {
		if(birthDate != null) {
			this.birthDate= birthDate;
			}
	}
	// Other Methods
	
	/**
	 * set the name
	 * @param name
	 */
	public void setName(Name name) {
		if(name != null) {
		this.name= name;
		}
	}
	/**
	 * set the address
	 * @param address 
	 */
	public void setAddress(Address address) {
		if(address != null) {
		this.address = address;
		}
	}
	
	
	/*	Normal Behavior	************************************/
	/**
	 * 
	 * @return int the bmi value
	 */
	public int bmi() {
		double bmi= MedicalCalculator.calculateBMI(height, weight);
		return (int) bmi;
	}
	 
	/**
	 * override the toString method
	 */
	public String toString() {
		
		return super.toString() +getClass().getName() + "[height=" + height + ", weight=" + weight + ", name=" + name + ", address=" + address + "]";
	}
	


	/*	Helper Methods		************************************/
	public String formattedName() {
		return name.formattedName();
	}
	
	public String formattedAddress() {
		return address.formattedAddress();
	}
	
	public String formattedBirthDate() {
		return birthDate.formattedBirthDate();
	}
	
	

    
}
