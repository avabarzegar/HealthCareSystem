package myHealthCareSystem;


/**
 * @author Ava Barzegar
 * version 1
 * @since java version "21.0.1" 2023-10-17 LTS
  * Description: HealthCareSystem
 */


/**
 * This class represents the birth date for a patient.  A birth date, once created
 * cannot be changed.
 * 
 */
public class BirthDate {
	
	
	/*	Attributes			************************************/
	/** Birth day															*/
	private	final	int	day;
	/** Birth month.														*/
	private	final	int	month;
	/** Birth year.														*/
	private	final	int	year;	
	
	
	/*	Constructors		************************************/
	/**
	 * Create the birth date for this patient.
	 * @param year		Year of birth (4 numeric characters)
	 * @param month	Month of birth (01 thru 12) (2 digit month)
	 * @param day	Day of birth. (2 digit day, 01 thru 30... depending upon the month and year)
	 */
	public	BirthDate(int year, int month, int day)	{
		this.day = day;
		this.month = month;
		this.year = year;
	}
	
	
	/*	Accessors			************************************/
	

	/**
	 * @return the day
	 */
	public int getDay() {
		return day;
	}


	/**
	 * @return the month
	 */
	public int getMonth() {
		return month;
	}


	/**
	 * @return the year
	 */
	public int getYear() {
		return year;
	}


	/* Modifiers			************************************/

	
	/*	Normal Behavior	************************************/
	public String formattedBirthDate()	{
		/*	TODO:	write the code to return a formatted string for the birth date in the format
		 * 		yyyy/mm/dd
		 */
		
		return year + "/" + month + "/" + day;
	}


	/**
	 * Convert this objectd into a meaningful string.
	 * @return	This object as a string.
	 */
	public String toString()	{
		return getClass().getName() + "[year=" + year + ", month=" + month + ", day=" + day + "]"; 
	}
	
	/*	Helper Methods		************************************/

}
