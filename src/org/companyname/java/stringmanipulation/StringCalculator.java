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
		String delimiter = "";
		if ( numbers.startsWith ( "//" ) ) {
			if ( numbers.length () < 3 ) {
				return 0;
			}
			numbers = numbers.substring ( 2 );
			int index = numbers.indexOf ( "\n" );
			System.out.println ( "Index of separation: " + index );
			if ( index == -1 || ( index >= ( numbers.length () - 1 ) ) ) { 
				return 0; 
			}
			delimiter = numbers.substring ( 0, index );
			numbers = numbers.substring ( index + 1 );
			//System.out.println ( "Delimiter found: " + delimiter + " Remaining String: " + remainingstring );
		} else {
			delimiter = ",\\n";
		}
		
		System.out.println ( "Delimiter choosen: " + delimiter );
		String [] numberstrings = numbers.split ( "[" + delimiter + "]" );
		//System.out.println ( "Found numbers: " + numberstrings.length );
		for ( String numberstring : numberstrings ) {
			result += Integer.parseInt ( numberstring );
		}
		return result;
	}
}