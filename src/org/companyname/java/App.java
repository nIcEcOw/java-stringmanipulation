package org.companyname.java;

import org.companyname.java.stringmanipulation.StringCalculator;

public class App {
	
	private void performTask () {
		System.out.println ( "String Calculator" );
		StringCalculator stringCalculator = new StringCalculator ();
		stringCalculator.add ( "" );
		stringCalculator.add ( "1" );
		stringCalculator.add ( "1,2" );
	}
	
	public static void main ( String [] args ) {
		System.out.println ( "String Manipulation App" );
		new App ().performTask ();
	}
}