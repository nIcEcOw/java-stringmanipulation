package org.companyname.java.stringmanipulation;

/*
 * StringCalculator holds all the logic related to the
 * manipulation of the strings as required by the task.
 */
public class StringCalculator {
	
	public int add ( String numbers ) {
		int result = 0;
		if ( numbers == null || numbers.length () == 0 ) {
			return result;
		}
		System.out.println ( "Received Numbers are " + numbers );
		String [] numberStrings = numbers.split ( "[,]" );
		for ( String numberString : numberStrings ) {
			result += Integer.parseInt ( numberString );
		}
		return result;
	}
}