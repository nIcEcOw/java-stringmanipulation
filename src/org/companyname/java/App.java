package org.companyname.java;

import org.companyname.java.stringmanipulation.StringCalculator;

public class App {
	
	private void performTask () {
		System.out.println ( "String Calculator" );
		StringCalculator stringCalculator = new StringCalculator ();
		System.out.println ( "Output when \"\" is passed: " + stringCalculator.add ( "" ) );
		System.out.println ( "Output when \"1\" is passed: " + stringCalculator.add ( "1" ) );
		System.out.println ( "Output when \"1,2\" is passed: " + stringCalculator.add ( "1,2" ) );
	}
	
	public static void main ( String [] args ) {
		System.out.println ( "String Manipulation App" );
		new App ().performTask ();
	}
}