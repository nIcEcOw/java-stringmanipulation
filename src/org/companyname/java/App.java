package org.companyname.java;

import org.companyname.java.stringmanipulation.StringCalculator;

public class App {
	
	private void performTask () {
		System.out.println ( "String Calculator" );
		StringCalculator stringCalculator = new StringCalculator ();
		// System.out.println ( "Output when \"null\" is passed: " + stringCalculator.add ( null ) );
		// System.out.println ( "Output when \"\" is passed: " + stringCalculator.add ( "" ) );
		// System.out.println ( "Output when \"1\" is passed: " + stringCalculator.add ( "1" ) );
		// System.out.println ( "Output when \"1,2\" is passed: " + stringCalculator.add ( "1,2" ) );
		// System.out.println ( "Output when \"1,2\\n3\" is passed: " + stringCalculator.add ( "1,2\n3" ) );
		// System.out.println ( "Output when \"1,2,3,\\n4,\\n5\" is passed: " + stringCalculator.add ( "1,2,3\n4\n5" ) );
		System.out.println ( "Output when \"//\\t\\n1\" is passed: " + stringCalculator.add ( "//\\t\n1" ) );
		System.out.println ( "Output when \"//,\\n1,2,3,4,5\" is passed: " + stringCalculator.add ( "//,\n1,2,3,4,5" ) );
		System.out.println ( "Output when \"//\\n\\n1\\n2\\n3\" is passed: " + stringCalculator.add ( "//\\n\n1\n2\n3" ) );
	}
	
	public static void main ( String [] args ) {
		System.out.println ( "String Manipulation App" );
		new App ().performTask ();
	}
}