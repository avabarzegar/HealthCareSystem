package testMyHealthCareSystem;


/*		@(#)Address_Test.java	Jan. 31, 2024
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

@DisplayName("Test My HealthCare Application Domain - Address")
@TestMethodOrder(OrderAnnotation.class)
public class Address_Test {

	Address address;
	@BeforeEach
	void setUp() throws Exception {
		/*
		 * Enter any requirements here that are needed before each test is run
		 */
		address = new Address(null, null, null, null, null);
	}

	@AfterEach
	void tearDown() throws Exception {
		/*
		 *	Undo what was setup for each test before the test was run
		 */
		address = null;
	}

	/*		Methods to test
	 * 
	 * 	+Address(...)
			+formattedAddress():String
			+street():String
			+postalCode():String
			+getCity():String
			+setStreet(street:String):void
			+setNumber(number:String):void
			+setCity(city:String):void
			+setCountry(country:String):void
			+setPostalCode(postalCode:String):void
	 */
	
	@Nested	@DisplayName("Address() Test")
	@TestMethodOrder(OrderAnnotation.class)
	class AddressTest {
		@Test @Order(1) @DisplayName("Address() test with Null arguments")
		final void testAddressWithNullArguments() {
			address = new Address(null, null, null, null, null);
			assertNotNull(address);
			address = null;
		}
		
		/*
		 * Add code with assertion to test overloaded constructors as you see fit
		 */
		final void testNameWithOverLoadedConstructors() {
			address = new Address("Granton","65","Ottawa","Canada","sdkfh");
			assertEquals("Granton", address.street());
            assertEquals("sdkfh", address.getPostalCode());
            assertEquals("Ottawa", address.getCity());
			address = null;
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
			address= new Address("54 Carling", "Unit 4", "Toronto", "Canada", "145");
	        assertEquals("myHealthCareSystem.Address[street=54 Carling, number=Unit 4, city=Toronto, country=Canada, postalCode=145]", address.toString());
	        address = null;
		}
	}
	
	@Nested	@DisplayName("formattedAddress() Test")
	@TestMethodOrder(OrderAnnotation.class)
	class FormattedAddress {
		@Test @Order(1) @DisplayName("formattedAddress()")
		final void testFormattedAddress() {
			/*
			 * Add code with assertion to test
			 */
			  address = new Address("r4 Barrhaven", "Unit2", "London", "England", "L2G");
			  String expectedValue = "r4 Barrhaven Unit2 London England L2G";
			  String actualValue = address.formattedAddress();
		      assertEquals(expectedValue,actualValue,"The formattedAddress() is not working");
		      address = null;
		}
		
	}

	@Nested	@DisplayName("postalCode() Test")
	@TestMethodOrder(OrderAnnotation.class)
	class PostalCodeTest {
		@Test @Order(1) @DisplayName("postalCode()")
		final void testPostalCode() {
			/*
			 * Add code with assertion to test
			 */
			address = new Address(null, null, null, null, null);
			address.setPostalCode("D4F");
			String expectedValue = "D4F";
			String actualValue = address.getPostalCode();
			assertEquals(expectedValue,actualValue,"The postalCode() is not working");
			address = null;
			
			
		}	
	}

	@Nested	@DisplayName("getCity() Test")
	@TestMethodOrder(OrderAnnotation.class)
	class GetCityTest {
		@Test @Order(1) @DisplayName("getCity()")
		final void testGetCity() {
			/*
			 * Add code with assertion to test
			 */
			address = new Address(null, null, null, null, null);
			address.setCity("Paris");
			String expectedValue = "Paris";
			String actualValue = address.getCity();
			assertEquals(expectedValue,actualValue,"The getCity() is not working");
			address = null;
		}	
	}

	
	@Nested	@DisplayName("setStreet() Test")
	@TestMethodOrder(OrderAnnotation.class)
	class SetStreetTest {
		@Test @Order(1) @DisplayName("setStreet()")
		final void testSetStreet() {
			/*
			 * Add code with assertion to test
			 */
			address = new Address(null, null, null, null, null);
			address.setCity("Tehran");
			String expectedValue = "Tehran";
			String actualValue = address.getCity();
			assertEquals(expectedValue,actualValue,"The setCity() is not working");
			address = null;
		}
	}
	
	@Nested	@DisplayName("setNumber() Test")
	@TestMethodOrder(OrderAnnotation.class)
	class SetNumberTest {
		@Test @Order(1) @DisplayName("setNumber()")
		final void testSetNumber() {
			/*
			 * Add code with assertion to test
			 */
			address = new Address(null, null, null, null, null);
			address.setNumber("45435");
			String expectedValue = "45435";
			String actualValue = "45435";
			assertEquals(expectedValue,actualValue,"The setNumber() is not working");
			address = null;
		}
	}


	@Nested	@DisplayName("setCity() Test")
	@TestMethodOrder(OrderAnnotation.class)
	class SetCityTest {
		@Test @Order(1) @DisplayName("setCity()")
		final void testSetCity() {
			/*
			 * Add code with assertion to test
			 */
			address = new Address(null, null, null, null, null);
			address.setCity("Madrid");
			String expectedValue = "Madrid";
			String actualValue = address.getCity();
			assertEquals(expectedValue,actualValue,"The getCity() is not working");
			address = null;
		}
	}
	
	@Nested	@DisplayName("setCountry() Test")
	@TestMethodOrder(OrderAnnotation.class)
	class SetCountryTest {
		@Test @Order(1) @DisplayName("setCountry()")
		final void testSetCountry() {
			/*
			 Add code with assertion to test
			 */
			address = new Address(null, null, null, null, null);
			address.setCountry("Turkey");
			String expectedValue = "Turkey";
			String actualValue = "Turkey";
			assertEquals(expectedValue,actualValue,"The setCountry() is not working");
			address = null;
		}
	}
	
	@Nested	@DisplayName("setPostalCode() Test")
	@TestMethodOrder(OrderAnnotation.class)
	class SetPostalCodeTest {
		@Test @Order(1) @DisplayName("setPostalCode()")
		final void testSetCountry() {
			/*
			 Add code with assertion to test
			 */
			address = new Address(null, null, null, null, null);
			address.setPostalCode("454f");
			String expectedValue = "454f";
			String actualValue = address.getPostalCode();
			assertEquals(expectedValue,actualValue,"The setPostalCode() is not working");
			address = null;
		}
	}




}
