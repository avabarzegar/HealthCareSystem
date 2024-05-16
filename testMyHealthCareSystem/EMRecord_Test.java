package testMyHealthCareSystem;


/*		@(#)EMRecord_Test.java	Jan. 31, 2024
*
*/


import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import myHealthCareSystem.*;


/**
* Test class for testing the EMRecord class
* Uses JUnit version 5
* @author Ava Barzegar
* @version 1.0.0
* @version 1
* @since java version "21.0.1" 2023-10-17 LTS
*/

@DisplayName("Test My HealthCare Application Domain - EMRecord")
@TestMethodOrder(OrderAnnotation.class)
public class EMRecord_Test {

	EMRecord record;
	
	@BeforeEach
	void setUp() throws Exception {
		/*
		 * Enter any requirements here that are needed before each test is run
		 */
		record = new EMRecord(null, null, null, null);
	}

	@AfterEach
	void tearDown() throws Exception {
		/*
		 *	Undo what was setup for each test before the test was run
		 */
		record = null;
	}

	
	/*		Methods to test
	 * 
		+EMRecord(reportingFacilityProvince:String, institutionNumber:String, chartNumber:String,healthCareNumber:String)
		
		+toString():String
		+setName(name:Name):void
		+setAddress(address:Address):void
		+setHeight():void
		+getHeight():int
		+setWeight():void
		+getWeight():int
		+formattedName():String
		+formattedAddress():String
		+bmi():int
	 */

	
	@Nested	@DisplayName("EMRecord() Test")
	@TestMethodOrder(OrderAnnotation.class)
	class EMRecordTest {
		@Test @Order(1) @DisplayName("EMRecord() test with Null arguments")
		final void testEMRecordWithNullArguments() {
			/*
			 * Add code with assertion to test constructor\
			 */
			record = null;
			assertNull(record);
		}
		
		/*
		 * Add code with assertion to test overloaded constructors as you see fit
		 */
	}

	

	@Nested	@DisplayName("toString() Test")
	@TestMethodOrder(OrderAnnotation.class)
	class ToStringTest {
		@Test @Order(1) @DisplayName("toString()")
		final void testToString() {
			/*
			 * Add code with assertion to test
			 */
			EMRecord result = new EMRecord("Quebec", "34", "d22", "788");
			String expectedString = "myHealthCareSystem.EMRecord@24569dbamyHealthCareSystem.EMRecord{reportingFacilityProvince='Quebec', institutionNumber='34', functionalCentreAccount='null', encounterSequnce=0, healthCareNumber='d22', charNumber='788', issuingProvince='null', residenceCode='null', gender='null', submissionYear=0, adminViaAmbulance='null', registrationDate=0, registrationTime=0}myHealthCareSystem.EMRecord[height=0, weight=0, name=null, address=null]";
		    String actualString = result.toString();
		    assertEquals(expectedString, actualString,"The toString() Method is not working");
		}
	}

	
	/*
	 * Add code to test one set method and one get method
	 */
	@Nested	@DisplayName("setHeight() Test")
	@TestMethodOrder(OrderAnnotation.class)
	class testSetHeight {
		@Test @Order(1) @DisplayName("setHeight()")
		final void testSetHeight() {
			/*
			 * Add code with assertion to test
			 */
			record = new EMRecord(null, null, null, null);
			record.setHeight(430);
			int expectedValue = 430;
			int actualValue = record.getHeight();
			assertEquals(expectedValue,actualValue,"The setHeight() method is not working");
			record = null;
		}	
	}
	@Nested	@DisplayName("getHeight() Test")
	@TestMethodOrder(OrderAnnotation.class)
	class testGetHeight {
		@Test @Order(1) @DisplayName("getHeight()")
		final void testGetHeight() {
			/*
			 * Add code with assertion to test
			 */
			record = new EMRecord(null, null, null, null);
			record.setHeight(322);
			int expectedValue = 322;
			int actualValue = record.getHeight();
			assertEquals(expectedValue,actualValue,"The getHeight() method is not working");
			record = null;
		}	
	}

}
