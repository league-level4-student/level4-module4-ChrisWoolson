package _01_introduction_to_encapsulation;

import static org.junit.jupiter.api.Assertions.assertEquals;

/*
 * Encapsulation is a way of protecting the data in a class from being
 * unintentionally altered from another class.
 * 
 * To encapsulate a member variable, follow these three steps:
 * 
 * 1. Make the member variable private (or protected)
 * 
 * 2. Make a getter and setter method (accessor and mutator) for the variable.
 * 
 * 3. Add restrictions to the setter method so the member variable cannot be 
 * 	  adversely altered
 * 
 * */


public class EncapsulateTheData {
	//1. Encapsulate the member variables.
	//   Add restrictions to the setters according to the comment.
	
	
	
	public int accecor1() {
		return itemsReceived;
	}
	
	public void mutator1(int x) {
if(x<0) {
	x=0;
}

		
		itemsReceived=x;
	}
	
	//
	public float accecor2() {
		return degreesTurned;
	}
	
	public void mutator2(float x) {
if(x<0.0) {
	x=0;
}
if(x>360.0) {
	x=360;
}
		
		degreesTurned=x;
	}
	
	//
	public String accecor3() {
		return nomenclature;
	}
	
	public void mutator3(String x) {
if(x.equals("")) {
	x=" ";
}

		
		nomenclature=x;
	}
	
	//
	public Object accecor4() {
		return memberObj;
	}
	
	public void mutator4(Object x) {
if(x.getClass().equals(String.class)) {
	Object b = x;
	
	memberObj = b;
}

	}
	
	
	//2. Create a new JUnit Test case and write tests to verify that 
	//   the member variables' getters and setters are working
	
	private int itemsReceived; //must not be negative. All negative arguments get set to 0.
	
	private float degreesTurned; //must be locked between 0.0 and 360.0 inclusive.
	private String nomenclature = " "; //must not be set to a blank string. Blank Strings get set to a space
	private Object memberObj; //can be any object type except String. Strings get turned into objects.
	
	
	
	
	public void tester(){
		mutator1(-2);
		assertEquals(accecor1(), 0);
	}
	
	
		
		
		
		
	}




