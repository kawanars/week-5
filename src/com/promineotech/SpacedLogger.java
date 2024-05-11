package com.promineotech;

public class SpacedLogger implements Logger {
	//5. Implement the SpacedLogger methods:
		//Note:  The SpacedLogger should add a space or " " between each character of the String argument passed into its methods.
	//a. If the log method received “Hello” as an argument, it should print H e l l o
	//b. The error method should do the same, but with “ERROR:” preceding the spaced out input (i.e. ERROR: H e l l o)
	@Override
	public void log(String log) {
		// TODO Auto-generated method stub
		StringBuilder spacing = new StringBuilder();
		for (int i=0; i<log.length(); i++){
			if (i>0) {
				spacing.append(" ");
			}
			spacing.append(log.charAt(i));
		}
		System.out.println(spacing.toString());
	}

	@Override
	public void error(String error) {
		// TODO Auto-generated method stub
		StringBuilder spacing = new StringBuilder();
		for (int i=0; i<error.length(); i++) {
		}
		System.out.println("ERROR: "+ spacing);
	}	
	}
	
	


