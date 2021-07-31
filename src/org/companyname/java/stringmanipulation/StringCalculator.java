package org.companyname.java.stringmanipulation;

/*
 * StringCalculator holds all the logic related to the
 * manipulation of the strings as required by the task.
 */
public class StringCalculator {
	
	public int add ( String numbers ) {
		// System.out.println ( "Received number is: " + numbers );
		int result = 0;
		if ( numbers == null || numbers.length () == 0 ) {
			return result;
		}
		String delimiter = "";
		if ( numbers.startsWith ( "//" ) ) {
			/*
			 * This check is to insure that the incoming string will have atleast
			 * something like //\\b\n0
			 */
			if ( numbers.length () < 4 ) {
				return 0;
			}
			numbers = numbers.substring ( 2 );
			/*
			 * Adding this check in case Characters like '\n' or '\t' are used as Delimiters.
			 * Checking if after taking out "//" from the input String, if the
			 * input String starts with "\", then whatever follows this character
			 * will become the delimiter.
			 * Assuming that for this case when delimiter specified having special meaning,
			 * will be passed with 2 slashes like \\n instead of just \n ( Since \n is used
			 * to separate the delimiter from rest of the numbers ).
			 */
			if ( numbers.startsWith ( "\\." ) ) {
				delimiter = numbers.substring ( 0, 2 );
				numbers = numbers.substring ( 2 );
			} else {
				int index = numbers.indexOf ( "\n" );
				if ( index == -1 || ( index >= ( numbers.length () - 1 ) ) ) { 
					return 0; 
				}
				delimiter = numbers.substring ( 0, index );
				numbers = numbers.substring ( index + 1 );
			}
		} else {
			delimiter = ",\\n";
		}
		
		System.out.println ( "Delimiter choosen: " + delimiter );
		String [] numberstrings = numbers.split ( "[" + delimiter + "]" );
		// System.out.println ( "Found numbers: " + numberstrings.length );
		System.out.println ( "Numbers: " + java.util.Arrays.toString ( numberstrings ) );
		for ( String numberstring : numberstrings ) {
			result += Integer.parseInt ( numberstring );
		}
		return result;
	}
}