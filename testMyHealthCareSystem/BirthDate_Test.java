package testMyHealthCareSystem;


/*		@(#)BirthDate_Test.java	Jan. 31, 2024
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
* Test class for testing the BirthDate class
* Uses JUnit version 5
* @author Ava Barzegar
* @version 1.0.0
* @version 1
* @since java version "21.0.1" 2023-10-17 LTS

*/

@DisplayName("Test My HealthCare Application Domain - BirthDate")
@TestMethodOrder(OrderAnnotation.class)
public class BirthDate_Test {
	
	BirthDate bd;
	@BeforeEach
	void setUp() throws Exception {
		/*
		 * Enter any requirements here that are needed before each test is run
		 */
		bd = new BirthDate(0,0,0);
	}

	@AfterEach
	void tearDown() throws Exception {
		/*
		 *	Undo what was setup for each test before the test was run
		 */
		bd = null;
	}

	/*		Methods to test
	 * 
		+BirthDate(day:int, month:int, year:int)
		+toString():String
		+formattedBirthDate():String
		+getDay():int
		+getMonth():int
		+getYear():int
	 */


	
	@Nested	@DisplayName("BirthDate() Test")
	@TestMethodOrder(OrderAnnotation.class)
	class BirthDateTest {
		@Test @Order(1) @DisplayName("BirthDate() test with Null arguments")
		final void testBirthDateWithNullArguments() {
			bd = new BirthDate(0,0,0);
			assertNotNull(bd);
		}
		
		/*
		 * Add code with assertion to test overloaded constructors as you see fit
		 */
		@Test
	    @Order(1)
	    @DisplayName("Constructor with valid arguments")
	    final void testConstructorWithValidArguments() {
	        bd = new BirthDate(2020, 10, 11);
	        assertNotNull(bd);
	        assertEquals(2020, bd.getYear());
	        assertEquals(10, bd.getMonth());
	        assertEquals(11, bd.getDay());
	        bd = null;
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
			 BirthDate birthDate = new BirthDate(2005, 11, 21);
		        assertEquals("myHealthCareSystem.BirthDate[year=2005, month=11, day=21]", birthDate.toString(),"The toString() method is not working");
		}
	}
	
	@Nested	@DisplayName("formattedBirthDate() Test")
	@TestMethodOrder(OrderAnnotation.class)
	class FormattedBirthDate {
		@Test @Order(1) @DisplayName("formattedBirthDate()")
		final void testFormattedBirthDate() {
			/*
			 * Add code with assertion to test
			 */
			bd = new BirthDate(2002,04,05);
			String expectedValue = "2002/4/5";
			String actualValue = bd.formattedBirthDate();
			assertEquals(expectedValue,actualValue,"The formattedBirthDate() method is not working");
			bd = null;
		}
		
	}

	@Nested	@DisplayName("getDay() Test")
	@TestMethodOrder(OrderAnnotation.class)
	class GetDayTest {
		@Test @Order(1) @DisplayName("getDay()")
		final void testGetDay() {
			/*
			 * Add code with assertion to test
			 */
			bd = new BirthDate(2024,04,05);
			int expectedValue = 5;
			int actualValue = bd.getDay();
			assertEquals(expectedValue,actualValue,"The getDay() method is not working");
			bd = null;
			
		}	
	}
	
	@Nested	@DisplayName("getMonth() Test")
	@TestMethodOrder(OrderAnnotation.class)
	class GetMonthTest {
		@Test @Order(1) @DisplayName("getMonth()")
		final void testGetMonth() {
			/*
			 * Add code with assertion to test
			 */
			bd = new BirthDate(1994,11,15);
			int expectedValue = 11;
			int actualValue = bd.getMonth();
			assertEquals(expectedValue,actualValue,"The getMonth() method is not working");
			bd = null;
		}	
	}
	
	@Nested	@DisplayName("getYear() Test")
	@TestMethodOrder(OrderAnnotation.class)
	class GetYearTest {
		@Test @Order(1) @DisplayName("getYear()")
		final void testGetYear() {
			/*
			 * Add code with assertion to test
			 */
			bd = new BirthDate(2014,05,06);
			int expectedValue = 2014;
			int actualValue = bd.getYear();
			assertEquals(expectedValue,actualValue,"The getYear() method is not working");
			bd = null;
		}	
	}


}
