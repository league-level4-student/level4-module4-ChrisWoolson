package _04_hospital;

import java.util.ArrayList;

public class Patient {
boolean cared;
	
	boolean feelsCaredFor() {
		if(cared == true) {
			return true;
		} else {
			return false; 
		}
	}
	
	void checkPulse() {
		cared = true;
	}
	
}

