package com.promineotech;

public class App {
	//6.     Create a class named App that has a main method.
	//a.  In this class instantiate an instance of each of your logger classes that implement the Logger interface.
	//b. Test both methods on both instances, passing in Strings of your choice.
	public static void main(String[] args) {
		Logger logger = new AsteriskLogger();
		//logger.log("Hello");
		//logger.error("Error");
		Logger log1 = new AsteriskLogger();
		log1.log("hi");
		log1.error("no");
		log1.toString();
		
		Logger log2 = new SpacedLogger();
		log2.log("new");
		log2.error("Hey");
		log2.toString();
			
	}

}
