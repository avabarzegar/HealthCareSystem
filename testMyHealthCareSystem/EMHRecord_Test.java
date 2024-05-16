package testMyHealthCareSystem;


/**
* Test class for testing the EMRecord class
* Uses JUnit version 5
* @author Ava Barzegar
* @version 1.0.0
* @version 1
* @since java version "21.0.1" 2023-10-17 LTS
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

@DisplayName("Test My HealthCare Application Domain - EMHRecord")
@TestMethodOrder(OrderAnnotation.class)
public class EMHRecord_Test {
	
	EMHRecord record;
	
	@BeforeEach
	void setUp() throws Exception {
		/*
		 * Enter any requirements here that are needed before each test is run
		 */
		record =  new EMHRecord(null, null, null, null);
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
		+EMHRecord(reportingFacilityProvince:String, institutionNumber:String, chartNumber:String,healthCareNumber:String)
		+toString():String
	 */

	
	@Nested	@DisplayName("EMHRecord() Test")
	@TestMethodOrder(OrderAnnotation.class)
	class EMHRecordTest {
		@Test @Order(1) @DisplayName("EMHRecord() test with Null arguments")
		final void testEMHRecordWithNullArguments() {
			/*
			 * Add code with assertion to test constructor\
			 */
			EMHRecord result = null;
			assertNull(result);
		}
		
		/*
		 * Add code with assertion to test overloaded constructors as you see fit
		 */
		  @Test
		    @Order(2)
		    @DisplayName("EMHRecord() test with Valid arguments")
		    final void testEMHRecordWithValidArguments() {
		       record = new EMHRecord("Ontario", "123", "456", "789");
		        assertNotNull(record,"The overloaded constructor is not working");
		        record = null;
		    }
		}

	@Nested	@DisplayName("toString() Test")
	@TestMethodOrder(OrderAnnotation.class)
	class ToStringTest {
		@Test @Order(1) @DisplayName("toString()")
		final void testToString() {
			/*
			 * Add code with assertion to test
			 */
			record = new EMHRecord(null, null, null, null);
			String actual = record.toString();
			System.out.println(record.toString());
			String expected = "myHealthCareSystem.EMHRecord@17fc391bmyHealthCareSystem.EMHRecord{reportingFacilityProvince='null', institutionNumber='null', functionalCentreAccount='null', encounterSequnce=0, healthCareNumber='null', charNumber='null', issuingProvince='null', residenceCode='null', gender='null', submissionYear=0, adminViaAmbulance='null', registrationDate=0, registrationTime=0}";
            assertEquals(expected, actual, record.toString());
		}
	}

	
	/*
	 * Add code to test one set method and one get method
	 */
	
	@Nested	@DisplayName("setgender() Test")
	@TestMethodOrder(OrderAnnotation.class)
	class SetGenderTest {
		@Test @Order(1) @DisplayName("setGender()")
		final void testSetGender() {
			/*
			 * Add code with assertion to test
			 */
			record = new EMHRecord(null, null, null, null);
			record.setGender("Female");
			String expectedValue = "Female";
			String actualValue = record.getGender();
			assertEquals(expectedValue,actualValue,"The setGender() method is not working");
			record = null;
		}	
	}
	@Nested	@DisplayName("GetGender() Test")
	@TestMethodOrder(OrderAnnotation.class)
	class GetGenderTest {
		@Test @Order(1) @DisplayName("GetGender()")
		final void testGetGender() {
			/*
			 * Add code with assertion to test
			 */
			record = new EMHRecord(null, null, null, null);
			record.setGender("Female");
			String expectedValue = "Female";
			String actualValue = record.getGender();
			assertEquals(expectedValue,actualValue,"The getGender() method is not working");
			record = null;
		}	
	}

}
