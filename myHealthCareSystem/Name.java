package myHealthCareSystem;

/**
 * @author Ava Barzegar
 * version 1
 * @since java version "21.0.1" 2023-10-17 LTS
  * Description: HealthCareSystem
 */


public class Name {

	/*	Attributes			************************************/
	private static String first;
	private static String last;
	private static String middle;
	private String salutation;
	
	
	/*	Constructors		************************************/
	/**
	 * Creating the constructors and using constructor chaining 
	 */
	
	/**
	 * constructor without parameters
	 */
	public Name() {
		this(first,last,middle);
	}
	
	/**
	 * constructor using name as parametere
	 */
	public Name(String name) {
	}
	
	/**
	 * constructor using first and last as parameteres
	 */
	public Name(String first, String last) {
		this(first,last,middle);
		middle = "";
	}
	/**
	 * constructor using first, last and middle parameteres
	 */
	public Name(String first,String last,String middle) {
		this.first = first;
		this.last = last;
		this.middle = middle;
	}
	/*	Accessors			************************************/

	/**
	 *  Getters for the variables
	 * @return value of first
	 */
	public String first() {
		if(first != null) {
		return first;
		}else {
			return "";
		}
	}
	/**
	 * 
	 * @return value of last
	 */
	public String last() {
		if(last != null) {
		return last;
		}else {
			return "";
		}
	}
	
	/**
	 * 
	 * @return value of Middle name
	 */
	public String getMiddle() {
		return middle;
	}
	/* Modifiers			************************************/
	
	/**
	 *  Setters for the variables
	 * @param first set the value of variable first
	 */
		public void setFirst(String first) {
			if(first != null) {
			this.first = first;
			}
		}
	/**
	 * 
	 * @param last To set the value of class-level variable last
	 */
		public void setLast(String last) {
			if (last != null) {
			this.last = last;
			}
		}
		/**
		 * 
		 * @param middle set the value of variable middle
		 */
		public void setMiddle(String middle) {
			if (middle != null) {
			this.middle = middle;
			}
		}
		/**
		 * 
		 * @param salutation set the value of salutation
		 */
	public void setSalutation(String salutation) {
		this.salutation = salutation;
	}
	
	/*	Normal Behavior	************************************/

	/**
	 * 
	 * @return the formattedName as first + middle + last + salutation
	 */
	public String formattedName() {
		if(salutation == null) {
		return  first + " " + middle+ " " + last;
		}else {
			return salutation +  " " + first + " " + middle+ " " + last;
		}
	}
	
	/**
	 * Convert this objectd into a meaningful string.
	 * @return this object as a string.
	 */
	@Override
	public String toString() {
		
		return getClass().getName() + "[first=" + first + ", last=" + last + ", middle=" + middle + ", salutation=" + salutation + "]";
	
	}
	
	
	/*	Helper Methods		************************************/
	


}
