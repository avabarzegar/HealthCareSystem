package testMyHealthCareSystem;


/**
 * @author Ava Barzegar
 * version 1
 * @since java version "21.0.1" 2023-10-17 LTS
  * Description: HealthCareSystem
 */ 

import myHealthCareSystem.*;

/**
 * This is a simple test demo class for the health care system.
 */
public class TestDemo {

	/**
	 * Main entry point for testing the health care assignment.
	 * @param args	Array of command line arguments input thru the VM
	 */
	public static void main(String[] args) {

		/*
		 * You must use the System.out.printf, formatted prints to show all health
		 * data as found in the EMRecord class (includes the parent class EMHRecord). Do not miss any item (includes any
		 * attributes which are complex objects, name, address etc.
		 *
		 *		Use the following standards guide to discover what field entries might look like for demo purposes.
		 *
		 * 	Field values and constraints can be found in the Standards guide
		 *		Acute and Ambulatory Care Data Content Standard, https://secure.cihi.ca/estore/productSeries.htm?pc=PCC1428
		 *
		 */
         //	sample test of BirthDate class
         //	BirthDate bd = new BirthDate(1970,12,01);
         //	System.out.println("BirtDate is:" + bd);

		/*	Instantiate and initialize an object representing address of patient
		* using class Address
		*/
		Address address = new Address("Granton","65","Ottawa", "Canada", "K2G 1W9");
		
            /*	Instantiate and initialize an object representing John Doe
		    *  using class Name
		    */ 
		    Name patient = new Name();
		    patient.setFirst("John");
	    	patient.setLast("Doe");
	    	patient.setMiddle("Hala");
	    	patient.setSalutation("Mr");
	    	
            /*	Instantiate and initialize an object representing patient 
	    	*using classBirthDate
	    	*/
			BirthDate bdate = new BirthDate(1970,12,01);
			
			
            /*	Instantiate and initialize an object representing reportingFacilityProvince, institutionNumber, 
			* healthCareNumber and charNumber for patient using class EMHRecord
			*/
			EMRecord record = new EMRecord("On","456","2342", "C5");
			
			/**
			 * Sets the height of the patient.
			 * @param height the height of the patient in centimeters
			 */
			record.setHeight(175);
			
			/*Sets the weight of the patient.*/
			record.setWeight(70);
			
			/*Sets the name of the patient. */
			record.setName(patient);
			
			/*Sets the address of the patient*/
			record.setAddress(address);
			
			/*Calculates the Body Mass Index (BMI) of the patient.*/
			record.bmi();
			
			/* Sets the AdminViaAmbulance for the record to Admin432. */
			record.setAdminViaAmbulance("Admin432");
			
			/* Sets the Functional Centre Account for the record to 4df3. */
			record.setFunctionalCentreAccount("4df3");
			
			/* Sets the encounter sequence for the record to 564. */
			record.setEncounterSequnce(564);
			
			/* Sets the Issuing Province for the record to BC. */
			record.setIssuingProvince("BC");
			
			/* Sets the residence code for the record to 65A. */
			record.setResidenceCode("65A");
			
			/* Sets the gender for the record to Female. */
			record.setGender("Female");
			
			/* Sets the submission year for the record to 2012. */
			record.setSubmissionYear(2012);
			
			/* Sets the Registration Date for the record to 200245. */
			record.setRegistrationDate(200245);
			
			/* Sets the Registration Time for the record to 1159. */
			record.setRegistrationTime(1159);
			
			
			/*Sets the Birth Date for patient 1. */
			record.setBirthDate(bdate);
			
			/** patient information */
			System.out.printf("Patient's Full Name: %s\n",record.formattedName());
			System.out.printf("Patient's Address: %s\n", record.formattedAddress());
			System.out.printf("Patient's Height and Weight: %scm, %skg\n", record.getHeight(),record.getWeight());
			System.out.printf("Patient's Functional Centre Account: %s\n", record.getFunctionalCentreAccount());
			System.out.printf("Patient's Encounter Sequence: %s\n", record.getEncounterSequnce());
			System.out.printf("Patient's Issuing Province: %s\n",record.getIssuingProvince());
			System.out.printf("Patient's Residence Code: %s\n",record.getResidenceCode());
			System.out.printf("Patient's Gender: %s\n",record.getGender());
			System.out.printf("Patient's Submision Year: %s\n",record.getSubmissionYear());
			System.out.printf("Patient's Registration Date and Time: %s, %s\n",record.getRegistrationDate(),record.getRegistrationTime());
			System.out.printf("Patient's Birthday: %s\n",record.formattedBirthDate());

		 /*	Calculate the BMI for your patient record here.
		 * 		use the static method in the MedicalCalculator class along with instance variables from the
		 * 		EMHRecord class.
		 */
			
			
			/**
			* Calculates the Body Mass Index (BMI) Patient using method in the MedicalCalculator class.
			*/
			MedicalCalculator.calculateBMI(record.getWeight(),record.getHeight());
			System.out.printf("BMI of patient1: %s\n",record.bmi());

			
			System.out.print("********************************************************");
		/*	You do not need to modify this piece of code, it is fine as it is.			*/
		System.out.println("\nBMI VALUES");
		System.out.println("Underweight: less than 18.5");
		System.out.println("Normal:      between 18.5 and 24.9");
		System.out.println("Overweight:  between 25 and 29.9");
		System.out.println("Obese:       30 or greater");
		System.out.println("Program by Ava Barzegar");

	}

}
