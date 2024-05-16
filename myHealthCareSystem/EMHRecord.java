package myHealthCareSystem;

/*
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

public class EMHRecord {
	
	/*	Attributes			************************************/
	private String reportingFacilityProvince;
	private String institutionNumber;
	private String functionalCentreAccount;
	private int encounterSequnce;
	private String healthCareNumber;
	private String charNumber;
	private String issuingProvince;
	private String residenceCode;
	private String gender;
	private int submissionYear;
	private String adminViaAmbulance;
	private int registrationDate;
	private int registrationTime;
	private BirthDate birthDate;
	
	/*	Constructors		************************************/
	/**
	 * @param reportingFacilityProvince
	 * @param institutionNumber
	 * @param healthCareNumber
	 * @param charNumber
	 */
	public EMHRecord(String reportingFacilityProvince, String institutionNumber, String healthCareNumber,
			String charNumber) {
		this.reportingFacilityProvince = reportingFacilityProvince;
		this.institutionNumber = institutionNumber;
		this.healthCareNumber = healthCareNumber;
		this.charNumber = charNumber;
	}
	
	/*	Accessors			************************************/

	/**
	 * @return the adminViaAmbulance
	 */
	public String getAdminViaAmbulance() {
		if(adminViaAmbulance != null) {
		return adminViaAmbulance;
		}
		else return "";
	}

	

	/**
	 * @return the functionalCentreAccount
	 */
	public String getFunctionalCentreAccount() {
		if(functionalCentreAccount != null) {
		return functionalCentreAccount;
		}
		else return "";
	}

	

	/**
	 * @return the encounterSequnce
	 */
	public int getEncounterSequnce() {
		if(encounterSequnce > 0) {
		return encounterSequnce;
		}
		else return 0;
	}

	

	/**
	 * @return the issuingProvince
	 */
	public String getIssuingProvince() {
		return issuingProvince;
	}

	

	/**
	 * @return the residenceCode
	 */
	public String getResidenceCode() {
		return residenceCode;
	}

	

	/**
	 * @return the gender
	 */
	public String getGender() {
		return gender;
	}

	

	/**
	 * @return the submissionYear
	 */
	public int getSubmissionYear() {
		return submissionYear;
	}

	
	/**
	 * @return the registrationDate
	 */
	public int getRegistrationDate() {
		return registrationDate;
	}

	
	/**
	 * @return the registrationTime
	 */
	public int getRegistrationTime() {
		return registrationTime;
	}

	/**
	 * @return The BirthDate object representing the patient's birth date.
	 */
	public BirthDate getBirthDate() {
		return birthDate;
	}
	
	/* Modifiers			************************************/
	
	/**
	 * @param adminViaAmbulance the adminViaAmbulance to set
	 */
	public void setAdminViaAmbulance(String adminViaAmbulance) {
		if(adminViaAmbulance != null) {
		this.adminViaAmbulance = adminViaAmbulance;
		}
	}
	
	/**
	 * @param functionalCentreAccount the functionalCentreAccount to set
	 */
	public void setFunctionalCentreAccount(String functionalCentreAccount) {
		if(functionalCentreAccount != null) {
		this.functionalCentreAccount = functionalCentreAccount;
		}
	}
	
	/**
	 * @param encounterSequnce the encounterSequnce to set
	 */
	public void setEncounterSequnce(int encounterSequnce) {
		if(encounterSequnce > 0) {
		this.encounterSequnce = encounterSequnce;
		}
	}
	
	/**
	 * @param issuingProvince the issuingProvince to set
	 */
	public void setIssuingProvince(String issuingProvince) {
		if(issuingProvince != null) {
		this.issuingProvince = issuingProvince;
		}
	}
	
	/**
	 * @param residenceCode the residenceCode to set
	 */
	public void setResidenceCode(String residenceCode) {
		if(residenceCode != null) {
		this.residenceCode = residenceCode;
		}
	}
	/**
	 * @param gender the gender to set
	 */
	public void setGender(String gender) {
		if(gender != null) {
		this.gender = gender;
		}
	}
	
	/**
	 * @param submissionYear the submissionYear to set
	 */
	public void setSubmissionYear(int submissionYear) {
		if(submissionYear > 0) {
		this.submissionYear = submissionYear;
		}
	}

	
	/**
	 * @param registrationDate the registrationDate to set
	 */
	public void setRegistrationDate(int registrationDate) {
		if (registrationDate > 0) {
		this.registrationDate = registrationDate;
		}
	}

	/**
	 * @param registrationTime the registrationTime to set
	 */
	public void setRegistrationTime(int registrationTime) {
		if(registrationTime > 0) {
		this.registrationTime = registrationTime;
		}
	}
	
	/**
	 * @param birthDate The BirthDate object representing the patient's birth date to set.
	 */
	public void setBirthDate(BirthDate birthDate) {
		if (birthDate != null) {
		this.birthDate = birthDate;
		}
	}

	
	/*	Normal Behavior	************************************/ 
	
	/**
	 * @return String the String to return
	 */
	@Override
    public String toString() {
        return super.toString() +getClass().getName() +
                "{reportingFacilityProvince='" + reportingFacilityProvince + '\'' +
                ", institutionNumber='" + institutionNumber + '\'' +
                ", functionalCentreAccount='" + functionalCentreAccount + '\'' +
                ", encounterSequnce=" + encounterSequnce +
                ", healthCareNumber='" + healthCareNumber + '\'' +
                ", charNumber='" + charNumber + '\'' +
                ", issuingProvince='" + issuingProvince + '\'' +
                ", residenceCode='" + residenceCode + '\'' +
                ", gender='" + gender + '\'' +
                ", submissionYear=" + submissionYear +
                ", adminViaAmbulance='" + adminViaAmbulance + '\'' +
                ", registrationDate=" + registrationDate +
                ", registrationTime=" + registrationTime +
                '}';
    }	
	
}
